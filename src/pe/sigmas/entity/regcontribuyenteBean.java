/*******************************************************************************
 * Descripcion       : Clase que contiene los atributos de regcontribuyente
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
    public class regcontribuyenteBean extends BaseBean
    {
        private String cCodRegContribuyente; 
        private int biIdRegPersona; 
        private String cCodMaeCategoria; 
        private Date dtFechInicio; 
        private Date dtFechFin; 
        private boolean bIndActivo; 
        private String nvObservacion; 
        private int iIdRegUsuaRegistra; 
        private Date dtFechRegistra; 
        private int iCantidadModifica; 
        private boolean bEstado; 
        public String getCCodRegContribuyente (){
        return cCodRegContribuyente ;
        }
        public void setCCodRegContribuyente (String cCodRegContribuyente){
        this.cCodRegContribuyente=cCodRegContribuyente ;
         }
        public int getBiIdRegPersona (){
        return biIdRegPersona ;
        }
        public void setBiIdRegPersona (int biIdRegPersona){
        this.biIdRegPersona=biIdRegPersona ;
         }
        public String getCCodMaeCategoria (){
        return cCodMaeCategoria ;
        }
        public void setCCodMaeCategoria (String cCodMaeCategoria){
        this.cCodMaeCategoria=cCodMaeCategoria ;
         }
        public Date getDtFechInicio (){
        return dtFechInicio ;
        }
        public void setDtFechInicio (Date dtFechInicio){
        this.dtFechInicio=dtFechInicio ;
         }
        public Date getDtFechFin (){
        return dtFechFin ;
        }
        public void setDtFechFin (Date dtFechFin){
        this.dtFechFin=dtFechFin ;
         }
        public boolean getBIndActivo (){
        return bIndActivo ;
        }
        public void setBIndActivo (boolean bIndActivo){
        this.bIndActivo=bIndActivo ;
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
