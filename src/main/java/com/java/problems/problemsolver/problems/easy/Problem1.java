package com.java.problems.problemsolver.problems.easy;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 *
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 *
 * Bonus: Can you do this in one pass?
 */

@Component
public class Problem1 {
    public boolean brutForceSolution(int[] input, int k) {
        for(int i =0; i < input.length; i++) {
            for(int j = 0; j < input.length; j++) {
                if(i != j && input[i] + input[j] == k) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean usingASet(int[] input, int k) {
        Set numbersSet = new HashSet();
        for(int i = 0; i < input.length; i++) {
            if(numbersSet.contains(k - input[i])) {
                return true;
            }
            numbersSet.add(input[i]);
        }
        return false;
    }
}
