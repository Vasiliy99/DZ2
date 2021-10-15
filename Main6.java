package com.company;

import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int S = 0;
        n = in.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) A[i] = in.nextInt();
        for (int i = 1; i < n; i++) {
            if (A[i]%100==11)
            {
                if (A[i]>S)
                {
                    S = A[i];
                }
            }
        }
            System.out.println(S);
    }
}