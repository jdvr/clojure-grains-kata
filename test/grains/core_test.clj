(ns grains.core-test
  (:require [clojure.test :refer :all]
            [grains.core :refer :all]))

(deftest a-test

  (testing "knowing square grains"
    (is (= 1 (grains-on 1)))
    (is (= 2 (grains-on 2)))
    )

  )
