package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BMI {
    public static void main(String[] args) throws IOException {

        float heightJoan, weightJoan, bmiJoan;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("This is a program to calculate your BMI");
        System.out.println("Enter your height in cm");
        heightJoan = Float.parseFloat(br.readLine())/100;
        System.out.println("Enter your weight in kg");
        weightJoan =Float.parseFloat(br.readLine());
        bmiJoan = (float) (weightJoan/(Math.pow(heightJoan, 2)));
        System.out.printf("Your BMI is " + "%2.2f, \n", bmiJoan);

        if (bmiJoan<16){
            System.out.println("You are starving");
        }else if ((bmiJoan>=16)&&(bmiJoan<16.99)){
            System.out.println("You are emaciation");
        }else if ((bmiJoan>=17)&&(bmiJoan<18.49)){
            System.out.println("You are underweight");
        }else if ((bmiJoan>=18.50)&&(bmiJoan<22.99)){
            System.out.println("You are normal, low range");
        }else if ((bmiJoan>=23)&&(bmiJoan<24.99)){
            System.out.println("You are normal, high range");
        }else if ((bmiJoan>=25)&&(bmiJoan<27.49)){
            System.out.println("You are overweight, low range");
        }else if ((bmiJoan>=27.50)&&(bmiJoan<29.99)){
            System.out.println("You are overweight, high range");
        }else if ((bmiJoan>=30)&&(bmiJoan<34.99)){
            System.out.println("You are 1st degree obesity");
        }else if ((bmiJoan>=34.99)&&(bmiJoan<39.99)){
            System.out.println("You are 2nd degree obesity");
        }else if (bmiJoan>40){
            System.out.println("You are 3rd degree obesity");
        }

    }
}
