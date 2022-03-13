package com.company;

import java.util.Random;

public class MinAndMax {
    public static void main(String[] args) {
        int setSize =10, i =1,number, min=101,max=0;

        System.out.println("Program which will find the largest and  smallest number from the set of 10 randomly drawn integers from 1 to 100");

        Random rnd = new Random();
        System.out.println("The drawn numbers are: ");
        while (i<=setSize){
            number = Math.round((rnd.nextInt(100)+1));
            System.out.print( number + " , ");

            if (number<min)min = number;
            if (number>max)max = number;
            i++;
        }
        System.out.println("\nThe largest number in the set of numbers is " + max);
        System.out.println("The smallest number in the set of numbers is " + min);

    }
}
