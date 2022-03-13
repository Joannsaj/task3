package com.company;

public class EvenCollector {
    public static void main(String[] args) {
        int sumOfEven=0;
       for (int i = 1; i<=100; i++){
           if (i%2==0){
               sumOfEven += i;
           }
        }
        System.out.println("The sum of even numbers from 1 to 100 is " + sumOfEven);
    }
}
