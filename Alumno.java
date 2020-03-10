/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Subclases;

import SuperClase.Persona;

/**
 *
 * @author Jorge
 */
public class Alumno extends Persona{
    private int numeroDeCuenta;
    private String carrera;
    private float promedio;
    
    public Alumno(){
    }
    
    public Alumno(int numeroDeCuenta, String carrera, float promedio, String nombre, String fechaDeNacimiento, String curp, String sexo){
        super(nombre, fechaDeNacimiento, curp, sexo);
        this.numeroDeCuenta = numeroDeCuenta;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    
    public void estudiar(){
        System.out.println(this.numeroDeCuenta + " está estudiando... ");
    } 
    
    public void platicar(){
        System.out.println(this.numeroDeCuenta + " está platicando... ");
    }
    
    public int reprobarMaterias(){
        System.out.println(this.numeroDeCuenta + " materias reprobadas... " );
        return 0;
    }
    
    public int irAlShine(){
        System.out.println(this.numeroDeCuenta + " ha ido al Shine... ");
        return 10;
    }
    
    @Override
    public String toString(){
        String res=super.toString();
        res = res +"Numero De Cuenta:"+this.numeroDeCuenta+"\n";
        res = res +"Carrera:"+this.carrera+"\n";
        return res;
    }
}
    