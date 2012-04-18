(doctype :html5)
[:html
 [:head
  [:meta {:http-equiv "Content-Type" :content "text/html" :charset "iso-8859-1"}]
  [:title "clojurekoans"]
  (include-css "/stylesheets/style.css")
  (include-js "/javascript/clojurekoans.js")]
 [:body
  (eval (:template-body joodo.views/*view-context*))
]]
