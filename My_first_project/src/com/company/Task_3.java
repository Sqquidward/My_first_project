package com.company;

import java.util.Scanner;

public class task_2 {
    static int k = 0;
    public static void main(String[] args) {
        sum();
    }
    public static int sum(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i = 0; i < b * 10; i += 10) {
            k += (a + i);
        }
        for (int i = 90; i < b * 10 + 90; i += 10) {
            k += (a + i);
        }
        for (int i = 210; i < b * 10 + 200; i += 10) {
            k += (a + i);
        }
        System.out.println(k);
        return k;
        
    }
}
