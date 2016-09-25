/*******************************************************************************
 * Descripcion       : Clase que contiene los atributos de regdetapago
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
    public class regdetapagoBean extends BaseBean
    {
        private int biIdRegDetaPago; 
        private int biIdRegPago; 
        private String cCodRegContribuyente; 
        private int biIdRegObligacion; 
        private int iIdEjercicio; 
        private String cCodMaeEstaPago; 
        private String cCodMaeEstaCaja; 
        private String cCodMaeConcepto; 
        private String nvRegUnidad; 
        private String nvNumRecibo; 
        private double deTotalInsoluto; 
        private double deTotalReajuste; 
        private double deTotalInteres; 
        private double deTotalGasto; 
        private double dePagoInsoluto; 
        private double dePagoReajuste; 
        private double dePagoInteres; 
        private double dePagoGasto; 
        private double dePagoTotal; 
        private int iCantidad; 
        private double deValoUnitario; 
        private int iIdVencimiento; 
        private Date dtFechEmision; 
        private Date dtFechVencimiento; 
        private Date dtFechRecibo; 
        private String nvObservacion; 
        private int iIdRegUsuaRegistra; 
        private Date dtFechRegistra; 
        private int iCantidadModifica; 
        private boolean bEstado; 
        public int getBiIdRegDetaPago (){
        return biIdRegDetaPago ;
        }
        public void setBiIdRegDetaPago (int biIdRegDetaPago){
        this.biIdRegDetaPago=biIdRegDetaPago ;
         }
        public int getBiIdRegPago (){
        return biIdRegPago ;
        }
        public void setBiIdRegPago (int biIdRegPago){
        this.biIdRegPago=biIdRegPago ;
         }
        public String getCCodRegContribuyente (){
        return cCodRegContribuyente ;
        }
        public void setCCodRegContribuyente (String cCodRegContribuyente){
        this.cCodRegContribuyente=cCodRegContribuyente ;
         }
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
        public String getCCodMaeConcepto (){
        return cCodMaeConcepto ;
        }
        public void setCCodMaeConcepto (String cCodMaeConcepto){
        this.cCodMaeConcepto=cCodMaeConcepto ;
         }
        public String getNvRegUnidad (){
        return nvRegUnidad ;
        }
        public void setNvRegUnidad (String nvRegUnidad){
        this.nvRegUnidad=nvRegUnidad ;
         }
        public String getNvNumRecibo (){
        return nvNumRecibo ;
        }
        public void setNvNumRecibo (String nvNumRecibo){
        this.nvNumRecibo=nvNumRecibo ;
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
        public double getDePagoTotal (){
        return dePagoTotal ;
        }
        public void setDePagoTotal (double dePagoTotal){
        this.dePagoTotal=dePagoTotal ;
         }
        public int getICantidad (){
        return iCantidad ;
        }
        public void setICantidad (int iCantidad){
        this.iCantidad=iCantidad ;
         }
        public double getDeValoUnitario (){
        return deValoUnitario ;
        }
        public void setDeValoUnitario (double deValoUnitario){
        this.deValoUnitario=deValoUnitario ;
         }
        public int getIIdVencimiento (){
        return iIdVencimiento ;
        }
        public void setIIdVencimiento (int iIdVencimiento){
        this.iIdVencimiento=iIdVencimiento ;
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
        public Date getDtFechRecibo (){
        return dtFechRecibo ;
        }
        public void setDtFechRecibo (Date dtFechRecibo){
        this.dtFechRecibo=dtFechRecibo ;
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
