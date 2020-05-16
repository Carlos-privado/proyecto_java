/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento.herencia;

/**
 *
 * @author Admin
 * extends prmite la herencia de la clase
 */
public class CuentaBancaria extends ClienteBanco{
    private long numCuenta;
    private double cargoCuenta;
    private double abonoCuenta;
    private double saldoCuenta;
    private char estadoCuenta;

    public long getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(long numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getCargoCuenta() {
        return cargoCuenta;
    }

    public void setCargoCuenta(double cargoCuenta) {
        this.cargoCuenta = cargoCuenta;
    }

    public double getAbonoCuenta() {
        return abonoCuenta;
    }

    public void setAbonoCuenta(double abonoCuenta) {
        this.abonoCuenta = abonoCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta() {
        //Formula para el calculo del saldo de la cueta
        this.saldoCuenta = saldoCuenta + this.abonoCuenta - this.cargoCuenta;
    }

    public char getEstadoCuenta() {
        return estadoCuenta;
    }

    public void setEstadoCuenta(char estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }
    
}
