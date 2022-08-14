package com.andrew.hackerank.davisstaircase;

/*
Davis has a number of staircases in his house and he likes to climb each staircase 1, 2, or 3 steps at a time.
 Being a very precocious child, he wonders how many ways there are to reach the top of the staircase.

Given the respective heights for each of the  staircases in his house, find and print the number of ways he can climb
 each staircase, module  on a new line.

Example:
The staircase has 5 steps. Davis can step on the following sequences of steps:

1 1 1 1 1
1 1 1 2
1 1 2 1
1 2 1 1
2 1 1 1
1 2 2
2 2 1
2 1 2
1 1 3
1 3 1
3 1 1
2 3
3 2
There are  possible ways he can take these  steps and

Function Description
# stepPerms has the following parameter(s):
* int n: the number of stairs in the staircase
# Returns
* int: the number of ways Davis can climb the staircase, modulo 10000000007

 */
public class Solution {
    public static int stepPerms(int n) {
        int res = 0;
        if(n < 0) return 0;
        if(n <= 3 && n >= 1) res += 1;
        return  res + stepPerms(n - 3) + stepPerms(n - 2) + stepPerms(n - 1);
    }
}
