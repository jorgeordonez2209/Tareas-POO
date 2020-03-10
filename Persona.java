/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperClase;

/**
 *
 * @author Jorge
 */
public class Persona {
    private String nombre;
    private String fechaDeNacmiento;
    private String curp;
    private String sexo;


    public Persona() {
    }
    
    public Persona(String nombre, String fechaDeNacimiento, String curp, String sexo) {
        this.nombre = nombre;
        this.fechaDeNacmiento = fechaDeNacimiento;
        this.curp = curp;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaDeNacmiento() {
        return fechaDeNacmiento;
    }

    public void setFechaDeNacmiento(String fechaDeNacmiento) {
        this.fechaDeNacmiento = fechaDeNacmiento;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void ver(){
        System.out.println(this.nombre + " está viendo... ");
    }
    
    public void pensar(){
        System.out.println(this.nombre + " está pensando... ");
    }
    
    @Override
    public String toString(){
        String res="+Nombre:"+this.nombre +"\n";
        res=res + "FechaDeNacimiento:"+this.fechaDeNacmiento +"\n";
        res=res + "CURP:"+this.curp +"\n";
        res=res + "Sexo;"+this.sexo + "\n";
        
        return res;
    }
    
}
    

    
    
