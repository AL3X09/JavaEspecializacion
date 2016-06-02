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
        String url = "jdbc:mysql://sql6.freemysqlhosting.net:3306/";
        String db = "sql6122001";
        String usuario = "sql6122001";
        String pass = "cT5qTwJIfq";
        //crear conexion
        cnn = DriverManager.getConnection(url+db, usuario, pass);          
        try {
          //Class.forName(driver).newInstance();
          //conn = DriverManager.getConnection(url+dbName,userName,password);
            System.out.println("Connected to the database");
            
           // return cnn; 
          //cnn.close();
          //System.out.println("Disconnected from database");
      } catch (Exception e) {
          e.printStackTrace();
      }
        //Por el momento que no grabe en disco 
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

/*
// To connect to mongodb server
         MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
			
         // Now connect to your databases
         DB db = mongoClient.getDB( "zologico" );
         System.out.println("Connect to database successfully");
			
         boolean auth = db.authenticate("ALEX", "AL3X12");
         System.out.println("Authentication: "+auth);



//se invoca libreria que controla drivers de conexion
        Class.forName("com.dbschema.MongoJdbcDriver");
        //Parametros de conexion
        String url = "jdbc:mongodb://localhost:27017/zologico";
        String usuario = "ALEX";
        String pass = "AL3X12";
*/