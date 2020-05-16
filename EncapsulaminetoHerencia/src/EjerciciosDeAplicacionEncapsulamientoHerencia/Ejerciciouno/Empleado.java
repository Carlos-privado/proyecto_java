/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosDeAplicacionEncapsulamientoHerencia.Ejerciciouno;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Empleado {
    
    private String noNIT;
    private String apellidos;
    private String nombres;
    private String Direccion;
    private double salarioDevegado;
    private double salarioConDescuento;
    private boolean estadoEmpleado;

    public String getNoNIT() {
        return noNIT;
    }

    public void setNoNIT(String noNIT) {
        this.noNIT = noNIT;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public double getSalarioDevegado() {
        return salarioDevegado;
    }

    public void setSalarioDevegado(double salarioDevegado) {
        this.salarioDevegado = salarioDevegado;
    }

    public double getSalarioConDescuento() {
        return salarioConDescuento;
    }

    public void setSalarioConDescuento(double salarioConDescuento) {
        this.salarioConDescuento = salarioConDescuento;
    }

    public boolean isEstadoEmpleado() {
        return estadoEmpleado;
    }

    public void setEstadoEmpleado(int estadoEmpleado) {
        if(estadoEmpleado == 1){
            this.estadoEmpleado = true;
        }else if(estadoEmpleado == 2){
            this.estadoEmpleado = false;
        }
    }
    
    public double calcularSalarioConDescuento(double salario_empleado, double descuento){
        double salario;
        return salario = (salario_empleado - descuento);
    }
    
    public double calcularDescuento(double salario_empleado){
        double descuento;
        return descuento = salario_empleado * 0.10;
    }
    
    public String getNombreContribuyente(String nombre, String apellido){
        String nombre_completo;
        nombre_completo = nombre + " " + apellido;
        return nombre_completo;
    }
    
    public String getAtributs(Empleado emp){
        String atributos;
        atributos = "<<<<<< Atributos >>>>>>\n";
        atributos += "Numero NIT: " + emp.noNIT + "\n";
        atributos += "Nombre    : " + emp.nombres + "\n";
        atributos += "Apellido  : " + emp.apellidos + "\n";
        atributos += "Direccion : " + emp.Direccion + "\n";
        atributos += "Salario Devegado : " + emp.salarioDevegado + "\n";
        atributos += "Salario con Descuento : " + emp.salarioConDescuento + "\n";
        if(emp.isEstadoEmpleado() == true){
            atributos += "Estado empleado : activo \n";
        }else{
            atributos += "Estado empleado : inactivo \n";
        }

        return atributos;
    }
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Empleado empleado = new Empleado();
        
        System.out.println("NIT de empleado");
        empleado.setNoNIT(leer.nextLine());
        System.err.println("Nombre Empleado");
        empleado.setNombres(leer.nextLine());
        System.out.println("Apellido Empleado");
        empleado.setApellidos(leer.nextLine());
        System.out.println("Direccion Empleado");
        empleado.setDireccion(leer.nextLine());
        System.out.println("Salario Devegando");
        empleado.setSalarioDevegado(leer.nextDouble());
        System.out.println("Estado empleado");
        System.out.println("1 Activo \n2 Incativo");
        empleado.setEstadoEmpleado(leer.nextInt());
        
        //Calculo del descuento                         obtiene el valor delsalrio bruto
        double descuento = empleado.calcularDescuento(empleado.getSalarioDevegado());
        
        /* Me queria ahorrar tiempo por eso no guarde los datos en variables :u por lo tanto  *
         * extraigo de manera directa los                                                     *
         * datos a traves de los getter y los asigno usando los setter                        */
        //Asignar salario con descuento                                              salario bruto          descuento
        empleado.setSalarioConDescuento(empleado.calcularSalarioConDescuento(empleado.getSalarioDevegado(), descuento));
        
        System.out.println("**************************************************");
        System.out.println(empleado.getNombreContribuyente(empleado.getNombres(), empleado.getApellidos()));
        System.out.println(empleado.getAtributs(empleado));
        System.out.println("**************************************************");
        
    }
    
}
