/*******************************************************************************
 * Descripcion       : Clase que contiene los atributos de regpago
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
    public class regpagoBean extends BaseBean
    {
        private int biIdRegPago; 
        private String cCodMaeEstaPago; 
        private String cCodMaeEstaCaja; 
        private String cCodRegContribuyente; 
        private int biIdRegRecibo; 
        private String nvNumRecibo; 
        private double deMontRecibido; 
        private double deMontVuelto; 
        private double deMontCancRedondeado; 
        private double deMontCancelado; 
        private double deMontResiRedondeo; 
        private double deTotalInsoluto; 
        private double deTotalReajuste; 
        private double deTotalInteres; 
        private double deTotalGasto; 
        private Date dtFechRecibo; 
        private String nvIp; 
        private String nvNombPc; 
        private String nvObservacion; 
        private int iIdRegUsuaRegistra; 
        private Date dtFechRegistra; 
        private int iCantidadModifica; 
        private boolean bEstado; 
        public int getBiIdRegPago (){
        return biIdRegPago ;
        }
        public void setBiIdRegPago (int biIdRegPago){
        this.biIdRegPago=biIdRegPago ;
         }
        public String getCCodMaeEstaPago (){
        return cCodMaeEstaPago ;
        }
        public void setCCodMaeEstaPago (String cCodMaeEstaPago){
        this.cCodMaeEstaPago=cCodMaeEstaPago ;
         }
        public String getCCodMaeEstaCaja (){
        return cCodMaeEstaCaja ;
        }
        public void setCCodMaeEstaCaja (String cCodMaeEstaCaja){
        this.cCodMaeEstaCaja=cCodMaeEstaCaja ;
         }
        public String getCCodRegContribuyente (){
        return cCodRegContribuyente ;
        }
        public void setCCodRegContribuyente (String cCodRegContribuyente){
        this.cCodRegContribuyente=cCodRegContribuyente ;
         }
        public int getBiIdRegRecibo (){
        return biIdRegRecibo ;
        }
        public void setBiIdRegRecibo (int biIdRegRecibo){
        this.biIdRegRecibo=biIdRegRecibo ;
         }
        public String getNvNumRecibo (){
        return nvNumRecibo ;
        }
        public void setNvNumRecibo (String nvNumRecibo){
        this.nvNumRecibo=nvNumRecibo ;
         }
        public double getDeMontRecibido (){
        return deMontRecibido ;
        }
        public void setDeMontRecibido (double deMontRecibido){
        this.deMontRecibido=deMontRecibido ;
         }
        public double getDeMontVuelto (){
        return deMontVuelto ;
        }
        public void setDeMontVuelto (double deMontVuelto){
        this.deMontVuelto=deMontVuelto ;
         }
        public double getDeMontCancRedondeado (){
        return deMontCancRedondeado ;
        }
        public void setDeMontCancRedondeado (double deMontCancRedondeado){
        this.deMontCancRedondeado=deMontCancRedondeado ;
         }
        public double getDeMontCancelado (){
        return deMontCancelado ;
        }
        public void setDeMontCancelado (double deMontCancelado){
        this.deMontCancelado=deMontCancelado ;
         }
        public double getDeMontResiRedondeo (){
        return deMontResiRedondeo ;
        }
        public void setDeMontResiRedondeo (double deMontResiRedondeo){
        this.deMontResiRedondeo=deMontResiRedondeo ;
         }
        public double getDeTotalInsoluto (){
        return deTotalInsoluto ;
        }
        public void setDeTotalInsoluto (double deTotalInsoluto){
        this.deTotalInsoluto=deTotalInsoluto ;
         }
        public double getDeTotalReajuste (){
        return deTotalReajuste ;
        }
        public void setDeTotalReajuste (double deTotalReajuste){
        this.deTotalReajuste=deTotalReajuste ;
         }
        public double getDeTotalInteres (){
        return deTotalInteres ;
        }
        public void setDeTotalInteres (double deTotalInteres){
        this.deTotalInteres=deTotalInteres ;
         }
        public double getDeTotalGasto (){
        return deTotalGasto ;
        }
        public void setDeTotalGasto (double deTotalGasto){
        this.deTotalGasto=deTotalGasto ;
         }
        public Date getDtFechRecibo (){
        return dtFechRecibo ;
        }
        public void setDtFechRecibo (Date dtFechRecibo){
        this.dtFechRecibo=dtFechRecibo ;
         }
        public String getNvIp (){
        return nvIp ;
        }
        public void setNvIp (String nvIp){
        this.nvIp=nvIp ;
         }
        public String getNvNombPc (){
        return nvNombPc ;
        }
        public void setNvNombPc (String nvNombPc){
        this.nvNombPc=nvNombPc ;
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
