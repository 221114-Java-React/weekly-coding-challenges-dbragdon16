package com.revature.problem1;


public class Solution {
    //Finding the smallest value larger than k not in the array
    public int elementNotInArray(int[] arr, int k) {
        Integer minMax = k;
        boolean running = true;
        int counter = 0;
        
        while(running){
            for(int i = 0; i < arr.length - 1; i++){
                if (arr[i] == minMax){
                    minMax++;
                    counter = 0;
                } else {
                    counter++;
                }
            }
            if(counter == arr.length-2){
                running = false;
            }
        }

        return minMax;
    }
}
