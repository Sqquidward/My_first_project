package com.company;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = Math.max(a, b);
        bol(c);

    }
    static void bol(int c){
        System.out.println(c);

    }
}
