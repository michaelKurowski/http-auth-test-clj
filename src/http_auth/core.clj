(ns http-auth.core
  (:require [org.httpkit.server :refer [run-server]]))

(defn app [req]
  {:status  200
      :headers {"Content-Type" "text/html"}
      :body    "Hello world"})

(defn -main [& args]
  (run-server app {:port 8080})
  (println "Server started on port 8080"))
