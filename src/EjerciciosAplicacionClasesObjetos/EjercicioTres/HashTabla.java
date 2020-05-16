/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosAplicacionClasesObjetos.EjercicioTres;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HashTabla {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        long[] numero_carnet = new long[5];
        String[] nombre_estudiante = new String[5];
        String[] codigo_carrera = new String[5];
        //Estudainte uno
        
        for(int i = 0; i < numero_carnet.length; i++){
        System.out.println("Numero carnet");
        numero_carnet[i] = leer.nextLong();

        System.out.println("Codigo carrera");
        codigo_carrera[i] = leer.next();

        System.out.println("Nombre estudiante");
        nombre_estudiante[i] = leer.next();
    
        }
        
        Estudiante estudiante = new Estudiante(numero_carnet[0], numero_carnet[1], numero_carnet[2], numero_carnet[3], numero_carnet[4], nombre_estudiante[0], nombre_estudiante[1], nombre_estudiante[2], nombre_estudiante[3], nombre_estudiante[4], codigo_carrera[0], codigo_carrera[1], codigo_carrera[2], codigo_carrera[3], codigo_carrera[4]);
        Estudiante est = estudiante;
        
        for(int i = 0; i < numero_carnet.length; i++){
        System.out.println( est.imprimirEstudiante(numero_carnet[i],codigo_carrera[i],nombre_estudiante[i]));
        }
    }
}
