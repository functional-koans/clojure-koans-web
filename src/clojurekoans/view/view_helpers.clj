(ns clojurekoans.view.view-helpers
  "Put helper functions for views in this namespace."
  (:use
    [joodo.views :only (render-partial *view-context*)]
    [hiccup.page-helpers]
    [hiccup.form-helpers]
    [clojure.java.io :only [reader]]
    [clojure.data.json :only [read-json]])
  (:import java.net.URL))

(def cached-contributors (atom []))

(defn get-contributor-json
  ([]
    (try
     (let [conn (-> (URL. "http://github.com/api/v2/json/repos/show/functional-koans/clojure-koans/contributors")
                    .openConnection)]
       (.setConnectTimeout conn 1000)
       (.setReadTimeout conn 1000)
       (get-contributor-json (.getInputStream conn)))
     (catch Exception e
       nil)))
  ([stream]
     (try
       (slurp (reader stream))
       (catch Exception e
         nil))))

(defn get-contributors
  ([]
     (get-contributors (get-contributor-json)))
  ([json]
     (let [parsed (if json
                    (read-json json)
                    @cached-contributors)]
       (when json (reset! cached-contributors parsed))
       (:contributors parsed))))
