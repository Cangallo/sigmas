/**
 * *****************************************************************************
 * Descripcion : Clase que contiene los metodos transaccionales de acceso a
 * datos de regobligacion Creado por : APP Fecha de Creacion : 22/05/2015
 * 12:08:40 * ****************************************************************************
 */
package pe.sigmas.datos;

import pe.sigmas.entity.regobligacionBean;
import pe.sigmas.conexion.DBConnection;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author APP
 */
public class regobligacionDAT {
    /* ***************************************************************************************************
     * --
     * -- Creado por              : APP
     * -- Fecha creacion          : 22/05/2015 12:08:40
     * -- ¿Esta siendo Utilizado? : NO
     * -- Modificado por          : <Analista Programador>
     * -- Fecha Actualizacion     : <Fecha de Actualizacion>
     * --
     * **************************************************************************************************/

    /**
     * @fnIsregobligacionBean, es un metodo que retorna si existe un
     * regobligacionBean metodo efectivo para validaciones
     * @param poregobligacionBean, Objeto correspondiente a regobligacionBean
     * @return Retorna true cuando existe un regobligacionBean, false cuando no
     * existe un regobligacionBean
     * @throws Exception
     */
    public boolean fnIsregobligacionBean(regobligacionBean poregobligacionBean) throws Exception {
        regobligacionBean oregobligacionBean = null;
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regobligacion_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, poregobligacionBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, poregobligacionBean.getBiIdRegObligacion());
            cs.setInt(4, poregobligacionBean.getIIdEjercicio());
            cs.setInt(5, poregobligacionBean.getIIdValConcepto());
            cs.setInt(6, poregobligacionBean.getBiIdRegRecibo());
            cs.setString(7, poregobligacionBean.getCCodMaeEstaObligacion());
            cs.setString(8, poregobligacionBean.getCCodRegContribuyente());
            cs.setInt(9, poregobligacionBean.getIIdVencimiento());
            cs.setDouble(10, poregobligacionBean.getDeTotaInsoluto());
            cs.setDouble(11, poregobligacionBean.getDeTotaReajuste());
            cs.setDouble(12, poregobligacionBean.getDeTotaInteres());
            cs.setDouble(13, poregobligacionBean.getDeTotaGasto());
            cs.setDouble(14, poregobligacionBean.getDePagoInsoluto());
            cs.setDouble(15, poregobligacionBean.getDePagoReajuste());
            cs.setDouble(16, poregobligacionBean.getDePagoInteres());
            cs.setDouble(17, poregobligacionBean.getDePagoGasto());
            cs.setDouble(18, poregobligacionBean.getDeModiInsoluto());
            cs.setDouble(19, poregobligacionBean.getDeModiReajuste());
            cs.setDouble(20, poregobligacionBean.getDeModiInteres());
            cs.setDouble(21, poregobligacionBean.getDeModiGasto());
            cs.setDate(22, poregobligacionBean.getDtFechEmision());
            cs.setDate(23, poregobligacionBean.getDtFechVencimiento());
            cs.setDate(24, poregobligacionBean.getDtFechPago());
            cs.setString(25, poregobligacionBean.getNvObservacion());
            cs.setInt(26, poregobligacionBean.getIIdRegUsuaRegistra());
            cs.setDate(27, poregobligacionBean.getDtFechRegistra());
            cs.setInt(28, poregobligacionBean.getICantidadModifica());
            cs.setBoolean(29, poregobligacionBean.getBEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                oregobligacionBean = new regobligacionBean();
                oregobligacionBean.setBEstado(rs.getBoolean("biIdRegObligacion"));
            }
            cn.commit();
            cn.setAutoCommit(true);
        } catch (SQLException ex) {
            cn.rollback();
            ex.printStackTrace();
        } finally {
            rs.close();
            rs = null;
            cn.close();
            cn = null;
        }
        return oregobligacionBean != null;
    }
    /* ***************************************************************************************************
     * --
     * -- Creado por              : APP
     * -- Fecha creacion          : 22/05/2015 12:08:40
     * -- ¿Esta siendo Utilizado? : NO
     * -- Modificado por          : <Analista Programador>
     * -- Fecha Actualizacion     : <Fecha de Actualizacion>
     * --
     * **************************************************************************************************/

    /**
     * @fnGetListregobligacionBean, es un metodo que retorna una lista de
     * objetos de regobligacionBean metodo efectivo para cargar controles de
     * seleccion y/o controles de aucompletado
     * @param poregobligacionBean, Objeto correspondiente a regobligacionBean
     * @return Retorna una lista de objetos regobligacionBean
     * @throws Exception
     */
    public List fnGetListregobligacionBean(regobligacionBean poregobligacionBean) throws Exception {
        List list = new LinkedList();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regobligacion_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, poregobligacionBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, poregobligacionBean.getBiIdRegObligacion());
            cs.setInt(4, poregobligacionBean.getIIdEjercicio());
            cs.setInt(5, poregobligacionBean.getIIdValConcepto());
            cs.setInt(6, poregobligacionBean.getBiIdRegRecibo());
            cs.setString(7, poregobligacionBean.getCCodMaeEstaObligacion());
            cs.setString(8, poregobligacionBean.getCCodRegContribuyente());
            cs.setInt(9, poregobligacionBean.getIIdVencimiento());
            cs.setDouble(10, poregobligacionBean.getDeTotaInsoluto());
            cs.setDouble(11, poregobligacionBean.getDeTotaReajuste());
            cs.setDouble(12, poregobligacionBean.getDeTotaInteres());
            cs.setDouble(13, poregobligacionBean.getDeTotaGasto());
            cs.setDouble(14, poregobligacionBean.getDePagoInsoluto());
            cs.setDouble(15, poregobligacionBean.getDePagoReajuste());
            cs.setDouble(16, poregobligacionBean.getDePagoInteres());
            cs.setDouble(17, poregobligacionBean.getDePagoGasto());
            cs.setDouble(18, poregobligacionBean.getDeModiInsoluto());
            cs.setDouble(19, poregobligacionBean.getDeModiReajuste());
            cs.setDouble(20, poregobligacionBean.getDeModiInteres());
            cs.setDouble(21, poregobligacionBean.getDeModiGasto());
            cs.setDate(22, poregobligacionBean.getDtFechEmision());
            cs.setDate(23, poregobligacionBean.getDtFechVencimiento());
            cs.setDate(24, poregobligacionBean.getDtFechPago());
            cs.setString(25, poregobligacionBean.getNvObservacion());
            cs.setInt(26, poregobligacionBean.getIIdRegUsuaRegistra());
            cs.setDate(27, poregobligacionBean.getDtFechRegistra());
            cs.setInt(28, poregobligacionBean.getICantidadModifica());
            cs.setBoolean(29, poregobligacionBean.getBEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20), rs.getString(21), rs.getString(22), rs.getString(23), rs.getString(24), rs.getString(25), rs.getString(26), rs.getString(27)};
                //Object[] obj = {rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getDouble(8), rs.getDouble(9), rs.getDouble(10), rs.getDouble(11), rs.getDouble(12), rs.getDouble(13), rs.getDouble(14), rs.getDouble(15), rs.getDouble(16), rs.getDouble(17), rs.getDouble(18), rs.getDouble(19), rs.getDate(20), rs.getDate(21), rs.getDate(22), rs.getString(23), rs.getInt(24), rs.getDate(25), rs.getInt(26), rs.getBoolean(27)}; 
                list.add(obj);
            }
            cn.commit();
            cn.setAutoCommit(true);
        } catch (SQLException ex) {
            cn.rollback();
            ex.printStackTrace();
        } finally {
            rs.close();
            rs = null;
            cn.close();
            cn = null;
        }
        return list;
    }
    /* ***************************************************************************************************
     * --
     * -- Creado por              : APP
     * -- Fecha creacion          : 22/05/2015 12:08:40
     * -- ¿Esta siendo Utilizado? : NO
     * -- Modificado por          : <Analista Programador>
     * -- Fecha Actualizacion     : <Fecha de Actualizacion>
     * --
     * **************************************************************************************************/

    /**
     * @fnGridregobligacionBean, es un metodo que retorna una lista de objetos
     * de regobligacionBean metodo efectivo para cargar controles de seleccion
     * y/o controles de aucompletado
     * @param poregobligacionBean, Objeto correspondiente a regobligacionBean
     * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una
     * grilla
     * @throws Exception
     */
    public List fnGridregobligacionBean(regobligacionBean poregobligacionBean) throws Exception {
        List lista = new LinkedList();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regobligacion_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, poregobligacionBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, poregobligacionBean.getBiIdRegObligacion());
            cs.setInt(4, poregobligacionBean.getIIdEjercicio());
            cs.setInt(5, poregobligacionBean.getIIdValConcepto());
            cs.setInt(6, poregobligacionBean.getBiIdRegRecibo());
            cs.setString(7, poregobligacionBean.getCCodMaeEstaObligacion());
            cs.setString(8, poregobligacionBean.getCCodRegContribuyente());
            cs.setInt(9, poregobligacionBean.getIIdVencimiento());
            cs.setDouble(10, poregobligacionBean.getDeTotaInsoluto());
            cs.setDouble(11, poregobligacionBean.getDeTotaReajuste());
            cs.setDouble(12, poregobligacionBean.getDeTotaInteres());
            cs.setDouble(13, poregobligacionBean.getDeTotaGasto());
            cs.setDouble(14, poregobligacionBean.getDePagoInsoluto());
            cs.setDouble(15, poregobligacionBean.getDePagoReajuste());
            cs.setDouble(16, poregobligacionBean.getDePagoInteres());
            cs.setDouble(17, poregobligacionBean.getDePagoGasto());
            cs.setDouble(18, poregobligacionBean.getDeModiInsoluto());
            cs.setDouble(19, poregobligacionBean.getDeModiReajuste());
            cs.setDouble(20, poregobligacionBean.getDeModiInteres());
            cs.setDouble(21, poregobligacionBean.getDeModiGasto());
            cs.setDate(22, poregobligacionBean.getDtFechEmision());
            cs.setDate(23, poregobligacionBean.getDtFechVencimiento());
            cs.setDate(24, poregobligacionBean.getDtFechPago());
            cs.setString(25, poregobligacionBean.getNvObservacion());
            cs.setInt(26, poregobligacionBean.getIIdRegUsuaRegistra());
            cs.setDate(27, poregobligacionBean.getDtFechRegistra());
            cs.setInt(28, poregobligacionBean.getICantidadModifica());
            cs.setBoolean(29, poregobligacionBean.getBEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                Object[] obj = {rs.getString(1), /*rs.getString(2), rs.getString(3), rs.getString(4), */ rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)/*, rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20), rs.getString(21), rs.getString(22), rs.getString(23), rs.getString(24), rs.getString(25), rs.getString(26), rs.getString(27)*/};
                //Object[] obj = {rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getDouble(8), rs.getDouble(9), rs.getDouble(10), rs.getDouble(11), rs.getDouble(12), rs.getDouble(13), rs.getDouble(14), rs.getDouble(15), rs.getDouble(16), rs.getDouble(17), rs.getDouble(18), rs.getDouble(19), rs.getDate(20), rs.getDate(21), rs.getDate(22), rs.getString(23), rs.getInt(24), rs.getDate(25), rs.getInt(26), rs.getBoolean(27)}; 
                lista.add(obj);
            }
            cn.commit();
            cn.setAutoCommit(true);
        } catch (SQLException ex) {
            cn.rollback();
            ex.printStackTrace();
        } finally {
            rs.close();
            rs = null;
            cn.close();
            cn = null;
        }
        return lista;
    }
    /* ***************************************************************************************************
     * --
     * -- Creado por              : APP
     * -- Fecha creacion          : 22/05/2015 12:08:40
     * -- ¿Esta siendo Utilizado? : NO
     * -- Modificado por          : <Analista Programador>
     * -- Fecha Actualizacion     : <Fecha de Actualizacion>
     * --
     * **************************************************************************************************/

    /**
     * @fnAutocompleteregobligacionBean, es un metodo que retorna una lista de
     * objetos de regobligacionBean metodo efectivo para cargar controles de
     * seleccion y/o controles de aucompletado
     * @param poregobligacionBean, Objeto correspondiente a regobligacionBean
     * @return Retorna una lista efectivo para cargar y mostrar registros en un
     * autocomplete
     * @throws Exception
     */
    public ArrayList<regobligacionBean> fnAutocompleteregobligacionBean(regobligacionBean poregobligacionBean) throws Exception {
        ArrayList<regobligacionBean> listaregobligacionBean = new ArrayList<>();
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regobligacion_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, poregobligacionBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, poregobligacionBean.getBiIdRegObligacion());
            cs.setInt(4, poregobligacionBean.getIIdEjercicio());
            cs.setInt(5, poregobligacionBean.getIIdValConcepto());
            cs.setInt(6, poregobligacionBean.getBiIdRegRecibo());
            cs.setString(7, poregobligacionBean.getCCodMaeEstaObligacion());
            cs.setString(8, poregobligacionBean.getCCodRegContribuyente());
            cs.setInt(9, poregobligacionBean.getIIdVencimiento());
            cs.setDouble(10, poregobligacionBean.getDeTotaInsoluto());
            cs.setDouble(11, poregobligacionBean.getDeTotaReajuste());
            cs.setDouble(12, poregobligacionBean.getDeTotaInteres());
            cs.setDouble(13, poregobligacionBean.getDeTotaGasto());
            cs.setDouble(14, poregobligacionBean.getDePagoInsoluto());
            cs.setDouble(15, poregobligacionBean.getDePagoReajuste());
            cs.setDouble(16, poregobligacionBean.getDePagoInteres());
            cs.setDouble(17, poregobligacionBean.getDePagoGasto());
            cs.setDouble(18, poregobligacionBean.getDeModiInsoluto());
            cs.setDouble(19, poregobligacionBean.getDeModiReajuste());
            cs.setDouble(20, poregobligacionBean.getDeModiInteres());
            cs.setDouble(21, poregobligacionBean.getDeModiGasto());
            cs.setDate(22, poregobligacionBean.getDtFechEmision());
            cs.setDate(23, poregobligacionBean.getDtFechVencimiento());
            cs.setDate(24, poregobligacionBean.getDtFechPago());
            cs.setString(25, poregobligacionBean.getNvObservacion());
            cs.setInt(26, poregobligacionBean.getIIdRegUsuaRegistra());
            cs.setDate(27, poregobligacionBean.getDtFechRegistra());
            cs.setInt(28, poregobligacionBean.getICantidadModifica());
            cs.setBoolean(29, poregobligacionBean.getBEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                regobligacionBean oregobligacionBean = new regobligacionBean();
                oregobligacionBean.setBiIdRegObligacion(rs.getInt("biIdRegObligacion"));
                oregobligacionBean.setIIdEjercicio(rs.getInt("iIdEjercicio"));
                oregobligacionBean.setIIdValConcepto(rs.getInt("iIdValConcepto"));
                oregobligacionBean.setBiIdRegRecibo(rs.getInt("biIdRegRecibo"));
                oregobligacionBean.setCCodMaeEstaObligacion(rs.getString("cCodMaeEstaObligacion"));
                oregobligacionBean.setCCodRegContribuyente(rs.getString("cCodRegContribuyente"));
                oregobligacionBean.setIIdVencimiento(rs.getInt("iIdVencimiento"));
                oregobligacionBean.setDeTotaInsoluto(rs.getDouble("deTotaInsoluto"));
                oregobligacionBean.setDeTotaReajuste(rs.getDouble("deTotaReajuste"));
                oregobligacionBean.setDeTotaInteres(rs.getDouble("deTotaInteres"));
                oregobligacionBean.setDeTotaGasto(rs.getDouble("deTotaGasto"));
                oregobligacionBean.setDePagoInsoluto(rs.getDouble("dePagoInsoluto"));
                oregobligacionBean.setDePagoReajuste(rs.getDouble("dePagoReajuste"));
                oregobligacionBean.setDePagoInteres(rs.getDouble("dePagoInteres"));
                oregobligacionBean.setDePagoGasto(rs.getDouble("dePagoGasto"));
                oregobligacionBean.setDeModiInsoluto(rs.getDouble("deModiInsoluto"));
                oregobligacionBean.setDeModiReajuste(rs.getDouble("deModiReajuste"));
                oregobligacionBean.setDeModiInteres(rs.getDouble("deModiInteres"));
                oregobligacionBean.setDeModiGasto(rs.getDouble("deModiGasto"));
                oregobligacionBean.setDtFechEmision(rs.getDate("dtFechEmision"));
                oregobligacionBean.setDtFechVencimiento(rs.getDate("dtFechVencimiento"));
                oregobligacionBean.setDtFechPago(rs.getDate("dtFechPago"));
                oregobligacionBean.setNvObservacion(rs.getString("nvObservacion"));
                oregobligacionBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra"));
                oregobligacionBean.setDtFechRegistra(rs.getDate("dtFechRegistra"));
                oregobligacionBean.setICantidadModifica(rs.getInt("iCantidadModifica"));
                oregobligacionBean.setBEstado(rs.getBoolean("bEstado"));
                listaregobligacionBean.add(oregobligacionBean);
            }
            cn.commit();
            cn.setAutoCommit(true);
        } catch (SQLException ex) {
            cn.rollback();
            ex.printStackTrace();
        } finally {
            rs.close();
            rs = null;
            cn.close();
            cn = null;
        }
        return listaregobligacionBean;
    }
    /* ***************************************************************************************************
     * --
     * -- Creado por              : APP
     * -- Fecha creacion          : 22/05/2015 12:08:40
     * -- ¿Esta siendo Utilizado? : NO
     * -- Modificado por          : <Analista Programador>
     * -- Fecha Actualizacion     : <Fecha de Actualizacion>
     * --
     * **************************************************************************************************/

    /**
     * @fnGetregobligacionBean, es un metodo que retorna un objeto especifico de
     * regobligacionBean
     * @param poregobligacionBean, Objeto correspondiente a regobligacionBean
     * @return Retorna el Objeto regobligacionBean
     * @throws Exception
     */
    public regobligacionBean fnGetregobligacionBean(regobligacionBean poregobligacionBean) throws Exception {
        regobligacionBean oregobligacionBean = null;
        Connection cn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regobligacion_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, poregobligacionBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, poregobligacionBean.getBiIdRegObligacion());
            cs.setInt(4, poregobligacionBean.getIIdEjercicio());
            cs.setInt(5, poregobligacionBean.getIIdValConcepto());
            cs.setInt(6, poregobligacionBean.getBiIdRegRecibo());
            cs.setString(7, poregobligacionBean.getCCodMaeEstaObligacion());
            cs.setString(8, poregobligacionBean.getCCodRegContribuyente());
            cs.setInt(9, poregobligacionBean.getIIdVencimiento());
            cs.setDouble(10, poregobligacionBean.getDeTotaInsoluto());
            cs.setDouble(11, poregobligacionBean.getDeTotaReajuste());
            cs.setDouble(12, poregobligacionBean.getDeTotaInteres());
            cs.setDouble(13, poregobligacionBean.getDeTotaGasto());
            cs.setDouble(14, poregobligacionBean.getDePagoInsoluto());
            cs.setDouble(15, poregobligacionBean.getDePagoReajuste());
            cs.setDouble(16, poregobligacionBean.getDePagoInteres());
            cs.setDouble(17, poregobligacionBean.getDePagoGasto());
            cs.setDouble(18, poregobligacionBean.getDeModiInsoluto());
            cs.setDouble(19, poregobligacionBean.getDeModiReajuste());
            cs.setDouble(20, poregobligacionBean.getDeModiInteres());
            cs.setDouble(21, poregobligacionBean.getDeModiGasto());
            cs.setDate(22, poregobligacionBean.getDtFechEmision());
            cs.setDate(23, poregobligacionBean.getDtFechVencimiento());
            cs.setDate(24, poregobligacionBean.getDtFechPago());
            cs.setString(25, poregobligacionBean.getNvObservacion());
            cs.setInt(26, poregobligacionBean.getIIdRegUsuaRegistra());
            cs.setDate(27, poregobligacionBean.getDtFechRegistra());
            cs.setInt(28, poregobligacionBean.getICantidadModifica());
            cs.setBoolean(29, poregobligacionBean.getBEstado());
            rs = cs.executeQuery();
            while (rs.next()) {
                oregobligacionBean = new regobligacionBean();
                oregobligacionBean.setBiIdRegObligacion(rs.getInt("biIdRegObligacion"));
                oregobligacionBean.setIIdEjercicio(rs.getInt("iIdEjercicio"));
                oregobligacionBean.setIIdValConcepto(rs.getInt("iIdValConcepto"));
                oregobligacionBean.setBiIdRegRecibo(rs.getInt("biIdRegRecibo"));
                oregobligacionBean.setCCodMaeEstaObligacion(rs.getString("cCodMaeEstaObligacion"));
                oregobligacionBean.setCCodRegContribuyente(rs.getString("cCodRegContribuyente"));
                oregobligacionBean.setIIdVencimiento(rs.getInt("iIdVencimiento"));
                oregobligacionBean.setDeTotaInsoluto(rs.getDouble("deTotaInsoluto"));
                oregobligacionBean.setDeTotaReajuste(rs.getDouble("deTotaReajuste"));
                oregobligacionBean.setDeTotaInteres(rs.getDouble("deTotaInteres"));
                oregobligacionBean.setDeTotaGasto(rs.getDouble("deTotaGasto"));
                oregobligacionBean.setDePagoInsoluto(rs.getDouble("dePagoInsoluto"));
                oregobligacionBean.setDePagoReajuste(rs.getDouble("dePagoReajuste"));
                oregobligacionBean.setDePagoInteres(rs.getDouble("dePagoInteres"));
                oregobligacionBean.setDePagoGasto(rs.getDouble("dePagoGasto"));
                oregobligacionBean.setDeModiInsoluto(rs.getDouble("deModiInsoluto"));
                oregobligacionBean.setDeModiReajuste(rs.getDouble("deModiReajuste"));
                oregobligacionBean.setDeModiInteres(rs.getDouble("deModiInteres"));
                oregobligacionBean.setDeModiGasto(rs.getDouble("deModiGasto"));
                oregobligacionBean.setDtFechEmision(rs.getDate("dtFechEmision"));
                oregobligacionBean.setDtFechVencimiento(rs.getDate("dtFechVencimiento"));
                oregobligacionBean.setDtFechPago(rs.getDate("dtFechPago"));
                oregobligacionBean.setNvObservacion(rs.getString("nvObservacion"));
                oregobligacionBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra"));
                oregobligacionBean.setDtFechRegistra(rs.getDate("dtFechRegistra"));
                oregobligacionBean.setICantidadModifica(rs.getInt("iCantidadModifica"));
                oregobligacionBean.setBEstado(rs.getBoolean("bEstado"));
            }
            cn.commit();
            cn.setAutoCommit(true);
        } catch (SQLException ex) {
            cn.rollback();
            ex.printStackTrace();
        } finally {
            rs.close();
            rs = null;
            cn.close();
            cn = null;
        }
        return oregobligacionBean;
    }
    /* ***************************************************************************************************
     * --
     * -- Creado por              : APP
     * -- Fecha creacion          : 22/05/2015 12:08:40
     * -- ¿Esta siendo Utilizado? : NO
     * -- Modificado por          : <Analista Programador>
     * -- Fecha Actualizacion     : <Fecha de Actualizacion>
     * --
     * **************************************************************************************************/

    /**
     * @fnInsertarregobligacionBean, es un metodo que Inserta un
     * regobligacionBean
     * @param poregobligacionBean, Objeto correspondiente a regobligacionBean
     * @return Retorna true cuando es exito, false cuando no hubo insercion
     * alguna
     * @throws Exception
     */
    public boolean fnInsertarregobligacionBean(regobligacionBean poregobligacionBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regobligacion_ins(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, poregobligacionBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, poregobligacionBean.getBiIdRegObligacion());
            cs.setInt(4, poregobligacionBean.getIIdEjercicio());
            cs.setInt(5, poregobligacionBean.getIIdValConcepto());
            cs.setInt(6, poregobligacionBean.getBiIdRegRecibo());
            cs.setString(7, poregobligacionBean.getCCodMaeEstaObligacion());
            cs.setString(8, poregobligacionBean.getCCodRegContribuyente());
            cs.setInt(9, poregobligacionBean.getIIdVencimiento());
            cs.setDouble(10, poregobligacionBean.getDeTotaInsoluto());
            cs.setDouble(11, poregobligacionBean.getDeTotaReajuste());
            cs.setDouble(12, poregobligacionBean.getDeTotaInteres());
            cs.setDouble(13, poregobligacionBean.getDeTotaGasto());
            cs.setDouble(14, poregobligacionBean.getDePagoInsoluto());
            cs.setDouble(15, poregobligacionBean.getDePagoReajuste());
            cs.setDouble(16, poregobligacionBean.getDePagoInteres());
            cs.setDouble(17, poregobligacionBean.getDePagoGasto());
            cs.setDouble(18, poregobligacionBean.getDeModiInsoluto());
            cs.setDouble(19, poregobligacionBean.getDeModiReajuste());
            cs.setDouble(20, poregobligacionBean.getDeModiInteres());
            cs.setDouble(21, poregobligacionBean.getDeModiGasto());
            cs.setDate(22, poregobligacionBean.getDtFechEmision());
            cs.setDate(23, poregobligacionBean.getDtFechVencimiento());
            cs.setDate(24, poregobligacionBean.getDtFechPago());
            cs.setString(25, poregobligacionBean.getNvObservacion());
            cs.setInt(26, poregobligacionBean.getIIdRegUsuaRegistra());
            cs.setDate(27, poregobligacionBean.getDtFechRegistra());
            cs.setInt(28, poregobligacionBean.getICantidadModifica());
            cs.setBoolean(29, true);
            cs.execute();
            resultado = cs.getBoolean(2);
            cs.close();
            cs = null;
            cn.commit();
            cn.setAutoCommit(true);
        } catch (SQLException ex) {
            cn.rollback();
            ex.printStackTrace();
            resultado = false;
        } finally {
            cn.close();
            cn = null;
        }
        return resultado;
    }
    /* ***************************************************************************************************
     * --
     * -- Creado por              : APP
     * -- Fecha creacion          : 22/05/2015 12:08:40
     * -- ¿Esta siendo Utilizado? : NO
     * -- Modificado por          : <Analista Programador>
     * -- Fecha Actualizacion     : <Fecha de Actualizacion>
     * --
     * **************************************************************************************************/

    /**
     * @fnEliminarregobligacionBean, es un metodo que Elimina un
     * regobligacionBean
     * @param poregobligacionBean, Objeto correspondiente a regobligacionBean
     * @return Retorna true cuando es exito, false cuando no hubo eliminacion
     * alguna
     * @throws Exception
     */
    public boolean fnEliminarregobligacionBean(regobligacionBean poregobligacionBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regobligacion_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, poregobligacionBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, poregobligacionBean.getBiIdRegObligacion());
            cs.setInt(4, poregobligacionBean.getIIdEjercicio());
            cs.setInt(5, poregobligacionBean.getIIdValConcepto());
            cs.setInt(6, poregobligacionBean.getBiIdRegRecibo());
            cs.setString(7, poregobligacionBean.getCCodMaeEstaObligacion());
            cs.setString(8, poregobligacionBean.getCCodRegContribuyente());
            cs.setInt(9, poregobligacionBean.getIIdVencimiento());
            cs.setDouble(10, poregobligacionBean.getDeTotaInsoluto());
            cs.setDouble(11, poregobligacionBean.getDeTotaReajuste());
            cs.setDouble(12, poregobligacionBean.getDeTotaInteres());
            cs.setDouble(13, poregobligacionBean.getDeTotaGasto());
            cs.setDouble(14, poregobligacionBean.getDePagoInsoluto());
            cs.setDouble(15, poregobligacionBean.getDePagoReajuste());
            cs.setDouble(16, poregobligacionBean.getDePagoInteres());
            cs.setDouble(17, poregobligacionBean.getDePagoGasto());
            cs.setDouble(18, poregobligacionBean.getDeModiInsoluto());
            cs.setDouble(19, poregobligacionBean.getDeModiReajuste());
            cs.setDouble(20, poregobligacionBean.getDeModiInteres());
            cs.setDouble(21, poregobligacionBean.getDeModiGasto());
            cs.setDate(22, poregobligacionBean.getDtFechEmision());
            cs.setDate(23, poregobligacionBean.getDtFechVencimiento());
            cs.setDate(24, poregobligacionBean.getDtFechPago());
            cs.setString(25, poregobligacionBean.getNvObservacion());
            cs.setInt(26, poregobligacionBean.getIIdRegUsuaRegistra());
            cs.setDate(27, poregobligacionBean.getDtFechRegistra());
            cs.setInt(28, poregobligacionBean.getICantidadModifica());
            cs.setBoolean(29, false);
            cs.execute();
            resultado = cs.getBoolean(2);
            cs.close();
            cs = null;
            cn.commit();
            cn.setAutoCommit(true);
        } catch (SQLException ex) {
            cn.rollback();
            ex.printStackTrace();
            resultado = false;
        } finally {
            cn.close();
            cn = null;
        }
        return resultado;
    }
    /* ***************************************************************************************************
     * --
     * -- Creado por              : APP
     * -- Fecha creacion          : 22/05/2015 12:08:40
     * -- ¿Esta siendo Utilizado? : NO
     * -- Modificado por          : <Analista Programador>
     * -- Fecha Actualizacion     : <Fecha de Actualizacion>
     * --
     * **************************************************************************************************/

    /**
     * @fnActualizarregobligacionBean, es un metodo que Actualiza un
     * regobligacionBean
     * @param poregobligacionBean, Objeto correspondiente a regobligacionBean
     * @return Retorna true cuando es exito, false cuando no hubo actualizacion
     * alguna
     * @throws Exception
     */
    public boolean fnActualizarregobligacionBean(regobligacionBean poregobligacionBean) throws Exception {
        boolean resultado = false;
        Connection cn = null;
        CallableStatement cs = null;
        try {
            cn = DBConnection.getInstance().openConnection();
            cn.setAutoCommit(false);
            cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regobligacion_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
            cs.setInt(1, poregobligacionBean.getIOps());
            cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
            cs.setInt(3, poregobligacionBean.getBiIdRegObligacion());
            cs.setInt(4, poregobligacionBean.getIIdEjercicio());
            cs.setInt(5, poregobligacionBean.getIIdValConcepto());
            cs.setInt(6, poregobligacionBean.getBiIdRegRecibo());
            cs.setString(7, poregobligacionBean.getCCodMaeEstaObligacion());
            cs.setString(8, poregobligacionBean.getCCodRegContribuyente());
            cs.setInt(9, poregobligacionBean.getIIdVencimiento());
            cs.setDouble(10, poregobligacionBean.getDeTotaInsoluto());
            cs.setDouble(11, poregobligacionBean.getDeTotaReajuste());
            cs.setDouble(12, poregobligacionBean.getDeTotaInteres());
            cs.setDouble(13, poregobligacionBean.getDeTotaGasto());
            cs.setDouble(14, poregobligacionBean.getDePagoInsoluto());
            cs.setDouble(15, poregobligacionBean.getDePagoReajuste());
            cs.setDouble(16, poregobligacionBean.getDePagoInteres());
            cs.setDouble(17, poregobligacionBean.getDePagoGasto());
            cs.setDouble(18, poregobligacionBean.getDeModiInsoluto());
            cs.setDouble(19, poregobligacionBean.getDeModiReajuste());
            cs.setDouble(20, poregobligacionBean.getDeModiInteres());
            cs.setDouble(21, poregobligacionBean.getDeModiGasto());
            cs.setDate(22, poregobligacionBean.getDtFechEmision());
            cs.setDate(23, poregobligacionBean.getDtFechVencimiento());
            cs.setDate(24, poregobligacionBean.getDtFechPago());
            cs.setString(25, poregobligacionBean.getNvObservacion());
            cs.setInt(26, poregobligacionBean.getIIdRegUsuaRegistra());
            cs.setDate(27, poregobligacionBean.getDtFechRegistra());
            cs.setInt(28, poregobligacionBean.getICantidadModifica());
            cs.setBoolean(29, true);
            cs.execute();
            resultado = cs.getBoolean(2);
            cs.close();
            cs = null;
            cn.commit();
            cn.setAutoCommit(true);
            resultado = true;
        } catch (SQLException ex) {
            cn.rollback();
            ex.printStackTrace();
            resultado = false;
        } finally {
            cn.close();
            cn = null;
        }
        return resultado;
    }
}
