package alixar.examen;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class principal {

  public static void main(String[] args) {

    material[] m = new material[10];

    m[0] = new material("nombre1", 99, 56, 29, material.Tipo.no_movible, "mezcla1");
    m[1] = new material("nombre2", 56, 23, 12, material.Tipo.movible, "mezcla2");
    m[2] = new material("nombre3", 34, 76, 65, material.Tipo.no_movible, "mezcla3");
    m[3] = new material("nombre4", 65, 34, 23, material.Tipo.movible, "mezcla4");
    m[4] = new material("nombre5", 29, 67, 76, material.Tipo.no_movible, "mezcla5");
    m[5] = new material("nombre6", 26, 86, 19, material.Tipo.movible, "mezcla6");
    m[6] = new material("nombre7", 75, 73, 2, material.Tipo.no_movible, "mezcla7");
    m[7] = new material("nombre8", 23, 36, 45, material.Tipo.movible, "mezcla8");
    m[8] = new material("nombre9", 52, 14, 83, material.Tipo.no_movible, "mezcla9");
    m[9] = new material("nombre10", 21, 97, 46, material.Tipo.movible, "mezcla10");

    pico[] p = new pico[1];

    p[0] = new pico(34.5);

    System.out.println(Arrays.toString(p));

    cristal[] c = new cristal[1];

    c[0] =
        new cristal(
            "cristal1", 3, 2, 5, material.Tipo.movible, "opalo", cristal.Tipo_cristal.translucido);
    roca[] r = new roca[1];
    System.out.println("Cristal: " + Arrays.toString(c));
    r[0] = new roca("roca1", 2, 6, 24, material.Tipo.no_movible, "roca", 23);
    System.out.println("Roca: " + Arrays.toString(r));

    Arrays.sort(m);
    Arrays.sort(
        m,
        new Comparator() {
          public int compare(Object ob1, Object ob2) {
            int resultado;
            material c1 = (material) ob1;
            material c2 = (material) ob2;

            if (c1.masa < ((material) c2).masa) {
              resultado = -1;
            } else {
              if (c2.masa > ((material) c1).masa) {
                resultado = 1;
              } else {
                resultado = 0;
              }
            }
            return resultado;
          }
        });

    System.out.println("Ordenado por masa: " + Arrays.toString(m));

    Arrays.sort(m);
    Arrays.sort(
        m,
        new Comparator() {
          public int compare(Object ob1, Object ob2) {
            int resultado;
            material c1 = (material) ob1;
            material c2 = (material) ob2;

            if (c1.quemadura < ((material) c2).quemadura) {
              resultado = -1;
            } else {
              if (c2.quemadura > ((material) c1).quemadura) {
                resultado = 1;
              } else {
                resultado = 0;
              }
            }
            return resultado;
          }
        });

    System.out.println("Ordenado por quemadura: " + Arrays.toString(m));

    Arrays.sort(m);
    Arrays.sort(
        m,
        new Comparator() {
          public int compare(Object ob1, Object ob2) {
            int resultado;
            material c1 = (material) ob1;
            material c2 = (material) ob2;

            if (c1.diluir < ((material) c2).diluir) {
              resultado = -1;
            } else {
              if (c2.diluir > ((material) c1).diluir) {
                resultado = 1;
              } else {
                resultado = 0;
              }
            }
            return resultado;
          }
        });

    System.out.println("Ordenado por diluir: " + Arrays.toString(m));
  }
}
