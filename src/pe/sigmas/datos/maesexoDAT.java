/*******************************************************************************
 * Descripcion       : Clase que contiene los metodos transaccionales de acceso a datos de maesexo
 * Creado por        : APP
 * Fecha de Creacion : 22/05/2015 12:08:40
** *****************************************************************************/

package pe.sigmas.datos;

import pe.sigmas.entity.maesexoBean;
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
    public class maesexoDAT
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
  * @fnIsmaesexoBean, es un metodo que retorna si existe un maesexoBean metodo efectivo para validaciones
  * @param pomaesexoBean, Objeto correspondiente a maesexoBean
  * @return Retorna true cuando existe un maesexoBean, false cuando no existe un maesexoBean
  * @throws Exception
  */
        public boolean fnIsmaesexoBean (maesexoBean pomaesexoBean) throws Exception 
        {
        maesexoBean omaesexoBean = null;
        Connection cn = null ;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maesexo_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaesexoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaesexoBean.getCCodMaeSexo());
        cs.setString(4, pomaesexoBean.getNvAbreviatura());
        cs.setString(5, pomaesexoBean.getNvDenominacion());
        cs.setString(6, pomaesexoBean.getNvDescripcion());
        cs.setString(7, pomaesexoBean.getNvObservacion());
        cs.setInt(8, pomaesexoBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaesexoBean.getDtFechRegistra());
        cs.setInt(10, pomaesexoBean.getICantidadModifica());
        cs.setBoolean(11, pomaesexoBean.getBEstado());
        rs = cs.executeQuery();
        while (rs.next()) {
        omaesexoBean = new maesexoBean();
        omaesexoBean.setBEstado(rs.getBoolean("cCodMaeSexo"));
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
        return omaesexoBean!= null;
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
  * @fnGetListmaesexoBean, es un metodo que retorna una lista de objetos de maesexoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaesexoBean, Objeto correspondiente a maesexoBean
  * @return Retorna una lista de objetos maesexoBean
  * @throws Exception
  */
  public List fnGetListmaesexoBean(maesexoBean pomaesexoBean) throws Exception {
  List list = new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maesexo_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaesexoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaesexoBean.getCCodMaeSexo());
        cs.setString(4, pomaesexoBean.getNvAbreviatura());
        cs.setString(5, pomaesexoBean.getNvDenominacion());
        cs.setString(6, pomaesexoBean.getNvDescripcion());
        cs.setString(7, pomaesexoBean.getNvObservacion());
        cs.setInt(8, pomaesexoBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaesexoBean.getDtFechRegistra());
        cs.setInt(10, pomaesexoBean.getICantidadModifica());
        cs.setBoolean(11, pomaesexoBean.getBEstado());
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
  * @fnGridmaesexoBean, es un metodo que retorna una lista de objetos de maesexoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaesexoBean, Objeto correspondiente a maesexoBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridmaesexoBean(maesexoBean pomaesexoBean) throws Exception {
  List lista= new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maesexo_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaesexoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaesexoBean.getCCodMaeSexo());
        cs.setString(4, pomaesexoBean.getNvAbreviatura());
        cs.setString(5, pomaesexoBean.getNvDenominacion());
        cs.setString(6, pomaesexoBean.getNvDescripcion());
        cs.setString(7, pomaesexoBean.getNvObservacion());
        cs.setInt(8, pomaesexoBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaesexoBean.getDtFechRegistra());
        cs.setInt(10, pomaesexoBean.getICantidadModifica());
        cs.setBoolean(11, pomaesexoBean.getBEstado());
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
  * @fnAutocompletemaesexoBean, es un metodo que retorna una lista de objetos de maesexoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaesexoBean, Objeto correspondiente a maesexoBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<maesexoBean> fnAutocompletemaesexoBean(maesexoBean pomaesexoBean) throws Exception {
  ArrayList<maesexoBean> listamaesexoBean = new ArrayList<>();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maesexo_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaesexoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaesexoBean.getCCodMaeSexo());
        cs.setString(4, pomaesexoBean.getNvAbreviatura());
        cs.setString(5, pomaesexoBean.getNvDenominacion());
        cs.setString(6, pomaesexoBean.getNvDescripcion());
        cs.setString(7, pomaesexoBean.getNvObservacion());
        cs.setInt(8, pomaesexoBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaesexoBean.getDtFechRegistra());
        cs.setInt(10, pomaesexoBean.getICantidadModifica());
        cs.setBoolean(11, pomaesexoBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  maesexoBean omaesexoBean = new maesexoBean();
  omaesexoBean.setCCodMaeSexo(rs.getString("cCodMaeSexo")); 
  omaesexoBean.setNvAbreviatura(rs.getString("nvAbreviatura")); 
  omaesexoBean.setNvDenominacion(rs.getString("nvDenominacion")); 
  omaesexoBean.setNvDescripcion(rs.getString("nvDescripcion")); 
  omaesexoBean.setNvObservacion(rs.getString("nvObservacion")); 
  omaesexoBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  omaesexoBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  omaesexoBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  omaesexoBean.setBEstado(rs.getBoolean("bEstado")); 
  listamaesexoBean.add(omaesexoBean);
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
  return listamaesexoBean;
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
  * @fnGetmaesexoBean, es un metodo que retorna un objeto especifico de maesexoBean
  * @param pomaesexoBean, Objeto correspondiente a maesexoBean
  * @return Retorna el Objeto maesexoBean
  * @throws Exception
  */
  public maesexoBean fnGetmaesexoBean(maesexoBean pomaesexoBean) throws Exception {
  maesexoBean omaesexoBean = null;
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maesexo_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaesexoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaesexoBean.getCCodMaeSexo());
        cs.setString(4, pomaesexoBean.getNvAbreviatura());
        cs.setString(5, pomaesexoBean.getNvDenominacion());
        cs.setString(6, pomaesexoBean.getNvDescripcion());
        cs.setString(7, pomaesexoBean.getNvObservacion());
        cs.setInt(8, pomaesexoBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaesexoBean.getDtFechRegistra());
        cs.setInt(10, pomaesexoBean.getICantidadModifica());
        cs.setBoolean(11, pomaesexoBean.getBEstado());
        rs = cs.executeQuery();
   while (rs.next()) {
  omaesexoBean = new maesexoBean();
  omaesexoBean.setCCodMaeSexo(rs.getString("cCodMaeSexo")); 
  omaesexoBean.setNvAbreviatura(rs.getString("nvAbreviatura")); 
  omaesexoBean.setNvDenominacion(rs.getString("nvDenominacion")); 
  omaesexoBean.setNvDescripcion(rs.getString("nvDescripcion")); 
  omaesexoBean.setNvObservacion(rs.getString("nvObservacion")); 
  omaesexoBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  omaesexoBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  omaesexoBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  omaesexoBean.setBEstado(rs.getBoolean("bEstado")); 
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
  return omaesexoBean;
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
  * @fnInsertarmaesexoBean,  es un metodo que Inserta un  maesexoBean
  * @param pomaesexoBean, Objeto correspondiente a maesexoBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarmaesexoBean(maesexoBean pomaesexoBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maesexo_ins(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaesexoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaesexoBean.getCCodMaeSexo());
        cs.setString(4, pomaesexoBean.getNvAbreviatura());
        cs.setString(5, pomaesexoBean.getNvDenominacion());
        cs.setString(6, pomaesexoBean.getNvDescripcion());
        cs.setString(7, pomaesexoBean.getNvObservacion());
        cs.setInt(8, pomaesexoBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaesexoBean.getDtFechRegistra());
        cs.setInt(10, pomaesexoBean.getICantidadModifica());
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
  * @fnEliminarmaesexoBean,  es un metodo que Elimina un  maesexoBean
  * @param pomaesexoBean, Objeto correspondiente a maesexoBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarmaesexoBean(maesexoBean pomaesexoBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maesexo_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaesexoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaesexoBean.getCCodMaeSexo());
        cs.setString(4, pomaesexoBean.getNvAbreviatura());
        cs.setString(5, pomaesexoBean.getNvDenominacion());
        cs.setString(6, pomaesexoBean.getNvDescripcion());
        cs.setString(7, pomaesexoBean.getNvObservacion());
        cs.setInt(8, pomaesexoBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaesexoBean.getDtFechRegistra());
        cs.setInt(10, pomaesexoBean.getICantidadModifica());
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
  * @fnActualizarmaesexoBean,  es un metodo que Actualiza un  maesexoBean
  * @param pomaesexoBean, Objeto correspondiente a maesexoBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarmaesexoBean(maesexoBean pomaesexoBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maesexo_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaesexoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaesexoBean.getCCodMaeSexo());
        cs.setString(4, pomaesexoBean.getNvAbreviatura());
        cs.setString(5, pomaesexoBean.getNvDenominacion());
        cs.setString(6, pomaesexoBean.getNvDescripcion());
        cs.setString(7, pomaesexoBean.getNvObservacion());
        cs.setInt(8, pomaesexoBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaesexoBean.getDtFechRegistra());
        cs.setInt(10, pomaesexoBean.getICantidadModifica());
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
