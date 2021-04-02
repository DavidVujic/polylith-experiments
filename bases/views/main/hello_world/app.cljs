(ns hello-world.app
  (:require [reagent.dom :as rdom]
            [hello-world.view :as view]))

(defn main-element []
  (-> js/document (.getElementById "app")))

(defn ^:export main []
  (rdom/render [view/page] (main-element)))
