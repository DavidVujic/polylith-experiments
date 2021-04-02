(ns greeting.interface
  (:require [example.message-parser.interface :as message-parser]))

(defn- greet []
  (message-parser/parse {"message" "Good Morning"}))

(defn message [light-theme?]
  [:h1 (if light-theme? (greet) "Good Evening")])
