/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosAplicacionClasesObjetos.EjercicioDos;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CalculoIVA {
    
    
    public double calculoIVA(double precio_articulo, double porcent_iva){
        double IVA;
        IVA = precio_articulo * porcent_iva;
        return IVA;
    }
    
    public double calcularIVAenproducto(double precio_productoIVA, double porcent_iva){
        double IVA_econtrado;
        System.out.println(porcent_iva);
        if(porcent_iva > 1){
            porcent_iva /= 100;
            porcent_iva += 1;
            IVA_econtrado = precio_productoIVA / porcent_iva;
            IVA_econtrado = precio_productoIVA - IVA_econtrado;
            System.out.println(porcent_iva);
            return IVA_econtrado;
        }else {
            porcent_iva += 1;
            IVA_econtrado = precio_productoIVA / porcent_iva;
            IVA_econtrado = precio_productoIVA - IVA_econtrado;
            return IVA_econtrado;
        }
    }
    
    
    public static void main(String[] args) {
        NumberFormat formato = new DecimalFormat("$##,###.##");
        CalculoIVA c = new CalculoIVA();
        Scanner leer = new Scanner(System.in);
        
        double precio_producto,porcent_iva;
        
        System.out.println("Ingrese el precio del producto");
        precio_producto = leer.nextDouble();
        
        System.out.println("Ingrese el porcentaje del Iva");
        porcent_iva = leer.nextDouble();
        
        System.out.println("Que desea hacer?");
        System.out.println("1 - calcular IVA de un producto");
        System.out.println("2 - obtener IVA de un producto");
        int opcion = leer.nextInt();
        
        switch(opcion){
            case 1:
                 System.out.println("Precio del producto + iva $" + formato.format((precio_producto += c.calculoIVA(precio_producto, porcent_iva))));
                 break;
            case 2:
                System.out.println("Iva del producto $" + formato.format(c.calcularIVAenproducto(precio_producto, porcent_iva)));
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
        
    }
}
