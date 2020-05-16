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
public class ClienteBanco {
    private long numeroDui;
    private String nombreCliente;
    private String telefonoCliente;

    public long getNumeroDui() {
        return numeroDui;
    }

    public void setNumeroDui(long numeroDui) {
        this.numeroDui = numeroDui;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }
    
    
}
