(ns example.hello-world-lambda.core
  (:require [clojure.java.io :as io]
            [clojure.data.json :as json]
            [example.message-parser.interface :as message-parser])
  (:gen-class
   :implements [com.amazonaws.services.lambda.runtime.RequestStreamHandler]))

(defn -handleRequest [_this input output _context]
  (with-open [reader (io/reader input)
              writer (io/writer output)]
    (-> reader
        json/read
        message-parser/parse
        (json/write writer))))
