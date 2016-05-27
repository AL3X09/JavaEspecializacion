/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zologico.modelo.dao;
import com.zologico.modelo.vo.IGenericoVO;
import java.sql.*;
import java.util.List;

/**
 *
 * @author APRENDIZ
 */
public interface IGenericoDAO<I extends IGenericoVO>{
    
    public void insertar(I vo) throws SQLException;

    public void modificar(I vo) throws SQLException;

    public void borrar(I vo) throws SQLException;

    public List<I> consultar() throws SQLException;
    
}
