(ns grains.core
  (:gen-class)
  (:require [clojure.math.numeric-tower :as math]))

(defn grains-on [square]
  (math/expt 2 (dec square)))

(defn total-grains []
  (reduce + (map grains-on (range 1 (inc 64)))))


