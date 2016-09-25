/*******************************************************************************
 * Descripcion       : Clase que contiene los metodos transaccionales de acceso a datos de vencimiento
 * Creado por        : APP
 * Fecha de Creacion : 22/05/2015 12:08:41
** *****************************************************************************/

package pe.sigmas.datos;

import pe.sigmas.entity.vencimientoBean;
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
    public class vencimientoDAT
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
  * @fnIsvencimientoBean, es un metodo que retorna si existe un vencimientoBean metodo efectivo para validaciones
  * @param povencimientoBean, Objeto correspondiente a vencimientoBean
  * @return Retorna true cuando existe un vencimientoBean, false cuando no existe un vencimientoBean
  * @throws Exception
  */
        public boolean fnIsvencimientoBean (vencimientoBean povencimientoBean) throws Exception 
        {
        vencimientoBean ovencimientoBean = null;
        Connection cn = null ;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_vencimiento_lst(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, povencimientoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, povencimientoBean.getIIdVencimiento());
        cs.setString(4, povencimientoBean.getNvDenominacion());
        cs.setString(5, povencimientoBean.getNvObservacion());
        cs.setInt(6, povencimientoBean.getIIdRegUsuaRegistra());
        cs.setDate(7, povencimientoBean.getDtFechRegistra());
        cs.setInt(8, povencimientoBean.getICantidadModifica());
        cs.setBoolean(9, povencimientoBean.getBEstado());
        rs = cs.executeQuery();
        while (rs.next()) {
        ovencimientoBean = new vencimientoBean();
        ovencimientoBean.setBEstado(rs.getBoolean("iIdVencimiento"));
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
        return ovencimientoBean!= null;
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
  * @fnGetListvencimientoBean, es un metodo que retorna una lista de objetos de vencimientoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param povencimientoBean, Objeto correspondiente a vencimientoBean
  * @return Retorna una lista de objetos vencimientoBean
  * @throws Exception
  */
  public List fnGetListvencimientoBean(vencimientoBean povencimientoBean) throws Exception {
  List list = new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_vencimiento_lst(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, povencimientoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, povencimientoBean.getIIdVencimiento());
        cs.setString(4, povencimientoBean.getNvDenominacion());
        cs.setString(5, povencimientoBean.getNvObservacion());
        cs.setInt(6, povencimientoBean.getIIdRegUsuaRegistra());
        cs.setDate(7, povencimientoBean.getDtFechRegistra());
        cs.setInt(8, povencimientoBean.getICantidadModifica());
        cs.setBoolean(9, povencimientoBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)}; 
  //Object[] obj = {rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5), rs.getInt(6), rs.getBoolean(7)}; 
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
  * @fnGridvencimientoBean, es un metodo que retorna una lista de objetos de vencimientoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param povencimientoBean, Objeto correspondiente a vencimientoBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridvencimientoBean(vencimientoBean povencimientoBean) throws Exception {
  List lista= new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_vencimiento_lst(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, povencimientoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, povencimientoBean.getIIdVencimiento());
        cs.setString(4, povencimientoBean.getNvDenominacion());
        cs.setString(5, povencimientoBean.getNvObservacion());
        cs.setInt(6, povencimientoBean.getIIdRegUsuaRegistra());
        cs.setDate(7, povencimientoBean.getDtFechRegistra());
        cs.setInt(8, povencimientoBean.getICantidadModifica());
        cs.setBoolean(9, povencimientoBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)}; 
  //Object[] obj = {rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5), rs.getInt(6), rs.getBoolean(7)}; 
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
  * @fnAutocompletevencimientoBean, es un metodo que retorna una lista de objetos de vencimientoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param povencimientoBean, Objeto correspondiente a vencimientoBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<vencimientoBean> fnAutocompletevencimientoBean(vencimientoBean povencimientoBean) throws Exception {
  ArrayList<vencimientoBean> listavencimientoBean = new ArrayList<>();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_vencimiento_lst(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, povencimientoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, povencimientoBean.getIIdVencimiento());
        cs.setString(4, povencimientoBean.getNvDenominacion());
        cs.setString(5, povencimientoBean.getNvObservacion());
        cs.setInt(6, povencimientoBean.getIIdRegUsuaRegistra());
        cs.setDate(7, povencimientoBean.getDtFechRegistra());
        cs.setInt(8, povencimientoBean.getICantidadModifica());
        cs.setBoolean(9, povencimientoBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  vencimientoBean ovencimientoBean = new vencimientoBean();
  ovencimientoBean.setIIdVencimiento(rs.getInt("iIdVencimiento")); 
  ovencimientoBean.setNvDenominacion(rs.getString("nvDenominacion")); 
  ovencimientoBean.setNvObservacion(rs.getString("nvObservacion")); 
  ovencimientoBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  ovencimientoBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  ovencimientoBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  ovencimientoBean.setBEstado(rs.getBoolean("bEstado")); 
  listavencimientoBean.add(ovencimientoBean);
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
  return listavencimientoBean;
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
  * @fnGetvencimientoBean, es un metodo que retorna un objeto especifico de vencimientoBean
  * @param povencimientoBean, Objeto correspondiente a vencimientoBean
  * @return Retorna el Objeto vencimientoBean
  * @throws Exception
  */
  public vencimientoBean fnGetvencimientoBean(vencimientoBean povencimientoBean) throws Exception {
  vencimientoBean ovencimientoBean = null;
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_vencimiento_lst(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, povencimientoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, povencimientoBean.getIIdVencimiento());
        cs.setString(4, povencimientoBean.getNvDenominacion());
        cs.setString(5, povencimientoBean.getNvObservacion());
        cs.setInt(6, povencimientoBean.getIIdRegUsuaRegistra());
        cs.setDate(7, povencimientoBean.getDtFechRegistra());
        cs.setInt(8, povencimientoBean.getICantidadModifica());
        cs.setBoolean(9, povencimientoBean.getBEstado());
        rs = cs.executeQuery();
   while (rs.next()) {
  ovencimientoBean = new vencimientoBean();
  ovencimientoBean.setIIdVencimiento(rs.getInt("iIdVencimiento")); 
  ovencimientoBean.setNvDenominacion(rs.getString("nvDenominacion")); 
  ovencimientoBean.setNvObservacion(rs.getString("nvObservacion")); 
  ovencimientoBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  ovencimientoBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  ovencimientoBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  ovencimientoBean.setBEstado(rs.getBoolean("bEstado")); 
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
  return ovencimientoBean;
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
  * @fnInsertarvencimientoBean,  es un metodo que Inserta un  vencimientoBean
  * @param povencimientoBean, Objeto correspondiente a vencimientoBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarvencimientoBean(vencimientoBean povencimientoBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_vencimiento_ins(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, povencimientoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, povencimientoBean.getIIdVencimiento());
        cs.setString(4, povencimientoBean.getNvDenominacion());
        cs.setString(5, povencimientoBean.getNvObservacion());
        cs.setInt(6, povencimientoBean.getIIdRegUsuaRegistra());
        cs.setDate(7, povencimientoBean.getDtFechRegistra());
        cs.setInt(8, povencimientoBean.getICantidadModifica());
        cs.setBoolean(9, true);
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
  * @fnEliminarvencimientoBean,  es un metodo que Elimina un  vencimientoBean
  * @param povencimientoBean, Objeto correspondiente a vencimientoBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarvencimientoBean(vencimientoBean povencimientoBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_vencimiento_upd(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, povencimientoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, povencimientoBean.getIIdVencimiento());
        cs.setString(4, povencimientoBean.getNvDenominacion());
        cs.setString(5, povencimientoBean.getNvObservacion());
        cs.setInt(6, povencimientoBean.getIIdRegUsuaRegistra());
        cs.setDate(7, povencimientoBean.getDtFechRegistra());
        cs.setInt(8, povencimientoBean.getICantidadModifica());
        cs.setBoolean(9, false);
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
  * @fnActualizarvencimientoBean,  es un metodo que Actualiza un  vencimientoBean
  * @param povencimientoBean, Objeto correspondiente a vencimientoBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarvencimientoBean(vencimientoBean povencimientoBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_vencimiento_upd(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, povencimientoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, povencimientoBean.getIIdVencimiento());
        cs.setString(4, povencimientoBean.getNvDenominacion());
        cs.setString(5, povencimientoBean.getNvObservacion());
        cs.setInt(6, povencimientoBean.getIIdRegUsuaRegistra());
        cs.setDate(7, povencimientoBean.getDtFechRegistra());
        cs.setInt(8, povencimientoBean.getICantidadModifica());
        cs.setBoolean(9, true);
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
