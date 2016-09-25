/*******************************************************************************
 * Descripcion       : Clase que contiene los metodos transaccionales de acceso a datos de regpersona
 * Creado por        : APP
 * Fecha de Creacion : 22/05/2015 12:08:41
** *****************************************************************************/

package pe.sigmas.datos;

import pe.sigmas.entity.regpersonaBean;
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
    public class regpersonaDAT
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
  * @fnIsregpersonaBean, es un metodo que retorna si existe un regpersonaBean metodo efectivo para validaciones
  * @param poregpersonaBean, Objeto correspondiente a regpersonaBean
  * @return Retorna true cuando existe un regpersonaBean, false cuando no existe un regpersonaBean
  * @throws Exception
  */
        public boolean fnIsregpersonaBean (regpersonaBean poregpersonaBean) throws Exception 
        {
        regpersonaBean oregpersonaBean = null;
        Connection cn = null ;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regpersona_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregpersonaBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregpersonaBean.getBiIdRegPersona());
        cs.setString(4, poregpersonaBean.getCCodMaeEstaCivil());
        cs.setString(5, poregpersonaBean.getCCodMaeTipoPersona());
        cs.setString(6, poregpersonaBean.getCCodMaeSexo());
        cs.setString(7, poregpersonaBean.getNvNombre());
        cs.setString(8, poregpersonaBean.getNvApePaterno());
        cs.setString(9, poregpersonaBean.getNvApeMaterno());
        cs.setString(10, poregpersonaBean.getNvRazoSocial());
        cs.setString(11, poregpersonaBean.getNvNumDocumento());
        cs.setString(12, poregpersonaBean.getNvTeleFijo());
        cs.setString(13, poregpersonaBean.getNvTeleMovil());
        cs.setString(14, poregpersonaBean.getNvDomiProcesal());
        cs.setString(15, poregpersonaBean.getNvRpm());
        cs.setString(16, poregpersonaBean.getNvEmail());
        cs.setDate(17, poregpersonaBean.getDtFechNacimiento());
        cs.setString(18, poregpersonaBean.getNvObservacion());
        cs.setInt(19, poregpersonaBean.getIIdRegUsuaRegistra());
        cs.setDate(20, poregpersonaBean.getDtFechRegistra());
        cs.setInt(21, poregpersonaBean.getICantidadModifica());
        cs.setBoolean(22, poregpersonaBean.getBEstado());
        rs = cs.executeQuery();
        while (rs.next()) {
        oregpersonaBean = new regpersonaBean();
        oregpersonaBean.setBEstado(rs.getBoolean("biIdRegPersona"));
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
        return oregpersonaBean!= null;
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
  * @fnGetListregpersonaBean, es un metodo que retorna una lista de objetos de regpersonaBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregpersonaBean, Objeto correspondiente a regpersonaBean
  * @return Retorna una lista de objetos regpersonaBean
  * @throws Exception
  */
  public List fnGetListregpersonaBean(regpersonaBean poregpersonaBean) throws Exception {
  List list = new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regpersona_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregpersonaBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregpersonaBean.getBiIdRegPersona());
        cs.setString(4, poregpersonaBean.getCCodMaeEstaCivil());
        cs.setString(5, poregpersonaBean.getCCodMaeTipoPersona());
        cs.setString(6, poregpersonaBean.getCCodMaeSexo());
        cs.setString(7, poregpersonaBean.getNvNombre());
        cs.setString(8, poregpersonaBean.getNvApePaterno());
        cs.setString(9, poregpersonaBean.getNvApeMaterno());
        cs.setString(10, poregpersonaBean.getNvRazoSocial());
        cs.setString(11, poregpersonaBean.getNvNumDocumento());
        cs.setString(12, poregpersonaBean.getNvTeleFijo());
        cs.setString(13, poregpersonaBean.getNvTeleMovil());
        cs.setString(14, poregpersonaBean.getNvDomiProcesal());
        cs.setString(15, poregpersonaBean.getNvRpm());
        cs.setString(16, poregpersonaBean.getNvEmail());
        cs.setDate(17, poregpersonaBean.getDtFechNacimiento());
        cs.setString(18, poregpersonaBean.getNvObservacion());
        cs.setInt(19, poregpersonaBean.getIIdRegUsuaRegistra());
        cs.setDate(20, poregpersonaBean.getDtFechRegistra());
        cs.setInt(21, poregpersonaBean.getICantidadModifica());
        cs.setBoolean(22, poregpersonaBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20)}; 
  //Object[] obj = {rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getDate(15), rs.getString(16), rs.getInt(17), rs.getDate(18), rs.getInt(19), rs.getBoolean(20)}; 
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
  * @fnGridregpersonaBean, es un metodo que retorna una lista de objetos de regpersonaBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregpersonaBean, Objeto correspondiente a regpersonaBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridregpersonaBean(regpersonaBean poregpersonaBean) throws Exception {
  List lista= new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regpersona_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregpersonaBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregpersonaBean.getBiIdRegPersona());
        cs.setString(4, poregpersonaBean.getCCodMaeEstaCivil());
        cs.setString(5, poregpersonaBean.getCCodMaeTipoPersona());
        cs.setString(6, poregpersonaBean.getCCodMaeSexo());
        cs.setString(7, poregpersonaBean.getNvNombre());
        cs.setString(8, poregpersonaBean.getNvApePaterno());
        cs.setString(9, poregpersonaBean.getNvApeMaterno());
        cs.setString(10, poregpersonaBean.getNvRazoSocial());
        cs.setString(11, poregpersonaBean.getNvNumDocumento());
        cs.setString(12, poregpersonaBean.getNvTeleFijo());
        cs.setString(13, poregpersonaBean.getNvTeleMovil());
        cs.setString(14, poregpersonaBean.getNvDomiProcesal());
        cs.setString(15, poregpersonaBean.getNvRpm());
        cs.setString(16, poregpersonaBean.getNvEmail());
        cs.setDate(17, poregpersonaBean.getDtFechNacimiento());
        cs.setString(18, poregpersonaBean.getNvObservacion());
        cs.setInt(19, poregpersonaBean.getIIdRegUsuaRegistra());
        cs.setDate(20, poregpersonaBean.getDtFechRegistra());
        cs.setInt(21, poregpersonaBean.getICantidadModifica());
        cs.setBoolean(22, poregpersonaBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20)}; 
  //Object[] obj = {rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getDate(15), rs.getString(16), rs.getInt(17), rs.getDate(18), rs.getInt(19), rs.getBoolean(20)}; 
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
  * @fnAutocompleteregpersonaBean, es un metodo que retorna una lista de objetos de regpersonaBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregpersonaBean, Objeto correspondiente a regpersonaBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<regpersonaBean> fnAutocompleteregpersonaBean(regpersonaBean poregpersonaBean) throws Exception {
  ArrayList<regpersonaBean> listaregpersonaBean = new ArrayList<>();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regpersona_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregpersonaBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregpersonaBean.getBiIdRegPersona());
        cs.setString(4, poregpersonaBean.getCCodMaeEstaCivil());
        cs.setString(5, poregpersonaBean.getCCodMaeTipoPersona());
        cs.setString(6, poregpersonaBean.getCCodMaeSexo());
        cs.setString(7, poregpersonaBean.getNvNombre());
        cs.setString(8, poregpersonaBean.getNvApePaterno());
        cs.setString(9, poregpersonaBean.getNvApeMaterno());
        cs.setString(10, poregpersonaBean.getNvRazoSocial());
        cs.setString(11, poregpersonaBean.getNvNumDocumento());
        cs.setString(12, poregpersonaBean.getNvTeleFijo());
        cs.setString(13, poregpersonaBean.getNvTeleMovil());
        cs.setString(14, poregpersonaBean.getNvDomiProcesal());
        cs.setString(15, poregpersonaBean.getNvRpm());
        cs.setString(16, poregpersonaBean.getNvEmail());
        cs.setDate(17, poregpersonaBean.getDtFechNacimiento());
        cs.setString(18, poregpersonaBean.getNvObservacion());
        cs.setInt(19, poregpersonaBean.getIIdRegUsuaRegistra());
        cs.setDate(20, poregpersonaBean.getDtFechRegistra());
        cs.setInt(21, poregpersonaBean.getICantidadModifica());
        cs.setBoolean(22, poregpersonaBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  regpersonaBean oregpersonaBean = new regpersonaBean();
  oregpersonaBean.setBiIdRegPersona(rs.getInt("biIdRegPersona")); 
  oregpersonaBean.setCCodMaeEstaCivil(rs.getString("cCodMaeEstaCivil")); 
  oregpersonaBean.setCCodMaeTipoPersona(rs.getString("cCodMaeTipoPersona")); 
  oregpersonaBean.setCCodMaeSexo(rs.getString("cCodMaeSexo")); 
  oregpersonaBean.setNvNombre(rs.getString("nvNombre")); 
  oregpersonaBean.setNvApePaterno(rs.getString("nvApePaterno")); 
  oregpersonaBean.setNvApeMaterno(rs.getString("nvApeMaterno")); 
  oregpersonaBean.setNvRazoSocial(rs.getString("nvRazoSocial")); 
  oregpersonaBean.setNvNumDocumento(rs.getString("nvNumDocumento")); 
  oregpersonaBean.setNvTeleFijo(rs.getString("nvTeleFijo")); 
  oregpersonaBean.setNvTeleMovil(rs.getString("nvTeleMovil")); 
  oregpersonaBean.setNvDomiProcesal(rs.getString("nvDomiProcesal")); 
  oregpersonaBean.setNvRpm(rs.getString("nvRpm")); 
  oregpersonaBean.setNvEmail(rs.getString("nvEmail")); 
  oregpersonaBean.setDtFechNacimiento(rs.getDate("dtFechNacimiento")); 
  oregpersonaBean.setNvObservacion(rs.getString("nvObservacion")); 
  oregpersonaBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  oregpersonaBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  oregpersonaBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  oregpersonaBean.setBEstado(rs.getBoolean("bEstado")); 
  listaregpersonaBean.add(oregpersonaBean);
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
  return listaregpersonaBean;
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
  * @fnGetregpersonaBean, es un metodo que retorna un objeto especifico de regpersonaBean
  * @param poregpersonaBean, Objeto correspondiente a regpersonaBean
  * @return Retorna el Objeto regpersonaBean
  * @throws Exception
  */
  public regpersonaBean fnGetregpersonaBean(regpersonaBean poregpersonaBean) throws Exception {
  regpersonaBean oregpersonaBean = null;
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regpersona_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregpersonaBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregpersonaBean.getBiIdRegPersona());
        cs.setString(4, poregpersonaBean.getCCodMaeEstaCivil());
        cs.setString(5, poregpersonaBean.getCCodMaeTipoPersona());
        cs.setString(6, poregpersonaBean.getCCodMaeSexo());
        cs.setString(7, poregpersonaBean.getNvNombre());
        cs.setString(8, poregpersonaBean.getNvApePaterno());
        cs.setString(9, poregpersonaBean.getNvApeMaterno());
        cs.setString(10, poregpersonaBean.getNvRazoSocial());
        cs.setString(11, poregpersonaBean.getNvNumDocumento());
        cs.setString(12, poregpersonaBean.getNvTeleFijo());
        cs.setString(13, poregpersonaBean.getNvTeleMovil());
        cs.setString(14, poregpersonaBean.getNvDomiProcesal());
        cs.setString(15, poregpersonaBean.getNvRpm());
        cs.setString(16, poregpersonaBean.getNvEmail());
        cs.setDate(17, poregpersonaBean.getDtFechNacimiento());
        cs.setString(18, poregpersonaBean.getNvObservacion());
        cs.setInt(19, poregpersonaBean.getIIdRegUsuaRegistra());
        cs.setDate(20, poregpersonaBean.getDtFechRegistra());
        cs.setInt(21, poregpersonaBean.getICantidadModifica());
        cs.setBoolean(22, poregpersonaBean.getBEstado());
        rs = cs.executeQuery();
   while (rs.next()) {
  oregpersonaBean = new regpersonaBean();
  oregpersonaBean.setBiIdRegPersona(rs.getInt("biIdRegPersona")); 
  oregpersonaBean.setCCodMaeEstaCivil(rs.getString("cCodMaeEstaCivil")); 
  oregpersonaBean.setCCodMaeTipoPersona(rs.getString("cCodMaeTipoPersona")); 
  oregpersonaBean.setCCodMaeSexo(rs.getString("cCodMaeSexo")); 
  oregpersonaBean.setNvNombre(rs.getString("nvNombre")); 
  oregpersonaBean.setNvApePaterno(rs.getString("nvApePaterno")); 
  oregpersonaBean.setNvApeMaterno(rs.getString("nvApeMaterno")); 
  oregpersonaBean.setNvRazoSocial(rs.getString("nvRazoSocial")); 
  oregpersonaBean.setNvNumDocumento(rs.getString("nvNumDocumento")); 
  oregpersonaBean.setNvTeleFijo(rs.getString("nvTeleFijo")); 
  oregpersonaBean.setNvTeleMovil(rs.getString("nvTeleMovil")); 
  oregpersonaBean.setNvDomiProcesal(rs.getString("nvDomiProcesal")); 
  oregpersonaBean.setNvRpm(rs.getString("nvRpm")); 
  oregpersonaBean.setNvEmail(rs.getString("nvEmail")); 
  oregpersonaBean.setDtFechNacimiento(rs.getDate("dtFechNacimiento")); 
  oregpersonaBean.setNvObservacion(rs.getString("nvObservacion")); 
  oregpersonaBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  oregpersonaBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  oregpersonaBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  oregpersonaBean.setBEstado(rs.getBoolean("bEstado")); 
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
  return oregpersonaBean;
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
  * @fnInsertarregpersonaBean,  es un metodo que Inserta un  regpersonaBean
  * @param poregpersonaBean, Objeto correspondiente a regpersonaBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarregpersonaBean(regpersonaBean poregpersonaBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regpersona_ins(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregpersonaBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregpersonaBean.getBiIdRegPersona());
        cs.setString(4, poregpersonaBean.getCCodMaeEstaCivil());
        cs.setString(5, poregpersonaBean.getCCodMaeTipoPersona());
        cs.setString(6, poregpersonaBean.getCCodMaeSexo());
        cs.setString(7, poregpersonaBean.getNvNombre());
        cs.setString(8, poregpersonaBean.getNvApePaterno());
        cs.setString(9, poregpersonaBean.getNvApeMaterno());
        cs.setString(10, poregpersonaBean.getNvRazoSocial());
        cs.setString(11, poregpersonaBean.getNvNumDocumento());
        cs.setString(12, poregpersonaBean.getNvTeleFijo());
        cs.setString(13, poregpersonaBean.getNvTeleMovil());
        cs.setString(14, poregpersonaBean.getNvDomiProcesal());
        cs.setString(15, poregpersonaBean.getNvRpm());
        cs.setString(16, poregpersonaBean.getNvEmail());
        cs.setDate(17, poregpersonaBean.getDtFechNacimiento());
        cs.setString(18, poregpersonaBean.getNvObservacion());
        cs.setInt(19, poregpersonaBean.getIIdRegUsuaRegistra());
        cs.setDate(20, poregpersonaBean.getDtFechRegistra());
        cs.setInt(21, poregpersonaBean.getICantidadModifica());
        cs.setBoolean(22, true);
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
  * @fnEliminarregpersonaBean,  es un metodo que Elimina un  regpersonaBean
  * @param poregpersonaBean, Objeto correspondiente a regpersonaBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarregpersonaBean(regpersonaBean poregpersonaBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regpersona_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregpersonaBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregpersonaBean.getBiIdRegPersona());
        cs.setString(4, poregpersonaBean.getCCodMaeEstaCivil());
        cs.setString(5, poregpersonaBean.getCCodMaeTipoPersona());
        cs.setString(6, poregpersonaBean.getCCodMaeSexo());
        cs.setString(7, poregpersonaBean.getNvNombre());
        cs.setString(8, poregpersonaBean.getNvApePaterno());
        cs.setString(9, poregpersonaBean.getNvApeMaterno());
        cs.setString(10, poregpersonaBean.getNvRazoSocial());
        cs.setString(11, poregpersonaBean.getNvNumDocumento());
        cs.setString(12, poregpersonaBean.getNvTeleFijo());
        cs.setString(13, poregpersonaBean.getNvTeleMovil());
        cs.setString(14, poregpersonaBean.getNvDomiProcesal());
        cs.setString(15, poregpersonaBean.getNvRpm());
        cs.setString(16, poregpersonaBean.getNvEmail());
        cs.setDate(17, poregpersonaBean.getDtFechNacimiento());
        cs.setString(18, poregpersonaBean.getNvObservacion());
        cs.setInt(19, poregpersonaBean.getIIdRegUsuaRegistra());
        cs.setDate(20, poregpersonaBean.getDtFechRegistra());
        cs.setInt(21, poregpersonaBean.getICantidadModifica());
        cs.setBoolean(22, false);
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
  * @fnActualizarregpersonaBean,  es un metodo que Actualiza un  regpersonaBean
  * @param poregpersonaBean, Objeto correspondiente a regpersonaBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarregpersonaBean(regpersonaBean poregpersonaBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regpersona_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregpersonaBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregpersonaBean.getBiIdRegPersona());
        cs.setString(4, poregpersonaBean.getCCodMaeEstaCivil());
        cs.setString(5, poregpersonaBean.getCCodMaeTipoPersona());
        cs.setString(6, poregpersonaBean.getCCodMaeSexo());
        cs.setString(7, poregpersonaBean.getNvNombre());
        cs.setString(8, poregpersonaBean.getNvApePaterno());
        cs.setString(9, poregpersonaBean.getNvApeMaterno());
        cs.setString(10, poregpersonaBean.getNvRazoSocial());
        cs.setString(11, poregpersonaBean.getNvNumDocumento());
        cs.setString(12, poregpersonaBean.getNvTeleFijo());
        cs.setString(13, poregpersonaBean.getNvTeleMovil());
        cs.setString(14, poregpersonaBean.getNvDomiProcesal());
        cs.setString(15, poregpersonaBean.getNvRpm());
        cs.setString(16, poregpersonaBean.getNvEmail());
        cs.setDate(17, poregpersonaBean.getDtFechNacimiento());
        cs.setString(18, poregpersonaBean.getNvObservacion());
        cs.setInt(19, poregpersonaBean.getIIdRegUsuaRegistra());
        cs.setDate(20, poregpersonaBean.getDtFechRegistra());
        cs.setInt(21, poregpersonaBean.getICantidadModifica());
        cs.setBoolean(22, true);
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
  
  public String fnBuscarPersona(int codigoContri) throws Exception {
  regpersonaBean oregpersonaBean = null;
  
  Connection cn = null;
  String nombre =null;
  //ResultSet rs = null;
        CallableStatement cs = null;
        try {
        
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_BuscarPersona(?, ?)}");
        cs.setInt(1, codigoContri);
        cs.registerOutParameter(2, java.sql.Types.VARCHAR);
        cs.executeQuery();
       nombre=cs.getString(2);
       System.out.println("\nIntroduce el ID del alumno::::::::::::::::::::::."+nombre);
  // while (rs.next()) {
  //oregpersonaBean.setNvRazoSocial(nombre); 

  //}
  cn.commit();
  cn.setAutoCommit(true);
  } catch (SQLException ex) {
  cn.rollback();
  ex.printStackTrace();
  } finally {
  //rs.close();
  //rs = null;
  cn.close();
  cn = null;
  }
  return nombre;
  }
  
  
 public String fnInsertarCorte(int codigo1,double mora1,String observacion) throws Exception {
 String resultado = null;
 boolean estado=true;
 String  fechafin= null;
  Connection cn = null;
  
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_Regcorte(?, ?, ? )}");
        cs.setInt(1,codigo1);
        cs.setDouble(2,mora1);
        cs.setString(3,observacion);
        cs.execute();
        resultado = "SE REGISTRO CORRECTAMENTE";
  cs.close();
  cs = null;
  cn.commit();
  cn.setAutoCommit(true);
  } catch (SQLException ex) {
  cn.rollback();
  ex.printStackTrace();
  resultado ="NO SE REGISTRO CORRECTAMENTE" ;
  } finally {
   cn.close();
  cn = null;
  }
   return resultado;
  }
 
 public String fnInsertarRecoenxion(int codigo1,double mora1,String observacion) throws Exception {
    String resultado = null;
    boolean estado=true;
    String  fechafin= null;
    Connection cn = null;
  
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_reconexion(?, ?, ?)}");
        cs.setInt(1,codigo1);
        cs.setDouble(2,mora1);
        cs.setString(3,observacion);
        cs.execute();
        resultado = "SE REGISTRO CORRECTAMENTE";
  cs.close();
  cs = null;
  cn.commit();
  cn.setAutoCommit(true);
  } catch (SQLException ex) {
  cn.rollback();
  ex.printStackTrace();
  resultado ="NO SE REGISTRO CORRECTAMENTE" ;
  } finally {
   cn.close();
  cn = null;
  }
   return resultado;
  }
}
