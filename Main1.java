package com.company;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;
        int k = 1;
        while (i == 0) {
            if (k * k > n) {
                i = 1;
            }
            else {
                k = k + 1;
            }
        }
        System.out.println(k-1);
    }
}
