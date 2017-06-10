/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_erick_martinez;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Doctor extends Persona {
    public ArrayList<String> especialidades = new ArrayList();
    public ArrayList<Paciente> pacientes = new ArrayList();
    public int años;
    public String horario;
    public ArrayList<String> dias = new ArrayList();

    public Doctor() {
        super();
    }

    public Doctor(int años, String horario, String nombre, int edad, int id, double altura, double peso, String sexo) {
        super(nombre, edad, id, altura, peso, sexo);
        this.años = años;
        this.horario = horario;
    }

    public ArrayList<String> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList<String> especialidades) {
        this.especialidades = especialidades;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public ArrayList<String> getDias() {
        return dias;
    }

    public void setDias(ArrayList<String> dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return "Doctor " + nombre + " {" + "especialidades=" + especialidades + ", pacientes=" + pacientes + ", años=" + años + ", horario=" + horario + ", dias=" + dias + '}';
    }
    
}
