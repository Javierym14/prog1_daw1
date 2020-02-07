package alixar.Entrega;

public class aereo extends vehiculo {

   protected String codigo;
   protected int altitud;

    public aereo(String codigo, int altitud, Tipo tipo, String nombre, int personas) {
        super(nombre, personas);
        this.codigo=codigo;
        this.altitud=altitud;
        this.tipo=tipo;
        this.personas=personas;
        this.nombre=nombre;
    }


    public enum Tipo{
        helicoptero,
        avioneta
    }

    public Tipo tipo;

    public void aereo(){

    }

    public aereo(String codigo, int altitud, Tipo tipo, int transporta, String nombre, int personas ){
        super(nombre, personas);

        this.codigo=codigo;
        this.altitud=altitud;
        this.tipo=tipo;
        this.personas=personas;
        this.nombre=nombre;

    }
}
