package alixar.examen;

public class material extends minecraft implements Comparable {
  String nombre_mezcla;

  public material(
      String nombre, int masa, int quemadura, int diluir, Tipo tipo, String nombre_mezcla) {
    super(nombre, masa, quemadura, diluir, tipo);

    this.nombre_mezcla = nombre_mezcla;
  }

  @Override
  public String toString() {
    return "El nombre del material es: "
        + nombre
        + " masa: "
        + masa
        + " quemadura: "
        + quemadura
        + " diluir: "
        + diluir
        + " y es de tipo: "
        + tipo
        + " mezclado con "
        + nombre_mezcla;
  }

  @Override
  public int compareTo(Object o) {
    return 0;
  }
}
