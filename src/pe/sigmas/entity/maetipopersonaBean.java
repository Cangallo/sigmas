/*******************************************************************************
 * Descripcion       : Clase que contiene los atributos de maetipopersona
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
    public class maetipopersonaBean extends BaseBean
    {
        private String cCodMaeTipoPersona; 
        private String nvAbreviatura; 
        private String nvDenominacion; 
        private String nvDescripcion; 
        private String nvObservacion; 
        private int iIdRegUsuaRegistra; 
        private Date dtFechRegistra; 
        private int iCantidadModifica; 
        private boolean bEstado; 
        public String getCCodMaeTipoPersona (){
        return cCodMaeTipoPersona ;
        }
        public void setCCodMaeTipoPersona (String cCodMaeTipoPersona){
        this.cCodMaeTipoPersona=cCodMaeTipoPersona ;
         }
        public String getNvAbreviatura (){
        return nvAbreviatura ;
        }
        public void setNvAbreviatura (String nvAbreviatura){
        this.nvAbreviatura=nvAbreviatura ;
         }
        public String getNvDenominacion (){
        return nvDenominacion ;
        }
        public void setNvDenominacion (String nvDenominacion){
        this.nvDenominacion=nvDenominacion ;
         }
        public String getNvDescripcion (){
        return nvDescripcion ;
        }
        public void setNvDescripcion (String nvDescripcion){
        this.nvDescripcion=nvDescripcion ;
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
        return nvAbreviatura ;
         }
    }
