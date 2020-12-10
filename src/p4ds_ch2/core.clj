(ns p4ds-ch2.core
  (:require
    [notespace.api]
    [notespace.kinds :as k :reload true]
    [notespace.state :as state]

    [tablecloth.api :as api]

    [tech.v3.datatype.statistics :as t.stat]))

^k/hidden
(comment
  (notespace.api/init)
  (notespace.api/init-with-browser)
  (notespace.api/eval-this-notespace)
  (notespace.api/eval-note-at-line 14)
  nil)

["
Python Data Science - ch.2. NumPy translated to Clojure
=======================================================
"]

["Understanding Data Types in Python
 ------------------------------------------------"]

["### Fixed-Type Arrays in Python"]
["### Creating Arrays from Python Lists"]
["### Creating Arrays from Scratch"]
["### NumPy Standard Data Types"]

["The Basics of NumPy Arrays
 ------------------------------------------------"]
["### NumPy Array Attributes

`ndim, size, shape` (list of dimension lengths), `dtype` e.g. int64,
`itemsize` in bytes and the total `nbytes` count."]

["### Array Indexing: Accessing Single Elements

Ex.: `x[4]`, `x[-1]`, `x[1,2]`"]

["### Array Slicing: Accessing Subarrays

`x[start:stop:step]`, e.g. `x[::2]  # every other element`, `x[5::-2]  # reversed every other from index 5`"]

["### Multi-dimensional subarrays

Same as for 1D arrays.

`x2[:2, :3]  # two rows, three columns`"]

["#### Accessing array rows and columns

One commonly needed routine is accessing of single rows or columns of an array.

`print(x2[:, 0])  # first column of x2`
`print(x2[0, :])  # first row of x2`"]

["#### Subarrays as no-copy views

views rather than copies of the array data"]

["#### Creating copies of arrays

Despite the nice features of array views, it is sometimes useful to instead explicitly copy the data within an array or a subarray."]


["### Reshaping of Arrays

For example, if you want to put the numbers 1 through 9 in a 3×3 grid"]


["### Array Concatenation and Splitting

All of the preceding routines worked on single arrays. It's also possible to combine multiple arrays into one, and to conversely split a single array into multiple arrays. "]


["#### Concatenation of arrays

NumPy: `np.concatenate, np.vstack, and np.hstack`"]


["#### Splitting of arrays"]


["#### NumPy Standard Data Types"]
["### NumPy Standard Data Types"]

["Computation on NumPy Arrays: Universal Functions
 ------------------------------------------------"]

["Aggregations: Min, Max, and Everything In Between
 ------------------------------------------------"]

["Computation on Arrays: Broadcasting
 ------------------------------------------------"]

["Comparisons, Masks, and Boolean Logic
 ------------------------------------------------"]

["Fancy Indexing
 ------------------------------------------------"]

["Sorting Arrays
 ------------------------------------------------"]

["Structured Data: NumPy's Structured Arrays
  ------------------------------------------------"]
