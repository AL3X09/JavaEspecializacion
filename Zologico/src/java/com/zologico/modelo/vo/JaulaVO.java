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
public class JaulaVO implements IGenericoVO{
    int idJaula;
    String nombre;

    public int getIdJaula() {
        return idJaula;
    }

    public void setIdJaula(int idJaula) {
        this.idJaula = idJaula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
