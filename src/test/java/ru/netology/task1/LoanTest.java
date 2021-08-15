package ru.netology.task1;

import org.junit.jupiter.api.*;


class LoanTest {

    private static Loan loan;
    private static final double DELTA = 0.02;

    @BeforeAll
    public static void initState() {
        final double annualInterestRate = 10;
        final int numberOfYears = 10;
        final double loanAmount = 1_000_000;

        loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
    }

    @Test
    public void testGetMonthlyPayment() {
        final double expected = 13215.07;
        final double actual = loan.getMonthlyPayment();

        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testGetTotalPayment() {
        final double expected = 1585808.84;
        final double actual = loan.getTotalPayment();

        Assertions.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testGetOverpayment() {
        final double expected = 585808.84;
        final double actual = loan.getOverpayment();

        Assertions.assertEquals(expected, actual, DELTA);
    }
}