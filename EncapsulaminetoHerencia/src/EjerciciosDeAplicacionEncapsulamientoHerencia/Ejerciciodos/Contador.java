/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosDeAplicacionEncapsulamientoHerencia.Ejerciciodos;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Contador extends FacturaElectrica{
    
    public static void main(String[] args) {
        Contador factura =  new Contador();
        Scanner leer = new Scanner(System.in);
        
        factura.setValues(factura, leer);
        
        /* 1) Se asigan el valor del cosumo mensual
         * 2) Se obtiene el consumo mensual
         *    Consumo actual ,Consumo anterior , Multiplicador sacados directamente del objeto
         */
        factura.setConsumoMensual(factura.calcularConsumoMensual(
                factura.getLecturaActualMedidor(), 
                factura.getLecturaAnteriorMedidor(), 
                factura.getMultiplicador()));
        /*
         *   1) Asigar el consumo diario al objeto
         *   2) calcula el consumo diario 
         *       parametros: consumo mensual, dias facturados
         */
        factura.setConsumoDiario(factura.calcularConsumoDiario(
                factura.getConsumoMensual(), 30));
                
        
        /*   1) calcula el consumo diario 
         *       parametros: consumo mensual
         */
        factura.setValorFactura(factura.calcularValorFactura(factura.getConsumoMensual()));
        
        System.out.println(factura.getAtributos());
    }
    //Funcion encargada de capturar todos los datos del atributo
    public void setValues(FacturaElectrica factura , Scanner leer){
        System.out.println("Numero de factura : ");
        factura.setNumeroCuenta(leer.nextLong());
        System.out.println("Lectura enterior del contador :");
        factura.setLecturaAnteriorMedidor(leer.nextDouble());
        System.out.println("Lectura actual del contador :");
        factura.setLecturaActualMedidor(leer.nextDouble());
        factura.setMultiplicador(10);
    }
}
