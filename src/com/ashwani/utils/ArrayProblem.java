package com.ashwani.utils;

import java.util.Scanner;

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
        System.out.print("this is your intial array: ");
        print(arr);
        System.out.println("");
        int n = arr.length;
        int i, j, temp;
        System.out.print("enter the index value :");
        Scanner sc= new Scanner(System.in);
        int m=sc.nextInt();
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
        print(arr);
        System.out.println(" ");
        System.out.print("your value is "+ arr[m-1]+" at index value "+ m );
    }

    public void findFrequency(int arr[]){
        int count =0;
        System.out.print("enter the Number to find it's Frequency: ");
        Scanner sc=new Scanner(System.in);
        int m = sc.nextInt();
        for (int i=0; i<arr.length;i++){
            if(arr[i]==m){
                count++;
            }
        }
        print(arr);
        System.out.println(" ");
        System.out.println("Frequency of "+m+" is "+count);
        
    }

    public void sort012(int arr[]){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[j] < arr[i])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            
        }
        print(arr);
    }

    public void subarraySum(int arr[]){
        System.out.print("enter a sum value :");
        Scanner sc= new Scanner(System.in);
        int m= sc.nextInt();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum = sum+arr[j];
                if(sum==m){
                    System.out.println(j);
                    break;
                }
                else{
                    System.out.println("please input valid sum.");
                }
            }
        }
    }
}
