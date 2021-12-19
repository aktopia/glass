(ns akarmic.glass.keyword
  (:require
   [clojure.walk :as walk]))

(defn unqualify
  [x]
  (walk/postwalk
   (fn [x]
     (if (keyword? x)
       (keyword (name x))
       x))
   x))
