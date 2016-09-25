/*******************************************************************************
 * Descripcion       : Clase que contiene los metodos transaccionales de acceso a datos de maeestacivil
 * Creado por        : APP
 * Fecha de Creacion : 22/05/2015 12:08:40
** *****************************************************************************/

package pe.sigmas.datos;

import pe.sigmas.entity.maeestacivilBean;
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
    public class maeestacivilDAT
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
  * @fnIsmaeestacivilBean, es un metodo que retorna si existe un maeestacivilBean metodo efectivo para validaciones
  * @param pomaeestacivilBean, Objeto correspondiente a maeestacivilBean
  * @return Retorna true cuando existe un maeestacivilBean, false cuando no existe un maeestacivilBean
  * @throws Exception
  */
        public boolean fnIsmaeestacivilBean (maeestacivilBean pomaeestacivilBean) throws Exception 
        {
        maeestacivilBean omaeestacivilBean = null;
        Connection cn = null ;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maeestacivil_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaeestacivilBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaeestacivilBean.getCCodMaeEstaCivil());
        cs.setString(4, pomaeestacivilBean.getNvAbreviatura());
        cs.setString(5, pomaeestacivilBean.getNvDenominacion());
        cs.setString(6, pomaeestacivilBean.getNvDescripcion());
        cs.setString(7, pomaeestacivilBean.getNvObservacion());
        cs.setInt(8, pomaeestacivilBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaeestacivilBean.getDtFechRegistra());
        cs.setInt(10, pomaeestacivilBean.getICantidadModifica());
        cs.setBoolean(11, pomaeestacivilBean.getBEstado());
        rs = cs.executeQuery();
        while (rs.next()) {
        omaeestacivilBean = new maeestacivilBean();
        omaeestacivilBean.setBEstado(rs.getBoolean("cCodMaeEstaCivil"));
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
        return omaeestacivilBean!= null;
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
  * @fnGetListmaeestacivilBean, es un metodo que retorna una lista de objetos de maeestacivilBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaeestacivilBean, Objeto correspondiente a maeestacivilBean
  * @return Retorna una lista de objetos maeestacivilBean
  * @throws Exception
  */
  public List fnGetListmaeestacivilBean(maeestacivilBean pomaeestacivilBean) throws Exception {
  List list = new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maeestacivil_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaeestacivilBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaeestacivilBean.getCCodMaeEstaCivil());
        cs.setString(4, pomaeestacivilBean.getNvAbreviatura());
        cs.setString(5, pomaeestacivilBean.getNvDenominacion());
        cs.setString(6, pomaeestacivilBean.getNvDescripcion());
        cs.setString(7, pomaeestacivilBean.getNvObservacion());
        cs.setInt(8, pomaeestacivilBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaeestacivilBean.getDtFechRegistra());
        cs.setInt(10, pomaeestacivilBean.getICantidadModifica());
        cs.setBoolean(11, pomaeestacivilBean.getBEstado());
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
  * @fnGridmaeestacivilBean, es un metodo que retorna una lista de objetos de maeestacivilBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaeestacivilBean, Objeto correspondiente a maeestacivilBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridmaeestacivilBean(maeestacivilBean pomaeestacivilBean) throws Exception {
  List lista= new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maeestacivil_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaeestacivilBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaeestacivilBean.getCCodMaeEstaCivil());
        cs.setString(4, pomaeestacivilBean.getNvAbreviatura());
        cs.setString(5, pomaeestacivilBean.getNvDenominacion());
        cs.setString(6, pomaeestacivilBean.getNvDescripcion());
        cs.setString(7, pomaeestacivilBean.getNvObservacion());
        cs.setInt(8, pomaeestacivilBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaeestacivilBean.getDtFechRegistra());
        cs.setInt(10, pomaeestacivilBean.getICantidadModifica());
        cs.setBoolean(11, pomaeestacivilBean.getBEstado());
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
  * @fnAutocompletemaeestacivilBean, es un metodo que retorna una lista de objetos de maeestacivilBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaeestacivilBean, Objeto correspondiente a maeestacivilBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<maeestacivilBean> fnAutocompletemaeestacivilBean(maeestacivilBean pomaeestacivilBean) throws Exception {
  ArrayList<maeestacivilBean> listamaeestacivilBean = new ArrayList<>();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maeestacivil_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaeestacivilBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaeestacivilBean.getCCodMaeEstaCivil());
        cs.setString(4, pomaeestacivilBean.getNvAbreviatura());
        cs.setString(5, pomaeestacivilBean.getNvDenominacion());
        cs.setString(6, pomaeestacivilBean.getNvDescripcion());
        cs.setString(7, pomaeestacivilBean.getNvObservacion());
        cs.setInt(8, pomaeestacivilBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaeestacivilBean.getDtFechRegistra());
        cs.setInt(10, pomaeestacivilBean.getICantidadModifica());
        cs.setBoolean(11, pomaeestacivilBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  maeestacivilBean omaeestacivilBean = new maeestacivilBean();
  omaeestacivilBean.setCCodMaeEstaCivil(rs.getString("cCodMaeEstaCivil")); 
  omaeestacivilBean.setNvAbreviatura(rs.getString("nvAbreviatura")); 
  omaeestacivilBean.setNvDenominacion(rs.getString("nvDenominacion")); 
  omaeestacivilBean.setNvDescripcion(rs.getString("nvDescripcion")); 
  omaeestacivilBean.setNvObservacion(rs.getString("nvObservacion")); 
  omaeestacivilBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  omaeestacivilBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  omaeestacivilBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  omaeestacivilBean.setBEstado(rs.getBoolean("bEstado")); 
  listamaeestacivilBean.add(omaeestacivilBean);
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
  return listamaeestacivilBean;
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
  * @fnGetmaeestacivilBean, es un metodo que retorna un objeto especifico de maeestacivilBean
  * @param pomaeestacivilBean, Objeto correspondiente a maeestacivilBean
  * @return Retorna el Objeto maeestacivilBean
  * @throws Exception
  */
  public maeestacivilBean fnGetmaeestacivilBean(maeestacivilBean pomaeestacivilBean) throws Exception {
  maeestacivilBean omaeestacivilBean = null;
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maeestacivil_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaeestacivilBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaeestacivilBean.getCCodMaeEstaCivil());
        cs.setString(4, pomaeestacivilBean.getNvAbreviatura());
        cs.setString(5, pomaeestacivilBean.getNvDenominacion());
        cs.setString(6, pomaeestacivilBean.getNvDescripcion());
        cs.setString(7, pomaeestacivilBean.getNvObservacion());
        cs.setInt(8, pomaeestacivilBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaeestacivilBean.getDtFechRegistra());
        cs.setInt(10, pomaeestacivilBean.getICantidadModifica());
        cs.setBoolean(11, pomaeestacivilBean.getBEstado());
        rs = cs.executeQuery();
   while (rs.next()) {
  omaeestacivilBean = new maeestacivilBean();
  omaeestacivilBean.setCCodMaeEstaCivil(rs.getString("cCodMaeEstaCivil")); 
  omaeestacivilBean.setNvAbreviatura(rs.getString("nvAbreviatura")); 
  omaeestacivilBean.setNvDenominacion(rs.getString("nvDenominacion")); 
  omaeestacivilBean.setNvDescripcion(rs.getString("nvDescripcion")); 
  omaeestacivilBean.setNvObservacion(rs.getString("nvObservacion")); 
  omaeestacivilBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  omaeestacivilBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  omaeestacivilBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  omaeestacivilBean.setBEstado(rs.getBoolean("bEstado")); 
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
  return omaeestacivilBean;
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
  * @fnInsertarmaeestacivilBean,  es un metodo que Inserta un  maeestacivilBean
  * @param pomaeestacivilBean, Objeto correspondiente a maeestacivilBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarmaeestacivilBean(maeestacivilBean pomaeestacivilBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maeestacivil_ins(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaeestacivilBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaeestacivilBean.getCCodMaeEstaCivil());
        cs.setString(4, pomaeestacivilBean.getNvAbreviatura());
        cs.setString(5, pomaeestacivilBean.getNvDenominacion());
        cs.setString(6, pomaeestacivilBean.getNvDescripcion());
        cs.setString(7, pomaeestacivilBean.getNvObservacion());
        cs.setInt(8, pomaeestacivilBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaeestacivilBean.getDtFechRegistra());
        cs.setInt(10, pomaeestacivilBean.getICantidadModifica());
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
  * @fnEliminarmaeestacivilBean,  es un metodo que Elimina un  maeestacivilBean
  * @param pomaeestacivilBean, Objeto correspondiente a maeestacivilBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarmaeestacivilBean(maeestacivilBean pomaeestacivilBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maeestacivil_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaeestacivilBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaeestacivilBean.getCCodMaeEstaCivil());
        cs.setString(4, pomaeestacivilBean.getNvAbreviatura());
        cs.setString(5, pomaeestacivilBean.getNvDenominacion());
        cs.setString(6, pomaeestacivilBean.getNvDescripcion());
        cs.setString(7, pomaeestacivilBean.getNvObservacion());
        cs.setInt(8, pomaeestacivilBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaeestacivilBean.getDtFechRegistra());
        cs.setInt(10, pomaeestacivilBean.getICantidadModifica());
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
  * @fnActualizarmaeestacivilBean,  es un metodo que Actualiza un  maeestacivilBean
  * @param pomaeestacivilBean, Objeto correspondiente a maeestacivilBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarmaeestacivilBean(maeestacivilBean pomaeestacivilBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maeestacivil_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaeestacivilBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaeestacivilBean.getCCodMaeEstaCivil());
        cs.setString(4, pomaeestacivilBean.getNvAbreviatura());
        cs.setString(5, pomaeestacivilBean.getNvDenominacion());
        cs.setString(6, pomaeestacivilBean.getNvDescripcion());
        cs.setString(7, pomaeestacivilBean.getNvObservacion());
        cs.setInt(8, pomaeestacivilBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaeestacivilBean.getDtFechRegistra());
        cs.setInt(10, pomaeestacivilBean.getICantidadModifica());
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
