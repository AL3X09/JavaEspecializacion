/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zologico.modelo.dao;

import com.zologico.modelo.vo.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author APRENDIZ
 */
public class JaulaDAO implements IGenericoDAO<JaulaVO>{

    Connection cnn;
    public JaulaDAO(Connection cnn){
        this.cnn=cnn;
    }

    @Override
    public void insertar(JaulaVO vo) throws SQLException {
        
        String sql = "INSERT INTO jaula (nombre)VALUES(?)";
        PreparedStatement ejecucionSQL = cnn.prepareStatement(sql);
        ejecucionSQL.setString(1, vo.getNombre());
        ejecucionSQL.executeUpdate();
    }

    @Override
    public void modificar(JaulaVO vo) throws SQLException {
        String sql="UPDATE jaula SET nombre=? WHERE idjaula=?";        
        PreparedStatement ejecucionSQL = cnn.prepareStatement(sql);
        ejecucionSQL.setString(1, vo.getNombre());
        ejecucionSQL.setInt(2, vo.getIdJaula());
        ejecucionSQL.executeUpdate();
    }

    @Override
    public void borrar(JaulaVO vo) throws SQLException {
        String sql="DELETE FROM jaula WHERE idjaula=?";        
        PreparedStatement ejecucionSQL = cnn.prepareStatement(sql);
        ejecucionSQL.setInt(1, vo.getIdJaula());        
        ejecucionSQL.executeUpdate();
    }

    @Override
    public List<JaulaVO> consultar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
    
}
