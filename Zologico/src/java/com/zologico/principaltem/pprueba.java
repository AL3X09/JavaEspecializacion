/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zologico.principaltem;
import com.zologico.controlador.AnimalController;
import com.zologico.modelo.dao.*;
import com.zologico.modelo.vo.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class pprueba {
     public static void main(String[] args) {
         try {
             JOptionPane.showMessageDialog(null,"Hola Iniciando Programa");
             Connection cnn = ConexionBD.obtenerConexionBD();
//             AnimalVO vo= new AnimalVO();
//             vo.setNombre(JOptionPane.showInputDialog("ingrese nombre del animal"));
//             vo.setIdJaula(1);
//             //formato de fecha para necesidad despues
//             SimpleDateFormat formato =new SimpleDateFormat("dd/MM/yyyy");
//             //vo.setfecha(formato.parse("25/11/2016"));
//             AnimalDAO dao = new AnimalDAO(cnn);
//             dao.insertar(vo);
                AnimalController animal = new AnimalController();
                AnimalVO vo = new AnimalVO();
                vo.setNombre(JOptionPane.showInputDialog("ingrese nombre del animal"));
                vo.setIdJaula(1);
                animal.insertar(vo);
                animal.cerrarConexion();
             //ConexionBD.cerrarConexion(cnn);
             JOptionPane.showMessageDialog(null,"Datos Guardados");
             
         }catch(ClassNotFoundException e){
            System.out.println("No se encontro el Driver de Mysql");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
     }
    
}
