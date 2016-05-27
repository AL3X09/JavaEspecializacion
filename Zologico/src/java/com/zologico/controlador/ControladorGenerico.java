/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zologico.controlador;

import com.zologico.controlador.excepciones.ZologicoException;
import com.zologico.modelo.dao.ConexionBD;
import com.zologico.modelo.dao.IGenericoDAO;
import com.zologico.modelo.vo.IGenericoVO;
import java.sql.*;
import java.util.List;
import utilidades.EMensajesError;

/**
 *
 * @author Alecs
 */
public class ControladorGenerico <I extends IGenericoDAO, J extends IGenericoVO>{
    private I dao;
    private Connection cnn;
    
    public void insertar(J vo) throws ZologicoException{
        try {
            dao.insertar(vo);
        } catch (Exception e) {
            throw new ZologicoException(EMensajesError.ERROR_INSERTAR, e);
        }
        
    }
    public void modificar(J vo) throws ZologicoException{
        try {
            dao.modificar(vo);
        } catch (Exception e) {
            throw new ZologicoException(EMensajesError.ERROR_MODIFICAR, e);
        }
        
    }
    public void borrar(J vo) throws ZologicoException{
        try {
            dao.borrar(vo);
        } catch (Exception e) {
            throw new ZologicoException(EMensajesError.ERROR_BORRAR, e);
        }
        
    }
    public List<J> consultar() throws ZologicoException{
        try {
            return dao.consultar();
        } catch (Exception e) {
            throw new ZologicoException(EMensajesError.ERROR_CONSUlTAR, e);
        }
        
    }
    public void cerrarConexion() throws ZologicoException{
         try {
             ConexionBD.cerrarConexion(this.cnn);
        } catch (SQLException e) {
            throw new ZologicoException(EMensajesError.ERROR_BASE_DESCONECTAR, e);
        }
    }

    protected I getDao() {
        return dao;
    }

    protected void setDao(I dao) {
        this.dao = dao;
    }

    protected Connection getCnn() {
        return cnn;
    }

    protected void setCnn(Connection cnn) {
        this.cnn = cnn;
    }
    
    
}
