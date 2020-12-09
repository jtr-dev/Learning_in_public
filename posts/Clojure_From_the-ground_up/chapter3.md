# Chapter 2 Clojure from the Ground up

## Functions

```
(defn name_function [arguments] (function)
```

Some functions can take any number of arguments. For that, Clojure provides &,
which slurps up all remaining arguments as a list