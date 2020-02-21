package alixar.examen;

public class cristal extends material implements mezclar {

  @Override
  public String getmezclarconmaterial() {
    return "Cristal mezclado con " + nombre_mezcla;
  }

  public enum Tipo_cristal {
    transparente,
    translucido
  }

  public cristal(
      String nombre,
      int masa,
      int quemadura,
      int diluir,
      Tipo tipo,
      String nombre_mezcla,
      Tipo_cristal tipo_cristal) {
    super(nombre, masa, quemadura, diluir, tipo, nombre_mezcla);

    this.tipo_cristal = tipo_cristal;
  }

  private Tipo_cristal tipo_cristal;

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
        + " Cristal mezclado con "
        + nombre_mezcla
        + " y es de tipo: "
        + tipo_cristal;
  }
}
