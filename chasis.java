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
public class chasis {
    private String materiales;
    private String modelo;
    private int tamanio;

    public chasis() {
}
    public chasis(String materiales, String modelo, int tamanio) {
        this.materiales = materiales;
        this.modelo = modelo;
        this.tamanio = tamanio;
    }
    
    public String getMateriales() {
        return modelo;
    }
    
    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int getTamanio() {
        return tamanio;
    }
        
    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
}
    
    


