package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner teclado = new Scanner(System.in);
        int base = 0;
        int ancho1  = 0;
        int ancho2 = 0;
        int i = 0;

        System.out.println("Introduce la base: ");
        base = teclado.nextInt();

        System.out.println("Introduce el primer ancho ");
        ancho1 = teclado.nextInt();

        System.out.println("Introduce el segundo ancho: ");
        ancho2 = teclado.nextInt();


        for (i = 1; i <= ancho2; ++i) {

            System.out.println("**");
        }


        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
    }
}
