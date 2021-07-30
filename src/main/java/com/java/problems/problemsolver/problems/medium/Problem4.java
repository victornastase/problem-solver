package com.java.problems.problemsolver.problems.medium;

/**
 * Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.
 *
 * For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
 */
public class Problem4 {
    public int linearTimeAndConstantSpace(int[] input) {
        if(input == null || input.length == 0)
            return 1;

        for(int i = 0; i < input.length; i++) {
            while (i + 1 != input[i] && (0 < input[i] && input[i] <= input.length)) {
                int v = input[i];
                input[i] = input[v - 1];
                input[v - 1] = input[i];
                if(input[i] == input[v - 1])
                    break;
            }
        }
        for(int i = 1; i < input.length; i++) {
            if(input[i] != i)
                return i;
        }
        return input.length + 1;
    }
}
