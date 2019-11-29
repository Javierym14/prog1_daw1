package Examen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner teclado = new Scanner(System.in);

        int n;

        System.out.print("Introduce un numero: ");
        n = teclado.nextInt();
        teclado.nextLine();

    }

    public String convierteEnMorse(int n) {

        String resultado = " ";
        for (int i = 0; i < n; i++) {
            if(i==1){
                resultado=". _ _ _ _";
            }
            if(i==2){
                resultado=". . _ _ _";
            }
            if(i==3){
                resultado=". . . _ _";
            }
            if(i==4){
                resultado=". . . . _";
            }
            if(i==5){
                resultado=". . . . .";
            }
            if(i==6){
                resultado="_ . . . .";
            }
            if(i==7){
                resultado="_ _ . . .";
            }
            if(i==8){
                resultado="_ _ _ . .";
            }
            if(i==9){
                resultado="_ _ _ _ .";
            }
            if(i==0){
                resultado="_ _ _ _ _";
            }

        }
    return resultado;

    }

}
