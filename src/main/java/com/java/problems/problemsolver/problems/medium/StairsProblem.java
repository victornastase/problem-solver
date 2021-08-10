package com.java.problems.problemsolver.problems.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * There exists a staircase with N steps, and you can climb up either 1 or 2 steps at a time. Given N, write a function that returns the number of unique ways you can climb the staircase. The order of the steps matters.
 *
 * For example, if N is 4, then there are 5 unique ways:
 *
 * 1, 1, 1, 1
 * 2, 1, 1
 * 1, 2, 1
 * 1, 1, 2
 * 2, 2
 * What if, instead of being able to climb 1 or 2 steps at a time, you could climb any number from a set of positive integers X? For example, if X = {1, 3, 5}, you could climb 1, 3, or 5 steps at a time.
 */
public class StairsProblem {
    public int fibonacciSolution( int n) {
        //O(2^n)
       if(n == 1 || n == 0)
           return 1;
       return fibonacciSolution(n - 1) + fibonacciSolution(n - 2);
    }

    public int enhancedFibonacciSolution(int n) {
        //O(N)
       int[] numberOfWays = new int[n + 1];
       numberOfWays[0] = 1;
       numberOfWays[1] = 1;

       for(int i = 2; i <= n; i++) {
           numberOfWays[i] = numberOfWays[i - 1] + numberOfWays[i - 2];
       }
       return numberOfWays[n];
    }

    public int enhancedFibonacciSolution(int n, Map<Integer, Integer> memo) {
        if(memo == null) memo = new HashMap<Integer, Integer>();
        if(n == 0) return 1;
        if(n == 1) return 1;
        if(memo.containsKey(n)) {
            return memo.get(n);
        }
        int result = enhancedFibonacciSolution(n - 1, memo) + enhancedFibonacciSolution(n - 2, memo);
        memo.put(n, result);
        return result;
    }
}
