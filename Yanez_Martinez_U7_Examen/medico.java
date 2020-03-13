package alixar.examen;

public class medico {

  private String nombre;
  private String apellidos;
  private int numero;
  private String hospital;

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setHospital(String hospital) {
    this.hospital = hospital;
  }

  public String getHospital() {
    return hospital;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getNumero() {
    return numero;
  }

  public void medico() {}

  public medico(String apellidos, String nombre, int numero, String hospital) {

    this.apellidos = apellidos;
    this.nombre = nombre;
    this.numero = numero;
    this.hospital = hospital;
  }
}
