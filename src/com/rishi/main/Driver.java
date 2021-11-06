package com.rishi.main;

import com.rishi.utils.ArrayProblem;

class Driver{
    public static void main(String[] args) {

        ArrayProblem arrayProblem = new ArrayProblem();

        int arr[] = {1,2,3,4,0,6,7,8,55};

        System.out.println(arrayProblem.getMinMaxElement(arr));
    }
}