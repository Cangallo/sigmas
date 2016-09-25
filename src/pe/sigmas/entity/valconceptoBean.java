/*******************************************************************************
 * Descripcion       : Clase que contiene los atributos de valconcepto
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
    public class valconceptoBean extends BaseBean
    {
        private int iIdValConcepto; 
        private String cCodMaeConcepto; 
        private String cCodRegContribuyente; 
        private int iIdVencimiento; 
        private double deTotaInsoluto; 
        private boolean bIndFijo; 
        private String nvObservacion; 
        private int iIdRegUsuaRegistra; 
        private Date dtFechRegistra; 
        private int iCantidadModifica; 
        private boolean bEstado; 
        public int getIIdValConcepto (){
        return iIdValConcepto ;
        }
        public void setIIdValConcepto (int iIdValConcepto){
        this.iIdValConcepto=iIdValConcepto ;
         }
        public String getCCodMaeConcepto (){
        return cCodMaeConcepto ;
        }
        public void setCCodMaeConcepto (String cCodMaeConcepto){
        this.cCodMaeConcepto=cCodMaeConcepto ;
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
        public double getDeTotaInsoluto (){
        return deTotaInsoluto ;
        }
        public void setDeTotaInsoluto (double deTotaInsoluto){
        this.deTotaInsoluto=deTotaInsoluto ;
         }
        public boolean getBIndFijo (){
        return bIndFijo ;
        }
        public void setBIndFijo (boolean bIndFijo){
        this.bIndFijo=bIndFijo ;
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
