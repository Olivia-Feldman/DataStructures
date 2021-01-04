package com.company;

public class BubbleSort {

    public static void main(String[] args) {


        //creating a bubbleSort algorithm with O (n^2) time complexity.
        //a quadratic alogorithm

        int[] intArray = { 20,35,-15,7,55,1,-22};

        //lastUnsortedIndex goes from 6 to zero
        for (int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex>0; lastUnsortedIndex--){
            for(int i =0;i <lastUnsortedIndex;i++ ){

                if(intArray[i]>intArray[i+1]){
                    swap(intArray, i , i+1);
                }
            }

        }
        //print bubbleSorted array
        for(int i =0; i<intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] array, int i, int j){

        //if the elements equal each other no reason to swap
        if ( i == j){
            return;
        }
        int temp = array[i]; //saving first value in a temp variable
        // swapping array values
        array[i] = array[j];
        array[j] = temp;


    }
}
