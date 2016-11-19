package com.ultraon.testing.intdiv;

import java.util.Random;

public class MainClass {

    private static int dividend, divider;

    public static void main(String[] args) {

        dividend = new Random().nextInt(9900) + 100;
        divider = new Random().nextInt(99) + 1;

        Division division = new Division(Integer.MIN_VALUE, 2);

        System.out.println(division.composeDivisionOutput());
    }

}
