/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento.herencia;

/**
 *
 * @author Admin
 */
public class Estudiante {
    private long carnetEstudiante;
    private String nombreEstudiante;
    private String apellidoEstudiante;
    
    public long getCarnetEstudiante() {
        return carnetEstudiante;
    }

    public void setCarnetEstudiante(long carnetEstudiante) {
        this.carnetEstudiante = carnetEstudiante;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getApellidoEstudiante() {
        return apellidoEstudiante;
    }

    public void setApellidoEstudiante(String apellidoEstudiante) {
        this.apellidoEstudiante = apellidoEstudiante;
    }

    
}
