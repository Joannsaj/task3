package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Calculator {
    public static void main(String[] args) throws IOException {

        float firstNumberJoan, secondNumberJoan, sum, difference, product, quotient;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("This program calculates sum, difference, product and quotient for two numbers. ");
        System.out.println("Enter the first number:");
        firstNumberJoan = Float.parseFloat(br.readLine());
        System.out.println("enter the second number:");
        secondNumberJoan = Float.parseFloat(br.readLine());

        sum = firstNumberJoan + secondNumberJoan ;
        difference = firstNumberJoan - secondNumberJoan ;
        product = firstNumberJoan * secondNumberJoan ;
        quotient = firstNumberJoan / secondNumberJoan ;

        System.out.printf("You entered " + "%.02f", firstNumberJoan);
        System.out.printf(" and " + "%.02f", secondNumberJoan);


        System.out.printf("\nThe sum of the numbers is " + "%.02f, \n", + sum);
        System.out.printf("The difference of the numbers is " + "%.02f, \n", + difference);
        System.out.printf("The product of the numbers is " + "%.02f, \n", + product);
        System.out.printf("The quotient of the numbers is " + "%.02f, \n", + quotient);
    }
}
