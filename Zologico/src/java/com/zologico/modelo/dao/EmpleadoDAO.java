/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zologico.modelo.dao;

import com.zologico.modelo.vo.IGenericoVO;
import com.zologico.modelo.vo.EmpleadoVO;
import java.sql.*;
import java.util.List;

/**
 *
 * @author APRENDIZ
 */
public class EmpleadoDAO implements IGenericoDAO<EmpleadoVO> {

    Connection cnn;
    
    public EmpleadoDAO(Connection cnn){
        this.cnn= cnn;
    }

    @Override
    public void insertar(EmpleadoVO vo) throws SQLException {
        String sql="INSERT INTO empleado (nombre,codigo,cargo) VALUES(?,?,?)";        
        PreparedStatement ejecucionSQL = cnn.prepareStatement(sql);
        ejecucionSQL.setString(1, vo.getNombre());
        ejecucionSQL.setInt(2, vo.getCodigo());
        ejecucionSQL.setString(3, vo.getCargo());
        ejecucionSQL.executeUpdate();
    }

    @Override
    public void modificar(EmpleadoVO vo) throws SQLException {
        String sql="UPDATE empleado SET nombre=?,codigo=?,cargo=? WHERE idempelado=?";        
        PreparedStatement ejecucionSQL = cnn.prepareStatement(sql);
        ejecucionSQL.setString(1, vo.getNombre());
        ejecucionSQL.setInt(2, vo.getCodigo());
        ejecucionSQL.setString(3, vo.getCargo());
        ejecucionSQL.setInt(4, vo.getIdEmpleado());
        ejecucionSQL.executeUpdate();
    }

    @Override
    public void borrar(EmpleadoVO vo) throws SQLException {
        String sql="DELETE FROM empleado WHERE idanimal=?";        
        PreparedStatement ejecucionSQL = cnn.prepareStatement(sql);
        ejecucionSQL.setInt(1, vo.getIdEmpleado());        
        ejecucionSQL.executeUpdate();
    }

    @Override
    public List<EmpleadoVO> consultar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
