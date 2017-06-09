/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_erick_martinez;

import java.awt.Color;

/**
 *
 * @author usuario
 */
public class Riñones extends Organo{
    public int nivel_efectividad;

    public Riñones(int nivel_efectividad, String color, int nivel_potenciado, int nivel_prueba) {
        super(color, nivel_potenciado, nivel_prueba);
        this.nivel_efectividad = 753266;
    }

    public int getNivel_efectividad() {
        return nivel_efectividad;
    }

    public void setNivel_efectividad(int nivel_efectividad) {
        this.nivel_efectividad = nivel_efectividad;
    }
}
