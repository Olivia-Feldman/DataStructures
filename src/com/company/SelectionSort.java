package com.company;

public class SelectionSort {


    public static void main(String[] args) {

        // creating and declaring array
        int[] intArray = new int[]{20,35,-17,7,55,1,-22};


        //SelectionSort Algorithm

        for( int lastIndexUnsorted = intArray.length-1; lastIndexUnsorted>0; lastIndexUnsorted--){

            int largest =0;//largest value when we start at index 0


            // we need to compare all elements in the array including the last index (<=)
            for(int i =1; i <= lastIndexUnsorted; i++){

                if(intArray[i]> intArray[largest]){
                    //updating and finding the index with the largest value
                    largest = i;

                }
            }
            //swapping the largest found value in unsorted partition with the lastIndex of the sorted partition
            swapSelection(intArray, largest,lastIndexUnsorted);


        }

        for(int i =0; i < intArray.length;i++){
            System.out.println(intArray[i]);
        }



    }

        // arrays are pass-by-reference
       public static void swapSelection(int[] array ,int i , int j){

        if(i ==j){
            return;
        }
        int temp = array[i];
        array[i] =array[j];
        array[j] = temp;
        }

    }
