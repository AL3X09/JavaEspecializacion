/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zologico.modelo.dao;

import com.zologico.modelo.vo.AnimalVO;
import java.sql.*;
import java.util.*;

/**
 *
 * @author APRENDIZ
 */
public class AnimalDAO implements IGenericoDAO<AnimalVO>{
    
    Connection cnn;
    
    public AnimalDAO(Connection cnn){
        this.cnn= cnn;
    }

    @Override
    public void insertar(AnimalVO vo) throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sql="INSERT INTO animal (nombre,jaula_idjaula) VALUES(?,?)";        
        PreparedStatement ejecucionSQL = cnn.prepareStatement(sql);
        ejecucionSQL.setString(1, vo.getNombre());
        ejecucionSQL.setInt(2, vo.getIdJaula());
        ejecucionSQL.executeUpdate();
        //ejecucionSQL.close();
    }

    @Override
    public void modificar(AnimalVO vo) throws SQLException {
        String sql="UPDATE animal SET nombre=?,jaula_idjaula=? WHERE idanimal=?";        
        PreparedStatement ejecucionSQL = cnn.prepareStatement(sql);
        ejecucionSQL.setString(1, vo.getNombre());
        ejecucionSQL.setInt(2, vo.getIdJaula());
        ejecucionSQL.executeUpdate();
    }

    @Override
    public void borrar(AnimalVO vo) throws SQLException {
        String sql="DELETE FROM animal WHERE idanimal=?";        
        PreparedStatement ejecucionSQL = cnn.prepareStatement(sql);
        ejecucionSQL.setInt(1, vo.getIdanimal());        
        ejecucionSQL.executeUpdate();
    }

    @Override
    public List<AnimalVO> consultar() throws SQLException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String sql="SELECT * FROM animal";        
        PreparedStatement ejecucionSQL = cnn.prepareStatement(sql);
        ResultSet resultado = ejecucionSQL.executeQuery();
        ArrayList<AnimalVO> listaAnimales =new ArrayList<>();
        
        while (resultado.next()) {
            AnimalVO veoTem= new AnimalVO();
            veoTem.setIdanimal(resultado.getInt("idanimal"));
            veoTem.setNombre(resultado.getString("nombre"));
            veoTem.setIdJaula(resultado.getInt("jaula_idjaula"));
            listaAnimales.add(veoTem);
        }
        if (listaAnimales.size()==0) {
            return null;
        }
        return listaAnimales;
        }

    
    
}
