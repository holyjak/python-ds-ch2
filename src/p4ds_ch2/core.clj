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


["#### Splitting of arrays

The opposite of concatenation is splitting, which is implemented by the functions `np.split`, `np.hsplit`, `np.vsplit`, and `np.dsplit` [depth?]. For each of these, we can pass a list of indices giving the split points:"]

["Computation on NumPy Arrays: Universal Functions
 ------------------------------------------------

 Computation on NumPy arrays can be very fast, or it can be very slow. The key to making it fast is to use vectorized operations, generally implemented through NumPy's universal functions (ufuncs). This section motivates the need for NumPy's ufuncs, which can be used to make repeated calculations on array elements much more efficient. It then introduces many of the most common and useful arithmetic ufuncs available in the NumPy package."]

["#### Introducing UFuncs

Ex.:
* `1.0 / matrice`
* `np.arange(5) / np.arange(1, 6)` - two arrays
* `x = np.arange(9).reshape((3, 3)); 2 ** x` - on multi-dimensional array"]


["### Exploring NumPy's UFuncs"]
["#### Array arithmetic

* addition, subtraction, multiplication, and division (+ `floor_divide`).
* unary ufunc for negation, and a ** operator for exponentiation, and a % operator for modulus

these can be strung together however you wish, and the standard order of operations is respecte"]


["### Absolute value"]
["### Trigonometric functions

```
theta = np.linspace(0, np.pi, 3)
print(\"theta      = \", theta)
print(\"sin(theta) = \", np.sin(theta))
print(\"cos(theta) = \", np.cos(theta))
print(\"tan(theta) = \", np.tan(theta))
np.arcsin(x)
np.arccos(x)
np.arctan(x)
```"]


["#### Exponents and logarithms

* e^x, 2^x, n^x
* ln(x), log2(x), log10(x)
* np.expm1(x) = exp(x) - 1, np.log1p(x) = log(1 + x)"]

["#### Specialized ufuncs

NumPy has many more ufuncs available, including hyperbolic trig functions, bitwise arithmetic, comparison operators, conversions from radians to degrees, rounding and remainders, and much more. A look through the NumPy documentation reveals a lot of interesting functionality.

Another excellent source for more specialized and obscure ufuncs is the submodule scipy.special. If you want to compute some obscure mathematical function on your data, chances are it is implemented in scipy.special. There are far too many functions to list them all..."]


["### Advanced Ufunc Features"]

["#### Specifying output

For large calculations, it is sometimes useful to be able to specify the array where the result of the calculation will be stored. Rather than creating a temporary array, this can be used to write computation results directly to the memory location where you'd like them to be. For all ufuncs, this can be done using the out argument of the function"]

["#### Aggregates

For binary ufuncs, there are some interesting aggregates that can be computed directly from the object. For example, if we'd like to reduce an array with a particular operation, we can use the reduce method of any ufunc. A reduce repeatedly applies a given operation to the elements of an array until only a single result remains.\n\nFor example, calling reduce on the add ufunc returns the sum of all elements in the array:

```
x = np.arange(1, 6)
np.add.reduce(x)      # 15
np.multiply.reduce(x) # 120
np.add.accumulate(x)  # [1, 3, ..] - store all the intermediate results of reduce

```"]

["#### Outer products

Finally, any ufunc can compute the output of all pairs of two different inputs using the `outer` method. This allows you, in one line, to do things like create a multiplication table:

```
x = np.arange(1, 6)
np.multiply.outer(x, x)
```"]

["### Ufuncs: Learning More

More information on universal functions (including the full list of available functions) can be found on the NumPy and SciPy documentation websites."]

["Aggregations: Min, Max, and Everything In Between
 ------------------------------------------------"]

["### NumPy Standard Data Types"]
["### NumPy Standard Data Types"]


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
