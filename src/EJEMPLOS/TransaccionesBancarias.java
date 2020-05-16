/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJEMPLOS;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TransaccionesBancarias {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();// Instanciamos el objeto
        Scanner leer = new Scanner(System.in);// Permite la entrada desde el teclado
        
        String dui_cliente, nombre_cliente;
        long telefono_cliente;
        double abono,retiro;
        
        //Asiganr datos al propietario(objeto)
        /*
        Se asignan los datos al propietario(objeto) para posteriormente asiganr los datos
        al cuenta(objeto) que tambien instancia un objeto tipo cliente.
        */
        System.out.println("Ingrese los datos que se le soliciten a continuacion");
        System.out.println("Nombre del propietario");
        nombre_cliente= leer.nextLine();
        
        System.out.println("Numero DUI: ");
        dui_cliente = leer.nextLine();
        
        System.out.println("Telefono");
        telefono_cliente = leer.nextLong();
        
        Cliente propietario = new Cliente(dui_cliente, nombre_cliente, telefono_cliente);// Crear el objeto propietario
        
        //asigamos los parametros al objeto cuenta
        cuenta.propietarioCuenta = propietario; // Datos del propietario a la cuneta(objeto)
        
        System.out.println("Ingrese la cantidad a abonar: ");// Ageregamos dinero a la cuenta
        cuenta.abonarCuenta(abono = leer.nextDouble());
        
        System.out.println("Ingresar cantidad a retirar: ");// Retiramos dinero de la cuenta
        cuenta.retirarCuenta(retiro = leer.nextDouble());
        
        System.out.println("**************************************************");
        System.out.println("Su saldo de la cuenta es: " + cuenta.saldoCuenta);// Consulta de saldo
        System.out.println("Datos propietario " + cuenta.getDatosPropietarioCuenta());
        
    }
}
