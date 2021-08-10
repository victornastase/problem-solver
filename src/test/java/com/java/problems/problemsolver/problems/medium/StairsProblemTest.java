package com.java.problems.problemsolver.problems.medium;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StairsProblemTest {
    private static final int N = 4;
    private static final int N_ = 3;
    private static final int _N_ = 5;
    private static final int BIG_N = 17;
    private static final int BIG_NN = 18;

    private static final int WAYS_N = 5;
    private static final int WAYSN_ = 3;
    private static final int WAYS_N_ = 8;
    private static final int WAYS_BIG_N = 2584;
    private static final int WAYS_BIG_NN = 4181;

    private StairsProblem problem;

    @BeforeEach
    public void init() {
        this.problem = new StairsProblem();
    }

    @Test
    public void testFibonacci() {
        assertEquals(WAYS_N, problem.fibonacciSolution(N));
        assertEquals(WAYSN_, problem.fibonacciSolution(N_));
        assertEquals(WAYS_N_, problem.fibonacciSolution(_N_));
    }

    @Test
    public void testEnhancedFibonacci() {
        assertEquals(WAYS_N, problem.enhancedFibonacciSolution(N));
        assertEquals(WAYSN_, problem.enhancedFibonacciSolution(N_));
        assertEquals(WAYS_N_, problem.enhancedFibonacciSolution(_N_));

        assertEquals(WAYS_N, problem.enhancedFibonacciSolution(N, null));
        assertEquals(WAYSN_, problem.enhancedFibonacciSolution(N_, null));
        assertEquals(WAYS_N_, problem.enhancedFibonacciSolution(_N_, null));

        assertEquals(WAYS_BIG_N, problem.enhancedFibonacciSolution(BIG_N, null));
        assertEquals(WAYS_BIG_NN, problem.enhancedFibonacciSolution(BIG_NN, null));
    }
}
