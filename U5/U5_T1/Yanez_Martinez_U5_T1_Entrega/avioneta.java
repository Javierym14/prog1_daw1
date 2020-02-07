package alixar.Entrega;

public class avioneta extends aereo {


    public avioneta(String codigo, int altitud, Tipo tipo, String nombre, int personas) {

        super(codigo, altitud, tipo, nombre, personas);
    }

    public String toString(){
        return "El codigo de la avioneta es: " + codigo +
                " vuela a una altitud de: " + altitud + " es de tipo: " + tipo + " transporta: " + personas + " personas" + " y se llama: " + nombre;
    }
}
