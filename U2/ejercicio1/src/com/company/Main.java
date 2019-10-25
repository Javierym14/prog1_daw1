package com.company;

import java.util.Scanner;
import java.lang.String;
public class Main {

    public static void main(String[] args) {
        // write your code here
        float nota1;
        float nota2;
        float nota3;

        String apto = "apto";
        String no_apto = "no apto";

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la primera nota: ");
        nota1 = teclado.nextFloat();
        teclado.nextLine();
        System.out.print("Introduce la segunda nota: ");
        nota2 = teclado.nextFloat();
        teclado.nextLine();
        System.out.print("Introduce la tercera nota: ");
        nota3 = teclado.nextFloat();
        teclado.nextLine();

        float media = (nota1 + nota2 + nota3) / 3;

        if (media >= 5 && media < 6) {
            System.out.println("El alumno está aprobado");
            System.out.println("Tu nota de programación es: " + media + " -" + " suficiente");

        }
        if (media >= 6 && media < 7) {
            System.out.println("El alumno está aprobado");
            System.out.println("Tu nota de programación es: " + media + " -" + " bien");
        }
        if (media >= 7 && media < 9) {
            System.out.println("El alumno está aprobado");
            System.out.println("Tu nota de programación es: " + media + " -" + " notable");
        }
        if (media >= 9 && media <= 10) {
            System.out.println("El alumno está aprobado");
            System.out.println("Tu nota de programación es: " + media + " -" + " sobresaliente");
        }
        if (media < 5) {
            System.out.print("¿Cuál ha sido el resultado de la recuperación?: ");
            String recu = teclado.nextLine();


            if (recu.equals(apto)) {
                System.out.print("Tu nota de programación es 5" + " suficiente");
            } else {
                if (recu.equals(no_apto)) {
                    System.out.print("Tu nota de programación es: " + media + " suspenso");
                }

            }
        }
    }
}
