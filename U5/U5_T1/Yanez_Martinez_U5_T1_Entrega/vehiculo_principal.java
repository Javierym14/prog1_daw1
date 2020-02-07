package alixar.Entrega;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
public class vehiculo_principal  {




    public static void main(String[] args) {


       terrestre[] t=new terrestre[6];

        t[0]=new coche("9875PLJ", "1999-02-04", terrestre.Color.amarillo, "Toyota", 5);
        t[1]=new coche("1548LMN", "2014-07-06", terrestre.Color.azul, "Audi", 3);
        t[2]=new coche("4569HBJ", "2011-07-06", terrestre.Color.amarillo, "Kia", 2);
        t[3]=new moto("1234JNK", "2019-02-04", terrestre.Color.rojo, "BMW", 2);
        t[4]=new moto("3214HNJ", "2013-07-06", terrestre.Color.verde, "Yamaha", 2);
        t[5]=new moto("1478FCG", "2010-07-06", terrestre.Color.azul, "Honda", 5);



        System.out.println("Terrestres ordenados: " + Arrays.toString(t));

        helicoptero[] h=new helicoptero[1];

        h[0]=new helicoptero("UP-A300I", 2000, aereo.Tipo.helicoptero, "Havilland", 9);

        System.out.println(Arrays.toString(h));

        avioneta[] a=new avioneta[1];
        a[0]=new avioneta("UP-B451D", 2020, aereo.Tipo.avioneta, "YoVuelo", 56);

        System.out.println(Arrays.toString(a));







        }
    }

