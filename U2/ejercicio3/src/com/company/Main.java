package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here




            Scanner teclado=new Scanner(System.in);


            System.out.println("Ingresa un numero decimal: ");

            long numerodecimal =teclado.nextLong();
            long n = numerodecimal;
            String binario="";

            for(int i=0; i<n; i-- )

                while (n >0){
                    binario = n %2 + binario;
                    n /=2;
                }
            System.out.println("El numero decimal: "+ numerodecimal +" en binario es: "+ binario);
        }    }