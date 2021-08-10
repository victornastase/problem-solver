package com.java.problems.problemsolver.problems.medium;

import static org.junit.jupiter.api.Assertions.*;
import com.java.problems.problemsolver.problems.easy.MarketStocks;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MarketStocksTest {
    private final static int[] INPUT = new int[]{9, 11, 8, 5, 7, 10};
    private final static int MAX_PROFIT = 5;

    private MarketStocks problem;

    @BeforeEach
    public void init() {
        this.problem = new MarketStocks();
    }

    @Test
    public void maxProfitBruteForceTest() {
        assertEquals(MAX_PROFIT, problem.maxProfitBruteForce(INPUT));
    }

    @Test
    public void setMaxProfitEnhancedTest() {
       assertEquals(MAX_PROFIT, problem.maxProfitEnhanced(INPUT));
    }

}
