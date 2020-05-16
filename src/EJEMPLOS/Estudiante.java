/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJEMPLOS;

/**
 *
 * @author Admin
 */
public class Estudiante {
    long carnet;
    String nombre, apellido;
    
    public void registroEstudiente(){
        System.out.println("Metodo para registro de estudientes");
    }
    
    public void consultarEsudiante(){
        System.out.println("Metodo para consultas de estudiante");
    }
    
    public void eliminarEstudente(){
        System.out.println("Metodo para eliminar estudiante");
    }
    
    public static void main(String[] args) {
        Estudiante est = new Estudiante(); //Instaciamos el objeto en el metodo main
        //Asignar parametros a los atributos
        est.carnet = 123;
        est.nombre = "Amalia";
        est.apellido = "Rosales";
        
        //Llamamos a las funciones
        est.registroEstudiente();
        est.consultarEsudiante();
        est.eliminarEstudente();
        
        //Mostrar datss en consola
        System.out.println("Carnet   :" + est.carnet);
        System.out.println("Nombre   :" + est.nombre);
        System.out.println("Apellido :" + est.apellido);
    }
    
}
