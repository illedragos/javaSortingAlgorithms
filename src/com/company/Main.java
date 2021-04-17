package com.company;

public class Main {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();

        int v1[] = new int[]{2,5,7,1,6,9};
        int v2[] = new int[]{2,5,7,1,6,9};
        int v3[] = new int[]{3,9,6,8,1,2,4};

        v1=BubbleSort.sort(v1);
        afisare(v1);
        System.out.println("");
        System.out.println("**********************");

        v2=SelectionSort.sort(v2);
        afisare(v2);

        System.out.println("");
        System.out.println("**********************");

        v3=InsertionSort.sort(v3);
        afisare(v3);


    }

    public static void afisare(int []a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
    }
}
