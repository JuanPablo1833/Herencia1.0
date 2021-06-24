/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadora1;

import ico.fes.Partes.Laptop;
import ico.fes.Partes.Memoria;
import ico.fes.Partes.Procesador;
import java.awt.Color;

/**
 *
 * @author Dell
 */
public class Computadora1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
Laptop c1 = new Laptop("Dell", "Latitud E6430", 24.1f, 35.2f, new Procesador("Intel", "i5-3210M", 2.5f),new Memoria("DDR3-SDRAM", 2.0f, 1600.0f));
        //System.out.println(c1);
        
        System.out.println(c1.getMarca());
        System.out.println(c1.getModelo());
        System.out.println(c1.getAlto()+ "cm. de alto");
        System.out.println(c1.getAncho()+"cm de ancho");
        System.out.println(c1.getProcesador());
        System.out.println(c1.getMemoria());
        
    }
    
}
