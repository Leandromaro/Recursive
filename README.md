# Backtracking Algorithms

Backtracking is an algorithmic-technique for solving problems recursively by trying to build a solution incrementally, one piece at a time, removing those solutions that fail to satisfy the constraints of the problem at any point of time (by time, here, is referred to the time elapsed till reaching any level of the search tree).

Basic idea: **FIND ALL POSIBLE COMBINATIONS**. When an element its found we "backtrack" erasing that element and continuing analizing other cases.
Like every recursive algorithm it counts with two elements
 - Base case
 - Recursive case

For example, consider the SudoKo solving Problem, we try filling digits one by one. Whenever we find that current digit cannot lead to a solution, we remove it (backtrack) and try next digit. This is better than naive approach (generating all possible combinations of digits and then trying every combination one by one) as it drops a set of permutations whenever it backtracks.

![Sodoku](https://media.geeksforgeeks.org/wp-content/uploads/sudoku.jpg)

## Excercises 

```


```
