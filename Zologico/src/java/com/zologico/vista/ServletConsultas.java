/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zologico.vista;

import com.google.gson.Gson;
import com.zologico.controlador.AnimalController;
import com.zologico.controlador.excepciones.ZologicoException;
import com.zologico.modelo.vo.*;
import com.zologico.vista.utilidades.RespuestaServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alecs
 */
@WebServlet(name = "ServletConsultas", urlPatterns = {"/consulta/animal","/consulta/jaula","/consulta/empleado","/consulta/cliente","/consulta/taquilla"})
public class ServletConsultas extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            //defino una propiedad accion para que responda a una url determinada
            String accion = request.getServletPath().substring(request.getServletPath().lastIndexOf("/")+1);
            //llamo al controlador
            AnimalController anic = new AnimalController();
            RespuestaServlet respuesta =new RespuestaServlet();
            switch (accion){
                case "animal":
                    //armo lista
                    List<AnimalVO> listadoAnimal = anic.consultar();
                    //envio respuesta
                    respuesta.setCodigo(1);
                    respuesta.setMensage("Consulta Animal");
                    respuesta.setDatos(listadoAnimal);
                    //armo un json para enviarlo a la vista
                    Gson gsonConAnimal=new Gson();
                    String jsonAnimal =gsonConAnimal.toJson(respuesta);
                    out.println(jsonAnimal);

                    
                    break;
                case "jaula":
                        break;
                case "empelado":
                    break;
                case "cliente":
                    break;
                case "taquilla":
                    break;
                default:
                    throw new AssertionError();
            }
           
        }catch(ZologicoException error){
            error.printStackTrace();
            RespuestaServlet respuesta =new RespuestaServlet();
            respuesta.setCodigo(500);
            respuesta.setMensage("error en actividad del servlet comuniquece con el administrador");
            respuesta.setDatos(null);
            //armo un json para enviarlo a la vista
            Gson gson=new Gson();
            String json =gson.toJson(respuesta);
            PrintWriter out;
            out = response.getWriter();
            out.println(json);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
