/*******************************************************************************
 * Descripcion       : Clase que contiene los metodos transaccionales de acceso a datos de regpago
 * Creado por        : APP
 * Fecha de Creacion : 22/05/2015 12:08:40
** *****************************************************************************/

package pe.sigmas.datos;

import pe.sigmas.entity.regpagoBean;
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
    public class regpagoDAT
    {
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
  * @fnIsregpagoBean, es un metodo que retorna si existe un regpagoBean metodo efectivo para validaciones
  * @param poregpagoBean, Objeto correspondiente a regpagoBean
  * @return Retorna true cuando existe un regpagoBean, false cuando no existe un regpagoBean
  * @throws Exception
  */
        public boolean fnIsregpagoBean (regpagoBean poregpagoBean) throws Exception 
        {
        regpagoBean oregpagoBean = null;
        Connection cn = null ;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regpago_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregpagoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregpagoBean.getBiIdRegPago());
        cs.setString(4, poregpagoBean.getCCodMaeEstaPago());
        cs.setString(5, poregpagoBean.getCCodMaeEstaCaja());
        cs.setString(6, poregpagoBean.getCCodRegContribuyente());
        cs.setInt(7, poregpagoBean.getBiIdRegRecibo());
        cs.setString(8, poregpagoBean.getNvNumRecibo());
        cs.setDouble(9, poregpagoBean.getDeMontRecibido());
        cs.setDouble(10, poregpagoBean.getDeMontVuelto());
        cs.setDouble(11, poregpagoBean.getDeMontCancRedondeado());
        cs.setDouble(12, poregpagoBean.getDeMontCancelado());
        cs.setDouble(13, poregpagoBean.getDeMontResiRedondeo());
        cs.setDouble(14, poregpagoBean.getDeTotalInsoluto());
        cs.setDouble(15, poregpagoBean.getDeTotalReajuste());
        cs.setDouble(16, poregpagoBean.getDeTotalInteres());
        cs.setDouble(17, poregpagoBean.getDeTotalGasto());
        cs.setDate(18, poregpagoBean.getDtFechRecibo());
        cs.setString(19, poregpagoBean.getNvIp());
        cs.setString(20, poregpagoBean.getNvNombPc());
        cs.setString(21, poregpagoBean.getNvObservacion());
        cs.setInt(22, poregpagoBean.getIIdRegUsuaRegistra());
        cs.setDate(23, poregpagoBean.getDtFechRegistra());
        cs.setInt(24, poregpagoBean.getICantidadModifica());
        cs.setBoolean(25, poregpagoBean.getBEstado());
        rs = cs.executeQuery();
        while (rs.next()) {
        oregpagoBean = new regpagoBean();
        oregpagoBean.setBEstado(rs.getBoolean("biIdRegPago"));
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
        return oregpagoBean!= null;
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
  * @fnGetListregpagoBean, es un metodo que retorna una lista de objetos de regpagoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregpagoBean, Objeto correspondiente a regpagoBean
  * @return Retorna una lista de objetos regpagoBean
  * @throws Exception
  */
  public List fnGetListregpagoBean(regpagoBean poregpagoBean) throws Exception {
  List list = new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regpago_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregpagoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregpagoBean.getBiIdRegPago());
        cs.setString(4, poregpagoBean.getCCodMaeEstaPago());
        cs.setString(5, poregpagoBean.getCCodMaeEstaCaja());
        cs.setString(6, poregpagoBean.getCCodRegContribuyente());
        cs.setInt(7, poregpagoBean.getBiIdRegRecibo());
        cs.setString(8, poregpagoBean.getNvNumRecibo());
        cs.setDouble(9, poregpagoBean.getDeMontRecibido());
        cs.setDouble(10, poregpagoBean.getDeMontVuelto());
        cs.setDouble(11, poregpagoBean.getDeMontCancRedondeado());
        cs.setDouble(12, poregpagoBean.getDeMontCancelado());
        cs.setDouble(13, poregpagoBean.getDeMontResiRedondeo());
        cs.setDouble(14, poregpagoBean.getDeTotalInsoluto());
        cs.setDouble(15, poregpagoBean.getDeTotalReajuste());
        cs.setDouble(16, poregpagoBean.getDeTotalInteres());
        cs.setDouble(17, poregpagoBean.getDeTotalGasto());
        cs.setDate(18, poregpagoBean.getDtFechRecibo());
        cs.setString(19, poregpagoBean.getNvIp());
        cs.setString(20, poregpagoBean.getNvNombPc());
        cs.setString(21, poregpagoBean.getNvObservacion());
        cs.setInt(22, poregpagoBean.getIIdRegUsuaRegistra());
        cs.setDate(23, poregpagoBean.getDtFechRegistra());
        cs.setInt(24, poregpagoBean.getICantidadModifica());
        cs.setBoolean(25, poregpagoBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20), rs.getString(21), rs.getString(22), rs.getString(23)}; 
  //Object[] obj = {rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getDouble(7), rs.getDouble(8), rs.getDouble(9), rs.getDouble(10), rs.getDouble(11), rs.getDouble(12), rs.getDouble(13), rs.getDouble(14), rs.getDouble(15), rs.getDate(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getInt(20), rs.getDate(21), rs.getInt(22), rs.getBoolean(23)}; 
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
  * @fnGridregpagoBean, es un metodo que retorna una lista de objetos de regpagoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregpagoBean, Objeto correspondiente a regpagoBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridregpagoBean(regpagoBean poregpagoBean) throws Exception {
  List lista= new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regpago_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregpagoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregpagoBean.getBiIdRegPago());
        cs.setString(4, poregpagoBean.getCCodMaeEstaPago());
        cs.setString(5, poregpagoBean.getCCodMaeEstaCaja());
        cs.setString(6, poregpagoBean.getCCodRegContribuyente());
        cs.setInt(7, poregpagoBean.getBiIdRegRecibo());
        cs.setString(8, poregpagoBean.getNvNumRecibo());
        cs.setDouble(9, poregpagoBean.getDeMontRecibido());
        cs.setDouble(10, poregpagoBean.getDeMontVuelto());
        cs.setDouble(11, poregpagoBean.getDeMontCancRedondeado());
        cs.setDouble(12, poregpagoBean.getDeMontCancelado());
        cs.setDouble(13, poregpagoBean.getDeMontResiRedondeo());
        cs.setDouble(14, poregpagoBean.getDeTotalInsoluto());
        cs.setDouble(15, poregpagoBean.getDeTotalReajuste());
        cs.setDouble(16, poregpagoBean.getDeTotalInteres());
        cs.setDouble(17, poregpagoBean.getDeTotalGasto());
        cs.setDate(18, poregpagoBean.getDtFechRecibo());
        cs.setString(19, poregpagoBean.getNvIp());
        cs.setString(20, poregpagoBean.getNvNombPc());
        cs.setString(21, poregpagoBean.getNvObservacion());
        cs.setInt(22, poregpagoBean.getIIdRegUsuaRegistra());
        cs.setDate(23, poregpagoBean.getDtFechRegistra());
        cs.setInt(24, poregpagoBean.getICantidadModifica());
        cs.setBoolean(25, poregpagoBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20), rs.getString(21), rs.getString(22), rs.getString(23)}; 
  //Object[] obj = {rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getDouble(7), rs.getDouble(8), rs.getDouble(9), rs.getDouble(10), rs.getDouble(11), rs.getDouble(12), rs.getDouble(13), rs.getDouble(14), rs.getDouble(15), rs.getDate(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getInt(20), rs.getDate(21), rs.getInt(22), rs.getBoolean(23)}; 
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
  * @fnAutocompleteregpagoBean, es un metodo que retorna una lista de objetos de regpagoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregpagoBean, Objeto correspondiente a regpagoBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<regpagoBean> fnAutocompleteregpagoBean(regpagoBean poregpagoBean) throws Exception {
  ArrayList<regpagoBean> listaregpagoBean = new ArrayList<>();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regpago_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregpagoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregpagoBean.getBiIdRegPago());
        cs.setString(4, poregpagoBean.getCCodMaeEstaPago());
        cs.setString(5, poregpagoBean.getCCodMaeEstaCaja());
        cs.setString(6, poregpagoBean.getCCodRegContribuyente());
        cs.setInt(7, poregpagoBean.getBiIdRegRecibo());
        cs.setString(8, poregpagoBean.getNvNumRecibo());
        cs.setDouble(9, poregpagoBean.getDeMontRecibido());
        cs.setDouble(10, poregpagoBean.getDeMontVuelto());
        cs.setDouble(11, poregpagoBean.getDeMontCancRedondeado());
        cs.setDouble(12, poregpagoBean.getDeMontCancelado());
        cs.setDouble(13, poregpagoBean.getDeMontResiRedondeo());
        cs.setDouble(14, poregpagoBean.getDeTotalInsoluto());
        cs.setDouble(15, poregpagoBean.getDeTotalReajuste());
        cs.setDouble(16, poregpagoBean.getDeTotalInteres());
        cs.setDouble(17, poregpagoBean.getDeTotalGasto());
        cs.setDate(18, poregpagoBean.getDtFechRecibo());
        cs.setString(19, poregpagoBean.getNvIp());
        cs.setString(20, poregpagoBean.getNvNombPc());
        cs.setString(21, poregpagoBean.getNvObservacion());
        cs.setInt(22, poregpagoBean.getIIdRegUsuaRegistra());
        cs.setDate(23, poregpagoBean.getDtFechRegistra());
        cs.setInt(24, poregpagoBean.getICantidadModifica());
        cs.setBoolean(25, poregpagoBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  regpagoBean oregpagoBean = new regpagoBean();
  oregpagoBean.setBiIdRegPago(rs.getInt("biIdRegPago")); 
  oregpagoBean.setCCodMaeEstaPago(rs.getString("cCodMaeEstaPago")); 
  oregpagoBean.setCCodMaeEstaCaja(rs.getString("cCodMaeEstaCaja")); 
  oregpagoBean.setCCodRegContribuyente(rs.getString("cCodRegContribuyente")); 
  oregpagoBean.setBiIdRegRecibo(rs.getInt("biIdRegRecibo")); 
  oregpagoBean.setNvNumRecibo(rs.getString("nvNumRecibo")); 
  oregpagoBean.setDeMontRecibido(rs.getDouble("deMontRecibido")); 
  oregpagoBean.setDeMontVuelto(rs.getDouble("deMontVuelto")); 
  oregpagoBean.setDeMontCancRedondeado(rs.getDouble("deMontCancRedondeado")); 
  oregpagoBean.setDeMontCancelado(rs.getDouble("deMontCancelado")); 
  oregpagoBean.setDeMontResiRedondeo(rs.getDouble("deMontResiRedondeo")); 
  oregpagoBean.setDeTotalInsoluto(rs.getDouble("deTotalInsoluto")); 
  oregpagoBean.setDeTotalReajuste(rs.getDouble("deTotalReajuste")); 
  oregpagoBean.setDeTotalInteres(rs.getDouble("deTotalInteres")); 
  oregpagoBean.setDeTotalGasto(rs.getDouble("deTotalGasto")); 
  oregpagoBean.setDtFechRecibo(rs.getDate("dtFechRecibo")); 
  oregpagoBean.setNvIp(rs.getString("nvIp")); 
  oregpagoBean.setNvNombPc(rs.getString("nvNombPc")); 
  oregpagoBean.setNvObservacion(rs.getString("nvObservacion")); 
  oregpagoBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  oregpagoBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  oregpagoBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  oregpagoBean.setBEstado(rs.getBoolean("bEstado")); 
  listaregpagoBean.add(oregpagoBean);
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
  return listaregpagoBean;
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
  * @fnGetregpagoBean, es un metodo que retorna un objeto especifico de regpagoBean
  * @param poregpagoBean, Objeto correspondiente a regpagoBean
  * @return Retorna el Objeto regpagoBean
  * @throws Exception
  */
  public regpagoBean fnGetregpagoBean(regpagoBean poregpagoBean) throws Exception {
  regpagoBean oregpagoBean = null;
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regpago_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregpagoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregpagoBean.getBiIdRegPago());
        cs.setString(4, poregpagoBean.getCCodMaeEstaPago());
        cs.setString(5, poregpagoBean.getCCodMaeEstaCaja());
        cs.setString(6, poregpagoBean.getCCodRegContribuyente());
        cs.setInt(7, poregpagoBean.getBiIdRegRecibo());
        cs.setString(8, poregpagoBean.getNvNumRecibo());
        cs.setDouble(9, poregpagoBean.getDeMontRecibido());
        cs.setDouble(10, poregpagoBean.getDeMontVuelto());
        cs.setDouble(11, poregpagoBean.getDeMontCancRedondeado());
        cs.setDouble(12, poregpagoBean.getDeMontCancelado());
        cs.setDouble(13, poregpagoBean.getDeMontResiRedondeo());
        cs.setDouble(14, poregpagoBean.getDeTotalInsoluto());
        cs.setDouble(15, poregpagoBean.getDeTotalReajuste());
        cs.setDouble(16, poregpagoBean.getDeTotalInteres());
        cs.setDouble(17, poregpagoBean.getDeTotalGasto());
        cs.setDate(18, poregpagoBean.getDtFechRecibo());
        cs.setString(19, poregpagoBean.getNvIp());
        cs.setString(20, poregpagoBean.getNvNombPc());
        cs.setString(21, poregpagoBean.getNvObservacion());
        cs.setInt(22, poregpagoBean.getIIdRegUsuaRegistra());
        cs.setDate(23, poregpagoBean.getDtFechRegistra());
        cs.setInt(24, poregpagoBean.getICantidadModifica());
        cs.setBoolean(25, poregpagoBean.getBEstado());
        rs = cs.executeQuery();
   while (rs.next()) {
  oregpagoBean = new regpagoBean();
  oregpagoBean.setBiIdRegPago(rs.getInt("biIdRegPago")); 
  oregpagoBean.setCCodMaeEstaPago(rs.getString("cCodMaeEstaPago")); 
  oregpagoBean.setCCodMaeEstaCaja(rs.getString("cCodMaeEstaCaja")); 
  oregpagoBean.setCCodRegContribuyente(rs.getString("cCodRegContribuyente")); 
  oregpagoBean.setBiIdRegRecibo(rs.getInt("biIdRegRecibo")); 
  oregpagoBean.setNvNumRecibo(rs.getString("nvNumRecibo")); 
  oregpagoBean.setDeMontRecibido(rs.getDouble("deMontRecibido")); 
  oregpagoBean.setDeMontVuelto(rs.getDouble("deMontVuelto")); 
  oregpagoBean.setDeMontCancRedondeado(rs.getDouble("deMontCancRedondeado")); 
  oregpagoBean.setDeMontCancelado(rs.getDouble("deMontCancelado")); 
  oregpagoBean.setDeMontResiRedondeo(rs.getDouble("deMontResiRedondeo")); 
  oregpagoBean.setDeTotalInsoluto(rs.getDouble("deTotalInsoluto")); 
  oregpagoBean.setDeTotalReajuste(rs.getDouble("deTotalReajuste")); 
  oregpagoBean.setDeTotalInteres(rs.getDouble("deTotalInteres")); 
  oregpagoBean.setDeTotalGasto(rs.getDouble("deTotalGasto")); 
  oregpagoBean.setDtFechRecibo(rs.getDate("dtFechRecibo")); 
  oregpagoBean.setNvIp(rs.getString("nvIp")); 
  oregpagoBean.setNvNombPc(rs.getString("nvNombPc")); 
  oregpagoBean.setNvObservacion(rs.getString("nvObservacion")); 
  oregpagoBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  oregpagoBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  oregpagoBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  oregpagoBean.setBEstado(rs.getBoolean("bEstado")); 
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
  return oregpagoBean;
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
  * @fnInsertarregpagoBean,  es un metodo que Inserta un  regpagoBean
  * @param poregpagoBean, Objeto correspondiente a regpagoBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarregpagoBean(regpagoBean poregpagoBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regpago_ins(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregpagoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregpagoBean.getBiIdRegPago());
        cs.setString(4, poregpagoBean.getCCodMaeEstaPago());
        cs.setString(5, poregpagoBean.getCCodMaeEstaCaja());
        cs.setString(6, poregpagoBean.getCCodRegContribuyente());
        cs.setInt(7, poregpagoBean.getBiIdRegRecibo());
        cs.setString(8, poregpagoBean.getNvNumRecibo());
        cs.setDouble(9, poregpagoBean.getDeMontRecibido());
        cs.setDouble(10, poregpagoBean.getDeMontVuelto());
        cs.setDouble(11, poregpagoBean.getDeMontCancRedondeado());
        cs.setDouble(12, poregpagoBean.getDeMontCancelado());
        cs.setDouble(13, poregpagoBean.getDeMontResiRedondeo());
        cs.setDouble(14, poregpagoBean.getDeTotalInsoluto());
        cs.setDouble(15, poregpagoBean.getDeTotalReajuste());
        cs.setDouble(16, poregpagoBean.getDeTotalInteres());
        cs.setDouble(17, poregpagoBean.getDeTotalGasto());
        cs.setDate(18, poregpagoBean.getDtFechRecibo());
        cs.setString(19, poregpagoBean.getNvIp());
        cs.setString(20, poregpagoBean.getNvNombPc());
        cs.setString(21, poregpagoBean.getNvObservacion());
        cs.setInt(22, poregpagoBean.getIIdRegUsuaRegistra());
        cs.setDate(23, poregpagoBean.getDtFechRegistra());
        cs.setInt(24, poregpagoBean.getICantidadModifica());
        cs.setBoolean(25, true);
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
  * @fnEliminarregpagoBean,  es un metodo que Elimina un  regpagoBean
  * @param poregpagoBean, Objeto correspondiente a regpagoBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarregpagoBean(regpagoBean poregpagoBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regpago_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregpagoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregpagoBean.getBiIdRegPago());
        cs.setString(4, poregpagoBean.getCCodMaeEstaPago());
        cs.setString(5, poregpagoBean.getCCodMaeEstaCaja());
        cs.setString(6, poregpagoBean.getCCodRegContribuyente());
        cs.setInt(7, poregpagoBean.getBiIdRegRecibo());
        cs.setString(8, poregpagoBean.getNvNumRecibo());
        cs.setDouble(9, poregpagoBean.getDeMontRecibido());
        cs.setDouble(10, poregpagoBean.getDeMontVuelto());
        cs.setDouble(11, poregpagoBean.getDeMontCancRedondeado());
        cs.setDouble(12, poregpagoBean.getDeMontCancelado());
        cs.setDouble(13, poregpagoBean.getDeMontResiRedondeo());
        cs.setDouble(14, poregpagoBean.getDeTotalInsoluto());
        cs.setDouble(15, poregpagoBean.getDeTotalReajuste());
        cs.setDouble(16, poregpagoBean.getDeTotalInteres());
        cs.setDouble(17, poregpagoBean.getDeTotalGasto());
        cs.setDate(18, poregpagoBean.getDtFechRecibo());
        cs.setString(19, poregpagoBean.getNvIp());
        cs.setString(20, poregpagoBean.getNvNombPc());
        cs.setString(21, poregpagoBean.getNvObservacion());
        cs.setInt(22, poregpagoBean.getIIdRegUsuaRegistra());
        cs.setDate(23, poregpagoBean.getDtFechRegistra());
        cs.setInt(24, poregpagoBean.getICantidadModifica());
        cs.setBoolean(25, false);
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
  * @fnActualizarregpagoBean,  es un metodo que Actualiza un  regpagoBean
  * @param poregpagoBean, Objeto correspondiente a regpagoBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarregpagoBean(regpagoBean poregpagoBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regpago_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregpagoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregpagoBean.getBiIdRegPago());
        cs.setString(4, poregpagoBean.getCCodMaeEstaPago());
        cs.setString(5, poregpagoBean.getCCodMaeEstaCaja());
        cs.setString(6, poregpagoBean.getCCodRegContribuyente());
        cs.setInt(7, poregpagoBean.getBiIdRegRecibo());
        cs.setString(8, poregpagoBean.getNvNumRecibo());
        cs.setDouble(9, poregpagoBean.getDeMontRecibido());
        cs.setDouble(10, poregpagoBean.getDeMontVuelto());
        cs.setDouble(11, poregpagoBean.getDeMontCancRedondeado());
        cs.setDouble(12, poregpagoBean.getDeMontCancelado());
        cs.setDouble(13, poregpagoBean.getDeMontResiRedondeo());
        cs.setDouble(14, poregpagoBean.getDeTotalInsoluto());
        cs.setDouble(15, poregpagoBean.getDeTotalReajuste());
        cs.setDouble(16, poregpagoBean.getDeTotalInteres());
        cs.setDouble(17, poregpagoBean.getDeTotalGasto());
        cs.setDate(18, poregpagoBean.getDtFechRecibo());
        cs.setString(19, poregpagoBean.getNvIp());
        cs.setString(20, poregpagoBean.getNvNombPc());
        cs.setString(21, poregpagoBean.getNvObservacion());
        cs.setInt(22, poregpagoBean.getIIdRegUsuaRegistra());
        cs.setDate(23, poregpagoBean.getDtFechRegistra());
        cs.setInt(24, poregpagoBean.getICantidadModifica());
        cs.setBoolean(25, true);
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
