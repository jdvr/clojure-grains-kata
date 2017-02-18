(ns grains.core-test
  (:require [clojure.test :refer :all]
            [grains.core :refer :all]))

(deftest a-test

  (testing "knowing square grains"
    (is (= 1 (grains-on 1)))
    (is (= 2 (grains-on 2)))
    (is (= 4 (grains-on 3)))
    )

  (testing "the number of grains in one square is the double of the previous one"
    (is (= (* 2 (grains-on 0)) (grains-on 41)))
    )


  )
