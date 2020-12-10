(ns chapter4)

(defn palindrome? 
  "Checks if a word is a palingdrome"
  [word]
  (= (seq word) (reverse word)))

(defn count_occurences
  "my version of code to count occurences in a collection"
  [collection character]
  (count (filter #(= % character) collection))
)

(defn my_filter
  "my version of the filter method"
  [predicate collection]
  (lazy-seq
   (when-let [s (seq collection)]
        (if (predicate (first s))
          (cons (first s) (my_filter predicate (rest s)))
          (my_filter predicate (rest s))))))

(defn divisible? [a b]
  (zero? (mod a b)))

(defn isPrime? [n]
  (and (> n 1) (not-any? (partial divisible? n) (range 2 n))))

(defn my_primes
  "my version to print out primes to a certain number"
   [limit]
   (filter #(isPrime? %) (range 2 limit )))



  


  
