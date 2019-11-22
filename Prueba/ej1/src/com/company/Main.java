package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int mesa[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int ocupacion[] = {3, 2, 0, 2, 4, 1, 0, 2, 1, 1};
        int personas;
        int aux;
        Scanner teclado = new Scanner(System.in);


        System.out.println("Cuantos son: ");
        personas = teclado.nextInt();
        teclado.nextLine();

        if (personas > 4) {
            System.out.println("Lo siento no admitimos grupos de " + personas);
        }

        int j = 0;
        for (int i = 0; i < 10; i++) {
            if (ocupacion[i] == 0) {

                ocupacion[i] = personas;

            }
        }
            System.out.println("Sientese en la mesa numero: " + mesa[j]);
            j++;



    }
}