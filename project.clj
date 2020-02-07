(defproject notionbit-clj "0.1.0-SNAPSHOT"
  :description "Notionbit Simple web app example"
  :url "http://localhost:3000"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.5"]
                 [enlive "1.1.1"]]
  :plugins [[lein-ring "0.8.5"]]
  :ring {:handler notionbit.handler/app}
  :profiles
  {:dev {:dependencies [[ring-mock "0.1.5"]]}})
