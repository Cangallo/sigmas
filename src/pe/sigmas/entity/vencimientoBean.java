/**
 * *****************************************************************************
 * Descripcion : Clase que contiene los atributos de vencimiento Creado por :
 * APP Fecha de Creacion : 22/05/2015 12:05:51 * ****************************************************************************
 */
package pe.sigmas.entity;

import java.sql.Date;

import java.sql.Time;

/**
 *
 * @author APP
 */
public class vencimientoBean extends BaseBean {

    private int iIdVencimiento;
    private String nvDenominacion;
    private String nvObservacion;
    private int iIdRegUsuaRegistra;
    private Date dtFechRegistra;
    private int iCantidadModifica;
    private boolean bEstado;

    public int getIIdVencimiento() {
        return iIdVencimiento;
    }

    public void setIIdVencimiento(int iIdVencimiento) {
        this.iIdVencimiento = iIdVencimiento;
    }

    public String getNvDenominacion() {
        return nvDenominacion;
    }

    public void setNvDenominacion(String nvDenominacion) {
        this.nvDenominacion = nvDenominacion;
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

    public boolean getBEstado() {
        return bEstado;
    }

    public void setBEstado(boolean bEstado) {
        this.bEstado = bEstado;
    }

    @Override
    public String toString() {
        return nvDenominacion;
    }
}
