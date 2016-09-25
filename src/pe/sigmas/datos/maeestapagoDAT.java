/*******************************************************************************
 * Descripcion       : Clase que contiene los metodos transaccionales de acceso a datos de maeestapago
 * Creado por        : APP
 * Fecha de Creacion : 22/05/2015 12:08:40
** *****************************************************************************/

package pe.sigmas.datos;

import pe.sigmas.entity.maeestapagoBean;
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
    public class maeestapagoDAT
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
  * @fnIsmaeestapagoBean, es un metodo que retorna si existe un maeestapagoBean metodo efectivo para validaciones
  * @param pomaeestapagoBean, Objeto correspondiente a maeestapagoBean
  * @return Retorna true cuando existe un maeestapagoBean, false cuando no existe un maeestapagoBean
  * @throws Exception
  */
        public boolean fnIsmaeestapagoBean (maeestapagoBean pomaeestapagoBean) throws Exception 
        {
        maeestapagoBean omaeestapagoBean = null;
        Connection cn = null ;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maeestapago_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaeestapagoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaeestapagoBean.getCCodMaeEstaPago());
        cs.setString(4, pomaeestapagoBean.getNvAbreviatura());
        cs.setString(5, pomaeestapagoBean.getNvDenominacion());
        cs.setString(6, pomaeestapagoBean.getNvDescripcion());
        cs.setString(7, pomaeestapagoBean.getNvObservacion());
        cs.setInt(8, pomaeestapagoBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaeestapagoBean.getDtFechRegistra());
        cs.setInt(10, pomaeestapagoBean.getICantidadModifica());
        cs.setBoolean(11, pomaeestapagoBean.getBEstado());
        rs = cs.executeQuery();
        while (rs.next()) {
        omaeestapagoBean = new maeestapagoBean();
        omaeestapagoBean.setBEstado(rs.getBoolean("cCodMaeEstaPago"));
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
        return omaeestapagoBean!= null;
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
  * @fnGetListmaeestapagoBean, es un metodo que retorna una lista de objetos de maeestapagoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaeestapagoBean, Objeto correspondiente a maeestapagoBean
  * @return Retorna una lista de objetos maeestapagoBean
  * @throws Exception
  */
  public List fnGetListmaeestapagoBean(maeestapagoBean pomaeestapagoBean) throws Exception {
  List list = new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maeestapago_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaeestapagoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaeestapagoBean.getCCodMaeEstaPago());
        cs.setString(4, pomaeestapagoBean.getNvAbreviatura());
        cs.setString(5, pomaeestapagoBean.getNvDenominacion());
        cs.setString(6, pomaeestapagoBean.getNvDescripcion());
        cs.setString(7, pomaeestapagoBean.getNvObservacion());
        cs.setInt(8, pomaeestapagoBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaeestapagoBean.getDtFechRegistra());
        cs.setInt(10, pomaeestapagoBean.getICantidadModifica());
        cs.setBoolean(11, pomaeestapagoBean.getBEstado());
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
  * @fnGridmaeestapagoBean, es un metodo que retorna una lista de objetos de maeestapagoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaeestapagoBean, Objeto correspondiente a maeestapagoBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridmaeestapagoBean(maeestapagoBean pomaeestapagoBean) throws Exception {
  List lista= new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maeestapago_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaeestapagoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaeestapagoBean.getCCodMaeEstaPago());
        cs.setString(4, pomaeestapagoBean.getNvAbreviatura());
        cs.setString(5, pomaeestapagoBean.getNvDenominacion());
        cs.setString(6, pomaeestapagoBean.getNvDescripcion());
        cs.setString(7, pomaeestapagoBean.getNvObservacion());
        cs.setInt(8, pomaeestapagoBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaeestapagoBean.getDtFechRegistra());
        cs.setInt(10, pomaeestapagoBean.getICantidadModifica());
        cs.setBoolean(11, pomaeestapagoBean.getBEstado());
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
  * @fnAutocompletemaeestapagoBean, es un metodo que retorna una lista de objetos de maeestapagoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaeestapagoBean, Objeto correspondiente a maeestapagoBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<maeestapagoBean> fnAutocompletemaeestapagoBean(maeestapagoBean pomaeestapagoBean) throws Exception {
  ArrayList<maeestapagoBean> listamaeestapagoBean = new ArrayList<>();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maeestapago_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaeestapagoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaeestapagoBean.getCCodMaeEstaPago());
        cs.setString(4, pomaeestapagoBean.getNvAbreviatura());
        cs.setString(5, pomaeestapagoBean.getNvDenominacion());
        cs.setString(6, pomaeestapagoBean.getNvDescripcion());
        cs.setString(7, pomaeestapagoBean.getNvObservacion());
        cs.setInt(8, pomaeestapagoBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaeestapagoBean.getDtFechRegistra());
        cs.setInt(10, pomaeestapagoBean.getICantidadModifica());
        cs.setBoolean(11, pomaeestapagoBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  maeestapagoBean omaeestapagoBean = new maeestapagoBean();
  omaeestapagoBean.setCCodMaeEstaPago(rs.getString("cCodMaeEstaPago")); 
  omaeestapagoBean.setNvAbreviatura(rs.getString("nvAbreviatura")); 
  omaeestapagoBean.setNvDenominacion(rs.getString("nvDenominacion")); 
  omaeestapagoBean.setNvDescripcion(rs.getString("nvDescripcion")); 
  omaeestapagoBean.setNvObservacion(rs.getString("nvObservacion")); 
  omaeestapagoBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  omaeestapagoBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  omaeestapagoBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  omaeestapagoBean.setBEstado(rs.getBoolean("bEstado")); 
  listamaeestapagoBean.add(omaeestapagoBean);
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
  return listamaeestapagoBean;
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
  * @fnGetmaeestapagoBean, es un metodo que retorna un objeto especifico de maeestapagoBean
  * @param pomaeestapagoBean, Objeto correspondiente a maeestapagoBean
  * @return Retorna el Objeto maeestapagoBean
  * @throws Exception
  */
  public maeestapagoBean fnGetmaeestapagoBean(maeestapagoBean pomaeestapagoBean) throws Exception {
  maeestapagoBean omaeestapagoBean = null;
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maeestapago_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaeestapagoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaeestapagoBean.getCCodMaeEstaPago());
        cs.setString(4, pomaeestapagoBean.getNvAbreviatura());
        cs.setString(5, pomaeestapagoBean.getNvDenominacion());
        cs.setString(6, pomaeestapagoBean.getNvDescripcion());
        cs.setString(7, pomaeestapagoBean.getNvObservacion());
        cs.setInt(8, pomaeestapagoBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaeestapagoBean.getDtFechRegistra());
        cs.setInt(10, pomaeestapagoBean.getICantidadModifica());
        cs.setBoolean(11, pomaeestapagoBean.getBEstado());
        rs = cs.executeQuery();
   while (rs.next()) {
  omaeestapagoBean = new maeestapagoBean();
  omaeestapagoBean.setCCodMaeEstaPago(rs.getString("cCodMaeEstaPago")); 
  omaeestapagoBean.setNvAbreviatura(rs.getString("nvAbreviatura")); 
  omaeestapagoBean.setNvDenominacion(rs.getString("nvDenominacion")); 
  omaeestapagoBean.setNvDescripcion(rs.getString("nvDescripcion")); 
  omaeestapagoBean.setNvObservacion(rs.getString("nvObservacion")); 
  omaeestapagoBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  omaeestapagoBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  omaeestapagoBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  omaeestapagoBean.setBEstado(rs.getBoolean("bEstado")); 
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
  return omaeestapagoBean;
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
  * @fnInsertarmaeestapagoBean,  es un metodo que Inserta un  maeestapagoBean
  * @param pomaeestapagoBean, Objeto correspondiente a maeestapagoBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarmaeestapagoBean(maeestapagoBean pomaeestapagoBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maeestapago_ins(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaeestapagoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaeestapagoBean.getCCodMaeEstaPago());
        cs.setString(4, pomaeestapagoBean.getNvAbreviatura());
        cs.setString(5, pomaeestapagoBean.getNvDenominacion());
        cs.setString(6, pomaeestapagoBean.getNvDescripcion());
        cs.setString(7, pomaeestapagoBean.getNvObservacion());
        cs.setInt(8, pomaeestapagoBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaeestapagoBean.getDtFechRegistra());
        cs.setInt(10, pomaeestapagoBean.getICantidadModifica());
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
  * @fnEliminarmaeestapagoBean,  es un metodo que Elimina un  maeestapagoBean
  * @param pomaeestapagoBean, Objeto correspondiente a maeestapagoBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarmaeestapagoBean(maeestapagoBean pomaeestapagoBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maeestapago_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaeestapagoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaeestapagoBean.getCCodMaeEstaPago());
        cs.setString(4, pomaeestapagoBean.getNvAbreviatura());
        cs.setString(5, pomaeestapagoBean.getNvDenominacion());
        cs.setString(6, pomaeestapagoBean.getNvDescripcion());
        cs.setString(7, pomaeestapagoBean.getNvObservacion());
        cs.setInt(8, pomaeestapagoBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaeestapagoBean.getDtFechRegistra());
        cs.setInt(10, pomaeestapagoBean.getICantidadModifica());
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
  * @fnActualizarmaeestapagoBean,  es un metodo que Actualiza un  maeestapagoBean
  * @param pomaeestapagoBean, Objeto correspondiente a maeestapagoBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarmaeestapagoBean(maeestapagoBean pomaeestapagoBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maeestapago_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaeestapagoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaeestapagoBean.getCCodMaeEstaPago());
        cs.setString(4, pomaeestapagoBean.getNvAbreviatura());
        cs.setString(5, pomaeestapagoBean.getNvDenominacion());
        cs.setString(6, pomaeestapagoBean.getNvDescripcion());
        cs.setString(7, pomaeestapagoBean.getNvObservacion());
        cs.setInt(8, pomaeestapagoBean.getIIdRegUsuaRegistra());
        cs.setDate(9, pomaeestapagoBean.getDtFechRegistra());
        cs.setInt(10, pomaeestapagoBean.getICantidadModifica());
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
