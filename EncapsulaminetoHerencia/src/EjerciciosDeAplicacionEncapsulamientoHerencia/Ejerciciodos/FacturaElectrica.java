/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosDeAplicacionEncapsulamientoHerencia.Ejerciciodos;

import java.text.DecimalFormat;
import java.text.NumberFormat;


/**
 *
 * @author Admin
 */
public class FacturaElectrica {
    
    private long numeroCuenta;
    private double lecturaActualMedidor;
    private double lecturaAnteriorMedidor;
    private int multiplicador;
    private double consumoMensual;
    private double consumoDiario;
    private double valorFactura;

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getLecturaActualMedidor() {
        return lecturaActualMedidor;
    }

    public void setLecturaActualMedidor(double lecturaActualMedidor) {
        this.lecturaActualMedidor = lecturaActualMedidor;
    }

    public double getLecturaAnteriorMedidor() {
        return lecturaAnteriorMedidor;
    }

    public void setLecturaAnteriorMedidor(double lecturaAnteriorMedidor) {
        this.lecturaAnteriorMedidor = lecturaAnteriorMedidor;
    }

    public int getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    public double getConsumoMensual() {
        return consumoMensual;
    }

    public void setConsumoMensual(double consumoMensual) {
        this.consumoMensual = consumoMensual;
    }

    public double getConsumoDiario() {
        return consumoDiario;
    }

    public void setConsumoDiario(double consumoDiario) {
        this.consumoDiario = consumoDiario;
    }

    public double getValorFactura() {
        return valorFactura;
    }

    public void setValorFactura(double valorFactura) {
        this.valorFactura = valorFactura;
    }
    
    public double calcularConsumoMensual(double consumoActual, double consumoAnterior, int multiplicador){
        double consumo_mensual = ( consumoActual - consumoAnterior ) * multiplicador; 
        return consumo_mensual;
    }
    
    public double calcularConsumoDiario(double consumoMensual, double diasFacturados){
        double consumo_diario = consumoMensual / diasFacturados;
        return consumo_diario;
    }
    
    public double calcularValorFactura(double consumo){
        double valor_factura = consumo * 0.20;
        return valor_factura;
    }
    
    public String getAtributos(){
        
        NumberFormat formatoDinero = new DecimalFormat("$##,###.##");
       
        String datos;
        datos = "<<<<<< Atributos >>>>>>\n";
        datos += "Factura numero  : " + getNumeroCuenta() + "\n";
        datos += "Lectura Actual  : " + getLecturaActualMedidor() + "\n";
        datos += "Multiplicador   : " + getMultiplicador() + "\n";
        datos += "Consumo Mensual : " + getConsumoMensual() + "kWh\n";
        datos += "Consumo Diario  : " + getConsumoDiario() + "\n";
        datos += "Valor Factura   : " + formatoDinero.format(getValorFactura()) + "\n";
        
        return datos;
    }
}
