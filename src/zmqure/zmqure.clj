(ns zmqure
  (:refer-clojure :exclude [send])
  (:require [zhelpers :as mq]))

(def port 4242)

(defn -main []

  (println "zmqure is up and listening on" port)

  (let [sock (-> 1 mq/context (mq/socket mq/pull))]
    (mq/bind sock (str "tcp://0.0.0.0:" port))
    (while true
      (let [bytes (mq/recv sock)]
        (println "do somm with [" bytes "]")

        ;; not to spam the terminal
        (Thread/sleep 1000)))))
