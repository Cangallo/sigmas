/*******************************************************************************
 * Descripcion       : Clase que contiene los metodos transaccionales de acceso a datos de maeestaobligacion
 * Creado por        : APP
 * Fecha de Creacion : 22/05/2015 12:08:40
** *****************************************************************************/

package pe.sigmas.datos;

import pe.sigmas.entity.maeestaobligacionBean;
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
    public class maeestaobligacionDAT
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
  * @fnIsmaeestaobligacionBean, es un metodo que retorna si existe un maeestaobligacionBean metodo efectivo para validaciones
  * @param pomaeestaobligacionBean, Objeto correspondiente a maeestaobligacionBean
  * @return Retorna true cuando existe un maeestaobligacionBean, false cuando no existe un maeestaobligacionBean
  * @throws Exception
  */
        public boolean fnIsmaeestaobligacionBean (maeestaobligacionBean pomaeestaobligacionBean) throws Exception 
        {
        maeestaobligacionBean omaeestaobligacionBean = null;
        Connection cn = null ;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maeestaobligacion_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaeestaobligacionBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaeestaobligacionBean.getCCodMaeEstaObligacion());
        cs.setString(4, pomaeestaobligacionBean.getNvAbreviatura());
        cs.setString(5, pomaeestaobligacionBean.getNvDenominacion());
        cs.setString(6, pomaeestaobligacionBean.getNvDescripcion());
        cs.setString(7, pomaeestaobligacionBean.getNvObservacion());
        cs.setInt(8, pomaeestaobligacionBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaeestaobligacionBean.getDtFechRegistra());
        cs.setInt(10, pomaeestaobligacionBean.getICantidadModifica());
        cs.setBoolean(11, pomaeestaobligacionBean.getBEstado());
        rs = cs.executeQuery();
        while (rs.next()) {
        omaeestaobligacionBean = new maeestaobligacionBean();
        omaeestaobligacionBean.setBEstado(rs.getBoolean("cCodMaeEstaObligacion"));
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
        return omaeestaobligacionBean!= null;
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
  * @fnGetListmaeestaobligacionBean, es un metodo que retorna una lista de objetos de maeestaobligacionBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaeestaobligacionBean, Objeto correspondiente a maeestaobligacionBean
  * @return Retorna una lista de objetos maeestaobligacionBean
  * @throws Exception
  */
  public List fnGetListmaeestaobligacionBean(maeestaobligacionBean pomaeestaobligacionBean) throws Exception {
  List list = new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maeestaobligacion_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaeestaobligacionBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaeestaobligacionBean.getCCodMaeEstaObligacion());
        cs.setString(4, pomaeestaobligacionBean.getNvAbreviatura());
        cs.setString(5, pomaeestaobligacionBean.getNvDenominacion());
        cs.setString(6, pomaeestaobligacionBean.getNvDescripcion());
        cs.setString(7, pomaeestaobligacionBean.getNvObservacion());
        cs.setInt(8, pomaeestaobligacionBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaeestaobligacionBean.getDtFechRegistra());
        cs.setInt(10, pomaeestaobligacionBean.getICantidadModifica());
        cs.setBoolean(11, pomaeestaobligacionBean.getBEstado());
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
  * @fnGridmaeestaobligacionBean, es un metodo que retorna una lista de objetos de maeestaobligacionBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaeestaobligacionBean, Objeto correspondiente a maeestaobligacionBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridmaeestaobligacionBean(maeestaobligacionBean pomaeestaobligacionBean) throws Exception {
  List lista= new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maeestaobligacion_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaeestaobligacionBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaeestaobligacionBean.getCCodMaeEstaObligacion());
        cs.setString(4, pomaeestaobligacionBean.getNvAbreviatura());
        cs.setString(5, pomaeestaobligacionBean.getNvDenominacion());
        cs.setString(6, pomaeestaobligacionBean.getNvDescripcion());
        cs.setString(7, pomaeestaobligacionBean.getNvObservacion());
        cs.setInt(8, pomaeestaobligacionBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaeestaobligacionBean.getDtFechRegistra());
        cs.setInt(10, pomaeestaobligacionBean.getICantidadModifica());
        cs.setBoolean(11, pomaeestaobligacionBean.getBEstado());
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
  * @fnAutocompletemaeestaobligacionBean, es un metodo que retorna una lista de objetos de maeestaobligacionBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaeestaobligacionBean, Objeto correspondiente a maeestaobligacionBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<maeestaobligacionBean> fnAutocompletemaeestaobligacionBean(maeestaobligacionBean pomaeestaobligacionBean) throws Exception {
  ArrayList<maeestaobligacionBean> listamaeestaobligacionBean = new ArrayList<>();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maeestaobligacion_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaeestaobligacionBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaeestaobligacionBean.getCCodMaeEstaObligacion());
        cs.setString(4, pomaeestaobligacionBean.getNvAbreviatura());
        cs.setString(5, pomaeestaobligacionBean.getNvDenominacion());
        cs.setString(6, pomaeestaobligacionBean.getNvDescripcion());
        cs.setString(7, pomaeestaobligacionBean.getNvObservacion());
        cs.setInt(8, pomaeestaobligacionBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaeestaobligacionBean.getDtFechRegistra());
        cs.setInt(10, pomaeestaobligacionBean.getICantidadModifica());
        cs.setBoolean(11, pomaeestaobligacionBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  maeestaobligacionBean omaeestaobligacionBean = new maeestaobligacionBean();
  omaeestaobligacionBean.setCCodMaeEstaObligacion(rs.getString("cCodMaeEstaObligacion")); 
  omaeestaobligacionBean.setNvAbreviatura(rs.getString("nvAbreviatura")); 
  omaeestaobligacionBean.setNvDenominacion(rs.getString("nvDenominacion")); 
  omaeestaobligacionBean.setNvDescripcion(rs.getString("nvDescripcion")); 
  omaeestaobligacionBean.setNvObservacion(rs.getString("nvObservacion")); 
  omaeestaobligacionBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  omaeestaobligacionBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  omaeestaobligacionBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  omaeestaobligacionBean.setBEstado(rs.getBoolean("bEstado")); 
  listamaeestaobligacionBean.add(omaeestaobligacionBean);
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
  return listamaeestaobligacionBean;
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
  * @fnGetmaeestaobligacionBean, es un metodo que retorna un objeto especifico de maeestaobligacionBean
  * @param pomaeestaobligacionBean, Objeto correspondiente a maeestaobligacionBean
  * @return Retorna el Objeto maeestaobligacionBean
  * @throws Exception
  */
  public maeestaobligacionBean fnGetmaeestaobligacionBean(maeestaobligacionBean pomaeestaobligacionBean) throws Exception {
  maeestaobligacionBean omaeestaobligacionBean = null;
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maeestaobligacion_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaeestaobligacionBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaeestaobligacionBean.getCCodMaeEstaObligacion());
        cs.setString(4, pomaeestaobligacionBean.getNvAbreviatura());
        cs.setString(5, pomaeestaobligacionBean.getNvDenominacion());
        cs.setString(6, pomaeestaobligacionBean.getNvDescripcion());
        cs.setString(7, pomaeestaobligacionBean.getNvObservacion());
        cs.setInt(8, pomaeestaobligacionBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaeestaobligacionBean.getDtFechRegistra());
        cs.setInt(10, pomaeestaobligacionBean.getICantidadModifica());
        cs.setBoolean(11, pomaeestaobligacionBean.getBEstado());
        rs = cs.executeQuery();
   while (rs.next()) {
  omaeestaobligacionBean = new maeestaobligacionBean();
  omaeestaobligacionBean.setCCodMaeEstaObligacion(rs.getString("cCodMaeEstaObligacion")); 
  omaeestaobligacionBean.setNvAbreviatura(rs.getString("nvAbreviatura")); 
  omaeestaobligacionBean.setNvDenominacion(rs.getString("nvDenominacion")); 
  omaeestaobligacionBean.setNvDescripcion(rs.getString("nvDescripcion")); 
  omaeestaobligacionBean.setNvObservacion(rs.getString("nvObservacion")); 
  omaeestaobligacionBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  omaeestaobligacionBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  omaeestaobligacionBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  omaeestaobligacionBean.setBEstado(rs.getBoolean("bEstado")); 
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
  return omaeestaobligacionBean;
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
  * @fnInsertarmaeestaobligacionBean,  es un metodo que Inserta un  maeestaobligacionBean
  * @param pomaeestaobligacionBean, Objeto correspondiente a maeestaobligacionBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarmaeestaobligacionBean(maeestaobligacionBean pomaeestaobligacionBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maeestaobligacion_ins(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaeestaobligacionBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaeestaobligacionBean.getCCodMaeEstaObligacion());
        cs.setString(4, pomaeestaobligacionBean.getNvAbreviatura());
        cs.setString(5, pomaeestaobligacionBean.getNvDenominacion());
        cs.setString(6, pomaeestaobligacionBean.getNvDescripcion());
        cs.setString(7, pomaeestaobligacionBean.getNvObservacion());
        cs.setInt(8, pomaeestaobligacionBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaeestaobligacionBean.getDtFechRegistra());
        cs.setInt(10, pomaeestaobligacionBean.getICantidadModifica());
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
  * @fnEliminarmaeestaobligacionBean,  es un metodo que Elimina un  maeestaobligacionBean
  * @param pomaeestaobligacionBean, Objeto correspondiente a maeestaobligacionBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarmaeestaobligacionBean(maeestaobligacionBean pomaeestaobligacionBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maeestaobligacion_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaeestaobligacionBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaeestaobligacionBean.getCCodMaeEstaObligacion());
        cs.setString(4, pomaeestaobligacionBean.getNvAbreviatura());
        cs.setString(5, pomaeestaobligacionBean.getNvDenominacion());
        cs.setString(6, pomaeestaobligacionBean.getNvDescripcion());
        cs.setString(7, pomaeestaobligacionBean.getNvObservacion());
        cs.setInt(8, pomaeestaobligacionBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaeestaobligacionBean.getDtFechRegistra());
        cs.setInt(10, pomaeestaobligacionBean.getICantidadModifica());
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
  * @fnActualizarmaeestaobligacionBean,  es un metodo que Actualiza un  maeestaobligacionBean
  * @param pomaeestaobligacionBean, Objeto correspondiente a maeestaobligacionBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarmaeestaobligacionBean(maeestaobligacionBean pomaeestaobligacionBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maeestaobligacion_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaeestaobligacionBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaeestaobligacionBean.getCCodMaeEstaObligacion());
        cs.setString(4, pomaeestaobligacionBean.getNvAbreviatura());
        cs.setString(5, pomaeestaobligacionBean.getNvDenominacion());
        cs.setString(6, pomaeestaobligacionBean.getNvDescripcion());
        cs.setString(7, pomaeestaobligacionBean.getNvObservacion());
        cs.setInt(8, pomaeestaobligacionBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaeestaobligacionBean.getDtFechRegistra());
        cs.setInt(10, pomaeestaobligacionBean.getICantidadModifica());
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
