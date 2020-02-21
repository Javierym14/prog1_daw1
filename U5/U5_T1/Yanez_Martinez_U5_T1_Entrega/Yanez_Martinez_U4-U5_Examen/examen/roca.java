package alixar.examen;

public class roca extends material implements mezclar {

  int dureza;

  public roca(
      String nombre,
      int masa,
      int quemadura,
      int diluir,
      Tipo tipo,
      String nombre_mezcla,
      int dureza) {
    super(nombre, masa, quemadura, diluir, tipo, nombre_mezcla);

    this.dureza = dureza;
  }

  @Override
  public String getmezclarconmaterial() {
    return "Roca mezclada con " + nombre_mezcla;
  }

  @Override
  public String toString() {
    return "Nombre: "
        + nombre
        + " masa: "
        + masa
        + " quemadura: "
        + quemadura
        + " diluir: "
        + diluir
        + " es: "
        + tipo
        + " roca mezclado con "
        + nombre_mezcla
        + " tiene una dureza de "
        + dureza;
  }
}
