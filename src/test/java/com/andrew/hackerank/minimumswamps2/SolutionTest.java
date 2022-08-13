package com.andrew.hackerank.minimumswamps2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

public class SolutionTest {
    @ParameterizedTest(name = "input arr: {0}, expected swamps: {1}")
    @MethodSource("inputArgs")
    public void testDifferentInput(int[] arr, int expectedSwamps) {
        int actualSwamps = Solution.minimumSwaps(arr);

        assert actualSwamps == expectedSwamps;
    }


    public static List<Arguments> inputArgs() {
        return List.of(
                Arguments.of(
                        new int[]{1, 3, 5, 2, 4, 6, 7},
                        3
                ),
                Arguments.of(
                        new int[]{3, 7, 6, 9, 1, 8, 10, 4, 2, 5},
                        9
                ),
                Arguments.of(
                        new int[]{
                                2, 31, 1, 38, 29, 5, 44, 6, 12, 18, 39, 9, 48, 49, 13, 11, 7, 27, 14, 33, 50, 21, 46, 23,
                                15, 26, 8, 47, 40, 3, 32, 22, 34, 42, 16, 41, 24, 10, 4, 28, 36, 30, 37, 35, 20, 17, 45,
                                43, 25, 19
                        },
                        46
                )
        );
    }
}
