package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class task_2 {
    public static void main(String[] args){
        max();
    }
    public static int max(){
        Scanner in = new Scanner(System.in);
        int d;
        int [] A = new int[3];
        for (int i = 0; i < 3; i++){
            A[i] = in.nextInt();
        }
        Arrays.sort(A);
        int D = A[2];
        System.out.println(D);
        return D;
    }
}
