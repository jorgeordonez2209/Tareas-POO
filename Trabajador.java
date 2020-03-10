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
public class Trabajador extends Persona{
    private float salario;
    private String rfc;
    private String puesto;
    private int anioDeIngreso;
    
    public Trabajador(){
    }
    
    public Trabajador(float salario, String rfc, String puesto, int anioDeIngreso, String nombre, String fechaDeNacimiento, String curp, String sexo){
        super(nombre, fechaDeNacimiento, curp, sexo);
        this.salario = salario;
        this.rfc = rfc;
        this.puesto = puesto;
        this.anioDeIngreso = anioDeIngreso;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getAnioDeIngreso() {
        return anioDeIngreso;
    }

    public void setAnioDeIngreso(int anioDeIngreso) {
        this.anioDeIngreso = anioDeIngreso;
    }
    
    public void trabajar(){
        System.out.println(this.puesto + " está trabajando... ");
    }
    
    public void descanzar(){
        System.out.println(this.puesto + " está descanzando... ");
    }
    
    public int ahorrar(){
        System.out.println(this.puesto + " tiene ahorrado... ");
        return 0;
    }
    
    public int comer(){
        System.out.println(this.puesto + " horas para comer... ");
        return 1;
    }
    
    @Override
    public String toString(){
        String res=super.toString();
        res = res +"Salario:"+this.salario+"\n";
        return res;
    }
}
    
    
