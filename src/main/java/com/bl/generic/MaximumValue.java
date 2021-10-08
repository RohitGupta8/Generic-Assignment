package com.bl.generic;

public class MaximumValue {
    public Integer findMax(Integer value1, Integer value2, Integer value3) {
        Integer max = value1;
        if (value2.compareTo(max) > 0) {
            max = value2;
        }
        if (value3.compareTo(max) > 0) {
            max = value3;
        }
        System.out.println("Maximum Integer number is " + max);
        return max;
    }
}
