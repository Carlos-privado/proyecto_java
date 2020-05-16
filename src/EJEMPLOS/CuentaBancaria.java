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
public class CuentaBancaria {
    long numero_cuenta;
    Cliente propietarioCuenta; //Atributo de tipo objeto
    double saldoCuenta;
    
    //Metodos que modifican el atributo sin devolver algun valor
    public void abonarCuenta(double cantidad){
        saldoCuenta += cantidad;
    }
    
    public void retirarCuenta(double cantidad){
        if(cantidad > saldoCuenta){
            System.out.println("Saldo insuficiente!!!");
        }else{
            saldoCuenta -= cantidad;
        }
    }
    
    public String getDatosPropietarioCuenta(){
        String informacion;
        informacion = "DUI :" + propietarioCuenta.dui_cliente;
        informacion += "\nNombre :" + propietarioCuenta.nombre_cliente;
        informacion += "\nTelefono :" + propietarioCuenta.telefono_cliente;
        return informacion;
    }
    
    
}
