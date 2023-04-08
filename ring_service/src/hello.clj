(ns hello
  (:require [clj-time.core :as t]
            [clj-time.format :as f]))
(defn time-str  
  "Returns a string representation of the current time in the local timezone."
  [dt]
  (f/unparse 
    (f/with-zone (f/formatter "hh:mm aa")(t/default-time-zone))
      dt))

(defn -main [] 
  (println "Hello " (time-str (t/now))))
