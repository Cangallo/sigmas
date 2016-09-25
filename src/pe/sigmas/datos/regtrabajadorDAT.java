/*******************************************************************************
 * Descripcion       : Clase que contiene los metodos transaccionales de acceso a datos de regtrabajador
 * Creado por        : APP
 * Fecha de Creacion : 22/05/2015 12:08:41
** *****************************************************************************/

package pe.sigmas.datos;

import pe.sigmas.entity.regtrabajadorBean;
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
    public class regtrabajadorDAT
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
  * @fnIsregtrabajadorBean, es un metodo que retorna si existe un regtrabajadorBean metodo efectivo para validaciones
  * @param poregtrabajadorBean, Objeto correspondiente a regtrabajadorBean
  * @return Retorna true cuando existe un regtrabajadorBean, false cuando no existe un regtrabajadorBean
  * @throws Exception
  */
        public boolean fnIsregtrabajadorBean (regtrabajadorBean poregtrabajadorBean) throws Exception 
        {
        regtrabajadorBean oregtrabajadorBean = null;
        Connection cn = null ;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regtrabajador_lst(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregtrabajadorBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, poregtrabajadorBean.getCCodRegTrabajador());
        cs.setInt(4, poregtrabajadorBean.getBiIdRegPersona());
        cs.setString(5, poregtrabajadorBean.getNvObservacion());
        cs.setInt(6, poregtrabajadorBean.getIIdRegUsuaRegistra());
        cs.setDate(7, poregtrabajadorBean.getDtFechRegistra());
        cs.setInt(8, poregtrabajadorBean.getICantidadModifica());
        cs.setBoolean(9, poregtrabajadorBean.getBEstado());
        rs = cs.executeQuery();
        while (rs.next()) {
        oregtrabajadorBean = new regtrabajadorBean();
        oregtrabajadorBean.setBEstado(rs.getBoolean("cCodRegTrabajador"));
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
        return oregtrabajadorBean!= null;
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
  * @fnGetListregtrabajadorBean, es un metodo que retorna una lista de objetos de regtrabajadorBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregtrabajadorBean, Objeto correspondiente a regtrabajadorBean
  * @return Retorna una lista de objetos regtrabajadorBean
  * @throws Exception
  */
  public List fnGetListregtrabajadorBean(regtrabajadorBean poregtrabajadorBean) throws Exception {
  List list = new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regtrabajador_lst(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregtrabajadorBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, poregtrabajadorBean.getCCodRegTrabajador());
        cs.setInt(4, poregtrabajadorBean.getBiIdRegPersona());
        cs.setString(5, poregtrabajadorBean.getNvObservacion());
        cs.setInt(6, poregtrabajadorBean.getIIdRegUsuaRegistra());
        cs.setDate(7, poregtrabajadorBean.getDtFechRegistra());
        cs.setInt(8, poregtrabajadorBean.getICantidadModifica());
        cs.setBoolean(9, poregtrabajadorBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)}; 
  //Object[] obj = {rs.getString(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getDate(5), rs.getInt(6), rs.getBoolean(7)}; 
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
  * @fnGridregtrabajadorBean, es un metodo que retorna una lista de objetos de regtrabajadorBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregtrabajadorBean, Objeto correspondiente a regtrabajadorBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridregtrabajadorBean(regtrabajadorBean poregtrabajadorBean) throws Exception {
  List lista= new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regtrabajador_lst(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregtrabajadorBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, poregtrabajadorBean.getCCodRegTrabajador());
        cs.setInt(4, poregtrabajadorBean.getBiIdRegPersona());
        cs.setString(5, poregtrabajadorBean.getNvObservacion());
        cs.setInt(6, poregtrabajadorBean.getIIdRegUsuaRegistra());
        cs.setDate(7, poregtrabajadorBean.getDtFechRegistra());
        cs.setInt(8, poregtrabajadorBean.getICantidadModifica());
        cs.setBoolean(9, poregtrabajadorBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)}; 
  //Object[] obj = {rs.getString(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getDate(5), rs.getInt(6), rs.getBoolean(7)}; 
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
  * @fnAutocompleteregtrabajadorBean, es un metodo que retorna una lista de objetos de regtrabajadorBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregtrabajadorBean, Objeto correspondiente a regtrabajadorBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<regtrabajadorBean> fnAutocompleteregtrabajadorBean(regtrabajadorBean poregtrabajadorBean) throws Exception {
  ArrayList<regtrabajadorBean> listaregtrabajadorBean = new ArrayList<>();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regtrabajador_lst(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregtrabajadorBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, poregtrabajadorBean.getCCodRegTrabajador());
        cs.setInt(4, poregtrabajadorBean.getBiIdRegPersona());
        cs.setString(5, poregtrabajadorBean.getNvObservacion());
        cs.setInt(6, poregtrabajadorBean.getIIdRegUsuaRegistra());
        cs.setDate(7, poregtrabajadorBean.getDtFechRegistra());
        cs.setInt(8, poregtrabajadorBean.getICantidadModifica());
        cs.setBoolean(9, poregtrabajadorBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  regtrabajadorBean oregtrabajadorBean = new regtrabajadorBean();
  oregtrabajadorBean.setCCodRegTrabajador(rs.getString("cCodRegTrabajador")); 
  oregtrabajadorBean.setBiIdRegPersona(rs.getInt("biIdRegPersona")); 
  oregtrabajadorBean.setNvObservacion(rs.getString("nvObservacion")); 
  oregtrabajadorBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  oregtrabajadorBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  oregtrabajadorBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  oregtrabajadorBean.setBEstado(rs.getBoolean("bEstado")); 
  listaregtrabajadorBean.add(oregtrabajadorBean);
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
  return listaregtrabajadorBean;
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
  * @fnGetregtrabajadorBean, es un metodo que retorna un objeto especifico de regtrabajadorBean
  * @param poregtrabajadorBean, Objeto correspondiente a regtrabajadorBean
  * @return Retorna el Objeto regtrabajadorBean
  * @throws Exception
  */
  public regtrabajadorBean fnGetregtrabajadorBean(regtrabajadorBean poregtrabajadorBean) throws Exception {
  regtrabajadorBean oregtrabajadorBean = null;
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regtrabajador_lst(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregtrabajadorBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, poregtrabajadorBean.getCCodRegTrabajador());
        cs.setInt(4, poregtrabajadorBean.getBiIdRegPersona());
        cs.setString(5, poregtrabajadorBean.getNvObservacion());
        cs.setInt(6, poregtrabajadorBean.getIIdRegUsuaRegistra());
        cs.setDate(7, poregtrabajadorBean.getDtFechRegistra());
        cs.setInt(8, poregtrabajadorBean.getICantidadModifica());
        cs.setBoolean(9, poregtrabajadorBean.getBEstado());
        rs = cs.executeQuery();
   while (rs.next()) {
  oregtrabajadorBean = new regtrabajadorBean();
  oregtrabajadorBean.setCCodRegTrabajador(rs.getString("cCodRegTrabajador")); 
  oregtrabajadorBean.setBiIdRegPersona(rs.getInt("biIdRegPersona")); 
  oregtrabajadorBean.setNvObservacion(rs.getString("nvObservacion")); 
  oregtrabajadorBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  oregtrabajadorBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  oregtrabajadorBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  oregtrabajadorBean.setBEstado(rs.getBoolean("bEstado")); 
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
  return oregtrabajadorBean;
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
  * @fnInsertarregtrabajadorBean,  es un metodo que Inserta un  regtrabajadorBean
  * @param poregtrabajadorBean, Objeto correspondiente a regtrabajadorBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarregtrabajadorBean(regtrabajadorBean poregtrabajadorBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regtrabajador_ins(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregtrabajadorBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, poregtrabajadorBean.getCCodRegTrabajador());
        cs.setInt(4, poregtrabajadorBean.getBiIdRegPersona());
        cs.setString(5, poregtrabajadorBean.getNvObservacion());
        cs.setInt(6, poregtrabajadorBean.getIIdRegUsuaRegistra());
        cs.setDate(7, poregtrabajadorBean.getDtFechRegistra());
        cs.setInt(8, poregtrabajadorBean.getICantidadModifica());
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
  * @fnEliminarregtrabajadorBean,  es un metodo que Elimina un  regtrabajadorBean
  * @param poregtrabajadorBean, Objeto correspondiente a regtrabajadorBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarregtrabajadorBean(regtrabajadorBean poregtrabajadorBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regtrabajador_upd(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregtrabajadorBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, poregtrabajadorBean.getCCodRegTrabajador());
        cs.setInt(4, poregtrabajadorBean.getBiIdRegPersona());
        cs.setString(5, poregtrabajadorBean.getNvObservacion());
        cs.setInt(6, poregtrabajadorBean.getIIdRegUsuaRegistra());
        cs.setDate(7, poregtrabajadorBean.getDtFechRegistra());
        cs.setInt(8, poregtrabajadorBean.getICantidadModifica());
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
  * @fnActualizarregtrabajadorBean,  es un metodo que Actualiza un  regtrabajadorBean
  * @param poregtrabajadorBean, Objeto correspondiente a regtrabajadorBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarregtrabajadorBean(regtrabajadorBean poregtrabajadorBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regtrabajador_upd(?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregtrabajadorBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, poregtrabajadorBean.getCCodRegTrabajador());
        cs.setInt(4, poregtrabajadorBean.getBiIdRegPersona());
        cs.setString(5, poregtrabajadorBean.getNvObservacion());
        cs.setInt(6, poregtrabajadorBean.getIIdRegUsuaRegistra());
        cs.setDate(7, poregtrabajadorBean.getDtFechRegistra());
        cs.setInt(8, poregtrabajadorBean.getICantidadModifica());
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
