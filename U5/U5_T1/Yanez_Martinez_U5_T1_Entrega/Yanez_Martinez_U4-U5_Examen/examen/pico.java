package alixar.examen;

class pico implements minar {

  double grosor;

  public void pico() {}

  public pico(double grosor) {
    this.grosor = grosor;
  }

  @Override
  public String toString() {

    return "El grosor del pico es: " + grosor;
  }

  @Override
  public String gethacer() {
    return null;
  }

  @Override
  public String getdeshacer() {
    return null;
  }
}
