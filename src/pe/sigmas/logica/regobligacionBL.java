/*******************************************************************************
* Descripcion       : Clase que contiene los metodos transaccionales de logica del negocio de regobligacion
* Creado por        : APP
* Fecha de Creacion : 22/05/2015 12:08:02
********************************************************************************/

package pe.sigmas.logica;

import pe.sigmas.entity.regobligacionBean;
import pe.sigmas.datos.regobligacionDAT;
import pe.sigmas.util.Generic;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;


/**
*
* @author APP
 */
    public class regobligacionBL
    {
  /**
  * @fnIsregobligacionBean, es un metodo que retorna si existe un regobligacionBean metodo efectivo para validaciones
  * @param poregobligacionBean, Objeto correspondiente a regobligacionBean
  * @return Retorna true cuando existe un regobligacionBean, false cuando no existe un regobligacionBean
  * @throws Exception
  */
        public boolean fnIsregobligacionBean (regobligacionBean poregobligacionBean) throws Exception 
        {
         boolean status = Generic.getInstance(regobligacionDAT.class).fnIsregobligacionBean(poregobligacionBean);
        if (!status) {
        poregobligacionBean.setMensaje("El IndexBean buscado no existe");
        }
        return status;
        }
  /**
  * @fnGetListregobligacionBean, es un metodo que retorna una lista de objetos de regobligacionBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregobligacionBean, Objeto correspondiente a regobligacionBean
  * @return Retorna una lista de objetos regobligacionBean
  * @throws Exception
  */
  public List fnGetListregobligacionBean(regobligacionBean poregobligacionBean) throws Exception {
  List list = Generic.getInstance(regobligacionDAT.class).fnGetListregobligacionBean(poregobligacionBean);
  return list;
  }
  /**
  * @fnGridregobligacionBean, es un metodo que retorna una lista de objetos de regobligacionBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregobligacionBean, Objeto correspondiente a regobligacionBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridregobligacionBean(regobligacionBean poregobligacionBean) throws Exception {
  List list= Generic.getInstance(regobligacionDAT.class).fnGridregobligacionBean(poregobligacionBean);
  return list;
  }
  /**
  * @fnAutocompleteregobligacionBean, es un metodo que retorna una lista de objetos de regobligacionBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregobligacionBean, Objeto correspondiente a regobligacionBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<regobligacionBean> fnAutocompleteregobligacionBean(regobligacionBean poregobligacionBean) throws Exception {
  ArrayList<regobligacionBean> listaregobligacionBean = null;
  try {
  listaregobligacionBean = Generic.getInstance(regobligacionDAT.class).fnAutocompleteregobligacionBean(poregobligacionBean);
  } catch (IllegalAccessException | InstantiationException | SQLException ex) {
  } finally {
  }
  return listaregobligacionBean;
  }
  /**
  * @fnGetregobligacionBean, es un metodo que retorna un objeto especifico de regobligacionBean
  * @param poregobligacionBean, Objeto correspondiente a regobligacionBean
  * @return Retorna el Objeto regobligacionBean
  * @throws Exception
  */
  public regobligacionBean fnGetregobligacionBean(regobligacionBean poregobligacionBean) throws Exception {
  return Generic.getInstance(regobligacionDAT.class).fnGetregobligacionBean(poregobligacionBean);
  }
  /**
  * @fnInsertarregobligacionBean,  es un metodo que Inserta un  regobligacionBean
  * @param poregobligacionBean, Objeto correspondiente a regobligacionBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarregobligacionBean(regobligacionBean poregobligacionBean) throws Exception {
  return Generic.getInstance(regobligacionDAT.class).fnInsertarregobligacionBean(poregobligacionBean);
  }
  /**
  * @fnEliminarregobligacionBean,  es un metodo que Elimina un  regobligacionBean
  * @param poregobligacionBean, Objeto correspondiente a regobligacionBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarregobligacionBean(regobligacionBean poregobligacionBean) throws Exception {
  return Generic.getInstance(regobligacionDAT.class).fnEliminarregobligacionBean(poregobligacionBean);
  }
  /**
  * @fnActualizarregobligacionBean,  es un metodo que Actualiza un  regobligacionBean
  * @param poregobligacionBean, Objeto correspondiente a regobligacionBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarregobligacionBean(regobligacionBean poregobligacionBean) throws Exception {
  return Generic.getInstance(regobligacionDAT.class).fnActualizarregobligacionBean(poregobligacionBean);
  }
    }

