/*******************************************************************************
 * Descripcion       : Clase que contiene los atributos de ejercicio
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
    public class ejercicioBean extends BaseBean
    {
        private int iIdEjercicio; 
        private int iAnioFiscal; 
        private double deUit; 
        private String nvDenominacion; 
        private String nvObservacion; 
        private int iIdRegUsuaRegistra; 
        private Date dtFechRegistra; 
        private int iCantidadModifica; 
        private boolean bEstado; 
        public int getIIdEjercicio (){
        return iIdEjercicio ;
        }
        public void setIIdEjercicio (int iIdEjercicio){
        this.iIdEjercicio=iIdEjercicio ;
         }
        public int getIAnioFiscal (){
        return iAnioFiscal ;
        }
        public void setIAnioFiscal (int iAnioFiscal){
        this.iAnioFiscal=iAnioFiscal ;
         }
        public double getDeUit (){
        return deUit ;
        }
        public void setDeUit (double deUit){
        this.deUit=deUit ;
         }
        public String getNvDenominacion (){
        return nvDenominacion ;
        }
        public void setNvDenominacion (String nvDenominacion){
        this.nvDenominacion=nvDenominacion ;
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
