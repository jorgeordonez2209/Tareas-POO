/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Jorge
 */
public class motor {
    private int capacidad;
    private int anio;
    private boolean electrico;  

    public motor() {
    }
   
    public motor(int capacidad, int anio, boolean electrico) {
        this.capacidad = capacidad;
        this.anio = anio;
        this.electrico = electrico;
    }
    
    public int getCapacidad() {
        return capacidad;
    }
    
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public int getAnio() {
        return anio;
    }
    
    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public boolean getElectrico() {
        return electrico;
    }
    
    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }
}

