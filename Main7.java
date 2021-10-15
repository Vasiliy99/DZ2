package com.company;

import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int m;
        m = in.nextInt();
        int[][] A = new int[n][m];
        for (int i1=1; i1<=n; i1++)
        {
            for (int i2=1; i2<=m; i2++)
            {
                A[i1][i2]=i1*i2;
            }
        }
        for (int i1=1; i1<=n; i1++)
        {
            for (int i2=1; i2<=m; i2++)
            {
                System.out.println(A[i1][i2]);
            }
        }


    }
}