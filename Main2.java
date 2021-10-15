package com.company;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int[] A = new int[n];
        for (int i=0; i<n; i++) A[i] = in.nextInt();
        int max = A[0];
        int min = A[0];
        int sr = A[0];
        for (int i=1; i<n; i++)
        {
            if (A[i]>max)
            {
                max = A[i];
            }
            if (A[i]<min)
            {
                min = A[i];
            }
            sr = sr + A[i];
        }
        sr /= 2;
        System.out.println(max);
        System.out.println(min);
        System.out.println(sr);
    }
}

