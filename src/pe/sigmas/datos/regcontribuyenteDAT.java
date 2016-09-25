/*******************************************************************************
 * Descripcion       : Clase que contiene los metodos transaccionales de acceso a datos de regcontribuyente
 * Creado por        : APP
 * Fecha de Creacion : 22/05/2015 12:08:40
** *****************************************************************************/

package pe.sigmas.datos;

import pe.sigmas.entity.regcontribuyenteBean;
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
    public class regcontribuyenteDAT
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
  * @fnIsregcontribuyenteBean, es un metodo que retorna si existe un regcontribuyenteBean metodo efectivo para validaciones
  * @param poregcontribuyenteBean, Objeto correspondiente a regcontribuyenteBean
  * @return Retorna true cuando existe un regcontribuyenteBean, false cuando no existe un regcontribuyenteBean
  * @throws Exception
  */
        public boolean fnIsregcontribuyenteBean (regcontribuyenteBean poregcontribuyenteBean) throws Exception 
        {
        regcontribuyenteBean oregcontribuyenteBean = null;
        Connection cn = null ;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regcontribuyente_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregcontribuyenteBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, poregcontribuyenteBean.getCCodRegContribuyente());
        cs.setInt(4, poregcontribuyenteBean.getBiIdRegPersona());
        cs.setString(5, poregcontribuyenteBean.getCCodMaeCategoria());
        cs.setDate(6, poregcontribuyenteBean.getDtFechInicio());
        cs.setDate(7, poregcontribuyenteBean.getDtFechFin());
        cs.setBoolean(8, poregcontribuyenteBean.getBIndActivo());
        cs.setString(9, poregcontribuyenteBean.getNvObservacion());
        cs.setInt(10, poregcontribuyenteBean.getIIdRegUsuaRegistra());
        cs.setDate(11, poregcontribuyenteBean.getDtFechRegistra());
        cs.setInt(12, poregcontribuyenteBean.getICantidadModifica());
        cs.setBoolean(13, poregcontribuyenteBean.getBEstado());
        rs = cs.executeQuery();
        while (rs.next()) {
        oregcontribuyenteBean = new regcontribuyenteBean();
        oregcontribuyenteBean.setBEstado(rs.getBoolean("cCodRegContribuyente"));
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
        return oregcontribuyenteBean!= null;
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
  * @fnGetListregcontribuyenteBean, es un metodo que retorna una lista de objetos de regcontribuyenteBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregcontribuyenteBean, Objeto correspondiente a regcontribuyenteBean
  * @return Retorna una lista de objetos regcontribuyenteBean
  * @throws Exception
  */
  public List fnGetListregcontribuyenteBean(regcontribuyenteBean poregcontribuyenteBean) throws Exception {
  List list = new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regcontribuyente_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregcontribuyenteBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, poregcontribuyenteBean.getCCodRegContribuyente());
        cs.setInt(4, poregcontribuyenteBean.getBiIdRegPersona());
        cs.setString(5, poregcontribuyenteBean.getCCodMaeCategoria());
        cs.setDate(6, poregcontribuyenteBean.getDtFechInicio());
        cs.setDate(7, poregcontribuyenteBean.getDtFechFin());
        cs.setBoolean(8, poregcontribuyenteBean.getBIndActivo());
        cs.setString(9, poregcontribuyenteBean.getNvObservacion());
        cs.setInt(10, poregcontribuyenteBean.getIIdRegUsuaRegistra());
        cs.setDate(11, poregcontribuyenteBean.getDtFechRegistra());
        cs.setInt(12, poregcontribuyenteBean.getICantidadModifica());
        cs.setBoolean(13, poregcontribuyenteBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11)}; 
  //Object[] obj = {rs.getString(1), rs.getInt(2), rs.getString(3), rs.getDate(4), rs.getDate(5), rs.getBoolean(6), rs.getString(7), rs.getInt(8), rs.getDate(9), rs.getInt(10), rs.getBoolean(11)}; 
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
  * @fnGridregcontribuyenteBean, es un metodo que retorna una lista de objetos de regcontribuyenteBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregcontribuyenteBean, Objeto correspondiente a regcontribuyenteBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridregcontribuyenteBean(regcontribuyenteBean poregcontribuyenteBean) throws Exception {
  List lista= new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regcontribuyente_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregcontribuyenteBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, poregcontribuyenteBean.getCCodRegContribuyente());
        cs.setInt(4, poregcontribuyenteBean.getBiIdRegPersona());
        cs.setString(5, poregcontribuyenteBean.getCCodMaeCategoria());
        cs.setDate(6, poregcontribuyenteBean.getDtFechInicio());
        cs.setDate(7, poregcontribuyenteBean.getDtFechFin());
        cs.setBoolean(8, poregcontribuyenteBean.getBIndActivo());
        cs.setString(9, poregcontribuyenteBean.getNvObservacion());
        cs.setInt(10, poregcontribuyenteBean.getIIdRegUsuaRegistra());
        cs.setDate(11, poregcontribuyenteBean.getDtFechRegistra());
        cs.setInt(12, poregcontribuyenteBean.getICantidadModifica());
        cs.setBoolean(13, poregcontribuyenteBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)/*, rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11)*/}; 
  //Object[] obj = {rs.getString(1), rs.getInt(2), rs.getString(3), rs.getDate(4), rs.getDate(5), rs.getBoolean(6), rs.getString(7), rs.getInt(8), rs.getDate(9), rs.getInt(10), rs.getBoolean(11)}; 
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
  * @fnAutocompleteregcontribuyenteBean, es un metodo que retorna una lista de objetos de regcontribuyenteBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregcontribuyenteBean, Objeto correspondiente a regcontribuyenteBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<regcontribuyenteBean> fnAutocompleteregcontribuyenteBean(regcontribuyenteBean poregcontribuyenteBean) throws Exception {
  ArrayList<regcontribuyenteBean> listaregcontribuyenteBean = new ArrayList<>();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regcontribuyente_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregcontribuyenteBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, poregcontribuyenteBean.getCCodRegContribuyente());
        cs.setInt(4, poregcontribuyenteBean.getBiIdRegPersona());
        cs.setString(5, poregcontribuyenteBean.getCCodMaeCategoria());
        cs.setDate(6, poregcontribuyenteBean.getDtFechInicio());
        cs.setDate(7, poregcontribuyenteBean.getDtFechFin());
        cs.setBoolean(8, poregcontribuyenteBean.getBIndActivo());
        cs.setString(9, poregcontribuyenteBean.getNvObservacion());
        cs.setInt(10, poregcontribuyenteBean.getIIdRegUsuaRegistra());
        cs.setDate(11, poregcontribuyenteBean.getDtFechRegistra());
        cs.setInt(12, poregcontribuyenteBean.getICantidadModifica());
        cs.setBoolean(13, poregcontribuyenteBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  regcontribuyenteBean oregcontribuyenteBean = new regcontribuyenteBean();
  oregcontribuyenteBean.setCCodRegContribuyente(rs.getString("cCodRegContribuyente")); 
  oregcontribuyenteBean.setBiIdRegPersona(rs.getInt("biIdRegPersona")); 
  oregcontribuyenteBean.setCCodMaeCategoria(rs.getString("cCodMaeCategoria")); 
  oregcontribuyenteBean.setDtFechInicio(rs.getDate("dtFechInicio")); 
  oregcontribuyenteBean.setDtFechFin(rs.getDate("dtFechFin")); 
  oregcontribuyenteBean.setBIndActivo(rs.getBoolean("bIndActivo")); 
  oregcontribuyenteBean.setNvObservacion(rs.getString("nvObservacion")); 
  oregcontribuyenteBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  oregcontribuyenteBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  oregcontribuyenteBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  oregcontribuyenteBean.setBEstado(rs.getBoolean("bEstado")); 
  listaregcontribuyenteBean.add(oregcontribuyenteBean);
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
  return listaregcontribuyenteBean;
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
  * @fnGetregcontribuyenteBean, es un metodo que retorna un objeto especifico de regcontribuyenteBean
  * @param poregcontribuyenteBean, Objeto correspondiente a regcontribuyenteBean
  * @return Retorna el Objeto regcontribuyenteBean
  * @throws Exception
  */
  public regcontribuyenteBean fnGetregcontribuyenteBean(regcontribuyenteBean poregcontribuyenteBean) throws Exception {
  regcontribuyenteBean oregcontribuyenteBean = null;
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regcontribuyente_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregcontribuyenteBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, poregcontribuyenteBean.getCCodRegContribuyente());
        cs.setInt(4, poregcontribuyenteBean.getBiIdRegPersona());
        cs.setString(5, poregcontribuyenteBean.getCCodMaeCategoria());
        cs.setDate(6, poregcontribuyenteBean.getDtFechInicio());
        cs.setDate(7, poregcontribuyenteBean.getDtFechFin());
        cs.setBoolean(8, poregcontribuyenteBean.getBIndActivo());
        cs.setString(9, poregcontribuyenteBean.getNvObservacion());
        cs.setInt(10, poregcontribuyenteBean.getIIdRegUsuaRegistra());
        cs.setDate(11, poregcontribuyenteBean.getDtFechRegistra());
        cs.setInt(12, poregcontribuyenteBean.getICantidadModifica());
        cs.setBoolean(13, poregcontribuyenteBean.getBEstado());
        rs = cs.executeQuery();
   while (rs.next()) {
  oregcontribuyenteBean = new regcontribuyenteBean();
  oregcontribuyenteBean.setCCodRegContribuyente(rs.getString("cCodRegContribuyente")); 
  oregcontribuyenteBean.setBiIdRegPersona(rs.getInt("biIdRegPersona")); 
  oregcontribuyenteBean.setCCodMaeCategoria(rs.getString("cCodMaeCategoria")); 
  oregcontribuyenteBean.setDtFechInicio(rs.getDate("dtFechInicio")); 
  oregcontribuyenteBean.setDtFechFin(rs.getDate("dtFechFin")); 
  oregcontribuyenteBean.setBIndActivo(rs.getBoolean("bIndActivo")); 
  oregcontribuyenteBean.setNvObservacion(rs.getString("nvObservacion")); 
  oregcontribuyenteBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  oregcontribuyenteBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  oregcontribuyenteBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  oregcontribuyenteBean.setBEstado(rs.getBoolean("bEstado")); 
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
  return oregcontribuyenteBean;
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
  * @fnInsertarregcontribuyenteBean,  es un metodo que Inserta un  regcontribuyenteBean
  * @param poregcontribuyenteBean, Objeto correspondiente a regcontribuyenteBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarregcontribuyenteBean(regcontribuyenteBean poregcontribuyenteBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regcontribuyente_ins(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregcontribuyenteBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, poregcontribuyenteBean.getCCodRegContribuyente());
        cs.setInt(4, poregcontribuyenteBean.getBiIdRegPersona());
        cs.setString(5, poregcontribuyenteBean.getCCodMaeCategoria());
        cs.setDate(6, poregcontribuyenteBean.getDtFechInicio());
        cs.setDate(7, poregcontribuyenteBean.getDtFechFin());
        cs.setBoolean(8, poregcontribuyenteBean.getBIndActivo());
        cs.setString(9, poregcontribuyenteBean.getNvObservacion());
        cs.setInt(10, poregcontribuyenteBean.getIIdRegUsuaRegistra());
        cs.setDate(11, poregcontribuyenteBean.getDtFechRegistra());
        cs.setInt(12, poregcontribuyenteBean.getICantidadModifica());
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
 * -- Fecha creacion          : 22/05/2015 12:08:40
 * -- ¿Esta siendo Utilizado? : NO
 * -- Modificado por          : <Analista Programador>
 * -- Fecha Actualizacion     : <Fecha de Actualizacion>
 * --
 * **************************************************************************************************/
  /**
  * @fnEliminarregcontribuyenteBean,  es un metodo que Elimina un  regcontribuyenteBean
  * @param poregcontribuyenteBean, Objeto correspondiente a regcontribuyenteBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarregcontribuyenteBean(regcontribuyenteBean poregcontribuyenteBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regcontribuyente_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregcontribuyenteBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, poregcontribuyenteBean.getCCodRegContribuyente());
        cs.setInt(4, poregcontribuyenteBean.getBiIdRegPersona());
        cs.setString(5, poregcontribuyenteBean.getCCodMaeCategoria());
        cs.setDate(6, poregcontribuyenteBean.getDtFechInicio());
        cs.setDate(7, poregcontribuyenteBean.getDtFechFin());
        cs.setBoolean(8, poregcontribuyenteBean.getBIndActivo());
        cs.setString(9, poregcontribuyenteBean.getNvObservacion());
        cs.setInt(10, poregcontribuyenteBean.getIIdRegUsuaRegistra());
        cs.setDate(11, poregcontribuyenteBean.getDtFechRegistra());
        cs.setInt(12, poregcontribuyenteBean.getICantidadModifica());
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
 * -- Fecha creacion          : 22/05/2015 12:08:40
 * -- ¿Esta siendo Utilizado? : NO
 * -- Modificado por          : <Analista Programador>
 * -- Fecha Actualizacion     : <Fecha de Actualizacion>
 * --
 * **************************************************************************************************/
  /**
  * @fnActualizarregcontribuyenteBean,  es un metodo que Actualiza un  regcontribuyenteBean
  * @param poregcontribuyenteBean, Objeto correspondiente a regcontribuyenteBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarregcontribuyenteBean(regcontribuyenteBean poregcontribuyenteBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regcontribuyente_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregcontribuyenteBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, poregcontribuyenteBean.getCCodRegContribuyente());
        cs.setInt(4, poregcontribuyenteBean.getBiIdRegPersona());
        cs.setString(5, poregcontribuyenteBean.getCCodMaeCategoria());
        cs.setDate(6, poregcontribuyenteBean.getDtFechInicio());
        cs.setDate(7, poregcontribuyenteBean.getDtFechFin());
        cs.setBoolean(8, poregcontribuyenteBean.getBIndActivo());
        cs.setString(9, poregcontribuyenteBean.getNvObservacion());
        cs.setInt(10, poregcontribuyenteBean.getIIdRegUsuaRegistra());
        cs.setDate(11, poregcontribuyenteBean.getDtFechRegistra());
        cs.setInt(12, poregcontribuyenteBean.getICantidadModifica());
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
