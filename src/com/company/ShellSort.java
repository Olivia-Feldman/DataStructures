package com.company;

/**
 * this class implements the shell sort algorithm for arrays
 * this is an in-place-algorithm and unstable algorithm
 * time complexity: o(n^2)
 * variation of insertion with reduction of shifting
 */
public class ShellSort {

    public static void main(String[] args){


        int[] intArray = new int[]{20,35,-15,7,55,1,-22};

        for(int gap = intArray.length/2; gap >0;gap /=2){

            for(int i = gap; i < intArray.length; i++){
                int newElement = intArray[i];
                int j = i;
                while (j>= gap && intArray[j-gap] > newElement){

                    intArray[j] = intArray[j-gap];
                    j -= gap;
                }
                intArray[j] = newElement;

            }

        }


        for(int i =0; i < intArray.length;i++){
            System.out.println(intArray[i]);
        }

    }
}
