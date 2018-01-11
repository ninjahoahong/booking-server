(ns booking-server.handler)

(defn init []
  (println "booking-server is starting"))

(defn destroy []
  (println "booking-server is shutting down"))

(defn handler [request]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    "Hell World"})

(def app handler)
