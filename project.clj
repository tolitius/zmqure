(defproject zmqure "0.1.0-SNAPSHOT"
  :description "zmq clojure server"
  :url "https://github.com/tolitius/zmqure"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths ["src/zmqure"]
  :dependencies [[org.clojure/clojure "1.5.0"]
                 [zmq/zmq "2.1.9"]]

  :native-path "/usr/local/lib"
  :jvm-opts [~(str "-Djava.library.path=native/:" (System/getenv "LD_LIBRARY_PATH"))]
            
  :main zmqure)
