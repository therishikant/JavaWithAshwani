package com.rishi.utils;

public class ArrayProblem {
    public void print(){
        System.out.println("Printing Array");
    }

    public String getMinMaxElement(int arr[]){
        int min=arr[0], max=arr[0];
        for(int i=0; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }if(arr[i] < min){
                min = arr[i];
            }
        }
        return "Min Value in Array is:" + min + " and Max value in Array is:" + max;
    }

}
