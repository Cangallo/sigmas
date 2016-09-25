/*******************************************************************************
 * Descripcion       : Clase que contiene los metodos transaccionales de acceso a datos de regubicpredio
 * Creado por        : APP
 * Fecha de Creacion : 22/05/2015 12:08:41
** *****************************************************************************/

package pe.sigmas.datos;

import pe.sigmas.entity.regubicpredioBean;
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
    public class regubicpredioDAT
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
  * @fnIsregubicpredioBean, es un metodo que retorna si existe un regubicpredioBean metodo efectivo para validaciones
  * @param poregubicpredioBean, Objeto correspondiente a regubicpredioBean
  * @return Retorna true cuando existe un regubicpredioBean, false cuando no existe un regubicpredioBean
  * @throws Exception
  */
        public boolean fnIsregubicpredioBean (regubicpredioBean poregubicpredioBean) throws Exception 
        {
        regubicpredioBean oregubicpredioBean = null;
        Connection cn = null ;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regubicpredio_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregubicpredioBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregubicpredioBean.getBiIdRegUbicPredio());
        cs.setInt(4, poregubicpredioBean.getBiIdRegPersona());
        cs.setString(5, poregubicpredioBean.getCCodRegPredio());
        cs.setString(6, poregubicpredioBean.getNvInterior());
        cs.setString(7, poregubicpredioBean.getNvManzana());
        cs.setString(8, poregubicpredioBean.getNvLote());
        cs.setString(9, poregubicpredioBean.getNvSubLote());
        cs.setString(10, poregubicpredioBean.getNvPiso());
        cs.setString(11, poregubicpredioBean.getNvDepartamento());
        cs.setString(12, poregubicpredioBean.getNvNumAnterior());
        cs.setString(13, poregubicpredioBean.getNvDireCompleta());
        cs.setString(14, poregubicpredioBean.getNvRefeUbicacion());
        cs.setBoolean(15, poregubicpredioBean.getBIndForaneo());
        cs.setBoolean(16, poregubicpredioBean.getBIndDomiFiscal());
        cs.setInt(17, poregubicpredioBean.getIEjerIniVigencia());
        cs.setInt(18, poregubicpredioBean.getIEjerFinVigencia());
        cs.setBoolean(19, poregubicpredioBean.getBIndVigencia());
        cs.setBoolean(20, poregubicpredioBean.getBIndConsentido());
        cs.setString(21, poregubicpredioBean.getNvObservacion());
        cs.setInt(22, poregubicpredioBean.getIIdRegUsuaRegistra());
        cs.setDate(23, poregubicpredioBean.getDtFechRegistra());
        cs.setInt(24, poregubicpredioBean.getICantidadModifica());
        cs.setString(25, poregubicpredioBean.getCCodRegContribuyente());
        cs.setBoolean(26, poregubicpredioBean.getBEstado());
        rs = cs.executeQuery();
        while (rs.next()) {
        oregubicpredioBean = new regubicpredioBean();
        oregubicpredioBean.setBEstado(rs.getBoolean("biIdRegUbicPredio"));
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
        return oregubicpredioBean!= null;
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
  * @fnGetListregubicpredioBean, es un metodo que retorna una lista de objetos de regubicpredioBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregubicpredioBean, Objeto correspondiente a regubicpredioBean
  * @return Retorna una lista de objetos regubicpredioBean
  * @throws Exception
  */
  public List fnGetListregubicpredioBean(regubicpredioBean poregubicpredioBean) throws Exception {
  List list = new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regubicpredio_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregubicpredioBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregubicpredioBean.getBiIdRegUbicPredio());
        cs.setInt(4, poregubicpredioBean.getBiIdRegPersona());
        cs.setString(5, poregubicpredioBean.getCCodRegPredio());
        cs.setString(6, poregubicpredioBean.getNvInterior());
        cs.setString(7, poregubicpredioBean.getNvManzana());
        cs.setString(8, poregubicpredioBean.getNvLote());
        cs.setString(9, poregubicpredioBean.getNvSubLote());
        cs.setString(10, poregubicpredioBean.getNvPiso());
        cs.setString(11, poregubicpredioBean.getNvDepartamento());
        cs.setString(12, poregubicpredioBean.getNvNumAnterior());
        cs.setString(13, poregubicpredioBean.getNvDireCompleta());
        cs.setString(14, poregubicpredioBean.getNvRefeUbicacion());
        cs.setBoolean(15, poregubicpredioBean.getBIndForaneo());
        cs.setBoolean(16, poregubicpredioBean.getBIndDomiFiscal());
        cs.setInt(17, poregubicpredioBean.getIEjerIniVigencia());
        cs.setInt(18, poregubicpredioBean.getIEjerFinVigencia());
        cs.setBoolean(19, poregubicpredioBean.getBIndVigencia());
        cs.setBoolean(20, poregubicpredioBean.getBIndConsentido());
        cs.setString(21, poregubicpredioBean.getNvObservacion());
        cs.setInt(22, poregubicpredioBean.getIIdRegUsuaRegistra());
        cs.setDate(23, poregubicpredioBean.getDtFechRegistra());
        cs.setInt(24, poregubicpredioBean.getICantidadModifica());
        cs.setString(25, poregubicpredioBean.getCCodRegContribuyente());
        cs.setBoolean(26, poregubicpredioBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20), rs.getString(21), rs.getString(22), rs.getString(23), rs.getString(24)}; 
  //Object[] obj = {rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getBoolean(13), rs.getBoolean(14), rs.getInt(15), rs.getInt(16), rs.getBoolean(17), rs.getBoolean(18), rs.getString(19), rs.getInt(20), rs.getDate(21), rs.getInt(22), rs.getString(23), rs.getBoolean(24)}; 
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
  * @fnGridregubicpredioBean, es un metodo que retorna una lista de objetos de regubicpredioBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregubicpredioBean, Objeto correspondiente a regubicpredioBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridregubicpredioBean(regubicpredioBean poregubicpredioBean) throws Exception {
  List lista= new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regubicpredio_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregubicpredioBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregubicpredioBean.getBiIdRegUbicPredio());
        cs.setInt(4, poregubicpredioBean.getBiIdRegPersona());
        cs.setString(5, poregubicpredioBean.getCCodRegPredio());
        cs.setString(6, poregubicpredioBean.getNvInterior());
        cs.setString(7, poregubicpredioBean.getNvManzana());
        cs.setString(8, poregubicpredioBean.getNvLote());
        cs.setString(9, poregubicpredioBean.getNvSubLote());
        cs.setString(10, poregubicpredioBean.getNvPiso());
        cs.setString(11, poregubicpredioBean.getNvDepartamento());
        cs.setString(12, poregubicpredioBean.getNvNumAnterior());
        cs.setString(13, poregubicpredioBean.getNvDireCompleta());
        cs.setString(14, poregubicpredioBean.getNvRefeUbicacion());
        cs.setBoolean(15, poregubicpredioBean.getBIndForaneo());
        cs.setBoolean(16, poregubicpredioBean.getBIndDomiFiscal());
        cs.setInt(17, poregubicpredioBean.getIEjerIniVigencia());
        cs.setInt(18, poregubicpredioBean.getIEjerFinVigencia());
        cs.setBoolean(19, poregubicpredioBean.getBIndVigencia());
        cs.setBoolean(20, poregubicpredioBean.getBIndConsentido());
        cs.setString(21, poregubicpredioBean.getNvObservacion());
        cs.setInt(22, poregubicpredioBean.getIIdRegUsuaRegistra());
        cs.setDate(23, poregubicpredioBean.getDtFechRegistra());
        cs.setInt(24, poregubicpredioBean.getICantidadModifica());
        cs.setString(25, poregubicpredioBean.getCCodRegContribuyente());
        cs.setBoolean(26, poregubicpredioBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19), rs.getString(20), rs.getString(21), rs.getString(22), rs.getString(23), rs.getString(24)}; 
  //Object[] obj = {rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getBoolean(13), rs.getBoolean(14), rs.getInt(15), rs.getInt(16), rs.getBoolean(17), rs.getBoolean(18), rs.getString(19), rs.getInt(20), rs.getDate(21), rs.getInt(22), rs.getString(23), rs.getBoolean(24)}; 
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
  * @fnAutocompleteregubicpredioBean, es un metodo que retorna una lista de objetos de regubicpredioBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregubicpredioBean, Objeto correspondiente a regubicpredioBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<regubicpredioBean> fnAutocompleteregubicpredioBean(regubicpredioBean poregubicpredioBean) throws Exception {
  ArrayList<regubicpredioBean> listaregubicpredioBean = new ArrayList<>();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regubicpredio_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregubicpredioBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregubicpredioBean.getBiIdRegUbicPredio());
        cs.setInt(4, poregubicpredioBean.getBiIdRegPersona());
        cs.setString(5, poregubicpredioBean.getCCodRegPredio());
        cs.setString(6, poregubicpredioBean.getNvInterior());
        cs.setString(7, poregubicpredioBean.getNvManzana());
        cs.setString(8, poregubicpredioBean.getNvLote());
        cs.setString(9, poregubicpredioBean.getNvSubLote());
        cs.setString(10, poregubicpredioBean.getNvPiso());
        cs.setString(11, poregubicpredioBean.getNvDepartamento());
        cs.setString(12, poregubicpredioBean.getNvNumAnterior());
        cs.setString(13, poregubicpredioBean.getNvDireCompleta());
        cs.setString(14, poregubicpredioBean.getNvRefeUbicacion());
        cs.setBoolean(15, poregubicpredioBean.getBIndForaneo());
        cs.setBoolean(16, poregubicpredioBean.getBIndDomiFiscal());
        cs.setInt(17, poregubicpredioBean.getIEjerIniVigencia());
        cs.setInt(18, poregubicpredioBean.getIEjerFinVigencia());
        cs.setBoolean(19, poregubicpredioBean.getBIndVigencia());
        cs.setBoolean(20, poregubicpredioBean.getBIndConsentido());
        cs.setString(21, poregubicpredioBean.getNvObservacion());
        cs.setInt(22, poregubicpredioBean.getIIdRegUsuaRegistra());
        cs.setDate(23, poregubicpredioBean.getDtFechRegistra());
        cs.setInt(24, poregubicpredioBean.getICantidadModifica());
        cs.setString(25, poregubicpredioBean.getCCodRegContribuyente());
        cs.setBoolean(26, poregubicpredioBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  regubicpredioBean oregubicpredioBean = new regubicpredioBean();
  oregubicpredioBean.setBiIdRegUbicPredio(rs.getInt("biIdRegUbicPredio")); 
  oregubicpredioBean.setBiIdRegPersona(rs.getInt("biIdRegPersona")); 
  oregubicpredioBean.setCCodRegPredio(rs.getString("cCodRegPredio")); 
  oregubicpredioBean.setNvInterior(rs.getString("nvInterior")); 
  oregubicpredioBean.setNvManzana(rs.getString("nvManzana")); 
  oregubicpredioBean.setNvLote(rs.getString("nvLote")); 
  oregubicpredioBean.setNvSubLote(rs.getString("nvSubLote")); 
  oregubicpredioBean.setNvPiso(rs.getString("nvPiso")); 
  oregubicpredioBean.setNvDepartamento(rs.getString("nvDepartamento")); 
  oregubicpredioBean.setNvNumAnterior(rs.getString("nvNumAnterior")); 
  oregubicpredioBean.setNvDireCompleta(rs.getString("nvDireCompleta")); 
  oregubicpredioBean.setNvRefeUbicacion(rs.getString("nvRefeUbicacion")); 
  oregubicpredioBean.setBIndForaneo(rs.getBoolean("bIndForaneo")); 
  oregubicpredioBean.setBIndDomiFiscal(rs.getBoolean("bIndDomiFiscal")); 
  oregubicpredioBean.setIEjerIniVigencia(rs.getInt("iEjerIniVigencia")); 
  oregubicpredioBean.setIEjerFinVigencia(rs.getInt("iEjerFinVigencia")); 
  oregubicpredioBean.setBIndVigencia(rs.getBoolean("bIndVigencia")); 
  oregubicpredioBean.setBIndConsentido(rs.getBoolean("bIndConsentido")); 
  oregubicpredioBean.setNvObservacion(rs.getString("nvObservacion")); 
  oregubicpredioBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  oregubicpredioBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  oregubicpredioBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  oregubicpredioBean.setCCodRegContribuyente(rs.getString("cCodRegContribuyente")); 
  oregubicpredioBean.setBEstado(rs.getBoolean("bEstado")); 
  listaregubicpredioBean.add(oregubicpredioBean);
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
  return listaregubicpredioBean;
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
  * @fnGetregubicpredioBean, es un metodo que retorna un objeto especifico de regubicpredioBean
  * @param poregubicpredioBean, Objeto correspondiente a regubicpredioBean
  * @return Retorna el Objeto regubicpredioBean
  * @throws Exception
  */
  public regubicpredioBean fnGetregubicpredioBean(regubicpredioBean poregubicpredioBean) throws Exception {
  regubicpredioBean oregubicpredioBean = null;
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regubicpredio_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregubicpredioBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregubicpredioBean.getBiIdRegUbicPredio());
        cs.setInt(4, poregubicpredioBean.getBiIdRegPersona());
        cs.setString(5, poregubicpredioBean.getCCodRegPredio());
        cs.setString(6, poregubicpredioBean.getNvInterior());
        cs.setString(7, poregubicpredioBean.getNvManzana());
        cs.setString(8, poregubicpredioBean.getNvLote());
        cs.setString(9, poregubicpredioBean.getNvSubLote());
        cs.setString(10, poregubicpredioBean.getNvPiso());
        cs.setString(11, poregubicpredioBean.getNvDepartamento());
        cs.setString(12, poregubicpredioBean.getNvNumAnterior());
        cs.setString(13, poregubicpredioBean.getNvDireCompleta());
        cs.setString(14, poregubicpredioBean.getNvRefeUbicacion());
        cs.setBoolean(15, poregubicpredioBean.getBIndForaneo());
        cs.setBoolean(16, poregubicpredioBean.getBIndDomiFiscal());
        cs.setInt(17, poregubicpredioBean.getIEjerIniVigencia());
        cs.setInt(18, poregubicpredioBean.getIEjerFinVigencia());
        cs.setBoolean(19, poregubicpredioBean.getBIndVigencia());
        cs.setBoolean(20, poregubicpredioBean.getBIndConsentido());
        cs.setString(21, poregubicpredioBean.getNvObservacion());
        cs.setInt(22, poregubicpredioBean.getIIdRegUsuaRegistra());
        cs.setDate(23, poregubicpredioBean.getDtFechRegistra());
        cs.setInt(24, poregubicpredioBean.getICantidadModifica());
        cs.setString(25, poregubicpredioBean.getCCodRegContribuyente());
        cs.setBoolean(26, poregubicpredioBean.getBEstado());
        rs = cs.executeQuery();
   while (rs.next()) {
  oregubicpredioBean = new regubicpredioBean();
  oregubicpredioBean.setBiIdRegUbicPredio(rs.getInt("biIdRegUbicPredio")); 
  oregubicpredioBean.setBiIdRegPersona(rs.getInt("biIdRegPersona")); 
  oregubicpredioBean.setCCodRegPredio(rs.getString("cCodRegPredio")); 
  oregubicpredioBean.setNvInterior(rs.getString("nvInterior")); 
  oregubicpredioBean.setNvManzana(rs.getString("nvManzana")); 
  oregubicpredioBean.setNvLote(rs.getString("nvLote")); 
  oregubicpredioBean.setNvSubLote(rs.getString("nvSubLote")); 
  oregubicpredioBean.setNvPiso(rs.getString("nvPiso")); 
  oregubicpredioBean.setNvDepartamento(rs.getString("nvDepartamento")); 
  oregubicpredioBean.setNvNumAnterior(rs.getString("nvNumAnterior")); 
  oregubicpredioBean.setNvDireCompleta(rs.getString("nvDireCompleta")); 
  oregubicpredioBean.setNvRefeUbicacion(rs.getString("nvRefeUbicacion")); 
  oregubicpredioBean.setBIndForaneo(rs.getBoolean("bIndForaneo")); 
  oregubicpredioBean.setBIndDomiFiscal(rs.getBoolean("bIndDomiFiscal")); 
  oregubicpredioBean.setIEjerIniVigencia(rs.getInt("iEjerIniVigencia")); 
  oregubicpredioBean.setIEjerFinVigencia(rs.getInt("iEjerFinVigencia")); 
  oregubicpredioBean.setBIndVigencia(rs.getBoolean("bIndVigencia")); 
  oregubicpredioBean.setBIndConsentido(rs.getBoolean("bIndConsentido")); 
  oregubicpredioBean.setNvObservacion(rs.getString("nvObservacion")); 
  oregubicpredioBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  oregubicpredioBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  oregubicpredioBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  oregubicpredioBean.setCCodRegContribuyente(rs.getString("cCodRegContribuyente")); 
  oregubicpredioBean.setBEstado(rs.getBoolean("bEstado")); 
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
  return oregubicpredioBean;
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
  * @fnInsertarregubicpredioBean,  es un metodo que Inserta un  regubicpredioBean
  * @param poregubicpredioBean, Objeto correspondiente a regubicpredioBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarregubicpredioBean(regubicpredioBean poregubicpredioBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regubicpredio_ins(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregubicpredioBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregubicpredioBean.getBiIdRegUbicPredio());
        cs.setInt(4, poregubicpredioBean.getBiIdRegPersona());
        cs.setString(5, poregubicpredioBean.getCCodRegPredio());
        cs.setString(6, poregubicpredioBean.getNvInterior());
        cs.setString(7, poregubicpredioBean.getNvManzana());
        cs.setString(8, poregubicpredioBean.getNvLote());
        cs.setString(9, poregubicpredioBean.getNvSubLote());
        cs.setString(10, poregubicpredioBean.getNvPiso());
        cs.setString(11, poregubicpredioBean.getNvDepartamento());
        cs.setString(12, poregubicpredioBean.getNvNumAnterior());
        cs.setString(13, poregubicpredioBean.getNvDireCompleta());
        cs.setString(14, poregubicpredioBean.getNvRefeUbicacion());
        cs.setBoolean(15, poregubicpredioBean.getBIndForaneo());
        cs.setBoolean(16, poregubicpredioBean.getBIndDomiFiscal());
        cs.setInt(17, poregubicpredioBean.getIEjerIniVigencia());
        cs.setInt(18, poregubicpredioBean.getIEjerFinVigencia());
        cs.setBoolean(19, poregubicpredioBean.getBIndVigencia());
        cs.setBoolean(20, poregubicpredioBean.getBIndConsentido());
        cs.setString(21, poregubicpredioBean.getNvObservacion());
        cs.setInt(22, poregubicpredioBean.getIIdRegUsuaRegistra());
        cs.setDate(23, poregubicpredioBean.getDtFechRegistra());
        cs.setInt(24, poregubicpredioBean.getICantidadModifica());
        cs.setString(25, poregubicpredioBean.getCCodRegContribuyente());
        cs.setBoolean(26, true);
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
  * @fnEliminarregubicpredioBean,  es un metodo que Elimina un  regubicpredioBean
  * @param poregubicpredioBean, Objeto correspondiente a regubicpredioBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarregubicpredioBean(regubicpredioBean poregubicpredioBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regubicpredio_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregubicpredioBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregubicpredioBean.getBiIdRegUbicPredio());
        cs.setInt(4, poregubicpredioBean.getBiIdRegPersona());
        cs.setString(5, poregubicpredioBean.getCCodRegPredio());
        cs.setString(6, poregubicpredioBean.getNvInterior());
        cs.setString(7, poregubicpredioBean.getNvManzana());
        cs.setString(8, poregubicpredioBean.getNvLote());
        cs.setString(9, poregubicpredioBean.getNvSubLote());
        cs.setString(10, poregubicpredioBean.getNvPiso());
        cs.setString(11, poregubicpredioBean.getNvDepartamento());
        cs.setString(12, poregubicpredioBean.getNvNumAnterior());
        cs.setString(13, poregubicpredioBean.getNvDireCompleta());
        cs.setString(14, poregubicpredioBean.getNvRefeUbicacion());
        cs.setBoolean(15, poregubicpredioBean.getBIndForaneo());
        cs.setBoolean(16, poregubicpredioBean.getBIndDomiFiscal());
        cs.setInt(17, poregubicpredioBean.getIEjerIniVigencia());
        cs.setInt(18, poregubicpredioBean.getIEjerFinVigencia());
        cs.setBoolean(19, poregubicpredioBean.getBIndVigencia());
        cs.setBoolean(20, poregubicpredioBean.getBIndConsentido());
        cs.setString(21, poregubicpredioBean.getNvObservacion());
        cs.setInt(22, poregubicpredioBean.getIIdRegUsuaRegistra());
        cs.setDate(23, poregubicpredioBean.getDtFechRegistra());
        cs.setInt(24, poregubicpredioBean.getICantidadModifica());
        cs.setString(25, poregubicpredioBean.getCCodRegContribuyente());
        cs.setBoolean(26, false);
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
  * @fnActualizarregubicpredioBean,  es un metodo que Actualiza un  regubicpredioBean
  * @param poregubicpredioBean, Objeto correspondiente a regubicpredioBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarregubicpredioBean(regubicpredioBean poregubicpredioBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regubicpredio_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregubicpredioBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregubicpredioBean.getBiIdRegUbicPredio());
        cs.setInt(4, poregubicpredioBean.getBiIdRegPersona());
        cs.setString(5, poregubicpredioBean.getCCodRegPredio());
        cs.setString(6, poregubicpredioBean.getNvInterior());
        cs.setString(7, poregubicpredioBean.getNvManzana());
        cs.setString(8, poregubicpredioBean.getNvLote());
        cs.setString(9, poregubicpredioBean.getNvSubLote());
        cs.setString(10, poregubicpredioBean.getNvPiso());
        cs.setString(11, poregubicpredioBean.getNvDepartamento());
        cs.setString(12, poregubicpredioBean.getNvNumAnterior());
        cs.setString(13, poregubicpredioBean.getNvDireCompleta());
        cs.setString(14, poregubicpredioBean.getNvRefeUbicacion());
        cs.setBoolean(15, poregubicpredioBean.getBIndForaneo());
        cs.setBoolean(16, poregubicpredioBean.getBIndDomiFiscal());
        cs.setInt(17, poregubicpredioBean.getIEjerIniVigencia());
        cs.setInt(18, poregubicpredioBean.getIEjerFinVigencia());
        cs.setBoolean(19, poregubicpredioBean.getBIndVigencia());
        cs.setBoolean(20, poregubicpredioBean.getBIndConsentido());
        cs.setString(21, poregubicpredioBean.getNvObservacion());
        cs.setInt(22, poregubicpredioBean.getIIdRegUsuaRegistra());
        cs.setDate(23, poregubicpredioBean.getDtFechRegistra());
        cs.setInt(24, poregubicpredioBean.getICantidadModifica());
        cs.setString(25, poregubicpredioBean.getCCodRegContribuyente());
        cs.setBoolean(26, true);
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
