package com.andrew.hackerank.davisstaircase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

public class SolutionTest {
    @ParameterizedTest(name = "input stairs: {0}, expected possibilities: {1}")
    @MethodSource("inputArgs")
    public void testDifferentInput(int starsCases, int expected) {
        int actual = Solution.stepPerms(starsCases);

        Assertions.assertEquals(expected, actual);
    }


    public static List<Arguments> inputArgs() {
        return List.of(
                Arguments.of(1, 1),
                Arguments.of(3, 4),
                Arguments.of(7, 44),
                Arguments.of(15, 5768),
                Arguments.of(20, 121415),
                Arguments.of(27, 8646064)
        );
    }
}
