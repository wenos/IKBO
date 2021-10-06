package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner ck = new Scanner(System.in);
        int num = 12;
        /*
        if (num > 5) {
            System.out.println("more");
        } else if (num == 5) {
            System.out.println("==");
        } else {
            System.out.println("less");
        }
        */
        /*
        while (num < 10){
            System.out.println(num);
            num += 1;
        }

        do {
            System.out.println(num);
            num -= 1;
        } while (num > -1);
        */


        for (int i = 0; i < num; i++){
            System.out.println();
        }

        int n = ck.nextInt();
        int m = ck.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++){
                arr[i][j] = i * m + j;
            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }       
            System.out.println();
        }

    }
    /*
        static int readNumber(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    */
}
