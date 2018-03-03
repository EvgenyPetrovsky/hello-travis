(ns hello-travis.core-test
  (:require [clojure.test :refer :all]
            [hello-travis.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))

(deftest b-test
  (testing "LOOK, I work!"
    (is (= 1 1))))
