/*******************************************************************************
 * Descripcion       : Clase que contiene los metodos transaccionales de acceso a datos de regrecibo
 * Creado por        : APP
 * Fecha de Creacion : 22/05/2015 12:08:41
** *****************************************************************************/

package pe.sigmas.datos;

import pe.sigmas.entity.regreciboBean;
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
    public class regreciboDAT
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
  * @fnIsregreciboBean, es un metodo que retorna si existe un regreciboBean metodo efectivo para validaciones
  * @param poregreciboBean, Objeto correspondiente a regreciboBean
  * @return Retorna true cuando existe un regreciboBean, false cuando no existe un regreciboBean
  * @throws Exception
  */
        public boolean fnIsregreciboBean (regreciboBean poregreciboBean) throws Exception 
        {
        regreciboBean oregreciboBean = null;
        Connection cn = null ;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regrecibo_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregreciboBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregreciboBean.getBiIdRegRecibo());
        cs.setInt(4, poregreciboBean.getIIdEjercicio());
        cs.setString(5, poregreciboBean.getCCodRegContribuyente());
        cs.setInt(6, poregreciboBean.getIIdVencimiento());
        cs.setString(7, poregreciboBean.getNvNumRecibo());
        cs.setString(8, poregreciboBean.getNvObservacion());
        cs.setInt(9, poregreciboBean.getIIdRegUsuaRegistra());
        cs.setDate(10, poregreciboBean.getDtFechRegistra());
        cs.setInt(11, poregreciboBean.getICantidadModifica());
        cs.setBoolean(12, poregreciboBean.getBEstado());
        rs = cs.executeQuery();
        while (rs.next()) {
        oregreciboBean = new regreciboBean();
        oregreciboBean.setBEstado(rs.getBoolean("biIdRegRecibo"));
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
        return oregreciboBean!= null;
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
  * @fnGetListregreciboBean, es un metodo que retorna una lista de objetos de regreciboBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregreciboBean, Objeto correspondiente a regreciboBean
  * @return Retorna una lista de objetos regreciboBean
  * @throws Exception
  */
  public List fnGetListregreciboBean(regreciboBean poregreciboBean) throws Exception {
  List list = new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regrecibo_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregreciboBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregreciboBean.getBiIdRegRecibo());
        cs.setInt(4, poregreciboBean.getIIdEjercicio());
        cs.setString(5, poregreciboBean.getCCodRegContribuyente());
        cs.setInt(6, poregreciboBean.getIIdVencimiento());
        cs.setString(7, poregreciboBean.getNvNumRecibo());
        cs.setString(8, poregreciboBean.getNvObservacion());
        cs.setInt(9, poregreciboBean.getIIdRegUsuaRegistra());
        cs.setDate(10, poregreciboBean.getDtFechRegistra());
        cs.setInt(11, poregreciboBean.getICantidadModifica());
        cs.setBoolean(12, poregreciboBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10)}; 
  //Object[] obj = {rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getDate(8), rs.getInt(9), rs.getBoolean(10)}; 
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
  * @fnGridregreciboBean, es un metodo que retorna una lista de objetos de regreciboBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregreciboBean, Objeto correspondiente a regreciboBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridregreciboBean(regreciboBean poregreciboBean) throws Exception {
  List lista= new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regrecibo_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregreciboBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregreciboBean.getBiIdRegRecibo());
        cs.setInt(4, poregreciboBean.getIIdEjercicio());
        cs.setString(5, poregreciboBean.getCCodRegContribuyente());
        cs.setInt(6, poregreciboBean.getIIdVencimiento());
        cs.setString(7, poregreciboBean.getNvNumRecibo());
        cs.setString(8, poregreciboBean.getNvObservacion());
        cs.setInt(9, poregreciboBean.getIIdRegUsuaRegistra());
        cs.setDate(10, poregreciboBean.getDtFechRegistra());
        cs.setInt(11, poregreciboBean.getICantidadModifica());
        cs.setBoolean(12, poregreciboBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10)}; 
  //Object[] obj = {rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getDate(8), rs.getInt(9), rs.getBoolean(10)}; 
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
  * @fnAutocompleteregreciboBean, es un metodo que retorna una lista de objetos de regreciboBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregreciboBean, Objeto correspondiente a regreciboBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<regreciboBean> fnAutocompleteregreciboBean(regreciboBean poregreciboBean) throws Exception {
  ArrayList<regreciboBean> listaregreciboBean = new ArrayList<>();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regrecibo_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregreciboBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregreciboBean.getBiIdRegRecibo());
        cs.setInt(4, poregreciboBean.getIIdEjercicio());
        cs.setString(5, poregreciboBean.getCCodRegContribuyente());
        cs.setInt(6, poregreciboBean.getIIdVencimiento());
        cs.setString(7, poregreciboBean.getNvNumRecibo());
        cs.setString(8, poregreciboBean.getNvObservacion());
        cs.setInt(9, poregreciboBean.getIIdRegUsuaRegistra());
        cs.setDate(10, poregreciboBean.getDtFechRegistra());
        cs.setInt(11, poregreciboBean.getICantidadModifica());
        cs.setBoolean(12, poregreciboBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  regreciboBean oregreciboBean = new regreciboBean();
  oregreciboBean.setBiIdRegRecibo(rs.getInt("biIdRegRecibo")); 
  oregreciboBean.setIIdEjercicio(rs.getInt("iIdEjercicio")); 
  oregreciboBean.setCCodRegContribuyente(rs.getString("cCodRegContribuyente")); 
  oregreciboBean.setIIdVencimiento(rs.getInt("iIdVencimiento")); 
  oregreciboBean.setNvNumRecibo(rs.getString("nvNumRecibo")); 
  oregreciboBean.setNvObservacion(rs.getString("nvObservacion")); 
  oregreciboBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  oregreciboBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  oregreciboBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  oregreciboBean.setBEstado(rs.getBoolean("bEstado")); 
  listaregreciboBean.add(oregreciboBean);
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
  return listaregreciboBean;
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
  * @fnGetregreciboBean, es un metodo que retorna un objeto especifico de regreciboBean
  * @param poregreciboBean, Objeto correspondiente a regreciboBean
  * @return Retorna el Objeto regreciboBean
  * @throws Exception
  */
  public regreciboBean fnGetregreciboBean(regreciboBean poregreciboBean) throws Exception {
  regreciboBean oregreciboBean = null;
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regrecibo_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregreciboBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregreciboBean.getBiIdRegRecibo());
        cs.setInt(4, poregreciboBean.getIIdEjercicio());
        cs.setString(5, poregreciboBean.getCCodRegContribuyente());
        cs.setInt(6, poregreciboBean.getIIdVencimiento());
        cs.setString(7, poregreciboBean.getNvNumRecibo());
        cs.setString(8, poregreciboBean.getNvObservacion());
        cs.setInt(9, poregreciboBean.getIIdRegUsuaRegistra());
        cs.setDate(10, poregreciboBean.getDtFechRegistra());
        cs.setInt(11, poregreciboBean.getICantidadModifica());
        cs.setBoolean(12, poregreciboBean.getBEstado());
        rs = cs.executeQuery();
   while (rs.next()) {
  oregreciboBean = new regreciboBean();
  oregreciboBean.setBiIdRegRecibo(rs.getInt("biIdRegRecibo")); 
  oregreciboBean.setIIdEjercicio(rs.getInt("iIdEjercicio")); 
  oregreciboBean.setCCodRegContribuyente(rs.getString("cCodRegContribuyente")); 
  oregreciboBean.setIIdVencimiento(rs.getInt("iIdVencimiento")); 
  oregreciboBean.setNvNumRecibo(rs.getString("nvNumRecibo")); 
  oregreciboBean.setNvObservacion(rs.getString("nvObservacion")); 
  oregreciboBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  oregreciboBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  oregreciboBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  oregreciboBean.setBEstado(rs.getBoolean("bEstado")); 
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
  return oregreciboBean;
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
  * @fnInsertarregreciboBean,  es un metodo que Inserta un  regreciboBean
  * @param poregreciboBean, Objeto correspondiente a regreciboBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarregreciboBean(regreciboBean poregreciboBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regrecibo_ins(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregreciboBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregreciboBean.getBiIdRegRecibo());
        cs.setInt(4, poregreciboBean.getIIdEjercicio());
        cs.setString(5, poregreciboBean.getCCodRegContribuyente());
        cs.setInt(6, poregreciboBean.getIIdVencimiento());
        cs.setString(7, poregreciboBean.getNvNumRecibo());
        cs.setString(8, poregreciboBean.getNvObservacion());
        cs.setInt(9, poregreciboBean.getIIdRegUsuaRegistra());
        cs.setDate(10, poregreciboBean.getDtFechRegistra());
        cs.setInt(11, poregreciboBean.getICantidadModifica());
        cs.setBoolean(12, true);
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
  * @fnEliminarregreciboBean,  es un metodo que Elimina un  regreciboBean
  * @param poregreciboBean, Objeto correspondiente a regreciboBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarregreciboBean(regreciboBean poregreciboBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regrecibo_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregreciboBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregreciboBean.getBiIdRegRecibo());
        cs.setInt(4, poregreciboBean.getIIdEjercicio());
        cs.setString(5, poregreciboBean.getCCodRegContribuyente());
        cs.setInt(6, poregreciboBean.getIIdVencimiento());
        cs.setString(7, poregreciboBean.getNvNumRecibo());
        cs.setString(8, poregreciboBean.getNvObservacion());
        cs.setInt(9, poregreciboBean.getIIdRegUsuaRegistra());
        cs.setDate(10, poregreciboBean.getDtFechRegistra());
        cs.setInt(11, poregreciboBean.getICantidadModifica());
        cs.setBoolean(12, false);
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
  * @fnActualizarregreciboBean,  es un metodo que Actualiza un  regreciboBean
  * @param poregreciboBean, Objeto correspondiente a regreciboBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarregreciboBean(regreciboBean poregreciboBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regrecibo_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregreciboBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregreciboBean.getBiIdRegRecibo());
        cs.setInt(4, poregreciboBean.getIIdEjercicio());
        cs.setString(5, poregreciboBean.getCCodRegContribuyente());
        cs.setInt(6, poregreciboBean.getIIdVencimiento());
        cs.setString(7, poregreciboBean.getNvNumRecibo());
        cs.setString(8, poregreciboBean.getNvObservacion());
        cs.setInt(9, poregreciboBean.getIIdRegUsuaRegistra());
        cs.setDate(10, poregreciboBean.getDtFechRegistra());
        cs.setInt(11, poregreciboBean.getICantidadModifica());
        cs.setBoolean(12, true);
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
