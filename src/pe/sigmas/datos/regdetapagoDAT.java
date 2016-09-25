/*******************************************************************************
 * Descripcion       : Clase que contiene los metodos transaccionales de acceso a datos de regdetapago
 * Creado por        : APP
 * Fecha de Creacion : 22/05/2015 12:08:40
** *****************************************************************************/

package pe.sigmas.datos;

import pe.sigmas.entity.regdetapagoBean;
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
    public class regdetapagoDAT
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
  * @fnIsregdetapagoBean, es un metodo que retorna si existe un regdetapagoBean metodo efectivo para validaciones
  * @param poregdetapagoBean, Objeto correspondiente a regdetapagoBean
  * @return Retorna true cuando existe un regdetapagoBean, false cuando no existe un regdetapagoBean
  * @throws Exception
  */
        public boolean fnIsregdetapagoBean (regdetapagoBean poregdetapagoBean) throws Exception 
        {
        regdetapagoBean oregdetapagoBean = null;
        Connection cn = null ;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regdetapago_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregdetapagoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregdetapagoBean.getBiIdRegDetaPago());
        cs.setInt(4, poregdetapagoBean.getBiIdRegPago());
        cs.setString(5, poregdetapagoBean.getCCodRegContribuyente());
        cs.setInt(6, poregdetapagoBean.getBiIdRegObligacion());
        cs.setInt(7, poregdetapagoBean.getIIdEjercicio());
        cs.setString(8, poregdetapagoBean.getCCodMaeEstaPago());
        cs.setString(9, poregdetapagoBean.getCCodMaeEstaCaja());
        cs.setString(10, poregdetapagoBean.getCCodMaeConcepto());
        cs.setString(11, poregdetapagoBean.getNvRegUnidad());
        cs.setString(12, poregdetapagoBean.getNvNumRecibo());
        cs.setDouble(13, poregdetapagoBean.getDeTotalInsoluto());
        cs.setDouble(14, poregdetapagoBean.getDeTotalReajuste());
        cs.setDouble(15, poregdetapagoBean.getDeTotalInteres());
        cs.setDouble(16, poregdetapagoBean.getDeTotalGasto());
        cs.setDouble(17, poregdetapagoBean.getDePagoInsoluto());
        cs.setDouble(18, poregdetapagoBean.getDePagoReajuste());
        cs.setDouble(19, poregdetapagoBean.getDePagoInteres());
        cs.setDouble(20, poregdetapagoBean.getDePagoGasto());
        cs.setDouble(21, poregdetapagoBean.getDePagoTotal());
        cs.setInt(22, poregdetapagoBean.getICantidad());
        cs.setDouble(23, poregdetapagoBean.getDeValoUnitario());
        cs.setInt(24, poregdetapagoBean.getIIdVencimiento());
        cs.setDate(25, poregdetapagoBean.getDtFechEmision());
        cs.setDate(26, poregdetapagoBean.getDtFechVencimiento());
        cs.setDate(27, poregdetapagoBean.getDtFechRecibo());
        cs.setString(28, poregdetapagoBean.getNvObservacion());
        cs.setInt(29, poregdetapagoBean.getIIdRegUsuaRegistra());
        cs.setDate(30, poregdetapagoBean.getDtFechRegistra());
        cs.setInt(31, poregdetapagoBean.getICantidadModifica());
        cs.setBoolean(32, poregdetapagoBean.getBEstado());
        rs = cs.executeQuery();
        while (rs.next()) {
        oregdetapagoBean = new regdetapagoBean();
        oregdetapagoBean.setBEstado(rs.getBoolean("biIdRegDetaPago"));
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
        return oregdetapagoBean!= null;
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
  * @fnGetListregdetapagoBean, es un metodo que retorna una lista de objetos de regdetapagoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregdetapagoBean, Objeto correspondiente a regdetapagoBean
  * @return Retorna una lista de objetos regdetapagoBean
  * @throws Exception
  */
  public List fnGetListregdetapagoBean(regdetapagoBean poregdetapagoBean) throws Exception {
  List list = new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regdetapago_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregdetapagoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregdetapagoBean.getBiIdRegDetaPago());
        cs.setInt(4, poregdetapagoBean.getBiIdRegPago());
        cs.setString(5, poregdetapagoBean.getCCodRegContribuyente());
        cs.setInt(6, poregdetapagoBean.getBiIdRegObligacion());
        cs.setInt(7, poregdetapagoBean.getIIdEjercicio());
        cs.setString(8, poregdetapagoBean.getCCodMaeEstaPago());
        cs.setString(9, poregdetapagoBean.getCCodMaeEstaCaja());
        cs.setString(10, poregdetapagoBean.getCCodMaeConcepto());
        cs.setString(11, poregdetapagoBean.getNvRegUnidad());
        cs.setString(12, poregdetapagoBean.getNvNumRecibo());
        cs.setDouble(13, poregdetapagoBean.getDeTotalInsoluto());
        cs.setDouble(14, poregdetapagoBean.getDeTotalReajuste());
        cs.setDouble(15, poregdetapagoBean.getDeTotalInteres());
        cs.setDouble(16, poregdetapagoBean.getDeTotalGasto());
        cs.setDouble(17, poregdetapagoBean.getDePagoInsoluto());
        cs.setDouble(18, poregdetapagoBean.getDePagoReajuste());
        cs.setDouble(19, poregdetapagoBean.getDePagoInteres());
        cs.setDouble(20, poregdetapagoBean.getDePagoGasto());
        cs.setDouble(21, poregdetapagoBean.getDePagoTotal());
        cs.setInt(22, poregdetapagoBean.getICantidad());
        cs.setDouble(23, poregdetapagoBean.getDeValoUnitario());
        cs.setInt(24, poregdetapagoBean.getIIdVencimiento());
        cs.setDate(25, poregdetapagoBean.getDtFechEmision());
        cs.setDate(26, poregdetapagoBean.getDtFechVencimiento());
        cs.setDate(27, poregdetapagoBean.getDtFechRecibo());
        cs.setString(28, poregdetapagoBean.getNvObservacion());
        cs.setInt(29, poregdetapagoBean.getIIdRegUsuaRegistra());
        cs.setDate(30, poregdetapagoBean.getDtFechRegistra());
        cs.setInt(31, poregdetapagoBean.getICantidadModifica());
        cs.setBoolean(32, poregdetapagoBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20), rs.getString(21), rs.getString(22), rs.getString(23), rs.getString(24), rs.getString(25), rs.getString(26), rs.getString(27), rs.getString(28), rs.getString(29), rs.getString(30)}; 
  //Object[] obj = {rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getDouble(11), rs.getDouble(12), rs.getDouble(13), rs.getDouble(14), rs.getDouble(15), rs.getDouble(16), rs.getDouble(17), rs.getDouble(18), rs.getDouble(19), rs.getInt(20), rs.getDouble(21), rs.getInt(22), rs.getDate(23), rs.getDate(24), rs.getDate(25), rs.getString(26), rs.getInt(27), rs.getDate(28), rs.getInt(29), rs.getBoolean(30)}; 
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
  * @fnGridregdetapagoBean, es un metodo que retorna una lista de objetos de regdetapagoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregdetapagoBean, Objeto correspondiente a regdetapagoBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridregdetapagoBean(regdetapagoBean poregdetapagoBean) throws Exception {
  List lista= new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regdetapago_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregdetapagoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregdetapagoBean.getBiIdRegDetaPago());
        cs.setInt(4, poregdetapagoBean.getBiIdRegPago());
        cs.setString(5, poregdetapagoBean.getCCodRegContribuyente());
        cs.setInt(6, poregdetapagoBean.getBiIdRegObligacion());
        cs.setInt(7, poregdetapagoBean.getIIdEjercicio());
        cs.setString(8, poregdetapagoBean.getCCodMaeEstaPago());
        cs.setString(9, poregdetapagoBean.getCCodMaeEstaCaja());
        cs.setString(10, poregdetapagoBean.getCCodMaeConcepto());
        cs.setString(11, poregdetapagoBean.getNvRegUnidad());
        cs.setString(12, poregdetapagoBean.getNvNumRecibo());
        cs.setDouble(13, poregdetapagoBean.getDeTotalInsoluto());
        cs.setDouble(14, poregdetapagoBean.getDeTotalReajuste());
        cs.setDouble(15, poregdetapagoBean.getDeTotalInteres());
        cs.setDouble(16, poregdetapagoBean.getDeTotalGasto());
        cs.setDouble(17, poregdetapagoBean.getDePagoInsoluto());
        cs.setDouble(18, poregdetapagoBean.getDePagoReajuste());
        cs.setDouble(19, poregdetapagoBean.getDePagoInteres());
        cs.setDouble(20, poregdetapagoBean.getDePagoGasto());
        cs.setDouble(21, poregdetapagoBean.getDePagoTotal());
        cs.setInt(22, poregdetapagoBean.getICantidad());
        cs.setDouble(23, poregdetapagoBean.getDeValoUnitario());
        cs.setInt(24, poregdetapagoBean.getIIdVencimiento());
        cs.setDate(25, poregdetapagoBean.getDtFechEmision());
        cs.setDate(26, poregdetapagoBean.getDtFechVencimiento());
        cs.setDate(27, poregdetapagoBean.getDtFechRecibo());
        cs.setString(28, poregdetapagoBean.getNvObservacion());
        cs.setInt(29, poregdetapagoBean.getIIdRegUsuaRegistra());
        cs.setDate(30, poregdetapagoBean.getDtFechRegistra());
        cs.setInt(31, poregdetapagoBean.getICantidadModifica());
        cs.setBoolean(32, poregdetapagoBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20), rs.getString(21), rs.getString(22), rs.getString(23), rs.getString(24), rs.getString(25), rs.getString(26), rs.getString(27), rs.getString(28), rs.getString(29), rs.getString(30)}; 
  //Object[] obj = {rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getDouble(11), rs.getDouble(12), rs.getDouble(13), rs.getDouble(14), rs.getDouble(15), rs.getDouble(16), rs.getDouble(17), rs.getDouble(18), rs.getDouble(19), rs.getInt(20), rs.getDouble(21), rs.getInt(22), rs.getDate(23), rs.getDate(24), rs.getDate(25), rs.getString(26), rs.getInt(27), rs.getDate(28), rs.getInt(29), rs.getBoolean(30)}; 
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
  * @fnAutocompleteregdetapagoBean, es un metodo que retorna una lista de objetos de regdetapagoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregdetapagoBean, Objeto correspondiente a regdetapagoBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<regdetapagoBean> fnAutocompleteregdetapagoBean(regdetapagoBean poregdetapagoBean) throws Exception {
  ArrayList<regdetapagoBean> listaregdetapagoBean = new ArrayList<>();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regdetapago_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregdetapagoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregdetapagoBean.getBiIdRegDetaPago());
        cs.setInt(4, poregdetapagoBean.getBiIdRegPago());
        cs.setString(5, poregdetapagoBean.getCCodRegContribuyente());
        cs.setInt(6, poregdetapagoBean.getBiIdRegObligacion());
        cs.setInt(7, poregdetapagoBean.getIIdEjercicio());
        cs.setString(8, poregdetapagoBean.getCCodMaeEstaPago());
        cs.setString(9, poregdetapagoBean.getCCodMaeEstaCaja());
        cs.setString(10, poregdetapagoBean.getCCodMaeConcepto());
        cs.setString(11, poregdetapagoBean.getNvRegUnidad());
        cs.setString(12, poregdetapagoBean.getNvNumRecibo());
        cs.setDouble(13, poregdetapagoBean.getDeTotalInsoluto());
        cs.setDouble(14, poregdetapagoBean.getDeTotalReajuste());
        cs.setDouble(15, poregdetapagoBean.getDeTotalInteres());
        cs.setDouble(16, poregdetapagoBean.getDeTotalGasto());
        cs.setDouble(17, poregdetapagoBean.getDePagoInsoluto());
        cs.setDouble(18, poregdetapagoBean.getDePagoReajuste());
        cs.setDouble(19, poregdetapagoBean.getDePagoInteres());
        cs.setDouble(20, poregdetapagoBean.getDePagoGasto());
        cs.setDouble(21, poregdetapagoBean.getDePagoTotal());
        cs.setInt(22, poregdetapagoBean.getICantidad());
        cs.setDouble(23, poregdetapagoBean.getDeValoUnitario());
        cs.setInt(24, poregdetapagoBean.getIIdVencimiento());
        cs.setDate(25, poregdetapagoBean.getDtFechEmision());
        cs.setDate(26, poregdetapagoBean.getDtFechVencimiento());
        cs.setDate(27, poregdetapagoBean.getDtFechRecibo());
        cs.setString(28, poregdetapagoBean.getNvObservacion());
        cs.setInt(29, poregdetapagoBean.getIIdRegUsuaRegistra());
        cs.setDate(30, poregdetapagoBean.getDtFechRegistra());
        cs.setInt(31, poregdetapagoBean.getICantidadModifica());
        cs.setBoolean(32, poregdetapagoBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  regdetapagoBean oregdetapagoBean = new regdetapagoBean();
  oregdetapagoBean.setBiIdRegDetaPago(rs.getInt("biIdRegDetaPago")); 
  oregdetapagoBean.setBiIdRegPago(rs.getInt("biIdRegPago")); 
  oregdetapagoBean.setCCodRegContribuyente(rs.getString("cCodRegContribuyente")); 
  oregdetapagoBean.setBiIdRegObligacion(rs.getInt("biIdRegObligacion")); 
  oregdetapagoBean.setIIdEjercicio(rs.getInt("iIdEjercicio")); 
  oregdetapagoBean.setCCodMaeEstaPago(rs.getString("cCodMaeEstaPago")); 
  oregdetapagoBean.setCCodMaeEstaCaja(rs.getString("cCodMaeEstaCaja")); 
  oregdetapagoBean.setCCodMaeConcepto(rs.getString("cCodMaeConcepto")); 
  oregdetapagoBean.setNvRegUnidad(rs.getString("nvRegUnidad")); 
  oregdetapagoBean.setNvNumRecibo(rs.getString("nvNumRecibo")); 
  oregdetapagoBean.setDeTotalInsoluto(rs.getDouble("deTotalInsoluto")); 
  oregdetapagoBean.setDeTotalReajuste(rs.getDouble("deTotalReajuste")); 
  oregdetapagoBean.setDeTotalInteres(rs.getDouble("deTotalInteres")); 
  oregdetapagoBean.setDeTotalGasto(rs.getDouble("deTotalGasto")); 
  oregdetapagoBean.setDePagoInsoluto(rs.getDouble("dePagoInsoluto")); 
  oregdetapagoBean.setDePagoReajuste(rs.getDouble("dePagoReajuste")); 
  oregdetapagoBean.setDePagoInteres(rs.getDouble("dePagoInteres")); 
  oregdetapagoBean.setDePagoGasto(rs.getDouble("dePagoGasto")); 
  oregdetapagoBean.setDePagoTotal(rs.getDouble("dePagoTotal")); 
  oregdetapagoBean.setICantidad(rs.getInt("iCantidad")); 
  oregdetapagoBean.setDeValoUnitario(rs.getDouble("deValoUnitario")); 
  oregdetapagoBean.setIIdVencimiento(rs.getInt("iIdVencimiento")); 
  oregdetapagoBean.setDtFechEmision(rs.getDate("dtFechEmision")); 
  oregdetapagoBean.setDtFechVencimiento(rs.getDate("dtFechVencimiento")); 
  oregdetapagoBean.setDtFechRecibo(rs.getDate("dtFechRecibo")); 
  oregdetapagoBean.setNvObservacion(rs.getString("nvObservacion")); 
  oregdetapagoBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  oregdetapagoBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  oregdetapagoBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  oregdetapagoBean.setBEstado(rs.getBoolean("bEstado")); 
  listaregdetapagoBean.add(oregdetapagoBean);
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
  return listaregdetapagoBean;
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
  * @fnGetregdetapagoBean, es un metodo que retorna un objeto especifico de regdetapagoBean
  * @param poregdetapagoBean, Objeto correspondiente a regdetapagoBean
  * @return Retorna el Objeto regdetapagoBean
  * @throws Exception
  */
  public regdetapagoBean fnGetregdetapagoBean(regdetapagoBean poregdetapagoBean) throws Exception {
  regdetapagoBean oregdetapagoBean = null;
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regdetapago_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregdetapagoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregdetapagoBean.getBiIdRegDetaPago());
        cs.setInt(4, poregdetapagoBean.getBiIdRegPago());
        cs.setString(5, poregdetapagoBean.getCCodRegContribuyente());
        cs.setInt(6, poregdetapagoBean.getBiIdRegObligacion());
        cs.setInt(7, poregdetapagoBean.getIIdEjercicio());
        cs.setString(8, poregdetapagoBean.getCCodMaeEstaPago());
        cs.setString(9, poregdetapagoBean.getCCodMaeEstaCaja());
        cs.setString(10, poregdetapagoBean.getCCodMaeConcepto());
        cs.setString(11, poregdetapagoBean.getNvRegUnidad());
        cs.setString(12, poregdetapagoBean.getNvNumRecibo());
        cs.setDouble(13, poregdetapagoBean.getDeTotalInsoluto());
        cs.setDouble(14, poregdetapagoBean.getDeTotalReajuste());
        cs.setDouble(15, poregdetapagoBean.getDeTotalInteres());
        cs.setDouble(16, poregdetapagoBean.getDeTotalGasto());
        cs.setDouble(17, poregdetapagoBean.getDePagoInsoluto());
        cs.setDouble(18, poregdetapagoBean.getDePagoReajuste());
        cs.setDouble(19, poregdetapagoBean.getDePagoInteres());
        cs.setDouble(20, poregdetapagoBean.getDePagoGasto());
        cs.setDouble(21, poregdetapagoBean.getDePagoTotal());
        cs.setInt(22, poregdetapagoBean.getICantidad());
        cs.setDouble(23, poregdetapagoBean.getDeValoUnitario());
        cs.setInt(24, poregdetapagoBean.getIIdVencimiento());
        cs.setDate(25, poregdetapagoBean.getDtFechEmision());
        cs.setDate(26, poregdetapagoBean.getDtFechVencimiento());
        cs.setDate(27, poregdetapagoBean.getDtFechRecibo());
        cs.setString(28, poregdetapagoBean.getNvObservacion());
        cs.setInt(29, poregdetapagoBean.getIIdRegUsuaRegistra());
        cs.setDate(30, poregdetapagoBean.getDtFechRegistra());
        cs.setInt(31, poregdetapagoBean.getICantidadModifica());
        cs.setBoolean(32, poregdetapagoBean.getBEstado());
        rs = cs.executeQuery();
   while (rs.next()) {
  oregdetapagoBean = new regdetapagoBean();
  oregdetapagoBean.setBiIdRegDetaPago(rs.getInt("biIdRegDetaPago")); 
  oregdetapagoBean.setBiIdRegPago(rs.getInt("biIdRegPago")); 
  oregdetapagoBean.setCCodRegContribuyente(rs.getString("cCodRegContribuyente")); 
  oregdetapagoBean.setBiIdRegObligacion(rs.getInt("biIdRegObligacion")); 
  oregdetapagoBean.setIIdEjercicio(rs.getInt("iIdEjercicio")); 
  oregdetapagoBean.setCCodMaeEstaPago(rs.getString("cCodMaeEstaPago")); 
  oregdetapagoBean.setCCodMaeEstaCaja(rs.getString("cCodMaeEstaCaja")); 
  oregdetapagoBean.setCCodMaeConcepto(rs.getString("cCodMaeConcepto")); 
  oregdetapagoBean.setNvRegUnidad(rs.getString("nvRegUnidad")); 
  oregdetapagoBean.setNvNumRecibo(rs.getString("nvNumRecibo")); 
  oregdetapagoBean.setDeTotalInsoluto(rs.getDouble("deTotalInsoluto")); 
  oregdetapagoBean.setDeTotalReajuste(rs.getDouble("deTotalReajuste")); 
  oregdetapagoBean.setDeTotalInteres(rs.getDouble("deTotalInteres")); 
  oregdetapagoBean.setDeTotalGasto(rs.getDouble("deTotalGasto")); 
  oregdetapagoBean.setDePagoInsoluto(rs.getDouble("dePagoInsoluto")); 
  oregdetapagoBean.setDePagoReajuste(rs.getDouble("dePagoReajuste")); 
  oregdetapagoBean.setDePagoInteres(rs.getDouble("dePagoInteres")); 
  oregdetapagoBean.setDePagoGasto(rs.getDouble("dePagoGasto")); 
  oregdetapagoBean.setDePagoTotal(rs.getDouble("dePagoTotal")); 
  oregdetapagoBean.setICantidad(rs.getInt("iCantidad")); 
  oregdetapagoBean.setDeValoUnitario(rs.getDouble("deValoUnitario")); 
  oregdetapagoBean.setIIdVencimiento(rs.getInt("iIdVencimiento")); 
  oregdetapagoBean.setDtFechEmision(rs.getDate("dtFechEmision")); 
  oregdetapagoBean.setDtFechVencimiento(rs.getDate("dtFechVencimiento")); 
  oregdetapagoBean.setDtFechRecibo(rs.getDate("dtFechRecibo")); 
  oregdetapagoBean.setNvObservacion(rs.getString("nvObservacion")); 
  oregdetapagoBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  oregdetapagoBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  oregdetapagoBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  oregdetapagoBean.setBEstado(rs.getBoolean("bEstado")); 
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
  return oregdetapagoBean;
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
  * @fnInsertarregdetapagoBean,  es un metodo que Inserta un  regdetapagoBean
  * @param poregdetapagoBean, Objeto correspondiente a regdetapagoBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarregdetapagoBean(regdetapagoBean poregdetapagoBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regdetapago_ins(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregdetapagoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregdetapagoBean.getBiIdRegDetaPago());
        cs.setInt(4, poregdetapagoBean.getBiIdRegPago());
        cs.setString(5, poregdetapagoBean.getCCodRegContribuyente());
        cs.setInt(6, poregdetapagoBean.getBiIdRegObligacion());
        cs.setInt(7, poregdetapagoBean.getIIdEjercicio());
        cs.setString(8, poregdetapagoBean.getCCodMaeEstaPago());
        cs.setString(9, poregdetapagoBean.getCCodMaeEstaCaja());
        cs.setString(10, poregdetapagoBean.getCCodMaeConcepto());
        cs.setString(11, poregdetapagoBean.getNvRegUnidad());
        cs.setString(12, poregdetapagoBean.getNvNumRecibo());
        cs.setDouble(13, poregdetapagoBean.getDeTotalInsoluto());
        cs.setDouble(14, poregdetapagoBean.getDeTotalReajuste());
        cs.setDouble(15, poregdetapagoBean.getDeTotalInteres());
        cs.setDouble(16, poregdetapagoBean.getDeTotalGasto());
        cs.setDouble(17, poregdetapagoBean.getDePagoInsoluto());
        cs.setDouble(18, poregdetapagoBean.getDePagoReajuste());
        cs.setDouble(19, poregdetapagoBean.getDePagoInteres());
        cs.setDouble(20, poregdetapagoBean.getDePagoGasto());
        cs.setDouble(21, poregdetapagoBean.getDePagoTotal());
        cs.setInt(22, poregdetapagoBean.getICantidad());
        cs.setDouble(23, poregdetapagoBean.getDeValoUnitario());
        cs.setInt(24, poregdetapagoBean.getIIdVencimiento());
        cs.setDate(25, poregdetapagoBean.getDtFechEmision());
        cs.setDate(26, poregdetapagoBean.getDtFechVencimiento());
        cs.setDate(27, poregdetapagoBean.getDtFechRecibo());
        cs.setString(28, poregdetapagoBean.getNvObservacion());
        cs.setInt(29, poregdetapagoBean.getIIdRegUsuaRegistra());
        cs.setDate(30, poregdetapagoBean.getDtFechRegistra());
        cs.setInt(31, poregdetapagoBean.getICantidadModifica());
        cs.setBoolean(32, true);
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
  * @fnEliminarregdetapagoBean,  es un metodo que Elimina un  regdetapagoBean
  * @param poregdetapagoBean, Objeto correspondiente a regdetapagoBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarregdetapagoBean(regdetapagoBean poregdetapagoBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regdetapago_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregdetapagoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregdetapagoBean.getBiIdRegDetaPago());
        cs.setInt(4, poregdetapagoBean.getBiIdRegPago());
        cs.setString(5, poregdetapagoBean.getCCodRegContribuyente());
        cs.setInt(6, poregdetapagoBean.getBiIdRegObligacion());
        cs.setInt(7, poregdetapagoBean.getIIdEjercicio());
        cs.setString(8, poregdetapagoBean.getCCodMaeEstaPago());
        cs.setString(9, poregdetapagoBean.getCCodMaeEstaCaja());
        cs.setString(10, poregdetapagoBean.getCCodMaeConcepto());
        cs.setString(11, poregdetapagoBean.getNvRegUnidad());
        cs.setString(12, poregdetapagoBean.getNvNumRecibo());
        cs.setDouble(13, poregdetapagoBean.getDeTotalInsoluto());
        cs.setDouble(14, poregdetapagoBean.getDeTotalReajuste());
        cs.setDouble(15, poregdetapagoBean.getDeTotalInteres());
        cs.setDouble(16, poregdetapagoBean.getDeTotalGasto());
        cs.setDouble(17, poregdetapagoBean.getDePagoInsoluto());
        cs.setDouble(18, poregdetapagoBean.getDePagoReajuste());
        cs.setDouble(19, poregdetapagoBean.getDePagoInteres());
        cs.setDouble(20, poregdetapagoBean.getDePagoGasto());
        cs.setDouble(21, poregdetapagoBean.getDePagoTotal());
        cs.setInt(22, poregdetapagoBean.getICantidad());
        cs.setDouble(23, poregdetapagoBean.getDeValoUnitario());
        cs.setInt(24, poregdetapagoBean.getIIdVencimiento());
        cs.setDate(25, poregdetapagoBean.getDtFechEmision());
        cs.setDate(26, poregdetapagoBean.getDtFechVencimiento());
        cs.setDate(27, poregdetapagoBean.getDtFechRecibo());
        cs.setString(28, poregdetapagoBean.getNvObservacion());
        cs.setInt(29, poregdetapagoBean.getIIdRegUsuaRegistra());
        cs.setDate(30, poregdetapagoBean.getDtFechRegistra());
        cs.setInt(31, poregdetapagoBean.getICantidadModifica());
        cs.setBoolean(32, false);
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
  * @fnActualizarregdetapagoBean,  es un metodo que Actualiza un  regdetapagoBean
  * @param poregdetapagoBean, Objeto correspondiente a regdetapagoBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarregdetapagoBean(regdetapagoBean poregdetapagoBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regdetapago_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregdetapagoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregdetapagoBean.getBiIdRegDetaPago());
        cs.setInt(4, poregdetapagoBean.getBiIdRegPago());
        cs.setString(5, poregdetapagoBean.getCCodRegContribuyente());
        cs.setInt(6, poregdetapagoBean.getBiIdRegObligacion());
        cs.setInt(7, poregdetapagoBean.getIIdEjercicio());
        cs.setString(8, poregdetapagoBean.getCCodMaeEstaPago());
        cs.setString(9, poregdetapagoBean.getCCodMaeEstaCaja());
        cs.setString(10, poregdetapagoBean.getCCodMaeConcepto());
        cs.setString(11, poregdetapagoBean.getNvRegUnidad());
        cs.setString(12, poregdetapagoBean.getNvNumRecibo());
        cs.setDouble(13, poregdetapagoBean.getDeTotalInsoluto());
        cs.setDouble(14, poregdetapagoBean.getDeTotalReajuste());
        cs.setDouble(15, poregdetapagoBean.getDeTotalInteres());
        cs.setDouble(16, poregdetapagoBean.getDeTotalGasto());
        cs.setDouble(17, poregdetapagoBean.getDePagoInsoluto());
        cs.setDouble(18, poregdetapagoBean.getDePagoReajuste());
        cs.setDouble(19, poregdetapagoBean.getDePagoInteres());
        cs.setDouble(20, poregdetapagoBean.getDePagoGasto());
        cs.setDouble(21, poregdetapagoBean.getDePagoTotal());
        cs.setInt(22, poregdetapagoBean.getICantidad());
        cs.setDouble(23, poregdetapagoBean.getDeValoUnitario());
        cs.setInt(24, poregdetapagoBean.getIIdVencimiento());
        cs.setDate(25, poregdetapagoBean.getDtFechEmision());
        cs.setDate(26, poregdetapagoBean.getDtFechVencimiento());
        cs.setDate(27, poregdetapagoBean.getDtFechRecibo());
        cs.setString(28, poregdetapagoBean.getNvObservacion());
        cs.setInt(29, poregdetapagoBean.getIIdRegUsuaRegistra());
        cs.setDate(30, poregdetapagoBean.getDtFechRegistra());
        cs.setInt(31, poregdetapagoBean.getICantidadModifica());
        cs.setBoolean(32, true);
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
