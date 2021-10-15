package com.company;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 1;
        int A1 = 0;
        int A2 = 0;
        int A3 = 0;
        int A4 = 0;
        int A5 = 0;
        while (n>0) {
            n = in.nextInt();
            if (n > A1) {
                A1 = n;
                A2 = A1;
                A3 = A2;
                A4 = A3;
                A5 = A4;
            }
            if (n>A2)
            {
                if (n<A1)
                {
                    A2=n;
                    A3=A2;
                    A4=A3;
                    A5=A4;
                }
            }
            if (n>A3)
            {
                if (n<A2)
                {
                    A3=n;
                    A4=A3;
                    A5=A4;
                }
            }
            if (n>A4)
            {
                if (n<A3)
                {
                    A4=n;
                    A5=A4;
                }
            }
            if (n>A5)
            {
                if (n<A4)
                {
                    A5=n;
                }
            }
        }
        System.out.println(A1);
        System.out.println(A2);
        System.out.println(A3);
        System.out.println(A4);
        System.out.println(A5);
    }
}

