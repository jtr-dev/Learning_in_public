# Chapter 2 Clojure from the Ground up

## Types

### Numeric 

Numeric : Long, Int, Double, Float

```
(type 3)
java.lang.Long
```

```
(type 1.23)
java.lang.Double
```

```
(type 1/3)
clojure.lang.Ratio
```

### Strings

```
(type "cat")
```

#### concatenation

```
(str "meow " 3 " times")
```

#### regex

```
(re-find #"cat" "mystic cat mouse")
(rest (re-matches #"(.+):(.+)" "mouse:treat"))
```

### Keywords

Closely related to symbols and strings are keywords, which begin with a :. 
Keywords are like strings in that they’re made up of text, but are specifically 
intended for use as labels or identifiers. These aren’t labels in the sense of 
symbols: keywords aren’t replaced by any other value. They’re just names, by 
themselves.

```
(type :cat)
```

### Lists

```
'(1 2 3)
(list 1 2 3)
```

```
(conj '(1 2 3) 4)
(4 1 2 3)
```

### Vectors

```
[1 2 3]
```

```
conj [1 2 3] 4)
[1 2 3 4]
```

```
(rest [1 2 3])
(2 3)

(next [1 2 3])
(2 3)
```

### Sets

unordered collection of values

```
 #{:a :b :c}
```

```
(conj #{:a :b :c} :d)
#{:a :c :b :d}
```

```
(contains? #{1 2 3} 3)
true
```

### Maps

```
{:name "mittens" :weight 9 :color "black"}
```

```
(get {"cat" "meow" "dog" "woof"} "cat")
```

get can also take a default value to return instead of nil, if the key doesn’t exist in that map.

```
(get {:glinda :good} :wicked :not-here)
```

You can add a value for a given key to a map with assoc.

```
(assoc {:bolts 1088} :camshafts 3)
{:camshafts 3 :bolts 1088}
```

