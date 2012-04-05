(ns clojurekoans.core
  (:use
    [compojure.core :only (defroutes GET)]
    [compojure.route :only (not-found)]
    [joodo.middleware.view-context :only (wrap-view-context)]
    [joodo.views :only (render-template render-html)]
    [joodo.controllers :only (controller-router)]))

(defroutes clojurekoans-routes
  (GET "/" [] (render-template "index"))
  (controller-router 'clojurekoans.controller)
  (not-found (render-template "not_found" :template-root "clojurekoans/view" :ns `clojurekoans.view.view-helpers)))

(def app-handler
  (->
    clojurekoans-routes
    (wrap-view-context :template-root "clojurekoans/view" :ns `clojurekoans.view.view-helpers)))

