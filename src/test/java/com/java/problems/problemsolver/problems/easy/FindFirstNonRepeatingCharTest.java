package com.java.problems.problemsolver.problems.easy;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FindFirstNonRepeatingCharTest {
    private static final String INPUT_1 = "aaabccc";
    private static final char OUTPUT_1 = 'c';

    private FindFirstNonRepeatingChar problem;

    @BeforeEach
    public void init() {
        problem =  new FindFirstNonRepeatingChar();
    }

    @Test
    public void test() {
        assertEquals(OUTPUT_1, problem.solution(INPUT_1));
    }
}
