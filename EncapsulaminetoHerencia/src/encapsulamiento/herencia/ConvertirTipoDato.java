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
public class ConvertirTipoDato {
    
    public static void main(String[] args) {
        ConvertirTipoDato polimorfismo = new ConvertirTipoDato();
        
        System.out.println("Valor int a String " + polimorfismo.convertirAString(10));
        System.out.println("Valor double a String " + polimorfismo.convertirAString(10.0));
        System.out.println("Valor float a String " + polimorfismo.convertirAString(10.12));
    }
    
    public String convertirAString(int valorInt){
        String conversion = String.valueOf(valorInt);
        return conversion;
    }
    
    public String convertirAString(double valorDouble){
        String conversion = String.valueOf(valorDouble);
        return conversion;
    }
    
    public String convertirAString(float valorFloat){
        String conversion = String.valueOf(valorFloat);
        return conversion;
    }
    
}
