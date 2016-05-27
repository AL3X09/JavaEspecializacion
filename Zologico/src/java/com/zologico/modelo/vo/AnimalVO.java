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
public class AnimalVO implements IGenericoVO{
    private int idanimal;
    private String nombre;
    private int idJaula;

    public int getIdanimal() {
        return idanimal;
    }

    public void setIdanimal(int idanimal) {
        this.idanimal = idanimal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdJaula() {
        return idJaula;
    }

    public void setIdJaula(int idJaula) {
        this.idJaula = idJaula;
    }

    
    
    
}
