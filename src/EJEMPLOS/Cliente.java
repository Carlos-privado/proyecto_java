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
public class Cliente {
    String dui_cliente, nombre_cliente;
    long telefono_cliente;
    
    public Cliente(String dui_cliente, String nombre_cliente, long telefono_cliente){
        this.dui_cliente = dui_cliente;
        this.nombre_cliente = nombre_cliente;
        this.telefono_cliente = telefono_cliente;
    }
}
