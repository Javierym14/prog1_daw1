package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner teclado = new Scanner(System.in);
        int[][] num = new int[4][5];

        int fila;
        int columna;
        int n;


        System.out.println("Introduzca los números: ");
        n = teclado.nextInt();
        teclado.nextLine();

        for (fila = 0; fila < 4; fila++) {
            for (columna = 0; columna < 5; columna++) {
                System.out.print("Fila " + fila + ", columna " + columna + ": ");

            }
        }


    }
}