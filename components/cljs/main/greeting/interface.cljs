(ns greeting.interface)

(defn message [light-theme?]
  [:h1 (if light-theme? "Good Morning" "Good Evening")])
