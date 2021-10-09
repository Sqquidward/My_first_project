package com.company;

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args){
        sum();
    }


    public static int sum(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = Math.max(a, b);
        System.out.println(c);
        return c;
    }
}
