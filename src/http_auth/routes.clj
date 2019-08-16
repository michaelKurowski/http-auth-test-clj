(ns http-auth.routes
  (:require
    [compojure.route :refer [not-found]]
    [compojure.core :refer [defroutes GET POST context]]
  ))

(defn show-landing-page [req]
  {:status  200
      :headers {"Content-Type" "text/html"}
      :body    "Hello world"})

(defroutes all-routes
  (GET "/" [] show-landing-page)
  (not-found "<p>Page not found.</p>"))