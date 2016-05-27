/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

/**
 *un enum es crear comodines de texto o lo que desea y cntiene cosas constantes
 * @author Alecs
 */
public enum EMensajesError {
    ERROR_BASE_DATOS("Error al conectar"),
    ERROR_BASE_DESCONECTAR("Error al Desconectar"),
    ERROR_INSERTAR(""),
    ERROR_MODIFICAR(""),
    ERROR_CONSUlTAR(""),
    ERROR_BORRAR(""),
    ERROR_DRIVER_NO_ENCONTRADO("")
    ;
    
    String mensaje;
    
    private EMensajesError(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
