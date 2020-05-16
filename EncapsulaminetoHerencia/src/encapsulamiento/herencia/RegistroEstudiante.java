/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento.herencia;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Admin
 */
public class RegistroEstudiante {
    public static void main(String[] args) {
        Estudiante est = new Estudiante();
        //Permite la entrada de datos en String es necesario pasar los datos sino necesitamos un String
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        try {
            // Ingreso de los respectivos valores
            System.out.println("Carnet del estudiante ");
            long carnet = Long.parseLong(leer.readLine());
            System.out.println("Nombre del estudiante ");
            String nombre = leer.readLine();
            System.out.println("Apellidos del estudiante ");
            String apellidos = leer.readLine();
            // Asignamos los valores a cada atributo
            est.setCarnetEstudiante(carnet);
            est.setNombreEstudiante(nombre);
            est.setApellidoEstudiante(apellidos);
            // Recuperacion de datos
            System.out.println("<<<< Recuperacion de valores >>>>");
            System.out.println("Carnet : " + est.getCarnetEstudiante());
            System.out.println("Nombre : " + est.getNombreEstudiante());
            System.out.println("Apellido : " + est.getApellidoEstudiante());
            
        } catch (Exception ella) {
            System.out.println("Error " + ella.getMessage());
        }
    }
}
