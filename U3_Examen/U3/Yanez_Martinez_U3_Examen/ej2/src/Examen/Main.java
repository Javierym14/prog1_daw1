package Examen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner teclado=new Scanner(System.in);

        long a;
        long b;

        System.out.print("Introduce el primer numero: ");
        a=teclado.nextLong();
        teclado.nextLine();

        System.out.print("Introduce el segundo numero: ");
        b=teclado.nextLong();
        teclado.nextLine();
        System.out.println(a+b);
    }

    public long juntaNumeros(long a, long b){


        System.out.println(a+b);

        return juntaNumeros(a, b);
    }

}
