package com.example.demo.arraySorting;

import java.util.Arrays;
public class arraySorting {
    public int[] sortedArray(int arr[]){
        Arrays.sort(arr);
        return arr;
    }

    public int[] sortingWithMaxTime(int arr[]){
        for(int i = 0;i<1000000;i++){
            Arrays.sort(arr);
        }
        return arr;
    }
}
