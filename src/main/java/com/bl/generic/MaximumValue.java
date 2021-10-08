package com.bl.generic;

public class MaximumValue {

    /**
     * Find Integer maximum value
     */
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

    /**
     * Find float maximum value
     */
    public Float findMax(Float value1, Float value2, Float value3) {
        Float max = value1;
        if (value2.compareTo(max) > 0) {
            max = value2;
        }
        if (value3.compareTo(max) > 0) {
            max = value3;
        }
        System.out.println("Maximum Float number is " + max);
        return max;
    }

    /**
     * Find String maximum value
     */
    public String findMax(String value1, String value2, String value3) {
        String max = value1;
        if (value2.compareTo(max) > 0) {
            max = value2;
        }
        if (value3.compareTo(max) > 0) {
            max = value3;
        }
        System.out.println("Maximum String number is " + max);
        return max;
    }

}
