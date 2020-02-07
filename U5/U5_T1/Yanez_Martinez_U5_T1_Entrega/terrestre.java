package alixar.Entrega;

import java.util.Arrays;

public class terrestre extends vehiculo  implements Comparable {
    protected String matricula;
    protected String anio;

    public terrestre(String matricula, String anio, Color color, String nombre, int personas) {
        super(nombre, personas);
        this.matricula=matricula;
        this.anio=anio;
        this.color=color;
        this.personas=personas;
        this.nombre= nombre;
    }


    public enum Color{
        azul,
        rojo,
        verde,
        amarillo
    }

    public Color color;

    public void terrestre(){

    }

    public terrestre(String matricula, String anio, Color color, int transporta, String nombre, int personas ){
        super(nombre, personas);

        this.matricula=matricula;
        this.anio=anio;
        this.color=color;
        this.personas=personas;
        this.nombre= nombre;

    }

    @Override
    public boolean equals(Object terrestre){
        terrestre otro=(terrestre) terrestre;
        return this.matricula.equals(otro.matricula);
    }

    @Override
    public int compareTo(Object o) {
        terrestre otroTerrestre=(terrestre) o;
        return this.matricula.compareTo(otroTerrestre.matricula);
    }




}
