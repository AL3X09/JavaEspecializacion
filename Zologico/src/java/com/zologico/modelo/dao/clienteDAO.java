/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zologico.modelo.dao;

import com.zologico.modelo.vo.ClienteVO;
import java.sql.*;
import java.util.List;



/**
 *
 * @author APRENDIZ
 */
public class ClienteDAO implements IGenericoDAO<ClienteVO>{
    
    Connection cnn;
    public ClienteDAO(Connection cnn){
        this.cnn= cnn;
    }

    @Override
    public void insertar(ClienteVO vo) throws SQLException {
       String sql="INSERT INTO animal (nombre,cedula,idTaquilla) VALUES(?,?,?)";        
       PreparedStatement ejecucionSQL = cnn.prepareStatement(sql);
       ejecucionSQL.setString(1, vo.getNombre());
       ejecucionSQL.setInt(2, vo.getCedula());
       ejecucionSQL.setInt(3, vo.getIdTaquilla());
       ejecucionSQL.executeUpdate();
        //ejecucionSQL.close(); 
    }

    @Override
    public void modificar(ClienteVO vo) throws SQLException {
        String sql="UPDATE cliente SET nombre=?,cedula=?,id_taquilla=? WHERE idcliente=?";        
        PreparedStatement ejecucionSQL = cnn.prepareStatement(sql);
        ejecucionSQL.setString(1, vo.getNombre());
        ejecucionSQL.setInt(2, vo.getCedula());
        ejecucionSQL.setInt(3, vo.getIdTaquilla());
        ejecucionSQL.setInt(4, vo.getIdCliente());
        ejecucionSQL.executeUpdate();
    }

    @Override
    public void borrar(ClienteVO vo) throws SQLException {
        String sql="DELETE FROM cliente WHERE idcliente=?";        
        PreparedStatement ejecucionSQL = cnn.prepareStatement(sql);
        ejecucionSQL.setInt(1, vo.getIdCliente());        
        ejecucionSQL.executeUpdate();
    }

    @Override
    public List<ClienteVO> consultar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
