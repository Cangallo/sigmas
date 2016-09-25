/*******************************************************************************
// Descripción       : Clase que contiene los atributos de GenericBean
// Creado por        : APP
// Fecha de Creación : 19/05/2015 18:30:46
********************************************************************************/

package pe.sigmas.entity;

import java.io.Serializable;

/**
*
* @author APP
 */
    public class BaseBean implements Serializable 
    {
        private String mensaje; 
        private Boolean status; 
        private String accion; 
        private int iOps; 
        private Boolean bEstaOperacion; 
        public String getMensaje (){
        return mensaje ;
         }
        public void setMensaje (String mensaje){
        this.mensaje=mensaje ;
         }
        public Boolean getStatus (){
        return status ;
         }
        public void setStatus (Boolean status){
        this.status=status ;
         }
        public String getAccion (){
        return accion ;
         }
        public void setAccion (String accion){
        this.accion=accion ;
         }
        public int getIOps (){
        return iOps ;
         }
        public void setIOps (int iOps){
        this.iOps=iOps ;
         }
        public Boolean getBEstaOperacion (){
        return bEstaOperacion ;
         }
        public void setBEstaOperacion (Boolean bEstaOperacion){
        this.bEstaOperacion=bEstaOperacion ;
         }
    }
