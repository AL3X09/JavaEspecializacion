/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zologico.modelo.vo;

/**
 *
 * @author APRENDIZ
 */
public class ClienteVO implements IGenericoVO{
    int idCliente;
    String nombre;
    int cedula;
    int idTaquilla;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getIdTaquilla() {
        return idTaquilla;
    }

    public void setIdTaquilla(int idTaquilla) {
        this.idTaquilla = idTaquilla;
    }
    
    
    
}
