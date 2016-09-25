/*******************************************************************************
 * Descripcion       : Clase que contiene los metodos transaccionales de acceso a datos de valconcepto
 * Creado por        : APP
 * Fecha de Creacion : 22/05/2015 12:08:41
** *****************************************************************************/

package pe.sigmas.datos;

import pe.sigmas.entity.valconceptoBean;
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
    public class valconceptoDAT
    {
/* ***************************************************************************************************
 * --
 * -- Creado por              : APP
 * -- Fecha creacion          : 22/05/2015 12:08:41
 * -- ¿Esta siendo Utilizado? : NO
 * -- Modificado por          : <Analista Programador>
 * -- Fecha Actualizacion     : <Fecha de Actualizacion>
 * --
 * **************************************************************************************************/
  /**
  * @fnIsvalconceptoBean, es un metodo que retorna si existe un valconceptoBean metodo efectivo para validaciones
  * @param povalconceptoBean, Objeto correspondiente a valconceptoBean
  * @return Retorna true cuando existe un valconceptoBean, false cuando no existe un valconceptoBean
  * @throws Exception
  */
        public boolean fnIsvalconceptoBean (valconceptoBean povalconceptoBean) throws Exception 
        {
        valconceptoBean ovalconceptoBean = null;
        Connection cn = null ;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_valconcepto_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, povalconceptoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, povalconceptoBean.getIIdValConcepto());
        cs.setString(4, povalconceptoBean.getCCodMaeConcepto());
        cs.setString(5, povalconceptoBean.getCCodRegContribuyente());
        cs.setInt(6, povalconceptoBean.getIIdVencimiento());
        cs.setDouble(7, povalconceptoBean.getDeTotaInsoluto());
        cs.setBoolean(8, povalconceptoBean.getBIndFijo());
        cs.setString(9, povalconceptoBean.getNvObservacion());
        cs.setInt(10, povalconceptoBean.getIIdRegUsuaRegistra());
        cs.setDate(11, povalconceptoBean.getDtFechRegistra());
        cs.setInt(12, povalconceptoBean.getICantidadModifica());
        cs.setBoolean(13, povalconceptoBean.getBEstado());
        rs = cs.executeQuery();
        while (rs.next()) {
        ovalconceptoBean = new valconceptoBean();
        ovalconceptoBean.setBEstado(rs.getBoolean("iIdValConcepto"));
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
        return ovalconceptoBean!= null;
        }
/* ***************************************************************************************************
 * --
 * -- Creado por              : APP
 * -- Fecha creacion          : 22/05/2015 12:08:41
 * -- ¿Esta siendo Utilizado? : NO
 * -- Modificado por          : <Analista Programador>
 * -- Fecha Actualizacion     : <Fecha de Actualizacion>
 * --
 * **************************************************************************************************/
  /**
  * @fnGetListvalconceptoBean, es un metodo que retorna una lista de objetos de valconceptoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param povalconceptoBean, Objeto correspondiente a valconceptoBean
  * @return Retorna una lista de objetos valconceptoBean
  * @throws Exception
  */
  public List fnGetListvalconceptoBean(valconceptoBean povalconceptoBean) throws Exception {
  List list = new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_valconcepto_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, povalconceptoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, povalconceptoBean.getIIdValConcepto());
        cs.setString(4, povalconceptoBean.getCCodMaeConcepto());
        cs.setString(5, povalconceptoBean.getCCodRegContribuyente());
        cs.setInt(6, povalconceptoBean.getIIdVencimiento());
        cs.setDouble(7, povalconceptoBean.getDeTotaInsoluto());
        cs.setBoolean(8, povalconceptoBean.getBIndFijo());
        cs.setString(9, povalconceptoBean.getNvObservacion());
        cs.setInt(10, povalconceptoBean.getIIdRegUsuaRegistra());
        cs.setDate(11, povalconceptoBean.getDtFechRegistra());
        cs.setInt(12, povalconceptoBean.getICantidadModifica());
        cs.setBoolean(13, povalconceptoBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)/*, rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11)*/}; 
  //Object[] obj = {rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDouble(5), rs.getBoolean(6), rs.getString(7), rs.getInt(8), rs.getDate(9), rs.getInt(10), rs.getBoolean(11)}; 
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
 * -- Fecha creacion          : 22/05/2015 12:08:41
 * -- ¿Esta siendo Utilizado? : NO
 * -- Modificado por          : <Analista Programador>
 * -- Fecha Actualizacion     : <Fecha de Actualizacion>
 * --
 * **************************************************************************************************/
  /**
  * @fnGridvalconceptoBean, es un metodo que retorna una lista de objetos de valconceptoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param povalconceptoBean, Objeto correspondiente a valconceptoBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridvalconceptoBean(valconceptoBean povalconceptoBean) throws Exception {
  List lista= new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_valconcepto_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, povalconceptoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, povalconceptoBean.getIIdValConcepto());
        cs.setString(4, povalconceptoBean.getCCodMaeConcepto());
        cs.setString(5, povalconceptoBean.getCCodRegContribuyente());
        cs.setInt(6, povalconceptoBean.getIIdVencimiento());
        cs.setDouble(7, povalconceptoBean.getDeTotaInsoluto());
        cs.setBoolean(8, povalconceptoBean.getBIndFijo());
        cs.setString(9, povalconceptoBean.getNvObservacion());
        cs.setInt(10, povalconceptoBean.getIIdRegUsuaRegistra());
        cs.setDate(11, povalconceptoBean.getDtFechRegistra());
        cs.setInt(12, povalconceptoBean.getICantidadModifica());
        cs.setBoolean(13, povalconceptoBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)/*, rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11)*/}; 
  //Object[] obj = {rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDouble(5), rs.getBoolean(6), rs.getString(7), rs.getInt(8), rs.getDate(9), rs.getInt(10), rs.getBoolean(11)}; 
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
 * -- Fecha creacion          : 22/05/2015 12:08:41
 * -- ¿Esta siendo Utilizado? : NO
 * -- Modificado por          : <Analista Programador>
 * -- Fecha Actualizacion     : <Fecha de Actualizacion>
 * --
 * **************************************************************************************************/
  /**
  * @fnAutocompletevalconceptoBean, es un metodo que retorna una lista de objetos de valconceptoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param povalconceptoBean, Objeto correspondiente a valconceptoBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<valconceptoBean> fnAutocompletevalconceptoBean(valconceptoBean povalconceptoBean) throws Exception {
  ArrayList<valconceptoBean> listavalconceptoBean = new ArrayList<>();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_valconcepto_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, povalconceptoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, povalconceptoBean.getIIdValConcepto());
        cs.setString(4, povalconceptoBean.getCCodMaeConcepto());
        cs.setString(5, povalconceptoBean.getCCodRegContribuyente());
        cs.setInt(6, povalconceptoBean.getIIdVencimiento());
        cs.setDouble(7, povalconceptoBean.getDeTotaInsoluto());
        cs.setBoolean(8, povalconceptoBean.getBIndFijo());
        cs.setString(9, povalconceptoBean.getNvObservacion());
        cs.setInt(10, povalconceptoBean.getIIdRegUsuaRegistra());
        cs.setDate(11, povalconceptoBean.getDtFechRegistra());
        cs.setInt(12, povalconceptoBean.getICantidadModifica());
        cs.setBoolean(13, povalconceptoBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  valconceptoBean ovalconceptoBean = new valconceptoBean();
  ovalconceptoBean.setIIdValConcepto(rs.getInt("iIdValConcepto")); 
  ovalconceptoBean.setCCodMaeConcepto(rs.getString("cCodMaeConcepto")); 
  ovalconceptoBean.setCCodRegContribuyente(rs.getString("cCodRegContribuyente")); 
  ovalconceptoBean.setIIdVencimiento(rs.getInt("iIdVencimiento")); 
  ovalconceptoBean.setDeTotaInsoluto(rs.getDouble("deTotaInsoluto")); 
  ovalconceptoBean.setBIndFijo(rs.getBoolean("bIndFijo")); 
  ovalconceptoBean.setNvObservacion(rs.getString("nvObservacion")); 
  ovalconceptoBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  ovalconceptoBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  ovalconceptoBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  ovalconceptoBean.setBEstado(rs.getBoolean("bEstado")); 
  listavalconceptoBean.add(ovalconceptoBean);
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
  return listavalconceptoBean;
  }
/* ***************************************************************************************************
 * --
 * -- Creado por              : APP
 * -- Fecha creacion          : 22/05/2015 12:08:41
 * -- ¿Esta siendo Utilizado? : NO
 * -- Modificado por          : <Analista Programador>
 * -- Fecha Actualizacion     : <Fecha de Actualizacion>
 * --
 * **************************************************************************************************/
  /**
  * @fnGetvalconceptoBean, es un metodo que retorna un objeto especifico de valconceptoBean
  * @param povalconceptoBean, Objeto correspondiente a valconceptoBean
  * @return Retorna el Objeto valconceptoBean
  * @throws Exception
  */
  public valconceptoBean fnGetvalconceptoBean(valconceptoBean povalconceptoBean) throws Exception {
  valconceptoBean ovalconceptoBean = null;
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_valconcepto_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, povalconceptoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, povalconceptoBean.getIIdValConcepto());
        cs.setString(4, povalconceptoBean.getCCodMaeConcepto());
        cs.setString(5, povalconceptoBean.getCCodRegContribuyente());
        cs.setInt(6, povalconceptoBean.getIIdVencimiento());
        cs.setDouble(7, povalconceptoBean.getDeTotaInsoluto());
        cs.setBoolean(8, povalconceptoBean.getBIndFijo());
        cs.setString(9, povalconceptoBean.getNvObservacion());
        cs.setInt(10, povalconceptoBean.getIIdRegUsuaRegistra());
        cs.setDate(11, povalconceptoBean.getDtFechRegistra());
        cs.setInt(12, povalconceptoBean.getICantidadModifica());
        cs.setBoolean(13, povalconceptoBean.getBEstado());
        rs = cs.executeQuery();
   while (rs.next()) {
  ovalconceptoBean = new valconceptoBean();
  ovalconceptoBean.setIIdValConcepto(rs.getInt("iIdValConcepto")); 
  ovalconceptoBean.setCCodMaeConcepto(rs.getString("cCodMaeConcepto")); 
  ovalconceptoBean.setCCodRegContribuyente(rs.getString("cCodRegContribuyente")); 
  ovalconceptoBean.setIIdVencimiento(rs.getInt("iIdVencimiento")); 
  ovalconceptoBean.setDeTotaInsoluto(rs.getDouble("deTotaInsoluto")); 
  ovalconceptoBean.setBIndFijo(rs.getBoolean("bIndFijo")); 
  ovalconceptoBean.setNvObservacion(rs.getString("nvObservacion")); 
  ovalconceptoBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  ovalconceptoBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  ovalconceptoBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  ovalconceptoBean.setBEstado(rs.getBoolean("bEstado")); 
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
  return ovalconceptoBean;
  }
