(ns http-auth.core
  (:use
    [compojure.route :only [not-found]]
    [compojure.core :only [defroutes GET POST context]]
    [org.httpkit.server :refer [run-server]]
  ))

(defn show-landing-page [req]
  {:status  200
      :headers {"Content-Type" "text/html"}
      :body    "Hello world"})

(defroutes all-routes
  (GET "/" [] show-landing-page)
  (not-found "<p>Page not found.</p>")) ;; all other, return 404

(defn -main [& args]
  (run-server all-routes {:port 8080})
  (println "Server started on port 8080"))