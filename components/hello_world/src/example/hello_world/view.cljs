(ns example.hello-world.view
  (:require [re-frame.core :as rf]
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
