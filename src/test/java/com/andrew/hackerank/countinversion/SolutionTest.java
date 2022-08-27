package com.andrew.hackerank.countinversion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {
    @ParameterizedTest(name = "input arr: {0}, expected inversions: {1}")
    @MethodSource("inputArgs")
    public void testDifferentInput(List<Integer> arr, long expected) {
        long actual = Solution.countInversions(arr);

        Assertions.assertEquals(expected, actual);
    }


    public static List<Arguments> inputArgs() {
        return List.of(
                Arguments.of(new ArrayList<>(List.of(1, 5, 3, 7)), 1),
                Arguments.of(new ArrayList<>(List.of(7, 5, 3, 1)), 6),
                Arguments.of(new ArrayList<>(List.of(2, 1, 3, 1, 2)), 4)
        );
    }
}
