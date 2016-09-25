/**
 * *****************************************************************************
 * Descripcion : Clase que contiene los atributos de regubicpredio Creado por :
 * APP Fecha de Creacion : 22/05/2015 12:05:51 * ****************************************************************************
 */
package pe.sigmas.entity;

import java.sql.Date;

import java.sql.Time;

/**
 *
 * @author APP
 */
public class regubicpredioBean extends BaseBean {

    private int biIdRegUbicPredio;
    private int biIdRegPersona;
    private String cCodRegPredio;
    private String nvInterior;
    private String nvManzana;
    private String nvLote;
    private String nvSubLote;
    private String nvPiso;
    private String nvDepartamento;
    private String nvNumAnterior;
    private String nvDireCompleta;
    private String nvRefeUbicacion;
    private boolean bIndForaneo;
    private boolean bIndDomiFiscal;
    private int iEjerIniVigencia;
    private int iEjerFinVigencia;
    private boolean bIndVigencia;
    private boolean bIndConsentido;
    private String nvObservacion;
    private int iIdRegUsuaRegistra;
    private Date dtFechRegistra;
    private int iCantidadModifica;
    private String cCodRegContribuyente;
    private boolean bEstado;

    public int getBiIdRegUbicPredio() {
        return biIdRegUbicPredio;
    }

    public void setBiIdRegUbicPredio(int biIdRegUbicPredio) {
        this.biIdRegUbicPredio = biIdRegUbicPredio;
    }

    public int getBiIdRegPersona() {
        return biIdRegPersona;
    }

    public void setBiIdRegPersona(int biIdRegPersona) {
        this.biIdRegPersona = biIdRegPersona;
    }

    public String getCCodRegPredio() {
        return cCodRegPredio;
    }

    public void setCCodRegPredio(String cCodRegPredio) {
        this.cCodRegPredio = cCodRegPredio;
    }

    public String getNvInterior() {
        return nvInterior;
    }

    public void setNvInterior(String nvInterior) {
        this.nvInterior = nvInterior;
    }

    public String getNvManzana() {
        return nvManzana;
    }

    public void setNvManzana(String nvManzana) {
        this.nvManzana = nvManzana;
    }

    public String getNvLote() {
        return nvLote;
    }

    public void setNvLote(String nvLote) {
        this.nvLote = nvLote;
    }

    public String getNvSubLote() {
        return nvSubLote;
    }

    public void setNvSubLote(String nvSubLote) {
        this.nvSubLote = nvSubLote;
    }

    public String getNvPiso() {
        return nvPiso;
    }

    public void setNvPiso(String nvPiso) {
        this.nvPiso = nvPiso;
    }

    public String getNvDepartamento() {
        return nvDepartamento;
    }

    public void setNvDepartamento(String nvDepartamento) {
        this.nvDepartamento = nvDepartamento;
    }

    public String getNvNumAnterior() {
        return nvNumAnterior;
    }

    public void setNvNumAnterior(String nvNumAnterior) {
        this.nvNumAnterior = nvNumAnterior;
    }

    public String getNvDireCompleta() {
        return nvDireCompleta;
    }

    public void setNvDireCompleta(String nvDireCompleta) {
        this.nvDireCompleta = nvDireCompleta;
    }

    public String getNvRefeUbicacion() {
        return nvRefeUbicacion;
    }

    public void setNvRefeUbicacion(String nvRefeUbicacion) {
        this.nvRefeUbicacion = nvRefeUbicacion;
    }

    public boolean getBIndForaneo() {
        return bIndForaneo;
    }

    public void setBIndForaneo(boolean bIndForaneo) {
        this.bIndForaneo = bIndForaneo;
    }

    public boolean getBIndDomiFiscal() {
        return bIndDomiFiscal;
    }

    public void setBIndDomiFiscal(boolean bIndDomiFiscal) {
        this.bIndDomiFiscal = bIndDomiFiscal;
    }

    public int getIEjerIniVigencia() {
        return iEjerIniVigencia;
    }

    public void setIEjerIniVigencia(int iEjerIniVigencia) {
        this.iEjerIniVigencia = iEjerIniVigencia;
    }

    public int getIEjerFinVigencia() {
        return iEjerFinVigencia;
    }

    public void setIEjerFinVigencia(int iEjerFinVigencia) {
        this.iEjerFinVigencia = iEjerFinVigencia;
    }

    public boolean getBIndVigencia() {
        return bIndVigencia;
    }

    public void setBIndVigencia(boolean bIndVigencia) {
        this.bIndVigencia = bIndVigencia;
    }

    public boolean getBIndConsentido() {
        return bIndConsentido;
    }

    public void setBIndConsentido(boolean bIndConsentido) {
        this.bIndConsentido = bIndConsentido;
    }

    public String getNvObservacion() {
        return nvObservacion;
    }

    public void setNvObservacion(String nvObservacion) {
        this.nvObservacion = nvObservacion;
    }

    public int getIIdRegUsuaRegistra() {
        return iIdRegUsuaRegistra;
    }

    public void setIIdRegUsuaRegistra(int iIdRegUsuaRegistra) {
        this.iIdRegUsuaRegistra = iIdRegUsuaRegistra;
    }

    public Date getDtFechRegistra() {
        return dtFechRegistra;
    }

    public void setDtFechRegistra(Date dtFechRegistra) {
        this.dtFechRegistra = dtFechRegistra;
    }

    public int getICantidadModifica() {
        return iCantidadModifica;
    }

    public void setICantidadModifica(int iCantidadModifica) {
        this.iCantidadModifica = iCantidadModifica;
    }

    public String getCCodRegContribuyente() {
        return cCodRegContribuyente;
    }

    public void setCCodRegContribuyente(String cCodRegContribuyente) {
        this.cCodRegContribuyente = cCodRegContribuyente;
    }

    public boolean getBEstado() {
        return bEstado;
    }

    public void setBEstado(boolean bEstado) {
        this.bEstado = bEstado;
    }

    @Override
    public String toString() {
        return nvObservacion;
    }
}
