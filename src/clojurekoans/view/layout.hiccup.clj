(doctype :html5)
[:html
 [:head
  [:meta {:http-equiv "Content-Type" :content "text/html" :charset "iso-8859-1"}]
  [:title "Clojure Koans"]

  "<!--[if IE]>"
  (include-css "/stylesheets/iestyle.css")
  "<![endif]-->"
  "<!--[if !IE]>"
  (include-css "/stylesheets/style.css")
  "<![endif]-->"
  (include-js "https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js")
  (include-js "/javascript/clojurekoans.js")]
 [:body
  (eval (:template-body joodo.views/*view-context*))
]]
