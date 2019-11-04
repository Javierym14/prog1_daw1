package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner teclado=new Scanner(System.in);

        long n;

        System.out.print("Introduce un número entero: ");
        n=teclado.nextLong();

        for (int i = 0; i <=n ; i++) {
            if (i == 1) {
                System.out.print("El 1 está");
            }
        }


    }
}
