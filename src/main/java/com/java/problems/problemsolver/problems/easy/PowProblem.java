package com.java.problems.problemsolver.problems.easy;

/**
 * Implement integer exponentiation. That is, implement the pow(x, y) function, where x and y are integers and returns x^y.
 *
 * Do this faster than the naive method of repeated multiplication.
 *
 * For example, pow(2, 10) should return 1024.
 */
public class PowProblem {

    //O(exp)
    public int powNaiveSolution(int base, int exp) {
        if(exp == 0) return 1;
        if(exp == 1) return base;
        return powNaiveSolution(base, exp - 1) * base;
    }

    //O(exp)
    public int powTabSolution(int base, int exp) {
        int[] table = new int[exp + 1];
        table[0] = 1;
        table[1] = base;

        for(int i = 2; i < exp + 1; i++) {
            table[i] = table[i - 1] * base;
        }
        return table[exp];
    }

    /**
     * If y is even, then x^y = (x^2) ^ (y/2)
     * If y is odd, then x^y = x * ((x^2) ^ ((y - 1) / 2))
     */
    //O(log exp)
    public int pow(int base, int exp) {
        if(exp < 0) {
            return pow(1/base, -exp);
        } else if (exp == 0) {
            return 1;
        } else if (exp == 1) {
            return base;
        } else if(exp % 2 == 0) {
            return pow(base * base, exp/2);
        } else {
            return base*pow(base*base, (exp - 1)/2);
        }
    }
}
