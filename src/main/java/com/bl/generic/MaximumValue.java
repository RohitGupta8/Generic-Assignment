package com.bl.generic;

public class MaximumValue<T extends Comparable<T>> {

    T value1, value2, value3;

    public MaximumValue(T value1, T value2, T value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public static <T extends Comparable<T>> T testMaximum(T value1, T value2, T value3) {
        T max = value1;
        if (value2.compareTo(max) > 0) {
            max = value2;
        }
        if (value3.compareTo(max) > 0) {
            max = value3;
        }
        System.out.println("Maximum value is " + max);
        return max;
    }

    public T findMax() {
        return MaximumValue.testMaximum(value1, value2, value3);
    }

}