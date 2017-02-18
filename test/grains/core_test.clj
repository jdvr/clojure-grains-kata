(ns grains.core-test
  (:require [clojure.test :refer :all]
            [grains.core :refer :all]
            [clojure.math.numeric-tower :as math]))

;; All this problem solution has been extracting reading this
;; Summing geometric sequence, calculate nth term of a geometric sequence...
;; http://www.mathsisfun.com/algebra/sequences-sums-geometric.html

(defn sum-geometric-sequence [start common-ration count]
  (* start (/ (- 1 (math/expt common-ration count)) (- 1 common-ration))))

(deftest a-test

  (testing "knowing square grains"
    (is (= 1 (grains-on 1)))
    (is (= 2 (grains-on 2)))
    (is (= 4 (grains-on 3)))
    )

  (testing "the number of grains in one square is the double of the previous one"
    (is (= (* 2 (grains-on 20)) (grains-on 21)))
    (is (= (* 2 (grains-on 30)) (grains-on 31)))
    (is (= (* 2 (grains-on 40)) (grains-on 41)))
    )

  (testing "total of grains"
    (is (= (sum-geometric-sequence 1 2 64) (total-grains)))
    )
  )


