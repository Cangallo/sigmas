/*******************************************************************************
 * Descripcion       : Clase que contiene los atributos de regobligacion
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
    public class regobligacionBean extends BaseBean
    {
        private int biIdRegObligacion; 
        private int iIdEjercicio; 
        private int iIdValConcepto; 
        private int biIdRegRecibo; 
        private String cCodMaeEstaObligacion; 
        private String cCodRegContribuyente; 
        private int iIdVencimiento; 
        private double deTotaInsoluto; 
        private double deTotaReajuste; 
        private double deTotaInteres; 
        private double deTotaGasto; 
        private double dePagoInsoluto; 
        private double dePagoReajuste; 
        private double dePagoInteres; 
        private double dePagoGasto; 
        private double deModiInsoluto; 
        private double deModiReajuste; 
        private double deModiInteres; 
        private double deModiGasto; 
        private Date dtFechEmision; 
        private Date dtFechVencimiento; 
        private Date dtFechPago; 
        private String nvObservacion; 
        private int iIdRegUsuaRegistra; 
        private Date dtFechRegistra; 
        private int iCantidadModifica; 
        private boolean bEstado; 
        public int getBiIdRegObligacion (){
        return biIdRegObligacion ;
        }
        public void setBiIdRegObligacion (int biIdRegObligacion){
        this.biIdRegObligacion=biIdRegObligacion ;
         }
        public int getIIdEjercicio (){
        return iIdEjercicio ;
        }
        public void setIIdEjercicio (int iIdEjercicio){
        this.iIdEjercicio=iIdEjercicio ;
         }
        public int getIIdValConcepto (){
        return iIdValConcepto ;
        }
        public void setIIdValConcepto (int iIdValConcepto){
        this.iIdValConcepto=iIdValConcepto ;
         }
        public int getBiIdRegRecibo (){
        return biIdRegRecibo ;
        }
        public void setBiIdRegRecibo (int biIdRegRecibo){
        this.biIdRegRecibo=biIdRegRecibo ;
         }
        public String getCCodMaeEstaObligacion (){
        return cCodMaeEstaObligacion ;
        }
        public void setCCodMaeEstaObligacion (String cCodMaeEstaObligacion){
        this.cCodMaeEstaObligacion=cCodMaeEstaObligacion ;
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
        public double getDeTotaReajuste (){
        return deTotaReajuste ;
        }
        public void setDeTotaReajuste (double deTotaReajuste){
        this.deTotaReajuste=deTotaReajuste ;
         }
        public double getDeTotaInteres (){
        return deTotaInteres ;
        }
        public void setDeTotaInteres (double deTotaInteres){
        this.deTotaInteres=deTotaInteres ;
         }
        public double getDeTotaGasto (){
        return deTotaGasto ;
        }
        public void setDeTotaGasto (double deTotaGasto){
        this.deTotaGasto=deTotaGasto ;
         }
        public double getDePagoInsoluto (){
        return dePagoInsoluto ;
        }
        public void setDePagoInsoluto (double dePagoInsoluto){
        this.dePagoInsoluto=dePagoInsoluto ;
         }
        public double getDePagoReajuste (){
        return dePagoReajuste ;
        }
        public void setDePagoReajuste (double dePagoReajuste){
        this.dePagoReajuste=dePagoReajuste ;
         }
        public double getDePagoInteres (){
        return dePagoInteres ;
        }
        public void setDePagoInteres (double dePagoInteres){
        this.dePagoInteres=dePagoInteres ;
         }
        public double getDePagoGasto (){
        return dePagoGasto ;
        }
        public void setDePagoGasto (double dePagoGasto){
        this.dePagoGasto=dePagoGasto ;
         }
        public double getDeModiInsoluto (){
        return deModiInsoluto ;
        }
        public void setDeModiInsoluto (double deModiInsoluto){
        this.deModiInsoluto=deModiInsoluto ;
         }
        public double getDeModiReajuste (){
        return deModiReajuste ;
        }
        public void setDeModiReajuste (double deModiReajuste){
        this.deModiReajuste=deModiReajuste ;
         }
        public double getDeModiInteres (){
        return deModiInteres ;
        }
        public void setDeModiInteres (double deModiInteres){
        this.deModiInteres=deModiInteres ;
         }
        public double getDeModiGasto (){
        return deModiGasto ;
        }
        public void setDeModiGasto (double deModiGasto){
        this.deModiGasto=deModiGasto ;
         }
        public Date getDtFechEmision (){
        return dtFechEmision ;
        }
        public void setDtFechEmision (Date dtFechEmision){
        this.dtFechEmision=dtFechEmision ;
         }
        public Date getDtFechVencimiento (){
        return dtFechVencimiento ;
        }
        public void setDtFechVencimiento (Date dtFechVencimiento){
        this.dtFechVencimiento=dtFechVencimiento ;
         }
        public Date getDtFechPago (){
        return dtFechPago ;
        }
        public void setDtFechPago (Date dtFechPago){
        this.dtFechPago=dtFechPago ;
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
