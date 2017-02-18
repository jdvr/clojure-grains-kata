(ns grains.core
  (:gen-class)
  (:require [clojure.math.numeric-tower :as math]))

(defn grains-on [square]
  (math/expt 2 (dec square)))

(defn total-grains []
  (reduce + (map grains-on (range 1 (inc 64)))))

(defn text-grains-on-square [square]
  (str "grains on cell " square " are " (grains-on square)))

(defn -main
    [& args]
    (println (text-grains-on-square 1))
    (println (text-grains-on-square 5))
    (println (text-grains-on-square 10))
    (println (text-grains-on-square 15))
    (println (str "The total of grains are " (total-grains)))
  )

