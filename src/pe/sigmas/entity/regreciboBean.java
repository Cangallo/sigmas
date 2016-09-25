/*******************************************************************************
 * Descripcion       : Clase que contiene los atributos de regrecibo
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
    public class regreciboBean extends BaseBean
    {
        private int biIdRegRecibo; 
        private int iIdEjercicio; 
        private String cCodRegContribuyente; 
        private int iIdVencimiento; 
        private String nvNumRecibo; 
        private String nvObservacion; 
        private int iIdRegUsuaRegistra; 
        private Date dtFechRegistra; 
        private int iCantidadModifica; 
        private boolean bEstado; 
        public int getBiIdRegRecibo (){
        return biIdRegRecibo ;
        }
        public void setBiIdRegRecibo (int biIdRegRecibo){
        this.biIdRegRecibo=biIdRegRecibo ;
         }
        public int getIIdEjercicio (){
        return iIdEjercicio ;
        }
        public void setIIdEjercicio (int iIdEjercicio){
        this.iIdEjercicio=iIdEjercicio ;
         }
        public String getCCodRegContribuyente (){
        return cCodRegContribuyente ;
        }
        public void setCCodRegContribuyente (String cCodRegContribuyente){
        this.cCodRegContribuyente=cCodRegContribuyente ;
         }
        public int getIIdVencimiento (){
        return iIdVencimiento ;
        }
        public void setIIdVencimiento (int iIdVencimiento){
        this.iIdVencimiento=iIdVencimiento ;
         }
        public String getNvNumRecibo (){
        return nvNumRecibo ;
        }
        public void setNvNumRecibo (String nvNumRecibo){
        this.nvNumRecibo=nvNumRecibo ;
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