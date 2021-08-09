package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {

    public Integer compute(int i) {

        if (i == -1) {
            throw new IllegalArgumentException("Negative value!");
        }


        int total = 1;
        for (int x = 1; x <= i; x++) {
            total = total * x;
        }
        return total;

    }
}


