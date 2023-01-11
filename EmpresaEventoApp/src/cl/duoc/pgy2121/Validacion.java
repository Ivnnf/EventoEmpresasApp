/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121;

/**
 *
 * @author DUOC
 */
public class Validacion {

    public Validacion() {
    }
    
    public boolean validarCliente(String nuevo){
        
        if (nuevo.equalsIgnoreCase("N") || nuevo.equalsIgnoreCase("A")) {
            return true;
        }else
        {
            return false;
        }

    }
    
    public boolean validarEvento(int monto){
        if(monto > 150000){
            return true;
        }else
        {
            return false;
        }
    }
    
    public boolean validarNombreev(String nombre){
        if(nombre.length()>5){
            return true;
        }else
        {
            return false;
        }
    
    }
}
