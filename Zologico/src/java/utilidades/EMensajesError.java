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
    ERROR_INSERTAR("Error al insertar"),
    ERROR_MODIFICAR("Error al modificar"),
    ERROR_CONSUlTAR("Error al consultar"),
    ERROR_BORRAR("Error al borrar"),
    ERROR_DRIVER_NO_ENCONTRADO("Error driver no encontrado")
    ;
    
    String mensaje;
    
    private EMensajesError(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
