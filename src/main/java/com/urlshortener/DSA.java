package com.urlshortener;

public class DSA {
    public static void main(String[]args){

        int [] number1 = {3, 7, 1, 9, 4};
         int largest1=number1 [0];

        for (int nums:number1){
            if( nums > largest1){
                 largest1 = nums;

            }

        }
System.out.println("The largest number is:" + largest1);

         int[]number2 = {15, 2, 8, 15, 6};

        int largest2 = number2[0];

        for(int nums: number2){
            if(nums > largest2){
               largest2 = nums;
            }
        }

System.out.println("Largest number is "+ largest2);


       //sum
        int[] number = {1,2,3,4,5};
        int sum = 0;  // start sum from 0
        for(int num:number){
            sum = sum + num;
        }

        System.out.println("sum is"+sum);


    }
}
