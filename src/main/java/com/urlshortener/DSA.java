package com.urlshortener;

public class DSA {
    public static int countNumber(int[]arr1, int target){
        int count = 0;
        for (int num : arr1) {
            if (num == target) {
                count++;
            }
        }
        return count;
     }

  public static int  linearSearch(int[]arr,int target){
        int index = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i] == target){
                 return i;
            }
        }
    return -1;
 }


public static void main(String[] args){

            int[] number1 = {3, 7, 1, 9, 4};
            int largest1 = number1[0];

            for (int nums : number1) {
                if (nums > largest1) {
                    largest1 = nums;

                }

            }
            System.out.println("The largest number is:" + largest1);

            int[] number2 = {15, 2, 8, 15, 6};

            int largest2 = number2[0];

            for (int nums : number2) {
                if (nums > largest2) {
                    largest2 = nums;
                }
            }

            System.out.println("Largest number is " + largest2);


            //sum
            int[] number = {1, 2, 3, 4, 5};
            int sum = 0;  // start sum from 0
            for (int num : number) {
                sum = sum + num;
            }

            System.out.println("sum is" + sum);

            //find the smallest thing:
            int[] number3 = {3, 7, 1, 9, 4}; // list of numbers
            int smallest = number3[0]; // considering the 1st number as the smallest number
            for (int num : number3) {  // looking at each number if the current number is smaller than 1st number
                if (num < smallest) {   // take the current number.
                    smallest = num; // update the smallest number
                }

            }
            System.out.println("Smallest number is " + smallest);


            //reverse the array
            int[] arr = {1, 2, 3, 4, 5};
            int i = 0; //start with 0 index
            int j = arr.length - 1;// last index of the array


            while (i < j) {// ne to swap 1st with the last until we reach at the middle
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                --j;
            }
            //print reversed array;
            for (int num : arr) {

                System.out.println(num + " ");
            }


            // loop and counting
            int[] arr2 = {1, 2, 1, 3, 1, 4};
            int result = countNumber(arr2, 2);
            System.out.println("count " + result);

            int[] arr4 = {22, 35, 22, 78, 22};
            result = countNumber(arr4, 22);
            System.out.println("count " + result);


             //LinerSearch
    int []arr0= {10, 20, 30, 40};
             result = (linearSearch(arr0,30));
    System.out.println("Index " + result);

    int[] arr5 = {10, 20, 30, 40};
     result = (linearSearch(arr5,90));
    System.out.println("Index " + result);

    int[] arr6 = {5, 15, 25};
    result = (linearSearch(arr6,30));
    System.out.println("Index " + result);
    }
     }