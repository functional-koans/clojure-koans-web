(use 'joodo.env)

(def environment {
  :joodo.core.namespace "clojurekoans.core"
  ; environment settings go here
  })

(swap! *env* merge environment)