package alixar.examen;

public class metal extends material implements mezclar {

  @Override
  public String getmezclarconmaterial() {
    return "Metal mezclado con " + nombre_mezcla;
  }

  public enum Tipo_metal {
    imantable,
    no_imantable
  }

  public Tipo_metal tipo_metal;

  public metal(
      String nombre, int masa, int quemadura, int diluir, Tipo tipo, String nombre_mezcla) {
    super(nombre, masa, quemadura, diluir, tipo, nombre_mezcla);
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
        + " y es: "
        + tipo_metal
        + " de tipo: "
        + tipo
        + " mezclado con "
        + getmezclarconmaterial();
  }
}
