package alixar.examen;

import java.util.HashMap;
import java.util.Map;

public class principal {

  public static void main(String[] args) {

    pacientes[] p = new pacientes[10];

    p[0] = new pacientes("paciente1", 12, 12, pacientes.Vacunas.no, "medico1", "b");
    p[1] = new pacientes("paciente2", 13, 10, pacientes.Vacunas.si, "medico2", "a");
    p[2] = new pacientes("paciente3", 14, 19, pacientes.Vacunas.no, "medico3", "a");
    p[3] = new pacientes("paciente4", 15, 18, pacientes.Vacunas.no, "medico4", "b");
    p[4] = new pacientes("paciente5", 16, 17, pacientes.Vacunas.no, "medico5", "b");
    p[5] = new pacientes("paciente6", 17, 16, pacientes.Vacunas.si, "medico6", "a");
    p[6] = new pacientes("paciente7", 18, 15, pacientes.Vacunas.no, "medico7", "b");
    p[7] = new pacientes("paciente8", 19, 14, pacientes.Vacunas.si, "medico8", "b");
    p[8] = new pacientes("paciente9", 10, 13, pacientes.Vacunas.no, "medico9", "a");
    p[9] = new pacientes("paciente10", 32, 22, pacientes.Vacunas.no, "medico10", "a");

    medico[] m = new medico[3];

    m[0] = new medico("apellido1", "nombre1", 2, "hospital1");
    m[0] = new medico("apellido2", "nombre2", 1, "hospital2");
    m[0] = new medico("apellido3", "nombre3", 3, "hospital3");

    Map<Integer, pacientes> pacientes2 = new HashMap();

    pacientes2.put(1, p[0]);
    pacientes2.put(2, p[1]);
    pacientes2.put(3, p[2]);
    pacientes2.put(4, p[3]);
    pacientes2.put(5, p[4]);
    pacientes2.put(6, p[5]);
    pacientes2.put(7, p[6]);
    pacientes2.put(8, p[7]);
    pacientes2.put(9, p[8]);
    pacientes2.put(10, p[9]);

    Map<Integer, medico> medicos = new HashMap();

    medicos.put(1, m[0]);
    medicos.put(2, m[1]);
    medicos.put(3, m[2]);
  }
}
