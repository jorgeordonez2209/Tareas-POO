/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarraylist;

import ico.fes.poo.Empleado;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Jorge
 */
public class EjercicioArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Empleado> lista = new ArrayList();
        lista.add(new Empleado("José García Pérez", "Sistemas", 670.00f, 30, 5));
        lista.add(new Empleado("Diana Herrera Pérez", "Recursos Humanos", 450.00f, 25, 0));
        lista.add(new Empleado("Jessica Juarez Días", "Ventas", 400.00f, 28, 0));
        lista.add(new Empleado("Pedro Paz Orozco", "Ventas", 410.00f, 30, 0));
        lista.add(new Empleado("José Marcel Pérez", "Sistemas", 680.00f, 29, 6));
        lista.add(new Empleado("Jesús Días García", "Recursos Humanos", 455.00f, 30, 0));
        lista.add(new Empleado("Pedro Xotla Ramirez", "Sistemas", 675.00f, 27, 0));
        lista.add(new Empleado("Javier Medina Blanco", "Ventas", 400.00f, 30, 4));
        lista.add(new Empleado("Elizabeth Villa Sosa", "Sistemas", 670.00f, 30, 3));
        
        for (Empleado emp : lista) {
            System.out.println("");
            System.out.println(emp);
        }
        
        System.out.println("");
        System.out.println("**************************************************************");
        System.out.println("");
        
        Iterator<Empleado> iterador = lista.iterator();
        while (iterador.hasNext()) {
            Empleado e = (Empleado)iterador.next();
            System.out.println("Nombre: "+ e.getNombre() );
            System.out.println("Sueldo Mensual: $"+ e.getSueldo() * e.getDiasTrabajados() );
            System.out.println("++++++++");
            System.out.println("Monto por horas extras: $"+ e.getHorasExtras() * (85.0f));
            System.out.println("========");
            System.out.println("Sueldo total: $"+ (e.getSueldo() * e.getDiasTrabajados() + e.getHorasExtras() * (85.0f)));
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("");
            
        }
        
        System.out.println("");
        System.out.println("**************************************************************");
        System.out.println("");
        Empleado i = lista.get(1); 
        System.out.println("Empleado que trabajó menos días en el mes");
        System.out.println("Nombre: "+ i.getNombre());
        System.out.println("Días trabajados: "+ i.getDiasTrabajados());
                
        System.out.println("");
        System.out.println("**************************************************************");
        System.out.println("");
        Empleado o = lista.get(4);
        System.out.println("Empleado que trabajó más hora extras");
        System.out.println("Nombre: "+ o.getNombre()); 
        System.out.println("Horas extras: "+ o.getHorasExtras());
        
        }
        
           
                
    }
    

