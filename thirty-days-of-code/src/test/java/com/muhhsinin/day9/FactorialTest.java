package com.muhhsinin.day9;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    Factorial factorial;

    @Before
    public void setup() {
        factorial = new Factorial();
    }

    @Test
    public void checkInstantiation() {
        Assert.assertNotNull(factorial);
    }

    @Test
    public void factorialOfNegativeShouldBeMinusOne() {
        Assert.assertEquals(-1, factorial.getFactorial(-9));
    }

    @Test
    public void factorialOfZeroShouldBeOne() {
        Assert.assertEquals(1, factorial.getFactorial(0));
    }

    @Test
    public void factorialOfOneShouldBeOne() {
        Assert.assertEquals(1, factorial.getFactorial(1));
    }

    @Test
    public void factorialOfThreeShouldBeSix() {
        Assert.assertEquals(6, factorial.getFactorial(3));
    }
}