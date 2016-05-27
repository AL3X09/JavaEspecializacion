/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zologico.modelo.dao;
import com.zologico.modelo.vo.TaquillaVO;
import java.sql.*;
import java.util.List;

/**
 *
 * @author APRENDIZ
 */
public class TaquillaDAO implements IGenericoDAO<TaquillaVO>{
    Connection cnn;
    public TaquillaDAO(){
        this.cnn=cnn;
    }

    @Override
    public void insertar(TaquillaVO vo) throws SQLException {
        String sql="INSERT INTO taquila (nombre,precio) VALUES(?,?)";        
        PreparedStatement ejecucionSQL = cnn.prepareStatement(sql);
        ejecucionSQL.setString(1, vo.getNombre());
        ejecucionSQL.setDouble(2, vo.getPrecio());
        ejecucionSQL.executeUpdate();
        //ejecucionSQL.close();
    }

    @Override
    public void modificar(TaquillaVO vo) throws SQLException {
        String sql="UPDATE taquilla SET nombre=?,precio=? WHERE idtaquilla=?";        
        PreparedStatement ejecucionSQL = cnn.prepareStatement(sql);
        ejecucionSQL.setString(1, vo.getNombre());
        ejecucionSQL.setDouble(2, vo.getPrecio());
        ejecucionSQL.setInt(2, vo.getIdTaquilla());
        ejecucionSQL.executeUpdate();
    }

    @Override
    public void borrar(TaquillaVO vo) throws SQLException {
        String sql="DELETE FROM taquilla WHERE idtaquilla=?";        
        PreparedStatement ejecucionSQL = cnn.prepareStatement(sql);
        ejecucionSQL.setInt(1, vo.getIdTaquilla());        
        ejecucionSQL.executeUpdate();
    }

    @Override
    public List<TaquillaVO> consultar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
    
}
