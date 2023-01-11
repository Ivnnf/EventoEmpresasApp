/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121;

import java.util.Scanner;

/**
 *
 * @author DUOC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        boolean flagValido;
        Validacion val= new Validacion();
        Scanner teclado = new Scanner(System.in);
        Cliente cli = new Cliente();
        Evento eve = new Evento();
        
        
        
        do{
            System.out.println("*****Menu******");
            System.out.println("1. Crear Cliente  ");
            System.out.println("2. Crear Evento  ");
            System.out.println("3. Mostrar informacion del evento  ");
            System.out.println("4. Aplicar Descuento a cliente ");
            System.out.println("5. Salir  ");
            opcion=teclado.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Ingrese Rut Cliente(sin puntos ni guión): ");
                    int rut = teclado.nextInt();
                    cli.setRut(rut);
                    
                    System.out.println("Ingrese Nombre de Cliente: ");
                    String nombre= teclado.next();
                    cli.setNombre(nombre);
                    
                    System.out.println("Ingrese Apellido: ");
                    String apellido= teclado.next();
                    cli.setApellido(apellido);
                    
                    do{
                        System.out.println("Si es Cliente Nuevo(N), si es Antiguo (A)");
                        String nuevo=teclado.next();
                        flagValido=val.validarCliente(nuevo);
                        if(flagValido==false){
                            System.out.println("Error Ingrese (N)Nuevo, (A)Antiguo");
                        }else{
                            cli.setNuevo(nuevo);
                        }
                    }while(flagValido==false);
                    
                    System.out.println("Ingrese correo: ");
                    String correo=teclado.next();
                    cli.setCorreo(correo);
                    break;
                case 2:
                    do{
                        System.out.println("Ingrese Nombre del evento: ");
                        String nomb=teclado.next();
                        flagValido=val.validarNombreev(nomb);
                        if(flagValido==false){
                            System.out.println("Nombre debe ser mayor a 5 letras ");
                        }else{
                            eve.setNombre(nomb);
                        }
                    }while(flagValido==false);
                    
                    
                    System.out.println("Ingrese Codigo: ");
                    int codigo=teclado.nextInt();
                    eve.setCodigo(codigo);
                    
                    System.out.println("Ingrese lugar: ");
                    String lugar=teclado.next();
                    eve.setLugar(lugar);
                    
                    do{
                        System.out.println("Ingrese monto: ");
                        int monto=teclado.nextInt();
                        flagValido=val.validarEvento(monto);
                        if(flagValido==false){
                            System.out.println("Monto debe ser superior a los 150.000");
                        }else{
                            eve.setMonto(monto);
                        }
                    }while(flagValido==false);
                    
                    break;
                case 3:
                    System.out.println("Detalles del evento");
                    eve.verEvento();
                    break;
                case 4:
                    System.out.println("Ingrese descuento %: ");
                    
                    int descuento=teclado.nextInt();
   
                    descuento=eve.descontar(descuento);
                    
                    
                    
                    break;
                case 5:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Error, intente de nuevo");
            
            
            }
            
        }while(opcion !=5);
    }
    
}
