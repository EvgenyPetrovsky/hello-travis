(ns hello-travis.core-test
  (:require [clojure.test :refer :all]
            [hello-travis.core :refer :all]))

(deftest b-test
  (testing "LOOK, I work!"
    (is (= 1 1))))
