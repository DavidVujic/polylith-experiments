(ns example.hello-world.view
  (:require [reagent.dom :as rdom]
            [re-frame.core :as rf]
            [example.hello-world.events]
            [example.hello-world.subs]
            [example.theme-toggle.interface :as theme-toggle]
            [example.greeting.interface :as greeting]))

(defn toggle-theme [e]
  (rf/dispatch [:toggle-theme (-> e .-target .-checked)]))

(defn page []
  [:<>
   [theme-toggle/theme-toggle-field toggle-theme]
   [:div {:id "page"}
    [theme-toggle/theme-toggle-label]
    [greeting/message @(rf/subscribe [:light-theme?])]]])

(defn main-element []
  (-> js/document (.getElementById "app")))

(defn ^:export main []
  (rdom/render [page] (main-element)))
