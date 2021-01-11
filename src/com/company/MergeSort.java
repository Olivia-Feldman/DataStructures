package com.company;

public class MergeSort {


        public static void main(String[] args) {
            int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
            mergeSort(intArray, 0, intArray.length);

            for (int j : intArray) {
                System.out.println(j);
            }
        }


        public static void mergeSort(int[] input, int start, int end) {
            //break when there are only one element arrays
            if (end - start < 2) {
                return;
            }
            //splitting array into two subArrays at midpoint
            int mid = (start + end) / 2;
            //using recursion to traverse through the left subtree then the right subtree
            mergeSort(input, start, mid);
            mergeSort(input, mid, end);
            merge(input, start, mid, end);


        }

        // { 20, 35, -15, 7, 55, 1, -22 }
        public static void merge(int[] input, int start, int mid, int end) {
            //check to see if subtrees are already perfectly sorted by comparing first and last elements in partitioned arrays
            if (input[mid - 1] <= input[mid]) {
                return;
            }

            int i = start;
            int j = mid;
            int tempIndex = 0;

            int[] temp = new int[end - start];
            while (i < mid && j < end) {
                //Ternary Operator statement used to return two values if condition is true or false respectively 
                temp[tempIndex++] = input[i] >= input[j] ? input[i++] : input[j++];
            }
            
            //copying subArrays into input arry
            System.arraycopy(input, i, input, start +tempIndex, mid - i);
            System.arraycopy(temp, 0, input, start, tempIndex);



        }

    }
