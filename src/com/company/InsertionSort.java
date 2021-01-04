package com.company;


/**
 * this class implements the Insertion sort for arrays.
 * time complexity is of : o(n^2)
 *
 */
public class InsertionSort {

    public static void main(String[] args) {

        int[] intArray = { 20,35,-15,7,55,1,-22};
        int i;
        //sorted partioned array starts at the first index and traversing through partiioned array
        for(int firstUnsortedIndex =1; firstUnsortedIndex< intArray.length;firstUnsortedIndex++){
            int newElement = intArray[firstUnsortedIndex];

            // right to left to see where to insert new element and stop at front at the beginning of array
            for( i = firstUnsortedIndex; i >0 && intArray[i-1]>newElement; i--){
                intArray[i] = intArray[i-1]; //shifting left to right to insert new element array

            }
            intArray[i] = newElement;
        }

        for(i =0; i <intArray.length;i++){
            System.out.println(intArray[i]);
        }

    }
}
