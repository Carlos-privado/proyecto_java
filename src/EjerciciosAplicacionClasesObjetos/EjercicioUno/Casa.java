/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosAplicacionClasesObjetos.EjercicioUno;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Casa {
    String numero_de_casa, nombre_calle;
    int numero_pasaje;
    
    public Casa(String numero_de_casa, String nombre_calle, int numero_pasaje){
        this.numero_de_casa = numero_de_casa;
        this.numero_pasaje = numero_pasaje;
        this.nombre_calle = nombre_calle;
    }
    
    public String getDatosCasa(){
        String informacion;
        informacion =  "Numero de casa : " + numero_de_casa;
        informacion += "\nNumero pasaje  : " + numero_pasaje;
        informacion += "\nNombre calle   : " + nombre_calle;
        return informacion;
    }
    
    public static void main(String[] args) {
        String numero_de_casa, nombre_de_calle;
        int numero_pasaje;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Numero de la casa");
        numero_de_casa = leer.nextLine();
        
        System.out.println("Nombre de la calle");
        nombre_de_calle = leer.nextLine();
        
        System.out.println("Numero pasaje");
        numero_pasaje = leer.nextInt();
        
        Casa c = new Casa(numero_de_casa, nombre_de_calle, numero_pasaje);
        
        System.out.println(c.getDatosCasa());
        
    }
}
