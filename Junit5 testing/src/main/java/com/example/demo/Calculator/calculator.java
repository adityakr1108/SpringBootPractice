package com.example.demo.Calculator;

public class calculator {
    public String reverseString(String s){
        int low = 0;
        int high = s.length()-1;
        char [] arr = s.toCharArray();
        while(low < high){
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return new String(arr);
    }
}
