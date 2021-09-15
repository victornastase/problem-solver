package com.java.problems.problemsolver.problems.easy;

/**
 * Given an array and a sum find the longest subarray that can be formed equal to sum.
 *
 * [1,2,3,7,5], sum = 12, result [2, 4]
 */
public class FindTheLongestSubarrayBySum {

    public int[] bruteForceSolution(int[] arr, int sum) {
        int[] result = new int[2];

        for(int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for(int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                if(currentSum == sum && result[1] - result[0] < j - i) {
                    result[0] = i + 1; result[1] = j + 1;
                }
            }
        }
        return result;
    }

    public int[] slidingWindowSolution(int arr[], int sum) {
        int[] result = new int[2];

        int s = 0;
        int left = 0;
        int right = 0;

        while(right < arr.length) {
           s += arr[right];
           while(s > sum && left < right) {
               s -= arr[left++];
           }
            if(s == sum && result[1] - result[0] < right - left) {
                result[0] = left + 1; result[1] = right + 1;
            }
           right ++;
        }

        return result;
    }
}
