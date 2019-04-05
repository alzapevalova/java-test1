package com.company;

public class Main2 {
    public static void main(String[] args) {
        int n, a, b, c, i;
        n = 40;
        a= 0;
        b = a + 1;
        System.out.println(a);
        System.out.println(b);
        for (i=0; i <= n-2; i++) {
            c = a + b;
            System.out.println(c);
            a=b;
            b=c;
        }
        }
    }

