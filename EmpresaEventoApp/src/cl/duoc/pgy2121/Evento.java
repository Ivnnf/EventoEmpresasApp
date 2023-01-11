/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pgy2121;

import java.util.Date;

/**
 *
 * @author DUOC
 */
public class Evento {
    private String nombre,lugar;
    private Cliente cliente;
    Date fechini,fechfin;
    private int monto,codigo;

    public Evento() {
    }

    public Evento(String nombre, String lugar, Cliente cliente, Date fechini, Date fechfin, int monto, int codigo) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.cliente = cliente;
        this.fechini = fechini;
        this.fechfin = fechfin;
        this.monto = monto;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFechini() {
        return fechini;
    }

    public void setFechini(Date fechini) {
        this.fechini = fechini;
    }

    public Date getFechfin() {
        return fechfin;
    }

    public void setFechfin(Date fechfin) {
        this.fechfin = fechfin;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void verEvento(){
        System.out.println("Nombre del evento es: "+this.nombre);
        System.out.println("Codigo: "+this.codigo);
        System.out.println("Lugar: "+this.lugar);
        System.out.println("Monto :"+this.monto);
        System.out.println("Cliente :"+this.cliente);   
    }
    
    public int descontar(int descuento){
        
        descuento = (int)(this.monto*descuento/100);
        return descuento;
    
    }



    
    
    
    
}
