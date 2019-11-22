package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int a[] = {0, 1, 2, 3, 4, 5};
        System.out.println(aleatorioDeArray(a));


    }
    public static int aleatorioDeArray(int[] a){
        int aleatorio = (int) Math.floor(Math.random()*(a.length));


        return aleatorio;
    }

}
