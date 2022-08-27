package com.andrew.hackerank.countinversion;

import java.util.ArrayList;
import java.util.List;
/*
In an array `arr`, the elements at indices `i` and `j` (where `i < j` ) form an inversion if arr[i] > arr[j]. In other
words, inverted elements `arr[i]` and `arr[j]` are considered to be "out of order". To correct an inversion, we can swap
adjacent elements.
 */

public class Solution {
    public static long countInversions(List<Integer> arr) {
        if(arr.size() == 1) return 0;
        int k = 0;
        int i = 0;
        int j = 0;

        int m = arr.size() / 2;
        List<Integer> left = new ArrayList<>(arr.subList(0, m));
        List<Integer> right = new ArrayList<>(arr.subList(m, arr.size()));
        long count = countInversions(left) + countInversions(right);

        while(i < left.size() && j < right.size()){
            if(left.get(i) > right.get(j)){
                arr.set(k++, right.get(j++));
                count += m - i;
            } else {
                arr.set(k++, left.get(i++));
            }
        }
        while (i < left.size()) {
            arr.set(k++, left.get(i++));
        }
        while (j < right.size()) {
            arr.set(k++, right.get(j++));
        }
        return count;
    }
}
