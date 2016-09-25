/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.sigmas.entity;
import java.sql.Date; 

import java.sql.Time; 
/**
 *
 * @author Core i7
 */
public class regCorteBean extends BaseBean
{
    
private int ccodregcontribuyente;
private double dmonto;
private String nvobservacion;
private String  dtfechInicio;
private String  dtfechafin;
private boolean bestado;

    /**
     * @return the ccodregcontribuyente
     */
    public int getCcodregcontribuyente() {
        return ccodregcontribuyente;
    }

    /**
     * @param ccodregcontribuyente the ccodregcontribuyente to set
     */
    public void setCcodregcontribuyente(int ccodregcontribuyente) {
        this.ccodregcontribuyente = ccodregcontribuyente;
    }

    /**
     * @return the dmonto
     */
    public double getDmonto() {
        return dmonto;
    }

    /**
     * @param dmonto the dmonto to set
     */
    public void setDmonto(double dmonto) {
        this.dmonto = dmonto;
    }

    /**
     * @return the nvobservacion
     */
    public String getNvobservacion() {
        return nvobservacion;
    }

    /**
     * @param nvobservacion the nvobservacion to set
     */
    public void setNvobservacion(String nvobservacion) {
        this.nvobservacion = nvobservacion;
    }


    public boolean isBestado() {
        return bestado;
    }

    /**
     * @param bestado the bestado to set
     */
    public void setBestado(boolean bestado) {
        this.bestado = bestado;
    }

    /**
     * @param dtfechInicio the dtfechInicio to set
     */
    public void setDtfechInicio(String dtfechInicio) {
        this.dtfechInicio = dtfechInicio;
    }

    /**
     * @param dtfechafin the dtfechafin to set
     */
    public void setDtfechafin(String dtfechafin) {
        this.dtfechafin = dtfechafin;
    }


}
