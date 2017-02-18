(ns grains.core
  (:gen-class))

(def powers-of-two (iterate (partial * 2) 1))


(defn grains-on [square]
  (last (take square powers-of-two)))