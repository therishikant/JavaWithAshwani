package com.ashwani.utils;

public class ArrayProblem {
    public void print(int arr[]){
        for(int i=0;i<= arr.length; i++){
            System.out.println(arr[i]);
        }

    }

    public void reverseArray(int arr[]){
        int newArr[]=new int[arr.length];
        int a=0;
        for(int i=arr.length-1; i>=0;i--){
            newArr[a]=arr[i];
            a++;
        }

        print(newArr);

    }

    public void kthElement(int arr[]){
        int newArray[]= new int[arr.length];
        for(int i=0; i<arr.length;i++){
            for(int j=0; j < i; j++){
                if(arr[j]<arr[j+1]){
                    newArray[i]=arr[j];
                }
            }
        }
        print(newArray);
    }
}
