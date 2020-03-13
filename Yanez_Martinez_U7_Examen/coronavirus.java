package alixar.examen;

import java.util.*;

public class coronavirus extends principal {

  private int infectados;
  private String nombre;
  private String localidad;

  public void setInfectados(int infectados) {
    this.infectados = infectados;
  }

  public int getInfectados() {
    return infectados;
  }

  public void setLocalidad(String localidad) {
    this.localidad = localidad;
  }

  public String getLocalidad() {
    return localidad;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void coronavirus() {}

  public coronavirus(int infectados, String localidad, String nombre) {

    this.infectados = infectados;
    this.localidad = localidad;
    this.nombre = nombre;
  }

  public void addPaciente() {

    Set<pacientes> pacientes3 = new HashSet<>();

    pacientes3.add();
  }

  public void darDeAlta() {

    Set<pacientes> pacientes3 = new HashSet<>();

    pacientes3.remove();
  }

  public void pacienteDeUnDoctor() {}

  public void PacientePeso() {

    Set<pacientes> pacientes3 = new TreeSet<>();
  }

  public void PacienteEdad() {
    Set<pacientes> pacientes3 = new TreeSet<>();
  }
}
