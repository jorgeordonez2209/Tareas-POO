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
public class llantas {
    private String marca;  
    private int medida;
    private float precio;
    
    public llantas() {
    }
    
    public llantas(String marca, int medida, float precio) {
        this.marca = marca;
        this.medida = medida;
        this.precio = precio;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
     
    public int getMedida() {
        return medida;
    }
    
    public void setMedida(int medida) {
        this.medida = medida;
    }
    
    public float getPrecio() {
        return precio;
    }
    
    public void setPrecio(float precio) {
        this.precio = precio;
    } 
}
