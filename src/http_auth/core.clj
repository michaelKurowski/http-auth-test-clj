(ns http-auth.core
  (:require
    [http-auth.routes :refer [all-routes]]
    [org.httpkit.server :refer [run-server]]
  ))

(defn -main [& args]
  (run-server all-routes {:port 8080})
  (println "Server started on port 8080"))