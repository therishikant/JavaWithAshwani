package com.ashwani.utils;

public class ArrayProblem {
    public void print(int arr[]){
        for(int i=0;i< arr.length; i++){
            System.out.print(arr[i] + " ");
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
        print(arr);
        System.out.println("");
        int n = arr.length;
        int i, j, temp;
        int newArr[] = new int[arr.length];
        for (i = 0; i < n; i++)
        {
            for (j = i+1; j < n; j++)
            {
                if (arr[j] < arr[i])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        print(newArr);
    }

}
