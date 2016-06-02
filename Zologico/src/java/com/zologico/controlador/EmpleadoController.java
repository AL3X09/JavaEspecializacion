/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zologico.controlador;

import com.zologico.controlador.excepciones.ZologicoException;
import com.zologico.modelo.dao.ConexionBD;
import com.zologico.modelo.dao.EmpleadoDAO;
import com.zologico.modelo.vo.EmpleadoVO;
import java.sql.*;
import utilidades.EMensajesError;


/**
 *
 * @author Alecs
 */
public class EmpleadoController extends ControladorGenerico<EmpleadoDAO, EmpleadoVO>{

    public EmpleadoController() throws ZologicoException{
        try {
            this.setCnn(ConexionBD.obtenerConexionBD());
            this.setDao(new EmpleadoDAO(this.getCnn()));
        } catch (ClassNotFoundException e) {
            throw new ZologicoException(EMensajesError.ERROR_DRIVER_NO_ENCONTRADO, e);
        } catch (SQLException e) {
            throw new ZologicoException(EMensajesError.ERROR_BASE_DATOS, e);
        }
    }
    
    public EmpleadoController(Connection cnn) throws ZologicoException{
        try {
            this.setCnn(cnn);
            this.setDao(new EmpleadoDAO(this.getCnn()));
        }catch (Exception ex) {
            throw new ZologicoException(EMensajesError.ERROR_BASE_DATOS, ex);
        }
    }
    
}
