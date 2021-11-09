package com.ashwani.main;


import com.ashwani.utils.ArrayProblem;

class Driver{
    public static void main(String[] args) {
        ArrayProblem arrayProblem = new ArrayProblem();
        int arr[]={1,2,1,3,0,0,0,1,3,9,0,8,5,7,5,7};

        arrayProblem.sort012(arr);
    }
}