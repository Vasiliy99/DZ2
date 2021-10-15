package com.company;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 1;
        int S = 0;
        while (n>0) {
            n = in.nextInt();
            S=S+n;
        }
        int i = 0;
        int k = 1;
        while (i == 0) {
            if (k * k > S) {
                i = 1;
            }
            else {
                k = k + 1;
            }
        }
        System.out.println(k-1);
    }
}

