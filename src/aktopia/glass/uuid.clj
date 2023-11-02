(ns aktopia.glass.uuid
  (:import
   [java.util UUID]
   [com.devskiller.friendly_id FriendlyId]))

(set! *warn-on-reflection* true)

(defn random-uuid-str
  []
  (str (UUID/randomUUID)))

(defn guid
  []
  (FriendlyId/createFriendlyId))

;; TODO Add tests for guid
