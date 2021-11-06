package com.rishi.utils;

public class ArrayProblem {
    public void print(int arr[]){
        for (int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
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

    public void rotateArray(int arr[]){
        print(arr);
        int toRotate = arr[arr.length-1];
        for(int i=arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = toRotate;
        System.out.println("");
        print(arr);
    }

    public void getPairsCount(int[] arr, int n, int k) {
        // code here
        int count = 0;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i] + arr[j] == k){
                    count++;
                }
            }
        }
        System.out.println(count);
    }



}
