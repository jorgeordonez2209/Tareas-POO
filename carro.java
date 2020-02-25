/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carro;

import Clases.chasis;
import Clases.llantas;
import Clases.motor;
/**
 *
 * @author Jorge
 */
public class carro {
    private String marca;
    private String color;
    private int puertas;
    private int modelo;
    private chasis tamanio;
    private llantas precio;
    private motor electrico;
    
    public carro() {
    }
    
    public carro(String marca,String color, int puertas, int modelo, chasis tamanio, llantas precio, motor electrico) {
        this.marca = marca;
        this.color = color;
        this.puertas = puertas;
        this.modelo = modelo;
        this.tamanio = tamanio;
        this.precio = precio;
        this.electrico = electrico;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public int getPuertas() {
        return puertas;
    }
    
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    public int getModelo() {
        return modelo;
    }
    
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    public chasis getTamanio() {
        return tamanio;
    }
    
    public void arrancar() {
        System.out.println("Arrancando tu:"+this.marca); 
    }
    
    public void apagar() {
        System.out.println("Apagando tu:"+this.marca);
    }
    
    public void setTamanio(chasis tamanio) {
        this.tamanio = tamanio;
    }
    
    public llantas getPrecio(){
        return precio;
    }
    
    public void setPrecio(llantas precio) {
        this.precio = precio;
    }
    
    public motor getElectrico() {
        return electrico;
    }

    public void setElectrico(motor electrico) {
        this.electrico = electrico;
    }
}
    