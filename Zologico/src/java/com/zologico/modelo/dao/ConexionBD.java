/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zologico.modelo.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

//clase conexion
public class ConexionBD {
    //Metodo obtener conexión
    public static Connection obtenerConexionBD() throws ClassNotFoundException, SQLException {
        // instancia al objeto cnn
        Connection cnn;
        //se invoca libreria que controla drivers de conexion
        Class.forName("com.mysql.jdbc.Driver");
        //Parametros de conexion
        String url = "jdbc:mysql://db4free.net:3306/pruebahost";
        String usuario = "al3x";
        String pass = "AL3X12";
        //se cre una conexion y se iguala a cnn
        cnn = DriverManager.getConnection(url, usuario, pass);
        //POr el momento que no grabe en disco 
        cnn.setAutoCommit(false);
        return cnn;
    }

    public static void cerrarConexion(Connection cnn) throws SQLException {
        //se graba
        cnn.commit();
        //cierra conexion
        cnn.close();
    }

}