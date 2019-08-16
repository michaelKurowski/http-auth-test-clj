(ns http-auth.core
  (:use
    [compojure.route :only [not-found]]
    [http-auth.routes :only [all-routes]]
    [compojure.core :only [defroutes GET POST context]]
    [org.httpkit.server :refer [run-server]]
  ))

(defn -main [& args]
  (run-server all-routes {:port 8080})
  (println "Server started on port 8080"))