(ns clojurekoans.view.view-helpers
  "Put helper functions for views in this namespace."
  (:use
    [joodo.views :only (render-partial *view-context*)]
    [hiccup.page-helpers]
    [hiccup.form-helpers]
    [clojure.java.io :only [reader]]
    [clojure.data.json :only [read-json]])
  (:import java.net.URL))


(defn get-contributor-json
  ([]
     (-> (URL. "http://github.com/api/v2/json/repos/show/functional-koans/clojure-koans/contributors")
         .openStream
         get-contributor-json))
  ([stream]
     (slurp (reader stream))))

(defn get-contributors
  ([]
     (get-contributors (get-contributor-json)))
  ([json]
     (let [parsed (read-json json)]
       (:contributors parsed))))
