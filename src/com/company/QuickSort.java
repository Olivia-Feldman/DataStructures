package com.company;

public class QuickSort {

    public static void main(String[] args){
        int[] intArray = {20,35,-15,7,55,1,-22};
        quickSort(intArray,0, intArray.length);

        for(int i =0; i< intArray.length;i++){
            System.out.println(intArray[i]);
        }

    }
    public static void  quickSort(int[] input, int start, int end){

        //check if the array is a one element array then return ( already sorted)
        if(end-start<2){
            return;
        }

        //first find pivot
        int pivotIndex = partition(input,start,end);
        //using recursion to partition the array
        quickSort(input,start, pivotIndex);
        quickSort(input, pivotIndex+1, end);


    }

    /**
     * method partitions the array and returns the pivot index
     * @param input
     * @param start
     * @param end
     * @return
     */
    public static int partition(int[] input, int start, int end){

        int pivot = input[start];
        int i = start; //traverse left to right
        int j = end; //traverse right to left

        //alternating between i and j
        while(i < j){
            //stop when i adn j cross
            while(i<j && input[--j] >= pivot){} //empty whileloop
                if(i<j){
                    input[i] = input[j]; //move element to new index

                while (i<j && input[++i] <= pivot){}// empty whileloop
                    if(i<j){
                        input[j] = input[i];
                    }


            }


        }
        input[j] = pivot;
        return j;




    }
}
