package com.java.problems.problemsolver.problems.medium;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Problem7Test {
    private String input1 = "111";
    private String input2 = "2222";
    private static final int RESULT1 = 3;
    private static final int RESULT2 = 5;

    private Problem7 problem;

    @BeforeEach
    public void init() {
        this.problem = new Problem7();
    }

    @Test
    public void testRecursive() {
        assertEquals(RESULT1, problem.recursiveSolution(input1));
        assertEquals(RESULT2, problem.recursiveSolution(input2));
    }
}
