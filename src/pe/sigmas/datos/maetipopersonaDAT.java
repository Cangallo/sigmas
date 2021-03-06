/*******************************************************************************
 * Descripcion       : Clase que contiene los metodos transaccionales de acceso a datos de maetipopersona
 * Creado por        : APP
 * Fecha de Creacion : 22/05/2015 12:08:40
** *****************************************************************************/

package pe.sigmas.datos;

import pe.sigmas.entity.maetipopersonaBean;
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
    public class maetipopersonaDAT
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
  * @fnIsmaetipopersonaBean, es un metodo que retorna si existe un maetipopersonaBean metodo efectivo para validaciones
  * @param pomaetipopersonaBean, Objeto correspondiente a maetipopersonaBean
  * @return Retorna true cuando existe un maetipopersonaBean, false cuando no existe un maetipopersonaBean
  * @throws Exception
  */
        public boolean fnIsmaetipopersonaBean (maetipopersonaBean pomaetipopersonaBean) throws Exception 
        {
        maetipopersonaBean omaetipopersonaBean = null;
        Connection cn = null ;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maetipopersona_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaetipopersonaBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaetipopersonaBean.getCCodMaeTipoPersona());
        cs.setString(4, pomaetipopersonaBean.getNvAbreviatura());
        cs.setString(5, pomaetipopersonaBean.getNvDenominacion());
        cs.setString(6, pomaetipopersonaBean.getNvDescripcion());
        cs.setString(7, pomaetipopersonaBean.getNvObservacion());
        cs.setInt(8, pomaetipopersonaBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaetipopersonaBean.getDtFechRegistra());
        cs.setInt(10, pomaetipopersonaBean.getICantidadModifica());
        cs.setBoolean(11, pomaetipopersonaBean.getBEstado());
        rs = cs.executeQuery();
        while (rs.next()) {
        omaetipopersonaBean = new maetipopersonaBean();
        omaetipopersonaBean.setBEstado(rs.getBoolean("cCodMaeTipoPersona"));
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
        return omaetipopersonaBean!= null;
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
  * @fnGetListmaetipopersonaBean, es un metodo que retorna una lista de objetos de maetipopersonaBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaetipopersonaBean, Objeto correspondiente a maetipopersonaBean
  * @return Retorna una lista de objetos maetipopersonaBean
  * @throws Exception
  */
  public List fnGetListmaetipopersonaBean(maetipopersonaBean pomaetipopersonaBean) throws Exception {
  List list = new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maetipopersona_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaetipopersonaBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaetipopersonaBean.getCCodMaeTipoPersona());
        cs.setString(4, pomaetipopersonaBean.getNvAbreviatura());
        cs.setString(5, pomaetipopersonaBean.getNvDenominacion());
        cs.setString(6, pomaetipopersonaBean.getNvDescripcion());
        cs.setString(7, pomaetipopersonaBean.getNvObservacion());
        cs.setInt(8, pomaetipopersonaBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaetipopersonaBean.getDtFechRegistra());
        cs.setInt(10, pomaetipopersonaBean.getICantidadModifica());
        cs.setBoolean(11, pomaetipopersonaBean.getBEstado());
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
  * @fnGridmaetipopersonaBean, es un metodo que retorna una lista de objetos de maetipopersonaBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaetipopersonaBean, Objeto correspondiente a maetipopersonaBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridmaetipopersonaBean(maetipopersonaBean pomaetipopersonaBean) throws Exception {
  List lista= new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maetipopersona_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaetipopersonaBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaetipopersonaBean.getCCodMaeTipoPersona());
        cs.setString(4, pomaetipopersonaBean.getNvAbreviatura());
        cs.setString(5, pomaetipopersonaBean.getNvDenominacion());
        cs.setString(6, pomaetipopersonaBean.getNvDescripcion());
        cs.setString(7, pomaetipopersonaBean.getNvObservacion());
        cs.setInt(8, pomaetipopersonaBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaetipopersonaBean.getDtFechRegistra());
        cs.setInt(10, pomaetipopersonaBean.getICantidadModifica());
        cs.setBoolean(11, pomaetipopersonaBean.getBEstado());
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
  * @fnAutocompletemaetipopersonaBean, es un metodo que retorna una lista de objetos de maetipopersonaBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaetipopersonaBean, Objeto correspondiente a maetipopersonaBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<maetipopersonaBean> fnAutocompletemaetipopersonaBean(maetipopersonaBean pomaetipopersonaBean) throws Exception {
  ArrayList<maetipopersonaBean> listamaetipopersonaBean = new ArrayList<>();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maetipopersona_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaetipopersonaBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaetipopersonaBean.getCCodMaeTipoPersona());
        cs.setString(4, pomaetipopersonaBean.getNvAbreviatura());
        cs.setString(5, pomaetipopersonaBean.getNvDenominacion());
        cs.setString(6, pomaetipopersonaBean.getNvDescripcion());
        cs.setString(7, pomaetipopersonaBean.getNvObservacion());
        cs.setInt(8, pomaetipopersonaBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaetipopersonaBean.getDtFechRegistra());
        cs.setInt(10, pomaetipopersonaBean.getICantidadModifica());
        cs.setBoolean(11, pomaetipopersonaBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  maetipopersonaBean omaetipopersonaBean = new maetipopersonaBean();
  omaetipopersonaBean.setCCodMaeTipoPersona(rs.getString("cCodMaeTipoPersona")); 
  omaetipopersonaBean.setNvAbreviatura(rs.getString("nvAbreviatura")); 
  omaetipopersonaBean.setNvDenominacion(rs.getString("nvDenominacion")); 
  omaetipopersonaBean.setNvDescripcion(rs.getString("nvDescripcion")); 
  omaetipopersonaBean.setNvObservacion(rs.getString("nvObservacion")); 
  omaetipopersonaBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  omaetipopersonaBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  omaetipopersonaBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  omaetipopersonaBean.setBEstado(rs.getBoolean("bEstado")); 
  listamaetipopersonaBean.add(omaetipopersonaBean);
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
  return listamaetipopersonaBean;
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
  * @fnGetmaetipopersonaBean, es un metodo que retorna un objeto especifico de maetipopersonaBean
  * @param pomaetipopersonaBean, Objeto correspondiente a maetipopersonaBean
  * @return Retorna el Objeto maetipopersonaBean
  * @throws Exception
  */
  public maetipopersonaBean fnGetmaetipopersonaBean(maetipopersonaBean pomaetipopersonaBean) throws Exception {
  maetipopersonaBean omaetipopersonaBean = null;
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maetipopersona_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaetipopersonaBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaetipopersonaBean.getCCodMaeTipoPersona());
        cs.setString(4, pomaetipopersonaBean.getNvAbreviatura());
        cs.setString(5, pomaetipopersonaBean.getNvDenominacion());
        cs.setString(6, pomaetipopersonaBean.getNvDescripcion());
        cs.setString(7, pomaetipopersonaBean.getNvObservacion());
        cs.setInt(8, pomaetipopersonaBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaetipopersonaBean.getDtFechRegistra());
        cs.setInt(10, pomaetipopersonaBean.getICantidadModifica());
        cs.setBoolean(11, pomaetipopersonaBean.getBEstado());
        rs = cs.executeQuery();
   while (rs.next()) {
  omaetipopersonaBean = new maetipopersonaBean();
  omaetipopersonaBean.setCCodMaeTipoPersona(rs.getString("cCodMaeTipoPersona")); 
  omaetipopersonaBean.setNvAbreviatura(rs.getString("nvAbreviatura")); 
  omaetipopersonaBean.setNvDenominacion(rs.getString("nvDenominacion")); 
  omaetipopersonaBean.setNvDescripcion(rs.getString("nvDescripcion")); 
  omaetipopersonaBean.setNvObservacion(rs.getString("nvObservacion")); 
  omaetipopersonaBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  omaetipopersonaBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  omaetipopersonaBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  omaetipopersonaBean.setBEstado(rs.getBoolean("bEstado")); 
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
  return omaetipopersonaBean;
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
  * @fnInsertarmaetipopersonaBean,  es un metodo que Inserta un  maetipopersonaBean
  * @param pomaetipopersonaBean, Objeto correspondiente a maetipopersonaBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarmaetipopersonaBean(maetipopersonaBean pomaetipopersonaBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maetipopersona_ins(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaetipopersonaBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaetipopersonaBean.getCCodMaeTipoPersona());
        cs.setString(4, pomaetipopersonaBean.getNvAbreviatura());
        cs.setString(5, pomaetipopersonaBean.getNvDenominacion());
        cs.setString(6, pomaetipopersonaBean.getNvDescripcion());
        cs.setString(7, pomaetipopersonaBean.getNvObservacion());
        cs.setInt(8, pomaetipopersonaBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaetipopersonaBean.getDtFechRegistra());
        cs.setInt(10, pomaetipopersonaBean.getICantidadModifica());
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
  * @fnEliminarmaetipopersonaBean,  es un metodo que Elimina un  maetipopersonaBean
  * @param pomaetipopersonaBean, Objeto correspondiente a maetipopersonaBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarmaetipopersonaBean(maetipopersonaBean pomaetipopersonaBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maetipopersona_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaetipopersonaBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaetipopersonaBean.getCCodMaeTipoPersona());
        cs.setString(4, pomaetipopersonaBean.getNvAbreviatura());
        cs.setString(5, pomaetipopersonaBean.getNvDenominacion());
        cs.setString(6, pomaetipopersonaBean.getNvDescripcion());
        cs.setString(7, pomaetipopersonaBean.getNvObservacion());
        cs.setInt(8, pomaetipopersonaBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaetipopersonaBean.getDtFechRegistra());
        cs.setInt(10, pomaetipopersonaBean.getICantidadModifica());
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
  * @fnActualizarmaetipopersonaBean,  es un metodo que Actualiza un  maetipopersonaBean
  * @param pomaetipopersonaBean, Objeto correspondiente a maetipopersonaBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarmaetipopersonaBean(maetipopersonaBean pomaetipopersonaBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maetipopersona_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaetipopersonaBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaetipopersonaBean.getCCodMaeTipoPersona());
        cs.setString(4, pomaetipopersonaBean.getNvAbreviatura());
        cs.setString(5, pomaetipopersonaBean.getNvDenominacion());
        cs.setString(6, pomaetipopersonaBean.getNvDescripcion());
        cs.setString(7, pomaetipopersonaBean.getNvObservacion());
        cs.setInt(8, pomaetipopersonaBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaetipopersonaBean.getDtFechRegistra());
        cs.setInt(10, pomaetipopersonaBean.getICantidadModifica());
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
