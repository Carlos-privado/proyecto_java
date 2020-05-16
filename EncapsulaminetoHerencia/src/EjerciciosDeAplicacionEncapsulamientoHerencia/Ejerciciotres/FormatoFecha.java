/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosDeAplicacionEncapsulamientoHerencia.Ejerciciotres;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class FormatoFecha {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        FormatoFecha fecha = new FormatoFecha();
        System.out.println("Ingrese la fecha");
        String fech = leer.nextLine();
        
        fecha.getFechaGuiones(fech);
        fecha.getFechaPleca(fech);
    }
    
//    public String getFechaGuiones(String fecha){
//        Permite dale formato de fecha a un String o Date
//        SimpleDateFormat FormatoFecha = new SimpleDateFormat("dd-MM-yy");
//        SimpleDateFormat Formato = new SimpleDateFormat("dd-MM-yy");
//        Date formatofecha = null;
//        try {
//        Permite pasar el String a Date
//           formatofecha = FormatoFecha.parse(fecha);
//        }catch(ParseException e){
//            System.out.println(e.getMessage());
//        }
//        Permite pasar el Date a String
//        String formatofechaString = Formato.format(formatofecha);
//        return formatofechaString;
//    }
//    
    public void getFechaGuiones(String fecha){
        // metodos arcanos 
        for(int i = 0; i < fecha.length(); i++){  
            if(i == 2){
                System.out.print("-");
            }else if(i == 4){
                System.out.print("-");
            }
            System.out.print(fecha.charAt(i));
        }
        System.out.println("");
    }
    public void getFechaPleca(String fecha){
        // metodos arcanos 
        for(int i = 0; i < fecha.length(); i++){  
            if(i == 2){
                System.out.print("/");
            }else if(i == 4){
                System.out.print("/");
            }
            System.out.print(fecha.charAt(i));
        }
        System.out.println("");
    }
}
