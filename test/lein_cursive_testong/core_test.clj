(ns lein-cursive-testong.core-test
  (:require [clojure.test :refer :all]
            [lein-cursive-testong.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest sum-test
  (testing "summary test"
    (is (= (sum 1 1) (+ 1 1)))
    (is (= (sum 1 1 1) (+ 1 1 1)))))