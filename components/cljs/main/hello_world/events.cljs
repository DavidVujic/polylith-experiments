(ns hello-world.events
  (:require [re-frame.core :as rf]))

(rf/reg-event-db
 :theme
 (fn [db [_ theme]]
   (assoc-in db [:theme :active] theme)))

(rf/reg-event-fx
 :toggle-theme
 (fn [_ [_ on?]]
   {:dispatch [:theme (if on? :light :dark)]}))
