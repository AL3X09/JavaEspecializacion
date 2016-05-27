/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zologico.controlador.excepciones;

import utilidades.EMensajesError;

/**
 *
 * @author Alecs
 */
public class ZologicoException extends Exception {
    String mensaje;
    
   public ZologicoException(EMensajesError mensaje, Throwable cause){
       super(mensaje.getMensaje() +  cause.getMessage(), cause);
       this.mensaje = mensaje.getMensaje();
   }
      public String getMensaje() {
        return mensaje;
    }
    
}