/* ***************************************************************************************************
 * --
 * -- Creado por              : APP
 * -- Fecha creacion          : 22/05/2015 12:08:41
 * -- ¿Esta siendo Utilizado? : NO
 * -- Modificado por          : <Analista Programador>
 * -- Fecha Actualizacion     : <Fecha de Actualizacion>
 * --
 * **************************************************************************************************/
  /**
  * @fnInsertarvalconceptoBean,  es un metodo que Inserta un  valconceptoBean
  * @param povalconceptoBean, Objeto correspondiente a valconceptoBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarvalconceptoBean(valconceptoBean povalconceptoBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_valconcepto_ins(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, povalconceptoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, povalconceptoBean.getIIdValConcepto());
        cs.setString(4, povalconceptoBean.getCCodMaeConcepto());
        cs.setString(5, povalconceptoBean.getCCodRegContribuyente());
        cs.setInt(6, povalconceptoBean.getIIdVencimiento());
        cs.setDouble(7, povalconceptoBean.getDeTotaInsoluto());
        cs.setBoolean(8, povalconceptoBean.getBIndFijo());
        cs.setString(9, povalconceptoBean.getNvObservacion());
        cs.setInt(10, povalconceptoBean.getIIdRegUsuaRegistra());
        cs.setDate(11, povalconceptoBean.getDtFechRegistra());
        cs.setInt(12, povalconceptoBean.getICantidadModifica());
        cs.setBoolean(13, true);
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
 * -- Fecha creacion          : 22/05/2015 12:08:41
 * -- ¿Esta siendo Utilizado? : NO
 * -- Modificado por          : <Analista Programador>
 * -- Fecha Actualizacion     : <Fecha de Actualizacion>
 * --
 * **************************************************************************************************/
  /**
  * @fnEliminarvalconceptoBean,  es un metodo que Elimina un  valconceptoBean
  * @param povalconceptoBean, Objeto correspondiente a valconceptoBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarvalconceptoBean(valconceptoBean povalconceptoBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_valconcepto_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, povalconceptoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, povalconceptoBean.getIIdValConcepto());
        cs.setString(4, povalconceptoBean.getCCodMaeConcepto());
        cs.setString(5, povalconceptoBean.getCCodRegContribuyente());
        cs.setInt(6, povalconceptoBean.getIIdVencimiento());
        cs.setDouble(7, povalconceptoBean.getDeTotaInsoluto());
        cs.setBoolean(8, povalconceptoBean.getBIndFijo());
        cs.setString(9, povalconceptoBean.getNvObservacion());
        cs.setInt(10, povalconceptoBean.getIIdRegUsuaRegistra());
        cs.setDate(11, povalconceptoBean.getDtFechRegistra());
        cs.setInt(12, povalconceptoBean.getICantidadModifica());
        cs.setBoolean(13, false);
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
 * -- Fecha creacion          : 22/05/2015 12:08:41
 * -- ¿Esta siendo Utilizado? : NO
 * -- Modificado por          : <Analista Programador>
 * -- Fecha Actualizacion     : <Fecha de Actualizacion>
 * --
 * **************************************************************************************************/
  /**
  * @fnActualizarvalconceptoBean,  es un metodo que Actualiza un  valconceptoBean
  * @param povalconceptoBean, Objeto correspondiente a valconceptoBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarvalconceptoBean(valconceptoBean povalconceptoBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_valconcepto_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, povalconceptoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, povalconceptoBean.getIIdValConcepto());
        cs.setString(4, povalconceptoBean.getCCodMaeConcepto());
        cs.setString(5, povalconceptoBean.getCCodRegContribuyente());
        cs.setInt(6, povalconceptoBean.getIIdVencimiento());
        cs.setDouble(7, povalconceptoBean.getDeTotaInsoluto());
        cs.setBoolean(8, povalconceptoBean.getBIndFijo());
        cs.setString(9, povalconceptoBean.getNvObservacion());
        cs.setInt(10, povalconceptoBean.getIIdRegUsuaRegistra());
        cs.setDate(11, povalconceptoBean.getDtFechRegistra());
        cs.setInt(12, povalconceptoBean.getICantidadModifica());
        cs.setBoolean(13, true);
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
