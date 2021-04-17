package com.company;
/* Bubble Sort is the simplest sorting algorithm that works by repeatedly
   swapping the adjacent elements if they are in wrong order.
   */
public class BubbleSort{

    public static int[] sort(int arr[]){

        int n= arr.length, temp;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

}
