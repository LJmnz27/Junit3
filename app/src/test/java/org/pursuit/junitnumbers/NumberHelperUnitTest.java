package org.pursuit.junitnumbers;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.pursuit.junitnumbers.NumberHelper;

public class NumberHelperUnitTest {

    private NumberHelper numberHelper;


    @Before
    public void setUp() throws Exception {
        numberHelper = NumberHelper.getInstance();
    }

    @Test
    public void oddOrEvenTestIfOdd() {
        int input = 5;
        String expected = "odd";
        String result = numberHelper.oddOrEven(input);
        Assert.assertEquals(expected,result);
    }

    @Test
    public void testIfDivisibleByFive() {
        int input = 55;
        Assert.assertTrue(numberHelper.divisibleBy5(input));
    }

    @Test
    public void testIfNotDivisibleByFive() {
        int input = 12;
        Assert.assertFalse(numberHelper.divisibleBy5(input));
    }

    @Test
    public void testMultiplesOfN() {
        int input1 = 3;
        int input2 = 10;
        int [] expected = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
        int[] result = numberHelper.multiplesOfN(input1,input2);
        Assert.assertArrayEquals(expected, result);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testMultiplesOfNWithNegative() {
        int input1 = 3;
        int input2 = -2;
        int [] expected = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
        int[] result = numberHelper.multiplesOfN(input1,input2);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void stringToNumber() {
        String result = "5";
        int expected = 5;
        Assert.assertEquals(numberHelper.stringToNumber(result), expected);
    }

    @Test (expected = IllegalArgumentException.class)
    public void stringToNumberNotNumber() {
        String result = "c";
        int expected = 5;
        Assert.assertEquals(numberHelper.stringToNumber(result), expected);
    }

    @Test
    public void arraySumSum() {
        int [] result = {1, 2, 3};
        int expected = 6;
        Assert.assertEquals(numberHelper.arraySum(result), expected);
    }

    @Test
    public void largestNumber() {
        int [] result = {1,2,3};
        int expected = 3;
        Assert.assertEquals(numberHelper.largestNumber(result),expected);
    }

    @Test
    public void numberSort() {
        int [] result = {0,2,3,1};
        int [] expected = {0,1,2,3};

        Assert.assertEquals(numberHelper.numberSort(result),expected);
    }

    @After
    public void tearDown() throws Exception {

    }



}
