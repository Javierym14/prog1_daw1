package alixar.examen;

public class minecraft {

  public String nombre;
  int masa;
  int quemadura;
  int diluir;

  public enum Tipo {
    no_movible,
    movible
  }

  public Tipo tipo;

  public void minecraft() {}

  public minecraft(String nombre, int masa, int quemadura, int diluir, Tipo tipo) {

    if (masa < 1000 && masa > 1) {
      this.masa = masa;
    }

    if (quemadura < 100 && quemadura > 0) {
      this.quemadura = quemadura;
    }
    if (diluir < 100 && diluir > 0) {
      this.diluir = diluir;
    }

    this.nombre = nombre;
    this.tipo = tipo;
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
        + tipo;
  }
}
