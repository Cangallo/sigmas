/*******************************************************************************
 * Descripcion       : Clase que contiene los atributos de regpersona
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
    public class regpersonaBean extends BaseBean
    {
        private int biIdRegPersona; 
        private String cCodMaeEstaCivil; 
        private String cCodMaeTipoPersona; 
        private String cCodMaeSexo; 
        private String nvNombre; 
        private String nvApePaterno; 
        private String nvApeMaterno; 
        private String nvRazoSocial; 
        private String nvNumDocumento; 
        private String nvTeleFijo; 
        private String nvTeleMovil; 
        private String nvDomiProcesal; 
        private String nvRpm; 
        private String nvEmail; 
        private Date dtFechNacimiento; 
        private String nvObservacion; 
        private int iIdRegUsuaRegistra; 
        private Date dtFechRegistra; 
        private int iCantidadModifica; 
        private boolean bEstado; 
        public int getBiIdRegPersona (){
        return biIdRegPersona ;
        }
        public void setBiIdRegPersona (int biIdRegPersona){
        this.biIdRegPersona=biIdRegPersona ;
         }
        public String getCCodMaeEstaCivil (){
        return cCodMaeEstaCivil ;
        }
        public void setCCodMaeEstaCivil (String cCodMaeEstaCivil){
        this.cCodMaeEstaCivil=cCodMaeEstaCivil ;
         }
        public String getCCodMaeTipoPersona (){
        return cCodMaeTipoPersona ;
        }
        public void setCCodMaeTipoPersona (String cCodMaeTipoPersona){
        this.cCodMaeTipoPersona=cCodMaeTipoPersona ;
         }
        public String getCCodMaeSexo (){
        return cCodMaeSexo ;
        }
        public void setCCodMaeSexo (String cCodMaeSexo){
        this.cCodMaeSexo=cCodMaeSexo ;
         }
        public String getNvNombre (){
        return nvNombre ;
        }
        public void setNvNombre (String nvNombre){
        this.nvNombre=nvNombre ;
         }
        public String getNvApePaterno (){
        return nvApePaterno ;
        }
        public void setNvApePaterno (String nvApePaterno){
        this.nvApePaterno=nvApePaterno ;
         }
        public String getNvApeMaterno (){
        return nvApeMaterno ;
        }
        public void setNvApeMaterno (String nvApeMaterno){
        this.nvApeMaterno=nvApeMaterno ;
         }
        public String getNvRazoSocial (){
        return nvRazoSocial ;
        }
        public void setNvRazoSocial (String nvRazoSocial){
        this.nvRazoSocial=nvRazoSocial ;
         }
        public String getNvNumDocumento (){
        return nvNumDocumento ;
        }
        public void setNvNumDocumento (String nvNumDocumento){
        this.nvNumDocumento=nvNumDocumento ;
         }
        public String getNvTeleFijo (){
        return nvTeleFijo ;
        }
        public void setNvTeleFijo (String nvTeleFijo){
        this.nvTeleFijo=nvTeleFijo ;
         }
        public String getNvTeleMovil (){
        return nvTeleMovil ;
        }
        public void setNvTeleMovil (String nvTeleMovil){
        this.nvTeleMovil=nvTeleMovil ;
         }
        public String getNvDomiProcesal (){
        return nvDomiProcesal ;
        }
        public void setNvDomiProcesal (String nvDomiProcesal){
        this.nvDomiProcesal=nvDomiProcesal ;
         }
        public String getNvRpm (){
        return nvRpm ;
        }
        public void setNvRpm (String nvRpm){
        this.nvRpm=nvRpm ;
         }
        public String getNvEmail (){
        return nvEmail ;
        }
        public void setNvEmail (String nvEmail){
        this.nvEmail=nvEmail ;
         }
        public Date getDtFechNacimiento (){
        return dtFechNacimiento ;
        }
        public void setDtFechNacimiento (Date dtFechNacimiento){
        this.dtFechNacimiento=dtFechNacimiento ;
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
