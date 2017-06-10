/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_erick_martinez;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author usuario
 */
public class Paciente extends Persona{
    public ArrayList<String> enfermedades = new ArrayList();
    public Date fecha_ingreso;
    public Date fecha_alta;
    public String sangre;
    public String visita;
    public ArrayList<String> alergias = new ArrayList();
    public ArrayList<Organo> organos = new ArrayList();

    public Paciente() {
        super();
    }

    public Paciente(Date fecha_ingreso, Date fecha_alta, String sangre, String visita, String nombre, int edad, int id, double altura, double peso, String sexo) {
        super(nombre, edad, id, altura, peso, sexo);
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_alta = fecha_alta;
        this.sangre = sangre;
        this.visita = visita;
    }

    public ArrayList<String> getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(ArrayList<String> enfermedades) {
        this.enfermedades = enfermedades;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public String getSangre() {
        return sangre;
    }

    public void setSangre(String sangre) {
        this.sangre = sangre;
    }

    public String getVisita() {
        return visita;
    }

    public void setVisita(String visita) {
        this.visita = visita;
    }

    public ArrayList<String> getAlergias() {
        return alergias;
    }

    public void setAlergias(ArrayList<String> alergias) {
        this.alergias = alergias;
    }

    public ArrayList<Organo> getOrganos() {
        return organos;
    }

    public void setOrganos(ArrayList<Organo> organos) {
        this.organos = organos;
    }

    @Override
    public String toString() {
        return "Doctor " + nombre + " {" + "enfermedades=" + enfermedades + ", fecha_ingreso=" + fecha_ingreso + ", fecha_alta=" + fecha_alta + ", sangre=" + sangre + ", visita=" + visita + ", alergias=" + alergias + ", organos=" + organos + '}';
    }
    
    
}
