(doctype :html5)
[:html
 [:head
  [:meta {:http-equiv "Content-Type" :content "text/html" :charset "iso-8859-1"}]
  [:title "Clojure Koans"]

  (include-css "/stylesheets/style.css")

  "<!--[if IE]>"
  (include-css "/stylesheets/iestyle.css")
  "<![endif]-->"
  (include-js "/javascript/jquery-1.7.2.js")
  (include-js "/javascript/clojurekoans.js")]
 [:body
  (eval (:template-body joodo.views/*view-context*))
]]
