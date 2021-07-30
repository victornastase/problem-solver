package com.java.problems.problemsolver.problems.medium;

/**
 * Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.
 *
 * For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.
 *
 * You can assume that the messages are decodable. For example, '001' is not allowed.
 */
public class Problem7 {
    public int recursiveSolution(String encoded) {
        if(encoded.startsWith("0")) {
            return 0;
        } else if(encoded.length() <= 1) {
            return 1;
        }

        int total = 0;
        String slicedFirstTwo = encoded.substring(0, 2);
        if(isSubstringWorthCounting(slicedFirstTwo)) {
            total += recursiveSolution(encoded.substring(2));
        }
        total += recursiveSolution(encoded.substring(1));

        return total;
    }

    private boolean isSubstringWorthCounting(String substring) {
        if(substring.isEmpty()) {
            return false;
        }

        if(Integer.parseInt(substring) <= 26) {
            return true;
        }
        return false;
    }
}
