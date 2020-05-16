/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosAplicacionClasesObjetos.EjercicioTres;

/**
 *
 * @author Admin
 */
public class Estudiante {

    long numero_carnet , numero_carnet2, numero_carnet3, numero_carnet4, numero_carnet5;
    String nombre_estudiante, nombre_estudiante2, nombre_estudiante3,nombre_estudiante4, nombre_estudiante5;
    String codigo_carrera, codigo_carrera2, codigo_carrera3, codigo_carrera4, codigo_carrera5;
    
    public Estudiante(long numero_carnet, long numero_carnet2, long numero_carnet3, long numero_carnet4, long numero_carnet5, String nombre_estudiante, String nombre_estudiante2, String nombre_estudiante3, String nombre_estudiante4, String nombre_estudiante5, String codigo_carrera, String codigo_carrera2, String codigo_carrera3, String codigo_carrera4, String codigo_carrera5) {
        this.numero_carnet = numero_carnet;
        this.numero_carnet2 = numero_carnet2;
        this.numero_carnet3 = numero_carnet3;
        this.numero_carnet4 = numero_carnet4;
        this.numero_carnet5 = numero_carnet5;
        this.nombre_estudiante = nombre_estudiante;
        this.nombre_estudiante2 = nombre_estudiante2;
        this.nombre_estudiante3 = nombre_estudiante3;
        this.nombre_estudiante4 = nombre_estudiante4;
        this.nombre_estudiante5 = nombre_estudiante5;
        this.codigo_carrera = codigo_carrera;
        this.codigo_carrera2 = codigo_carrera2;
        this.codigo_carrera3 = codigo_carrera3;
        this.codigo_carrera4 = codigo_carrera4;
        this.codigo_carrera5 = codigo_carrera5;
    }

    Estudiante() {
       
    }
    
    public String imprimirEstudiante(long numero_carnet, String nombre_estudiante, String codigo_carrera){
        String informacion;
        informacion = "************************************";
        informacion += "\nNumero carnet " + numero_carnet;
        informacion += "\nNombre estudiante " + nombre_estudiante;
        informacion += "\nCodigo carrera " + codigo_carrera;
        return informacion;
    }
    
}
