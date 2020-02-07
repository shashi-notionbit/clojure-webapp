(ns notionbit.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [notionbit.templates :refer [template-landing]]))

(defroutes app-routes
  (GET "/" [] (template-landing "Hello from Notionbit"))
  (route/resources "/")
  (route/not-found "Page Not Found"))

(def app
  (handler/site app-routes))
