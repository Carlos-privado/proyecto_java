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
public class TransaccionesBancarias {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();//Se instancia el objeto
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        double abonoCuenta, cargoCuenta;
        try {
            //Ingreso de los valores de los atributos heredados
            System.out.println("DUI del cliente: ");
            long numeroDui = Long.parseLong(leer.readLine());
            System.out.println("Nombre del cliente: ");
            String nombreCliente = leer.readLine();
            System.err.println("Telefono del cliente: ");
            String telefono = leer.readLine();
            
            //ingresar valores de la cuenta
            System.out.println("Ingresar el abono a la cuenta: ");
            abonoCuenta = Double.parseDouble(leer.readLine());
            System.out.println("Ingresar el cargo a la cuenta: ");
            cargoCuenta = Double.parseDouble(leer.readLine());
            
            //Asignar valores al objeto cliente accesible a traves de la cuenta por herencia
            cuenta.setNumeroDui(numeroDui);
            cuenta.setNombreCliente(nombreCliente);
            cuenta.setTelefonoCliente(telefono);
            
            //Asigar valores al objeto cuenta
            cuenta.setAbonoCuenta(abonoCuenta);
            cuenta.setCargoCuenta(cargoCuenta);
            //Esta funcion utiliza los parametros asignados anteriormente para asignar el valor final
            cuenta.setSaldoCuenta();
            //Imprimir datos del cliente
            System.out.println("Numero de DUI : " + cuenta.getNumeroDui());
            System.out.println("Nombre del cliente : " + cuenta.getNombreCliente());
            System.out.println("Telefono del cliente : " + cuenta.getTelefonoCliente());
            //Imprimir datos de la cuenta
            System.out.println("Abono : " + cuenta.getAbonoCuenta());
            System.out.println("Cargo : " + cuenta.getCargoCuenta());
            System.out.println("Saldo : " + cuenta.getSaldoCuenta());
            
        } catch (Exception ella) {
            System.out.println("Error" + ella.getMessage());
        }
    }
}
