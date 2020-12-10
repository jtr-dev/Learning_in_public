(ns chapter5
  (:import [java.time LocalTime]))

(defn parse
  [my-time]
  (LocalTime/parse my-time))


(def breakfast (parse "07:00"))
(def midday (parse "12:00"))
(def nearly-dinner (parse "18:00"))
(def dinner (parse "19:00"))
(def late-night (parse "23:59"))

(defn schedule
  "Using the control flow constructs we’ve learned, write a schedule 
   function which, given an hour of the day, returns what you’ll be 
   doing at that time. (schedule 18), for me, returns :dinner."
   [my-time] 
   (let [my-time' (parse my-time)]
   (cond
     (.isBefore my-time' breakfast) :sleeping)))


(schedule "03:00")