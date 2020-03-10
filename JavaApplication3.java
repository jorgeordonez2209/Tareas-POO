/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import Subclases.Alumno;

import Subclases.Trabajador;

/**
 *
 * @author Jorge
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno jorge=new Alumno();
        jorge.setNombre("Jorge Ordoñez Tuxpan");
        jorge.setFechaDeNacmiento("4 octubre 1999");
        jorge.setCurp("OOTJ991004HDFRXR02");
        jorge.setSexo("Masculino");
        jorge.setNumeroDeCuenta(315199266);
        jorge.setCarrera("Ingenieria en Computacion");
        jorge.setPromedio(8.82f);
        System.out.println("jorge");
        jorge.ver();
        jorge.pensar();
        jorge.estudiar();
        jorge.platicar();
        jorge.reprobarMaterias();
        jorge.irAlShine();
        
        Trabajador juanito=new Trabajador();
        juanito.setNombre("Juanito Alimaña");
        juanito.setFechaDeNacmiento("18 julio 1955");
        juanito.setCurp("AAFJ550718JSHIESJ01");
        juanito.setSexo("Masculino");
        juanito.setSalario(45264.67f);
        juanito.setRfc("JAF5898JJ");
        juanito.setPuesto("Jefe");
        juanito.setAnioDeIngreso(1975);
        System.out.println("juanito");
        juanito.ver();
        juanito.pensar();
        juanito.trabajar();
        juanito.descanzar();
        juanito.ahorrar();
        juanito.comer();
    }
    
    
}
