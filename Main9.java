package com.company;

import java.util.Scanner;

public class Main9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int w = 1;
        int y = 0;
        n = in.nextInt();
        int q = n;
        while (q > 0) {
            q = q / 10;
            y++;
        }
        int[] A = new int[y];
        for (int i = 0; i < y; i++) {
            A[y - i - 1] = (n / 10);
            n = n / 10;
        }
        for (int i = 0; i < (y/2); i++)
        {
            if (A[i]==A[y-i-1])
            {
                w = 1;
            }
            else
            {
                w = 0;
                break;
            }
        }
        if (w==1)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}