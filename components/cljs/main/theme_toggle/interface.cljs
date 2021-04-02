(ns theme-toggle.interface)

(defn theme-toggle-field [toggle-fn]
  [:input {:type       "checkbox"
           :class-name "theme-switch"
           :id         "theme-toggle"
           :on-click   toggle-fn}])

(defn theme-toggle-label []
  [:label {:class-name "switch-label"
           :for        "theme-toggle"}])

