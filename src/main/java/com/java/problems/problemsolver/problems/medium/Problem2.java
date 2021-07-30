package com.java.problems.problemsolver.problems.medium;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
 *
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 *
 * Follow-up: what if you can't use division?
 */
public class Problem2 {
    public int[] divisionMethod(int[] input) {
        int product = calculateArrayProduct(input);
        return Arrays.stream(input).map(element -> product/element).toArray();
    }

    //TODO: whitout streams
    public int[] prefixSuffixMethod(final int[] input) {
        int[] result = new int[input.length];

        for(int i = 0; i < input.length; i++) {
            int[] skipedArray = skipElementFromIndex(input, i);
            result[i] = calculateArrayProduct(skipedArray);
        }
        return result;
    }

    public int[] reverseArray(final int[] input) {
        int[] reversed = Arrays.copyOf(input, input.length);
        for(int i = 0; i < input.length /2; i++) {
            int temp = reversed[i];
            reversed[i] = reversed[reversed.length - i - 1];
            reversed[reversed.length -i - 1] = temp;
        }
        return reversed;
    }

    private int[] skipElementFromIndex(int[] array , int index) {
        return IntStream.range(0, array.length).filter(i -> i != index).map(i -> array[i]).toArray();
    }

    private int calculateArrayProduct(int[] input) {
        return Arrays.stream(input).reduce(1, (partialProduct,element) -> partialProduct * element);
    }
}
