/*******************************************************************************
 * Descripcion       : Clase que contiene los metodos transaccionales de acceso a datos de maetipodocumento
 * Creado por        : APP
 * Fecha de Creacion : 22/05/2015 12:08:40
** *****************************************************************************/

package pe.sigmas.datos;

import pe.sigmas.entity.maetipodocumentoBean;
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
    public class maetipodocumentoDAT
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
  * @fnIsmaetipodocumentoBean, es un metodo que retorna si existe un maetipodocumentoBean metodo efectivo para validaciones
  * @param pomaetipodocumentoBean, Objeto correspondiente a maetipodocumentoBean
  * @return Retorna true cuando existe un maetipodocumentoBean, false cuando no existe un maetipodocumentoBean
  * @throws Exception
  */
        public boolean fnIsmaetipodocumentoBean (maetipodocumentoBean pomaetipodocumentoBean) throws Exception 
        {
        maetipodocumentoBean omaetipodocumentoBean = null;
        Connection cn = null ;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maetipodocumento_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaetipodocumentoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaetipodocumentoBean.getCCodMaeTipoDocumento());
        cs.setString(4, pomaetipodocumentoBean.getNvAbreviatura());
        cs.setString(5, pomaetipodocumentoBean.getNvDenominacion());
        cs.setString(6, pomaetipodocumentoBean.getNvDescripcion());
        cs.setString(7, pomaetipodocumentoBean.getNvObservacion());
        cs.setInt(8, pomaetipodocumentoBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaetipodocumentoBean.getDtFechRegistra());
        cs.setInt(10, pomaetipodocumentoBean.getICantidadModifica());
        cs.setBoolean(11, pomaetipodocumentoBean.getBEstado());
        rs = cs.executeQuery();
        while (rs.next()) {
        omaetipodocumentoBean = new maetipodocumentoBean();
        omaetipodocumentoBean.setBEstado(rs.getBoolean("cCodMaeTipoDocumento"));
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
        return omaetipodocumentoBean!= null;
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
  * @fnGetListmaetipodocumentoBean, es un metodo que retorna una lista de objetos de maetipodocumentoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaetipodocumentoBean, Objeto correspondiente a maetipodocumentoBean
  * @return Retorna una lista de objetos maetipodocumentoBean
  * @throws Exception
  */
  public List fnGetListmaetipodocumentoBean(maetipodocumentoBean pomaetipodocumentoBean) throws Exception {
  List list = new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maetipodocumento_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaetipodocumentoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaetipodocumentoBean.getCCodMaeTipoDocumento());
        cs.setString(4, pomaetipodocumentoBean.getNvAbreviatura());
        cs.setString(5, pomaetipodocumentoBean.getNvDenominacion());
        cs.setString(6, pomaetipodocumentoBean.getNvDescripcion());
        cs.setString(7, pomaetipodocumentoBean.getNvObservacion());
        cs.setInt(8, pomaetipodocumentoBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaetipodocumentoBean.getDtFechRegistra());
        cs.setInt(10, pomaetipodocumentoBean.getICantidadModifica());
        cs.setBoolean(11, pomaetipodocumentoBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)}; 
  //Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getDate(7), rs.getInt(8), rs.getBoolean(9)}; 
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
  * @fnGridmaetipodocumentoBean, es un metodo que retorna una lista de objetos de maetipodocumentoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaetipodocumentoBean, Objeto correspondiente a maetipodocumentoBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridmaetipodocumentoBean(maetipodocumentoBean pomaetipodocumentoBean) throws Exception {
  List lista= new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maetipodocumento_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaetipodocumentoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaetipodocumentoBean.getCCodMaeTipoDocumento());
        cs.setString(4, pomaetipodocumentoBean.getNvAbreviatura());
        cs.setString(5, pomaetipodocumentoBean.getNvDenominacion());
        cs.setString(6, pomaetipodocumentoBean.getNvDescripcion());
        cs.setString(7, pomaetipodocumentoBean.getNvObservacion());
        cs.setInt(8, pomaetipodocumentoBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaetipodocumentoBean.getDtFechRegistra());
        cs.setInt(10, pomaetipodocumentoBean.getICantidadModifica());
        cs.setBoolean(11, pomaetipodocumentoBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)}; 
  //Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getDate(7), rs.getInt(8), rs.getBoolean(9)}; 
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
  * @fnAutocompletemaetipodocumentoBean, es un metodo que retorna una lista de objetos de maetipodocumentoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaetipodocumentoBean, Objeto correspondiente a maetipodocumentoBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<maetipodocumentoBean> fnAutocompletemaetipodocumentoBean(maetipodocumentoBean pomaetipodocumentoBean) throws Exception {
  ArrayList<maetipodocumentoBean> listamaetipodocumentoBean = new ArrayList<>();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maetipodocumento_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaetipodocumentoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaetipodocumentoBean.getCCodMaeTipoDocumento());
        cs.setString(4, pomaetipodocumentoBean.getNvAbreviatura());
        cs.setString(5, pomaetipodocumentoBean.getNvDenominacion());
        cs.setString(6, pomaetipodocumentoBean.getNvDescripcion());
        cs.setString(7, pomaetipodocumentoBean.getNvObservacion());
        cs.setInt(8, pomaetipodocumentoBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaetipodocumentoBean.getDtFechRegistra());
        cs.setInt(10, pomaetipodocumentoBean.getICantidadModifica());
        cs.setBoolean(11, pomaetipodocumentoBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  maetipodocumentoBean omaetipodocumentoBean = new maetipodocumentoBean();
  omaetipodocumentoBean.setCCodMaeTipoDocumento(rs.getString("cCodMaeTipoDocumento")); 
  omaetipodocumentoBean.setNvAbreviatura(rs.getString("nvAbreviatura")); 
  omaetipodocumentoBean.setNvDenominacion(rs.getString("nvDenominacion")); 
  omaetipodocumentoBean.setNvDescripcion(rs.getString("nvDescripcion")); 
  omaetipodocumentoBean.setNvObservacion(rs.getString("nvObservacion")); 
  omaetipodocumentoBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  omaetipodocumentoBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  omaetipodocumentoBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  omaetipodocumentoBean.setBEstado(rs.getBoolean("bEstado")); 
  listamaetipodocumentoBean.add(omaetipodocumentoBean);
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
  return listamaetipodocumentoBean;
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
  * @fnGetmaetipodocumentoBean, es un metodo que retorna un objeto especifico de maetipodocumentoBean
  * @param pomaetipodocumentoBean, Objeto correspondiente a maetipodocumentoBean
  * @return Retorna el Objeto maetipodocumentoBean
  * @throws Exception
  */
  public maetipodocumentoBean fnGetmaetipodocumentoBean(maetipodocumentoBean pomaetipodocumentoBean) throws Exception {
  maetipodocumentoBean omaetipodocumentoBean = null;
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maetipodocumento_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaetipodocumentoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaetipodocumentoBean.getCCodMaeTipoDocumento());
        cs.setString(4, pomaetipodocumentoBean.getNvAbreviatura());
        cs.setString(5, pomaetipodocumentoBean.getNvDenominacion());
        cs.setString(6, pomaetipodocumentoBean.getNvDescripcion());
        cs.setString(7, pomaetipodocumentoBean.getNvObservacion());
        cs.setInt(8, pomaetipodocumentoBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaetipodocumentoBean.getDtFechRegistra());
        cs.setInt(10, pomaetipodocumentoBean.getICantidadModifica());
        cs.setBoolean(11, pomaetipodocumentoBean.getBEstado());
        rs = cs.executeQuery();
   while (rs.next()) {
  omaetipodocumentoBean = new maetipodocumentoBean();
  omaetipodocumentoBean.setCCodMaeTipoDocumento(rs.getString("cCodMaeTipoDocumento")); 
  omaetipodocumentoBean.setNvAbreviatura(rs.getString("nvAbreviatura")); 
  omaetipodocumentoBean.setNvDenominacion(rs.getString("nvDenominacion")); 
  omaetipodocumentoBean.setNvDescripcion(rs.getString("nvDescripcion")); 
  omaetipodocumentoBean.setNvObservacion(rs.getString("nvObservacion")); 
  omaetipodocumentoBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  omaetipodocumentoBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  omaetipodocumentoBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  omaetipodocumentoBean.setBEstado(rs.getBoolean("bEstado")); 
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
  return omaetipodocumentoBean;
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
  * @fnInsertarmaetipodocumentoBean,  es un metodo que Inserta un  maetipodocumentoBean
  * @param pomaetipodocumentoBean, Objeto correspondiente a maetipodocumentoBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarmaetipodocumentoBean(maetipodocumentoBean pomaetipodocumentoBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maetipodocumento_ins(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaetipodocumentoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaetipodocumentoBean.getCCodMaeTipoDocumento());
        cs.setString(4, pomaetipodocumentoBean.getNvAbreviatura());
        cs.setString(5, pomaetipodocumentoBean.getNvDenominacion());
        cs.setString(6, pomaetipodocumentoBean.getNvDescripcion());
        cs.setString(7, pomaetipodocumentoBean.getNvObservacion());
        cs.setInt(8, pomaetipodocumentoBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaetipodocumentoBean.getDtFechRegistra());
        cs.setInt(10, pomaetipodocumentoBean.getICantidadModifica());
        cs.setBoolean(11, true);
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
  * @fnEliminarmaetipodocumentoBean,  es un metodo que Elimina un  maetipodocumentoBean
  * @param pomaetipodocumentoBean, Objeto correspondiente a maetipodocumentoBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarmaetipodocumentoBean(maetipodocumentoBean pomaetipodocumentoBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maetipodocumento_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaetipodocumentoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaetipodocumentoBean.getCCodMaeTipoDocumento());
        cs.setString(4, pomaetipodocumentoBean.getNvAbreviatura());
        cs.setString(5, pomaetipodocumentoBean.getNvDenominacion());
        cs.setString(6, pomaetipodocumentoBean.getNvDescripcion());
        cs.setString(7, pomaetipodocumentoBean.getNvObservacion());
        cs.setInt(8, pomaetipodocumentoBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaetipodocumentoBean.getDtFechRegistra());
        cs.setInt(10, pomaetipodocumentoBean.getICantidadModifica());
        cs.setBoolean(11, false);
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
  * @fnActualizarmaetipodocumentoBean,  es un metodo que Actualiza un  maetipodocumentoBean
  * @param pomaetipodocumentoBean, Objeto correspondiente a maetipodocumentoBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarmaetipodocumentoBean(maetipodocumentoBean pomaetipodocumentoBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maetipodocumento_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaetipodocumentoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaetipodocumentoBean.getCCodMaeTipoDocumento());
        cs.setString(4, pomaetipodocumentoBean.getNvAbreviatura());
        cs.setString(5, pomaetipodocumentoBean.getNvDenominacion());
        cs.setString(6, pomaetipodocumentoBean.getNvDescripcion());
        cs.setString(7, pomaetipodocumentoBean.getNvObservacion());
        cs.setInt(8, pomaetipodocumentoBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaetipodocumentoBean.getDtFechRegistra());
        cs.setInt(10, pomaetipodocumentoBean.getICantidadModifica());
        cs.setBoolean(11, true);
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
