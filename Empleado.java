/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo;

/**
 *
 * @author Jorge
 */
public class Empleado {
    private String nombre;
    private String departamento;
    private float sueldo;
    private int diasTrabajados;
    private int horasExtras;

    public Empleado(){
    
    }
    
    public Empleado(String nombre, String departamento, float sueldo, int diasTrabajados, int horasExtras){ 
        this.nombre = nombre;
        this.departamento = departamento;
        this.sueldo = sueldo;
        this.diasTrabajados = diasTrabajados;
        this.horasExtras = horasExtras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    @Override
    public String toString() {
        return "Empleado{" + "Nombre= " + nombre + ", Departamento= " + departamento + ", Sueldo Diario= $" + sueldo + ", Dias Trabajados= " + diasTrabajados + ", Horas Extras= " + horasExtras + '}';
    }
    
    
}
