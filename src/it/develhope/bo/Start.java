package it.develhope.bo;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        System.out.println("--------Starting operations -----------");

        System.out.println("2 <= 2 && !true: " + (2 <= 2 && !true));

        System.out.println("-----------------------------------------");

        System.out.println("!false && 3 > 2: " + (!false && 3 > 2));

        System.out.println("-----------------------------------------");

        boolean t = false;
        boolean f = true;
        System.out.println("!(!t || f): " + (!(!t || f)));

        System.out.println("------------------------------------------");

        System.out.println("6 > 6 ^ !(true && true): " + (6 > 6 ^ !(true && true)));

        System.out.println("----------------------------------------");

    }
}


