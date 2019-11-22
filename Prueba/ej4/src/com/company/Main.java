package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner teclado=new Scanner(System.in);

        int n[]={1, 2, 3, 4, 5};
        System.out.println(convierteArrayEnString(n));

    }
        public static String convierteArrayEnString(int[] n) {

            String c="";

            for (int i = 0; i <n.length ; i++) {
                c=c + n[i];

            }
return c;
        }





    }


