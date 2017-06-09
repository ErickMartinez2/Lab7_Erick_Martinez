/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_erick_martinez;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Organo {
    public Color color;
    public ArrayList<String> caracteristicas = new ArrayList();
    public int nivel_potenciado;
    public int nivel_prueba;

    public Organo() {
    }
    
    public Organo(Color color, int nivel_potenciado, int nivel_prueba) {
        this.color = color;
        this.nivel_potenciado = nivel_potenciado;
        this.nivel_prueba = nivel_prueba;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ArrayList<String> getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(ArrayList<String> caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public int getNivel_potenciado() {
        return nivel_potenciado;
    }

    public void setNivel_potenciado(int nivel_potenciado) {
        this.nivel_potenciado = nivel_potenciado;
    }

    public int getNivel_prueba() {
        return nivel_prueba;
    }

    public void setNivel_prueba(int nivel_prueba) {
        this.nivel_prueba = nivel_prueba;
    }
    
}
