# Chapter 4 Clojure from the Ground up 

## Transforming sequences

### Map

If one sequence is bigger than another, map stops at the end of the smaller one.

Transforming elements together with their indices is so common that Clojure has a special function for it: map-indexed


```
map (fn [n vehicle] (str "I've got " n " " vehicle "s"))
         [0 200 9]
         ["car" "train" "kiteboard"])
("I've got 0 cars" "I've got 200 trains" "I've got 9 kiteboards")
```
### concat 

```
(concat [1 2 3] [:a :b :c] [4 5 6])
(1 2 3 :a :b :c 4 5 6)
```

### Interleave

Another way to combine two sequences is to riffle them together, using interleave.

```
(interleave [:a :b :c] [1 2 3])
(:a 1 :b 2 :c 3)
```

### Interleave 

And if you want to insert a specific element between each successive pair in a sequence, try interpose:

```
user=> (interpose :and [1 2 3 4])
(1 :and 2 :and 3 :and 4)
```

## Collapsing sequences

### 

```
(frequencies [:meow :mrrrow :meow :meow])
{:meow 3, :mrrrow 1}
```

```
(pprint (group-by :first [{:first "Li"    :last "Zhou"}
                                 {:first "Sarah" :last "Lee"}
                                 {:first "Sarah" :last "Dunn"}
                                 {:first "Li"    :last "O'Toole"}]))
```

```
(reduce + [1 2 3 4])
```

```
(into {} [[:a 2] [:b 3]])
{:a 2, :b 3}
```

That function returned immediately. Because it hasn’t done any work yet, we say the sequence is unrealized. It doesn’t increment any numbers at all until we ask for them:

```
(take 10 infseq)
(1 2 3 4 5 6 7 8 9 10)

(realized? infseq)
true
```

