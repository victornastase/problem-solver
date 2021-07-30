package com.java.problems.problemsolver.problems.hard;

public class Problem9 {

    public int firstApproach(int[] input) {
        int len = input.length;

        if(len == 0)
            return 0;
        if(len == 1)
            return input[0];

        int[] sum = new int[len];
        sum[len - 1] = input[len - 1];
        sum[len - 2] = Math.max(input[len - 2], input[len - 1]);

        for(int i = len - 3; i >= 0; i --) {
            sum[i] = Math.max(input[i] + sum[i + 2], sum[i + 1]);
        }

        return sum[0];
    }

    public int findMaxSumOfNonAdjacent(int[] input) {
        int first = 0;
        int second = 0;

        for(int i = input.length - 1; i >= 0; i--) {
            int sum = Math.max(input[i] + second, first);
            second = first;
            first = sum;
        }

        return first;
    }
}
