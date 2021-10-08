package com.bl.generic;

import org.junit.Assert;
import org.junit.Test;

public class MaximumValueTest {
    @Test
    public void givenThreeNumberWhenIntegerNumberShouldReturnMaxAtFirstPosition() {
        int value = new MaximumValue<Integer>(9, 5, 4).findMax();
        Assert.assertEquals(9, value);
    }

    @Test
    public void givenThreeNumberWhenIntegerNumberShouldReturnMaxAtSecondPosition() {
        int value = new MaximumValue<Integer>(5, 9, 6).findMax();
        Assert.assertEquals(9, value);
    }

    @Test
    public void givenThreeNumberWhenIntegerNumberShouldReturnMaxAtThirdPosition() {
        int value = new MaximumValue<Integer>(6, 5, 9).findMax();
        Assert.assertEquals(9, value);
    }

    @Test
    public void givenThreeNumberWhenFloatNumberShouldReturnMaxAtFirstPosition() {
        float value = new MaximumValue<Float>(9.0f, 5.0f, 6.0f).findMax();
        Assert.assertEquals(9.0f, value, 0.0f);
    }

    @Test
    public void givenThreeNumberWhenFloatNumberShouldReturnMaxSecondPosition() {
        float value = new MaximumValue<Float>(5.0f, 9.0f, 6.0f).findMax();
        Assert.assertEquals(9.0f, value, 0.0f);
    }

    @Test
    public void givenThreeNumberWhenFloatNumberShouldReturnMaxThirdPosition() {
        float value = new MaximumValue<Float>(9.0f, 5.0f, 11.0f).findMax();
        Assert.assertEquals(11.0f, value, 0.0f);
    }

    @Test
    public void givenThreeNumberWhenStringValueShouldReturnMaxAtFirstPosition() {
        String value = new MaximumValue<String>("peach", "apple", "banana").findMax();
        Assert.assertEquals("peach", value);
    }

    @Test
    public void givenThreeNumberWhenStringValueShouldReturnMaxAtSecondPosition() {
        String value = new MaximumValue<String>("apple", "peach", "banana").findMax();
        Assert.assertEquals("peach", value);
    }

    @Test
    public void givenThreeNumberWhenStringValueShouldReturnMaxAtThirdPosition() {
        String value = new MaximumValue<String>("apple", "banana", "peach").findMax();
        Assert.assertEquals("peach", value);
    }

}