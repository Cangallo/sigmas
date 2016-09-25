/*******************************************************************************
 * Descripcion       : Clase que contiene los metodos transaccionales de acceso a datos de regusuario
 * Creado por        : APP
 * Fecha de Creacion : 22/05/2015 12:08:41
** *****************************************************************************/

package pe.sigmas.datos;

import pe.sigmas.entity.regusuarioBean;
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
    public class regusuarioDAT
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
  * @fnIsregusuarioBean, es un metodo que retorna si existe un regusuarioBean metodo efectivo para validaciones
  * @param poregusuarioBean, Objeto correspondiente a regusuarioBean
  * @return Retorna true cuando existe un regusuarioBean, false cuando no existe un regusuarioBean
  * @throws Exception
  */
        public boolean fnIsregusuarioBean (regusuarioBean poregusuarioBean) throws Exception 
        {
        regusuarioBean oregusuarioBean = null;
        Connection cn = null ;
        ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regusuario_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregusuarioBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregusuarioBean.getIIdRegUsuario());
        cs.setString(4, poregusuarioBean.getCCodRegTrabajador());
        cs.setDate(5, poregusuarioBean.getDtFechaVigencia());
        cs.setString(6, poregusuarioBean.getNvNombUsuario());
        cs.setString(7, poregusuarioBean.getNvContrasenia());
        cs.setString(8, poregusuarioBean.getNvObservacion());
        cs.setInt(9, poregusuarioBean.getIIdRegUsuaRegistra());
        cs.setDate(10, poregusuarioBean.getDtFechRegistra());
        cs.setInt(11, poregusuarioBean.getICantidadModifica());
        cs.setBoolean(12, poregusuarioBean.getBEstado());
        rs = cs.executeQuery();
        while (rs.next()) {
        oregusuarioBean = new regusuarioBean();
        oregusuarioBean.setBEstado(rs.getBoolean("iIdRegUsuario"));
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
        return oregusuarioBean!= null;
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
  * @fnGetListregusuarioBean, es un metodo que retorna una lista de objetos de regusuarioBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregusuarioBean, Objeto correspondiente a regusuarioBean
  * @return Retorna una lista de objetos regusuarioBean
  * @throws Exception
  */
  public List fnGetListregusuarioBean(regusuarioBean poregusuarioBean) throws Exception {
  List list = new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regusuario_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregusuarioBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregusuarioBean.getIIdRegUsuario());
        cs.setString(4, poregusuarioBean.getCCodRegTrabajador());
        cs.setDate(5, poregusuarioBean.getDtFechaVigencia());
        cs.setString(6, poregusuarioBean.getNvNombUsuario());
        cs.setString(7, poregusuarioBean.getNvContrasenia());
        cs.setString(8, poregusuarioBean.getNvObservacion());
        cs.setInt(9, poregusuarioBean.getIIdRegUsuaRegistra());
        cs.setDate(10, poregusuarioBean.getDtFechRegistra());
        cs.setInt(11, poregusuarioBean.getICantidadModifica());
        cs.setBoolean(12, poregusuarioBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10)}; 
  //Object[] obj = {rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getDate(8), rs.getInt(9), rs.getBoolean(10)}; 
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
  * @fnGridregusuarioBean, es un metodo que retorna una lista de objetos de regusuarioBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregusuarioBean, Objeto correspondiente a regusuarioBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridregusuarioBean(regusuarioBean poregusuarioBean) throws Exception {
  List lista= new LinkedList();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regusuario_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregusuarioBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregusuarioBean.getIIdRegUsuario());
        cs.setString(4, poregusuarioBean.getCCodRegTrabajador());
        cs.setDate(5, poregusuarioBean.getDtFechaVigencia());
        cs.setString(6, poregusuarioBean.getNvNombUsuario());
        cs.setString(7, poregusuarioBean.getNvContrasenia());
        cs.setString(8, poregusuarioBean.getNvObservacion());
        cs.setInt(9, poregusuarioBean.getIIdRegUsuaRegistra());
        cs.setDate(10, poregusuarioBean.getDtFechRegistra());
        cs.setInt(11, poregusuarioBean.getICantidadModifica());
        cs.setBoolean(12, poregusuarioBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10)}; 
  //Object[] obj = {rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getDate(8), rs.getInt(9), rs.getBoolean(10)}; 
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
  * @fnAutocompleteregusuarioBean, es un metodo que retorna una lista de objetos de regusuarioBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregusuarioBean, Objeto correspondiente a regusuarioBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<regusuarioBean> fnAutocompleteregusuarioBean(regusuarioBean poregusuarioBean) throws Exception {
  ArrayList<regusuarioBean> listaregusuarioBean = new ArrayList<>();
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regusuario_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregusuarioBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregusuarioBean.getIIdRegUsuario());
        cs.setString(4, poregusuarioBean.getCCodRegTrabajador());
        cs.setDate(5, poregusuarioBean.getDtFechaVigencia());
        cs.setString(6, poregusuarioBean.getNvNombUsuario());
        cs.setString(7, poregusuarioBean.getNvContrasenia());
        cs.setString(8, poregusuarioBean.getNvObservacion());
        cs.setInt(9, poregusuarioBean.getIIdRegUsuaRegistra());
        cs.setDate(10, poregusuarioBean.getDtFechRegistra());
        cs.setInt(11, poregusuarioBean.getICantidadModifica());
        cs.setBoolean(12, poregusuarioBean.getBEstado());
        rs = cs.executeQuery();
  while (rs.next()) {
  regusuarioBean oregusuarioBean = new regusuarioBean();
  oregusuarioBean.setIIdRegUsuario(rs.getInt("iIdRegUsuario")); 
  oregusuarioBean.setCCodRegTrabajador(rs.getString("cCodRegTrabajador")); 
  oregusuarioBean.setDtFechaVigencia(rs.getDate("dtFechaVigencia")); 
  oregusuarioBean.setNvNombUsuario(rs.getString("nvNombUsuario")); 
  oregusuarioBean.setNvContrasenia(rs.getString("nvContrasenia")); 
  oregusuarioBean.setNvObservacion(rs.getString("nvObservacion")); 
  oregusuarioBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  oregusuarioBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  oregusuarioBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  oregusuarioBean.setBEstado(rs.getBoolean("bEstado")); 
  listaregusuarioBean.add(oregusuarioBean);
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
  return listaregusuarioBean;
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
  * @fnGetregusuarioBean, es un metodo que retorna un objeto especifico de regusuarioBean
  * @param poregusuarioBean, Objeto correspondiente a regusuarioBean
  * @return Retorna el Objeto regusuarioBean
  * @throws Exception
  */
  public regusuarioBean fnGetregusuarioBean(regusuarioBean poregusuarioBean) throws Exception {
  regusuarioBean oregusuarioBean = null;
  Connection cn = null;
  ResultSet rs = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regusuario_lst(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregusuarioBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregusuarioBean.getIIdRegUsuario());
        cs.setString(4, poregusuarioBean.getCCodRegTrabajador());
        cs.setDate(5, poregusuarioBean.getDtFechaVigencia());
        cs.setString(6, poregusuarioBean.getNvNombUsuario());
        cs.setString(7, poregusuarioBean.getNvContrasenia());
        cs.setString(8, poregusuarioBean.getNvObservacion());
        cs.setInt(9, poregusuarioBean.getIIdRegUsuaRegistra());
        cs.setDate(10, poregusuarioBean.getDtFechRegistra());
        cs.setInt(11, poregusuarioBean.getICantidadModifica());
        cs.setBoolean(12, poregusuarioBean.getBEstado());
        rs = cs.executeQuery();
   while (rs.next()) {
  oregusuarioBean = new regusuarioBean();
  oregusuarioBean.setIIdRegUsuario(rs.getInt("iIdRegUsuario")); 
  oregusuarioBean.setCCodRegTrabajador(rs.getString("cCodRegTrabajador")); 
  oregusuarioBean.setDtFechaVigencia(rs.getDate("dtFechaVigencia")); 
  oregusuarioBean.setNvNombUsuario(rs.getString("nvNombUsuario")); 
  oregusuarioBean.setNvContrasenia(rs.getString("nvContrasenia")); 
  oregusuarioBean.setNvObservacion(rs.getString("nvObservacion")); 
  oregusuarioBean.setIIdRegUsuaRegistra(rs.getInt("iIdRegUsuaRegistra")); 
  oregusuarioBean.setDtFechRegistra(rs.getDate("dtFechRegistra")); 
  oregusuarioBean.setICantidadModifica(rs.getInt("iCantidadModifica")); 
  oregusuarioBean.setBEstado(rs.getBoolean("bEstado")); 
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
  return oregusuarioBean;
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
  * @fnInsertarregusuarioBean,  es un metodo que Inserta un  regusuarioBean
  * @param poregusuarioBean, Objeto correspondiente a regusuarioBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarregusuarioBean(regusuarioBean poregusuarioBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regusuario_ins(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregusuarioBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregusuarioBean.getIIdRegUsuario());
        cs.setString(4, poregusuarioBean.getCCodRegTrabajador());
        cs.setDate(5, poregusuarioBean.getDtFechaVigencia());
        cs.setString(6, poregusuarioBean.getNvNombUsuario());
        cs.setString(7, poregusuarioBean.getNvContrasenia());
        cs.setString(8, poregusuarioBean.getNvObservacion());
        cs.setInt(9, poregusuarioBean.getIIdRegUsuaRegistra());
        cs.setDate(10, poregusuarioBean.getDtFechRegistra());
        cs.setInt(11, poregusuarioBean.getICantidadModifica());
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
  * @fnEliminarregusuarioBean,  es un metodo que Elimina un  regusuarioBean
  * @param poregusuarioBean, Objeto correspondiente a regusuarioBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarregusuarioBean(regusuarioBean poregusuarioBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regusuario_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregusuarioBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregusuarioBean.getIIdRegUsuario());
        cs.setString(4, poregusuarioBean.getCCodRegTrabajador());
        cs.setDate(5, poregusuarioBean.getDtFechaVigencia());
        cs.setString(6, poregusuarioBean.getNvNombUsuario());
        cs.setString(7, poregusuarioBean.getNvContrasenia());
        cs.setString(8, poregusuarioBean.getNvObservacion());
        cs.setInt(9, poregusuarioBean.getIIdRegUsuaRegistra());
        cs.setDate(10, poregusuarioBean.getDtFechRegistra());
        cs.setInt(11, poregusuarioBean.getICantidadModifica());
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
  * @fnActualizarregusuarioBean,  es un metodo que Actualiza un  regusuarioBean
  * @param poregusuarioBean, Objeto correspondiente a regusuarioBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarregusuarioBean(regusuarioBean poregusuarioBean) throws Exception {
  boolean resultado = false;
  Connection cn = null;
        CallableStatement cs = null;
        try {
        cn = DBConnection.getInstance().openConnection();
        cn.setAutoCommit(false);
        cs = cn.prepareCall("{CALL sisaguasaniamiento.usp_regusuario_upd(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )}");
        cs.setInt(1, poregusuarioBean.getIOps());
        cs.registerOutParameter(2, java.sql.Types.BOOLEAN);
        cs.setInt(3, poregusuarioBean.getIIdRegUsuario());
        cs.setString(4, poregusuarioBean.getCCodRegTrabajador());
        cs.setDate(5, poregusuarioBean.getDtFechaVigencia());
        cs.setString(6, poregusuarioBean.getNvNombUsuario());
        cs.setString(7, poregusuarioBean.getNvContrasenia());
        cs.setString(8, poregusuarioBean.getNvObservacion());
        cs.setInt(9, poregusuarioBean.getIIdRegUsuaRegistra());
        cs.setDate(10, poregusuarioBean.getDtFechRegistra());
        cs.setInt(11, poregusuarioBean.getICantidadModifica());
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
