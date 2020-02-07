package alixar.Entrega;

public class helicoptero extends aereo {


    public helicoptero(String codigo, int altitud, Tipo tipo, String nombre, int personas) {
        super(codigo, altitud, tipo, nombre, personas);
    }

    @Override
    public String toString() {
        return "El codigo del avion es: " + codigo + " vuela a una altitud de: " + " es de tipo: " + tipo + " transporta: " + personas +" personas" + " y se llama: " + nombre;

    }
}
