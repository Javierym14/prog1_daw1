package alixar.Entrega;

public class coche extends terrestre {


    public coche(String matricula, String anio, Color color,  String nombre, int personas) {
        super(matricula, anio, color, nombre, personas);
    }



    @Override
    public String toString() {
        return "La matricula del coche es: " + matricula + " el color es: " + color + " y es del año: " + anio + " transporta: " + personas +" personas" + " y se llama: " + nombre;

    }
}
