package com.muhhsinin.day10;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * kawnayeen
 * 3/6/18
 */
public class BinaryNumbersTest {

    BinaryNumbers binaryNumbers;

    @Before
    public void setup() {
        binaryNumbers = new BinaryNumbers();
    }

    @Test
    public void testInstantiation() {
        Assert.assertNotNull(binaryNumbers);
    }

    @Test
    public void negativeNumberShouldReturnEmptyString() {
        Assert.assertEquals("", binaryNumbers.getBinary(-10));
    }

    @Test
    public void oneWillRemainSameInBinary(){
        Assert.assertEquals("1", binaryNumbers.getBinary(1));
    }

    @Test
    public void twoWillBecomeTenInBinary(){
        Assert.assertEquals("10", binaryNumbers.getBinary(2));
    }
}