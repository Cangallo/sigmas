/*******************************************************************************
 * Descripcion       : Clase que contiene los atributos de regusuario
 * Creado por        : APP
 * Fecha de Creacion : 22/05/2015 12:05:51
** *****************************************************************************/

package pe.sigmas.entity; 

import java.sql.Date; 

import java.sql.Time; 

/**
*
* @author APP
 */
    public class regusuarioBean extends BaseBean
    {
        private int iIdRegUsuario; 
        private String cCodRegTrabajador; 
        private Date dtFechaVigencia; 
        private String nvNombUsuario; 
        private String nvContrasenia; 
        private String nvObservacion; 
        private int iIdRegUsuaRegistra; 
        private Date dtFechRegistra; 
        private int iCantidadModifica; 
        private boolean bEstado; 
        public int getIIdRegUsuario (){
        return iIdRegUsuario ;
        }
        public void setIIdRegUsuario (int iIdRegUsuario){
        this.iIdRegUsuario=iIdRegUsuario ;
         }
        public String getCCodRegTrabajador (){
        return cCodRegTrabajador ;
        }
        public void setCCodRegTrabajador (String cCodRegTrabajador){
        this.cCodRegTrabajador=cCodRegTrabajador ;
         }
        public Date getDtFechaVigencia (){
        return dtFechaVigencia ;
        }
        public void setDtFechaVigencia (Date dtFechaVigencia){
        this.dtFechaVigencia=dtFechaVigencia ;
         }
        public String getNvNombUsuario (){
        return nvNombUsuario ;
        }
        public void setNvNombUsuario (String nvNombUsuario){
        this.nvNombUsuario=nvNombUsuario ;
         }
        public String getNvContrasenia (){
        return nvContrasenia ;
        }
        public void setNvContrasenia (String nvContrasenia){
        this.nvContrasenia=nvContrasenia ;
         }
        public String getNvObservacion (){
        return nvObservacion ;
        }
        public void setNvObservacion (String nvObservacion){
        this.nvObservacion=nvObservacion ;
         }
        public int getIIdRegUsuaRegistra (){
        return iIdRegUsuaRegistra ;
        }
        public void setIIdRegUsuaRegistra (int iIdRegUsuaRegistra){
        this.iIdRegUsuaRegistra=iIdRegUsuaRegistra ;
         }
        public Date getDtFechRegistra (){
        return dtFechRegistra ;
        }
        public void setDtFechRegistra (Date dtFechRegistra){
        this.dtFechRegistra=dtFechRegistra ;
         }
        public int getICantidadModifica (){
        return iCantidadModifica ;
        }
        public void setICantidadModifica (int iCantidadModifica){
        this.iCantidadModifica=iCantidadModifica ;
         }
        public boolean getBEstado (){
        return bEstado ;
        }
        public void setBEstado (boolean bEstado){
        this.bEstado=bEstado ;
         }
        @Override
        public String toString(){
        return nvObservacion ;
         }
    }
