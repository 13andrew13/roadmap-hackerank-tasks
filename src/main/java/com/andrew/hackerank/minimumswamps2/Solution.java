package com.andrew.hackerank.minimumswamps2;

/*
# Task description
You are given an unordered array consisting of consecutive integers  [1, 2, 3, ..., n] without any duplicates.
You are allowed to swap any two elements. Find the minimum number of swaps required to sort the array in ascending order.

minimumSwaps has the following parameter(s):
* int arr[n]: an unordered array of integers
Returns
* int: the minimum number of swaps to sort the array

# Example
Perform the following steps:
arr = [7, 1, 3, 2, 4, 5, 6]
i   arr                         swap (indices)
0   [7, 1, 3, 2, 4, 5, 6]   swap (0,3)
1   [2, 1, 3, 7, 4, 5, 6]   swap (0,1)
2   [1, 2, 3, 7, 4, 5, 6]   swap (3,4)
3   [1, 2, 3, 4, 7, 5, 6]   swap (4,5)
4   [1, 2, 3, 4, 5, 7, 6]   swap (5,6)
5   [1, 2, 3, 4, 5, 6, 7]
It took 5 swaps to sort the array.
 */

public class Solution {
    static int minimumSwaps(int[] arr) {
        int swapCount = 0;
        boolean sorted = false;
        for (int j = 0; j < arr.length && !sorted; j++) {
            boolean alreadySorted = true;
            for (int i = 1; i <= arr.length; i++) {
                if (arr[i - 1] != i) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[temp - 1];
                    arr[temp - 1] = temp;
                    swapCount++;
                    alreadySorted = false;
                }
            }
            sorted = alreadySorted;
        }

        return swapCount;
    }
}
