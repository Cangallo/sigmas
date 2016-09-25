/*******************************************************************************
* Descripcion       : Clase que contiene los metodos transaccionales de logica del negocio de regusuario
* Creado por        : APP
* Fecha de Creacion : 22/05/2015 12:08:02
********************************************************************************/

package pe.sigmas.logica;

import pe.sigmas.entity.regusuarioBean;
import pe.sigmas.datos.regusuarioDAT;
import pe.sigmas.util.Generic;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;


/**
*
* @author APP
 */
    public class regusuarioBL
    {
  /**
  * @fnIsregusuarioBean, es un metodo que retorna si existe un regusuarioBean metodo efectivo para validaciones
  * @param poregusuarioBean, Objeto correspondiente a regusuarioBean
  * @return Retorna true cuando existe un regusuarioBean, false cuando no existe un regusuarioBean
  * @throws Exception
  */
        public boolean fnIsregusuarioBean (regusuarioBean poregusuarioBean) throws Exception 
        {
         boolean status = Generic.getInstance(regusuarioDAT.class).fnIsregusuarioBean(poregusuarioBean);
        if (!status) {
        poregusuarioBean.setMensaje("El IndexBean buscado no existe");
        }
        return status;
        }
  /**
  * @fnGetListregusuarioBean, es un metodo que retorna una lista de objetos de regusuarioBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregusuarioBean, Objeto correspondiente a regusuarioBean
  * @return Retorna una lista de objetos regusuarioBean
  * @throws Exception
  */
  public List fnGetListregusuarioBean(regusuarioBean poregusuarioBean) throws Exception {
  List list = Generic.getInstance(regusuarioDAT.class).fnGetListregusuarioBean(poregusuarioBean);
  return list;
  }
  /**
  * @fnGridregusuarioBean, es un metodo que retorna una lista de objetos de regusuarioBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregusuarioBean, Objeto correspondiente a regusuarioBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridregusuarioBean(regusuarioBean poregusuarioBean) throws Exception {
  List list= Generic.getInstance(regusuarioDAT.class).fnGridregusuarioBean(poregusuarioBean);
  return list;
  }
  /**
  * @fnAutocompleteregusuarioBean, es un metodo que retorna una lista de objetos de regusuarioBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregusuarioBean, Objeto correspondiente a regusuarioBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<regusuarioBean> fnAutocompleteregusuarioBean(regusuarioBean poregusuarioBean) throws Exception {
  ArrayList<regusuarioBean> listaregusuarioBean = null;
  try {
  listaregusuarioBean = Generic.getInstance(regusuarioDAT.class).fnAutocompleteregusuarioBean(poregusuarioBean);
  } catch (IllegalAccessException | InstantiationException | SQLException ex) {
  } finally {
  }
  return listaregusuarioBean;
  }
  /**
  * @fnGetregusuarioBean, es un metodo que retorna un objeto especifico de regusuarioBean
  * @param poregusuarioBean, Objeto correspondiente a regusuarioBean
  * @return Retorna el Objeto regusuarioBean
  * @throws Exception
  */
  public regusuarioBean fnGetregusuarioBean(regusuarioBean poregusuarioBean) throws Exception {
  return Generic.getInstance(regusuarioDAT.class).fnGetregusuarioBean(poregusuarioBean);
  }
  /**
  * @fnInsertarregusuarioBean,  es un metodo que Inserta un  regusuarioBean
  * @param poregusuarioBean, Objeto correspondiente a regusuarioBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarregusuarioBean(regusuarioBean poregusuarioBean) throws Exception {
  return Generic.getInstance(regusuarioDAT.class).fnInsertarregusuarioBean(poregusuarioBean);
  }
  /**
  * @fnEliminarregusuarioBean,  es un metodo que Elimina un  regusuarioBean
  * @param poregusuarioBean, Objeto correspondiente a regusuarioBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarregusuarioBean(regusuarioBean poregusuarioBean) throws Exception {
  return Generic.getInstance(regusuarioDAT.class).fnEliminarregusuarioBean(poregusuarioBean);
  }
  /**
  * @fnActualizarregusuarioBean,  es un metodo que Actualiza un  regusuarioBean
  * @param poregusuarioBean, Objeto correspondiente a regusuarioBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarregusuarioBean(regusuarioBean poregusuarioBean) throws Exception {
  return Generic.getInstance(regusuarioDAT.class).fnActualizarregusuarioBean(poregusuarioBean);
  }
    }

