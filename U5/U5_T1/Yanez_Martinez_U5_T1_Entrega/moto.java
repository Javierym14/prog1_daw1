package alixar.Entrega;

public class moto extends terrestre implements Comparable {


    public moto(String matricula, String anio, Color color, String nombre, int personas) {
        super(matricula, anio, color, nombre, personas);
    }



    @Override
    public int compareTo(Object o) {
        moto otraMoto = (moto) o;
        return this.matricula.compareTo(otraMoto.matricula);
    }

    @Override
    public boolean equals(Object moto) {
        moto otra = (moto) moto;
        return this.matricula.equals(otra.matricula);
    }

    @Override
    public String toString() {
        return "La matricula de la moto es: " + matricula + " el color es: " + color + " y es del año: " + anio + " transporta: " + personas + " personas" + " y se llama: " + nombre;

    }
}
