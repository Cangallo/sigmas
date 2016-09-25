/*******************************************************************************
 * Descripcion       : Clase que contiene los metodos transaccionales de acceso a datos de maecategoria
 * Creado por        : APP
 * Fecha de Creacion : 22/05/2015 12:08:40
** *****************************************************************************/

package pe.sigmas.datos;

import pe.sigmas.entity.maecategoriaBean;
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
    public class maecategoriaDAT
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
  * @fnIsmaecategoriaBean, es un metodo que retorna si existe un maecategoriaBean metodo efectivo para validaciones
  * @param pomaecategoriaBean, Objeto correspondiente a maecategoriaBean
  * @return Retorna true cuando existe un maecategoriaBean, false cuando no existe un maecategoriaBean
  * @throws Exception
  */
        public boolean fnIsmaecategoriaBean (maecategoriaBean pomaecategoriaBean) throws Exception 
        {
        maecategoriaBean omaecategoriaBean = null;
        Connection cn = null ;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maecategoria_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaecategoriaBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaecategoriaBean.getCCodMaeCategoria());
        cs.setString(4, pomaecategoriaBean.getNvAbreviatura());
        cs.setString(5, pomaecategoriaBean.getNvDenominacion());
        cs.setString(6, pomaecategoriaBean.getNvDescripcion());
        cs.setString(7, pomaecategoriaBean.getNvObservacion());
        cs.setInt(8, pomaecategoriaBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaecategoriaBean.getDtFechRegistra());
        cs.setInt(10, pomaecategoriaBean.getICantidadModifica());
        cs.setBoolean(11, pomaecategoriaBean.getBEstado());
        rs = cs.executeQuery();
        while (rs.next()) {
        omaecategoriaBean = new maecategoriaBean();
        omaecategoriaBean.setBEstado(rs.getBoolean("cCodMaeCategoria"));
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
        return omaecategoriaBean!= null;
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
  * @fnGetListmaecategoriaBean, es un metodo que retorna una lista de objetos de maecategoriaBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaecategoriaBean, Objeto correspondiente a maecategoriaBean
  * @return Retorna una lista de objetos maecategoriaBean
  * @throws Exception
  */
  public List fnGetListmaecategoriaBean(maecategoriaBean pomaecategoriaBean) throws Exception {
  List list = new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maecategoria_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaecategoriaBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaecategoriaBean.getCCodMaeCategoria());
        cs.setString(4, pomaecategoriaBean.getNvAbreviatura());
        cs.setString(5, pomaecategoriaBean.getNvDenominacion());
        cs.setString(6, pomaecategoriaBean.getNvDescripcion());
        cs.setString(7, pomaecategoriaBean.getNvObservacion());
        cs.setInt(8, pomaecategoriaBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaecategoriaBean.getDtFechRegistra());
        cs.setInt(10, pomaecategoriaBean.getICantidadModifica());
        cs.setBoolean(11, pomaecategoriaBean.getBEstado());
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
  * @fnGridmaecategoriaBean, es un metodo que retorna una lista de objetos de maecategoriaBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaecategoriaBean, Objeto correspondiente a maecategoriaBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridmaecategoriaBean(maecategoriaBean pomaecategoriaBean) throws Exception {
  List lista= new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maecategoria_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaecategoriaBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaecategoriaBean.getCCodMaeCategoria());
        cs.setString(4, pomaecategoriaBean.getNvAbreviatura());
        cs.setString(5, pomaecategoriaBean.getNvDenominacion());
        cs.setString(6, pomaecategoriaBean.getNvDescripcion());
        cs.setString(7, pomaecategoriaBean.getNvObservacion());
        cs.setInt(8, pomaecategoriaBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaecategoriaBean.getDtFechRegistra());
        cs.setInt(10, pomaecategoriaBean.getICantidadModifica());
        cs.setBoolean(11, pomaecategoriaBean.getBEstado());
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
  * @fnAutocompletemaecategoriaBean, es un metodo que retorna una lista de objetos de maecategoriaBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaecategoriaBean, Objeto correspondiente a maecategoriaBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<maecategoriaBean> fnAutocompletemaecategoriaBean(maecategoriaBean pomaecategoriaBean) throws Exception {
  ArrayList<maecategoriaBean> listamaecategoriaBean = new ArrayList<>();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maecategoria_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaecategoriaBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaecategoriaBean.getCCodMaeCategoria());
        cs.setString(4, pomaecategoriaBean.getNvAbreviatura());
        cs.setString(5, pomaecategoriaBean.getNvDenominacion());
        cs.setString(6, pomaecategoriaBean.getNvDescripcion());
        cs.setString(7, pomaecategoriaBean.getNvObservacion());
        cs.setInt(8, pomaecategoriaBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaecategoriaBean.getDtFechRegistra());
        cs.setInt(10, pomaecategoriaBean.getICantidadModifica());
        cs.setBoolean(11, pomaecategoriaBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  maecategoriaBean omaecategoriaBean = new maecategoriaBean();
  omaecategoriaBean.setCCodMaeCategoria(rs.getString("cCodMaeCategoria")); 
  omaecategoriaBean.setNvAbreviatura(rs.getString("nvAbreviatura")); 
  omaecategoriaBean.setNvDenominacion(rs.getString("nvDenominacion")); 
  omaecategoriaBean.setNvDescripcion(rs.getString("nvDescripcion")); 
  omaecategoriaBean.setNvObservacion(rs.getString("nvObservacion")); 
  omaecategoriaBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  omaecategoriaBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  omaecategoriaBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  omaecategoriaBean.setBEstado(rs.getBoolean("bEstado")); 
  listamaecategoriaBean.add(omaecategoriaBean);
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
  return listamaecategoriaBean;
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
  * @fnGetmaecategoriaBean, es un metodo que retorna un objeto especifico de maecategoriaBean
  * @param pomaecategoriaBean, Objeto correspondiente a maecategoriaBean
  * @return Retorna el Objeto maecategoriaBean
  * @throws Exception
  */
  public maecategoriaBean fnGetmaecategoriaBean(maecategoriaBean pomaecategoriaBean) throws Exception {
  maecategoriaBean omaecategoriaBean = null;
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maecategoria_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaecategoriaBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaecategoriaBean.getCCodMaeCategoria());
        cs.setString(4, pomaecategoriaBean.getNvAbreviatura());
        cs.setString(5, pomaecategoriaBean.getNvDenominacion());
        cs.setString(6, pomaecategoriaBean.getNvDescripcion());
        cs.setString(7, pomaecategoriaBean.getNvObservacion());
        cs.setInt(8, pomaecategoriaBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaecategoriaBean.getDtFechRegistra());
        cs.setInt(10, pomaecategoriaBean.getICantidadModifica());
        cs.setBoolean(11, pomaecategoriaBean.getBEstado());
        rs = cs.executeQuery();
   while (rs.next()) {
  omaecategoriaBean = new maecategoriaBean();
  omaecategoriaBean.setCCodMaeCategoria(rs.getString("cCodMaeCategoria")); 
  omaecategoriaBean.setNvAbreviatura(rs.getString("nvAbreviatura")); 
  omaecategoriaBean.setNvDenominacion(rs.getString("nvDenominacion")); 
  omaecategoriaBean.setNvDescripcion(rs.getString("nvDescripcion")); 
  omaecategoriaBean.setNvObservacion(rs.getString("nvObservacion")); 
  omaecategoriaBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  omaecategoriaBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  omaecategoriaBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  omaecategoriaBean.setBEstado(rs.getBoolean("bEstado")); 
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
  return omaecategoriaBean;
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
  * @fnInsertarmaecategoriaBean,  es un metodo que Inserta un  maecategoriaBean
  * @param pomaecategoriaBean, Objeto correspondiente a maecategoriaBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarmaecategoriaBean(maecategoriaBean pomaecategoriaBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maecategoria_ins(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaecategoriaBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaecategoriaBean.getCCodMaeCategoria());
        cs.setString(4, pomaecategoriaBean.getNvAbreviatura());
        cs.setString(5, pomaecategoriaBean.getNvDenominacion());
        cs.setString(6, pomaecategoriaBean.getNvDescripcion());
        cs.setString(7, pomaecategoriaBean.getNvObservacion());
        cs.setInt(8, pomaecategoriaBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaecategoriaBean.getDtFechRegistra());
        cs.setInt(10, pomaecategoriaBean.getICantidadModifica());
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
  * @fnEliminarmaecategoriaBean,  es un metodo que Elimina un  maecategoriaBean
  * @param pomaecategoriaBean, Objeto correspondiente a maecategoriaBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarmaecategoriaBean(maecategoriaBean pomaecategoriaBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maecategoria_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaecategoriaBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaecategoriaBean.getCCodMaeCategoria());
        cs.setString(4, pomaecategoriaBean.getNvAbreviatura());
        cs.setString(5, pomaecategoriaBean.getNvDenominacion());
        cs.setString(6, pomaecategoriaBean.getNvDescripcion());
        cs.setString(7, pomaecategoriaBean.getNvObservacion());
        cs.setInt(8, pomaecategoriaBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaecategoriaBean.getDtFechRegistra());
        cs.setInt(10, pomaecategoriaBean.getICantidadModifica());
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
  * @fnActualizarmaecategoriaBean,  es un metodo que Actualiza un  maecategoriaBean
  * @param pomaecategoriaBean, Objeto correspondiente a maecategoriaBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarmaecategoriaBean(maecategoriaBean pomaecategoriaBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maecategoria_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaecategoriaBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaecategoriaBean.getCCodMaeCategoria());
        cs.setString(4, pomaecategoriaBean.getNvAbreviatura());
        cs.setString(5, pomaecategoriaBean.getNvDenominacion());
        cs.setString(6, pomaecategoriaBean.getNvDescripcion());
        cs.setString(7, pomaecategoriaBean.getNvObservacion());
        cs.setInt(8, pomaecategoriaBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaecategoriaBean.getDtFechRegistra());
        cs.setInt(10, pomaecategoriaBean.getICantidadModifica());
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
