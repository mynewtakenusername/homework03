package com.company;

public class Main {
    public static void main(String[] args) {
        //  int age = 40;
       // boolean isVip = false;
        //System.out.println("discount = " + getDiscount(age, isVip));
        System.out.println("discount1 = " + getDiscount(40, false));
        System.out.println("discount2 = " + getDiscount(40, true));
        System.out.println("discount3 = " + getDiscount(65, false));
        System.out.println("discount4 = " + getDiscount(65, true));
        System.out.println("discount5 = " + getDiscount(16, false));
        System.out.println("discount6 = " + getDiscount(16, true));
    }

    private static int getDiscount(int age, boolean isVip) {
        int discount = 0;
        if (age > 64) {
            discount = 10;
        } else if (age < 18) {
            discount = 25;
        }

        if (isVip) {
            discount = discount + 5;
        }

        return discount;
    }
}