(ns hello-world.subs
  (:require [re-frame.core :as rf]))

; Defining shorthands for re-frame subscribe
(def <sub (comp deref rf/subscribe))

(rf/reg-sub
 :light-theme?
 (fn [db _]
   (= :light (get-in db [:theme :active]))))
