package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Task_2 {
        public static void main(String[] args){    Scanner in = new Scanner(System.in);
            int d;
            int [] A = new int[3];
            for (int i = 0; i < 3; i++){
                A[i] = in.nextInt();
            }
            Arrays.sort(A);
            int D = A[2];
            bol(D);

        }
        public static int bol(int D){
            System.out.println(D);
            return D;
        }
}
