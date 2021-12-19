(ns akarmic.glass.uuid
  (:import
   [java.util UUID]))

(set! *warn-on-reflection* true)

(defn uuid-str
  []
  (str (UUID/randomUUID)))
