(ns lein-cursive-testong.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))


(defn sum
  "sum 2 number"
  ([x y]
   (println (+ x y))
   (+ x y))

  ([x y z]
   (println (+ x y z))
   (+ x y z)))