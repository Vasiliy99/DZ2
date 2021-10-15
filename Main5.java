package com.company;

import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) A[i] = in.nextInt();
        for (int i = 1; i < n; i++) {
            while (A[i] / 10 > 0) {
                A[i] = A[i] / 10;
            }
        }
        for (int i = 1; i < n; i++) {
            System.out.println(A[i]);
        }
    }
}


