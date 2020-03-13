package alixar.examen;

public class pacientes {

  private String nombre;
  private int edad;
  private int peso;
  private String medico;
  private String cepa;

  public enum Vacunas {
    si,
    no
  }

  public Vacunas vacunas;

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public int getEdad() {
    return edad;
  }

  public void setMedico(String medico) {
    this.medico = medico;
  }

  public String getMedico() {
    return medico;
  }

  public void setPeso(int peso) {
    this.peso = peso;
  }

  public int getPeso() {
    return peso;
  }

  public void setVacunas(Vacunas vacunas) {
    this.vacunas = vacunas;
  }

  public Vacunas getVacunas() {
    return vacunas;
  }

  public void setCepa(String cepa) {
    this.cepa = cepa;
  }

  public String getCepa() {
    return cepa;
  }

  public pacientes(String nombre, int peso, int edad, Vacunas vacunas, String medico, String cepa) {

    this.nombre = nombre;
    this.peso = peso;
    this.edad = edad;
    this.vacunas = vacunas;
    this.medico = medico;
    this.cepa = cepa;
  }
}
