/*******************************************************************************
 * Descripcion       : Clase que contiene los metodos transaccionales de acceso a datos de maeconcepto
 * Creado por        : APP
 * Fecha de Creacion : 22/05/2015 12:08:40
** *****************************************************************************/

package pe.sigmas.datos;

import pe.sigmas.entity.maeconceptoBean;
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
    public class maeconceptoDAT
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
  * @fnIsmaeconceptoBean, es un metodo que retorna si existe un maeconceptoBean metodo efectivo para validaciones
  * @param pomaeconceptoBean, Objeto correspondiente a maeconceptoBean
  * @return Retorna true cuando existe un maeconceptoBean, false cuando no existe un maeconceptoBean
  * @throws Exception
  */
        public boolean fnIsmaeconceptoBean (maeconceptoBean pomaeconceptoBean) throws Exception 
        {
        maeconceptoBean omaeconceptoBean = null;
        Connection cn = null ;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maeconcepto_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaeconceptoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaeconceptoBean.getCCodMaeConcepto());
        cs.setString(4, pomaeconceptoBean.getCCodMaeTipoConcepto());
        cs.setString(5, pomaeconceptoBean.getNvDenominacion());
        cs.setString(6, pomaeconceptoBean.getNvDescripcion());
        cs.setString(7, pomaeconceptoBean.getNvAbreviatura());
        cs.setString(8, pomaeconceptoBean.getNvObservacion());
        cs.setInt(9, pomaeconceptoBean.getIIdRegUsuaRegistra());
        cs.setDate(10, pomaeconceptoBean.getDtFechRegistra());
        cs.setInt(11, pomaeconceptoBean.getICantidadModifica());
        cs.setBoolean(12, pomaeconceptoBean.getBEstado());
        rs = cs.executeQuery();
        while (rs.next()) {
        omaeconceptoBean = new maeconceptoBean();
        omaeconceptoBean.setBEstado(rs.getBoolean("cCodMaeConcepto"));
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
        return omaeconceptoBean!= null;
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
  * @fnGetListmaeconceptoBean, es un metodo que retorna una lista de objetos de maeconceptoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaeconceptoBean, Objeto correspondiente a maeconceptoBean
  * @return Retorna una lista de objetos maeconceptoBean
  * @throws Exception
  */
  public List fnGetListmaeconceptoBean(maeconceptoBean pomaeconceptoBean) throws Exception {
  List list = new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maeconcepto_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaeconceptoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaeconceptoBean.getCCodMaeConcepto());
        cs.setString(4, pomaeconceptoBean.getCCodMaeTipoConcepto());
        cs.setString(5, pomaeconceptoBean.getNvDenominacion());
        cs.setString(6, pomaeconceptoBean.getNvDescripcion());
        cs.setString(7, pomaeconceptoBean.getNvAbreviatura());
        cs.setString(8, pomaeconceptoBean.getNvObservacion());
        cs.setInt(9, pomaeconceptoBean.getIIdRegUsuaRegistra());
        cs.setDate(10, pomaeconceptoBean.getDtFechRegistra());
        cs.setInt(11, pomaeconceptoBean.getICantidadModifica());
        cs.setBoolean(12, pomaeconceptoBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10)}; 
  //Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getDate(8), rs.getInt(9), rs.getBoolean(10)}; 
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
  * @fnGridmaeconceptoBean, es un metodo que retorna una lista de objetos de maeconceptoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaeconceptoBean, Objeto correspondiente a maeconceptoBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridmaeconceptoBean(maeconceptoBean pomaeconceptoBean) throws Exception {
  List lista= new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maeconcepto_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaeconceptoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaeconceptoBean.getCCodMaeConcepto());
        cs.setString(4, pomaeconceptoBean.getCCodMaeTipoConcepto());
        cs.setString(5, pomaeconceptoBean.getNvDenominacion());
        cs.setString(6, pomaeconceptoBean.getNvDescripcion());
        cs.setString(7, pomaeconceptoBean.getNvAbreviatura());
        cs.setString(8, pomaeconceptoBean.getNvObservacion());
        cs.setInt(9, pomaeconceptoBean.getIIdRegUsuaRegistra());
        cs.setDate(10, pomaeconceptoBean.getDtFechRegistra());
        cs.setInt(11, pomaeconceptoBean.getICantidadModifica());
        cs.setBoolean(12, pomaeconceptoBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10)}; 
  //Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getDate(8), rs.getInt(9), rs.getBoolean(10)}; 
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
  * @fnAutocompletemaeconceptoBean, es un metodo que retorna una lista de objetos de maeconceptoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaeconceptoBean, Objeto correspondiente a maeconceptoBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<maeconceptoBean> fnAutocompletemaeconceptoBean(maeconceptoBean pomaeconceptoBean) throws Exception {
  ArrayList<maeconceptoBean> listamaeconceptoBean = new ArrayList<>();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maeconcepto_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaeconceptoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaeconceptoBean.getCCodMaeConcepto());
        cs.setString(4, pomaeconceptoBean.getCCodMaeTipoConcepto());
        cs.setString(5, pomaeconceptoBean.getNvDenominacion());
        cs.setString(6, pomaeconceptoBean.getNvDescripcion());
        cs.setString(7, pomaeconceptoBean.getNvAbreviatura());
        cs.setString(8, pomaeconceptoBean.getNvObservacion());
        cs.setInt(9, pomaeconceptoBean.getIIdRegUsuaRegistra());
        cs.setDate(10, pomaeconceptoBean.getDtFechRegistra());
        cs.setInt(11, pomaeconceptoBean.getICantidadModifica());
        cs.setBoolean(12, pomaeconceptoBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  maeconceptoBean omaeconceptoBean = new maeconceptoBean();
  omaeconceptoBean.setCCodMaeConcepto(rs.getString("cCodMaeConcepto")); 
  omaeconceptoBean.setCCodMaeTipoConcepto(rs.getString("cCodMaeTipoConcepto")); 
  omaeconceptoBean.setNvDenominacion(rs.getString("nvDenominacion")); 
  omaeconceptoBean.setNvDescripcion(rs.getString("nvDescripcion")); 
  omaeconceptoBean.setNvAbreviatura(rs.getString("nvAbreviatura")); 
  omaeconceptoBean.setNvObservacion(rs.getString("nvObservacion")); 
  omaeconceptoBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  omaeconceptoBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  omaeconceptoBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  omaeconceptoBean.setBEstado(rs.getBoolean("bEstado")); 
  listamaeconceptoBean.add(omaeconceptoBean);
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
  return listamaeconceptoBean;
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
  * @fnGetmaeconceptoBean, es un metodo que retorna un objeto especifico de maeconceptoBean
  * @param pomaeconceptoBean, Objeto correspondiente a maeconceptoBean
  * @return Retorna el Objeto maeconceptoBean
  * @throws Exception
  */
  public maeconceptoBean fnGetmaeconceptoBean(maeconceptoBean pomaeconceptoBean) throws Exception {
  maeconceptoBean omaeconceptoBean = null;
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maeconcepto_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaeconceptoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaeconceptoBean.getCCodMaeConcepto());
        cs.setString(4, pomaeconceptoBean.getCCodMaeTipoConcepto());
        cs.setString(5, pomaeconceptoBean.getNvDenominacion());
        cs.setString(6, pomaeconceptoBean.getNvDescripcion());
        cs.setString(7, pomaeconceptoBean.getNvAbreviatura());
        cs.setString(8, pomaeconceptoBean.getNvObservacion());
        cs.setInt(9, pomaeconceptoBean.getIIdRegUsuaRegistra());
        cs.setDate(10, pomaeconceptoBean.getDtFechRegistra());
        cs.setInt(11, pomaeconceptoBean.getICantidadModifica());
        cs.setBoolean(12, pomaeconceptoBean.getBEstado());
        rs = cs.executeQuery();
   while (rs.next()) {
  omaeconceptoBean = new maeconceptoBean();
  omaeconceptoBean.setCCodMaeConcepto(rs.getString("cCodMaeConcepto")); 
  omaeconceptoBean.setCCodMaeTipoConcepto(rs.getString("cCodMaeTipoConcepto")); 
  omaeconceptoBean.setNvDenominacion(rs.getString("nvDenominacion")); 
  omaeconceptoBean.setNvDescripcion(rs.getString("nvDescripcion")); 
  omaeconceptoBean.setNvAbreviatura(rs.getString("nvAbreviatura")); 
  omaeconceptoBean.setNvObservacion(rs.getString("nvObservacion")); 
  omaeconceptoBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  omaeconceptoBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  omaeconceptoBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  omaeconceptoBean.setBEstado(rs.getBoolean("bEstado")); 
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
  return omaeconceptoBean;
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
  * @fnInsertarmaeconceptoBean,  es un metodo que Inserta un  maeconceptoBean
  * @param pomaeconceptoBean, Objeto correspondiente a maeconceptoBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarmaeconceptoBean(maeconceptoBean pomaeconceptoBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maeconcepto_ins(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaeconceptoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaeconceptoBean.getCCodMaeConcepto());
        cs.setString(4, pomaeconceptoBean.getCCodMaeTipoConcepto());
        cs.setString(5, pomaeconceptoBean.getNvDenominacion());
        cs.setString(6, pomaeconceptoBean.getNvDescripcion());
        cs.setString(7, pomaeconceptoBean.getNvAbreviatura());
        cs.setString(8, pomaeconceptoBean.getNvObservacion());
        cs.setInt(9, pomaeconceptoBean.getIIdRegUsuaRegistra());
        cs.setDate(10, pomaeconceptoBean.getDtFechRegistra());
        cs.setInt(11, pomaeconceptoBean.getICantidadModifica());
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
 * -- Fecha creacion          : 22/05/2015 12:08:40
 * -- ¿Esta siendo Utilizado? : NO
 * -- Modificado por          : <Analista Programador>
 * -- Fecha Actualizacion     : <Fecha de Actualizacion>
 * --
 * **************************************************************************************************/
  /**
  * @fnEliminarmaeconceptoBean,  es un metodo que Elimina un  maeconceptoBean
  * @param pomaeconceptoBean, Objeto correspondiente a maeconceptoBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarmaeconceptoBean(maeconceptoBean pomaeconceptoBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maeconcepto_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaeconceptoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaeconceptoBean.getCCodMaeConcepto());
        cs.setString(4, pomaeconceptoBean.getCCodMaeTipoConcepto());
        cs.setString(5, pomaeconceptoBean.getNvDenominacion());
        cs.setString(6, pomaeconceptoBean.getNvDescripcion());
        cs.setString(7, pomaeconceptoBean.getNvAbreviatura());
        cs.setString(8, pomaeconceptoBean.getNvObservacion());
        cs.setInt(9, pomaeconceptoBean.getIIdRegUsuaRegistra());
        cs.setDate(10, pomaeconceptoBean.getDtFechRegistra());
        cs.setInt(11, pomaeconceptoBean.getICantidadModifica());
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
 * -- Fecha creacion          : 22/05/2015 12:08:40
 * -- ¿Esta siendo Utilizado? : NO
 * -- Modificado por          : <Analista Programador>
 * -- Fecha Actualizacion     : <Fecha de Actualizacion>
 * --
 * **************************************************************************************************/
  /**
  * @fnActualizarmaeconceptoBean,  es un metodo que Actualiza un  maeconceptoBean
  * @param pomaeconceptoBean, Objeto correspondiente a maeconceptoBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarmaeconceptoBean(maeconceptoBean pomaeconceptoBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_maeconcepto_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, pomaeconceptoBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setString(3, pomaeconceptoBean.getCCodMaeConcepto());
        cs.setString(4, pomaeconceptoBean.getCCodMaeTipoConcepto());
        cs.setString(5, pomaeconceptoBean.getNvDenominacion());
        cs.setString(6, pomaeconceptoBean.getNvDescripcion());
        cs.setString(7, pomaeconceptoBean.getNvAbreviatura());
        cs.setString(8, pomaeconceptoBean.getNvObservacion());
        cs.setInt(9, pomaeconceptoBean.getIIdRegUsuaRegistra());
        cs.setDate(10, pomaeconceptoBean.getDtFechRegistra());
        cs.setInt(11, pomaeconceptoBean.getICantidadModifica());
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
