(ns example.message-parser.interface
  (:require [clojure.walk :as walk]))

(defn parse [data]
  (-> data
      walk/keywordize-keys
      :message
      (or "No message, I'm afraid ...")))
