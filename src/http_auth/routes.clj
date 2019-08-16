(ns http-auth.routes
  (:use
    [compojure.route :only [not-found]]
    [compojure.core :only [defroutes GET POST context]]
  ))

(defn show-landing-page [req]
  {:status  200
      :headers {"Content-Type" "text/html"}
      :body    "Hello world"})

(defroutes all-routes
  (GET "/" [] show-landing-page)
  (not-found "<p>Page not found.</p>")) ;; all other, return 404