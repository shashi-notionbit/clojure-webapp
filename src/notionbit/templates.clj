(ns notionbit.templates
  (:require [net.cgrand.enlive-html :refer [deftemplate content]]))

(deftemplate template-landing "public/landing.html"
  [value]
  [:#message] (content value))
