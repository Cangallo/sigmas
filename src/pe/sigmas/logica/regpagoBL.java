/*******************************************************************************
* Descripcion       : Clase que contiene los metodos transaccionales de logica del negocio de regpago
* Creado por        : APP
* Fecha de Creacion : 22/05/2015 12:08:02
********************************************************************************/

package pe.sigmas.logica;

import pe.sigmas.entity.regpagoBean;
import pe.sigmas.datos.regpagoDAT;
import pe.sigmas.util.Generic;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;


/**
*
* @author APP
 */
    public class regpagoBL
    {
  /**
  * @fnIsregpagoBean, es un metodo que retorna si existe un regpagoBean metodo efectivo para validaciones
  * @param poregpagoBean, Objeto correspondiente a regpagoBean
  * @return Retorna true cuando existe un regpagoBean, false cuando no existe un regpagoBean
  * @throws Exception
  */
        public boolean fnIsregpagoBean (regpagoBean poregpagoBean) throws Exception 
        {
         boolean status = Generic.getInstance(regpagoDAT.class).fnIsregpagoBean(poregpagoBean);
        if (!status) {
        poregpagoBean.setMensaje("El IndexBean buscado no existe");
        }
        return status;
        }
  /**
  * @fnGetListregpagoBean, es un metodo que retorna una lista de objetos de regpagoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregpagoBean, Objeto correspondiente a regpagoBean
  * @return Retorna una lista de objetos regpagoBean
  * @throws Exception
  */
  public List fnGetListregpagoBean(regpagoBean poregpagoBean) throws Exception {
  List list = Generic.getInstance(regpagoDAT.class).fnGetListregpagoBean(poregpagoBean);
  return list;
  }
  /**
  * @fnGridregpagoBean, es un metodo que retorna una lista de objetos de regpagoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregpagoBean, Objeto correspondiente a regpagoBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridregpagoBean(regpagoBean poregpagoBean) throws Exception {
  List list= Generic.getInstance(regpagoDAT.class).fnGridregpagoBean(poregpagoBean);
  return list;
  }
  /**
  * @fnAutocompleteregpagoBean, es un metodo que retorna una lista de objetos de regpagoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregpagoBean, Objeto correspondiente a regpagoBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<regpagoBean> fnAutocompleteregpagoBean(regpagoBean poregpagoBean) throws Exception {
  ArrayList<regpagoBean> listaregpagoBean = null;
  try {
  listaregpagoBean = Generic.getInstance(regpagoDAT.class).fnAutocompleteregpagoBean(poregpagoBean);
  } catch (IllegalAccessException | InstantiationException | SQLException ex) {
  } finally {
  }
  return listaregpagoBean;
  }
  /**
  * @fnGetregpagoBean, es un metodo que retorna un objeto especifico de regpagoBean
  * @param poregpagoBean, Objeto correspondiente a regpagoBean
  * @return Retorna el Objeto regpagoBean
  * @throws Exception
  */
  public regpagoBean fnGetregpagoBean(regpagoBean poregpagoBean) throws Exception {
  return Generic.getInstance(regpagoDAT.class).fnGetregpagoBean(poregpagoBean);
  }
  /**
  * @fnInsertarregpagoBean,  es un metodo que Inserta un  regpagoBean
  * @param poregpagoBean, Objeto correspondiente a regpagoBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarregpagoBean(regpagoBean poregpagoBean) throws Exception {
  return Generic.getInstance(regpagoDAT.class).fnInsertarregpagoBean(poregpagoBean);
  }
  /**
  * @fnEliminarregpagoBean,  es un metodo que Elimina un  regpagoBean
  * @param poregpagoBean, Objeto correspondiente a regpagoBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarregpagoBean(regpagoBean poregpagoBean) throws Exception {
  return Generic.getInstance(regpagoDAT.class).fnEliminarregpagoBean(poregpagoBean);
  }
  /**
  * @fnActualizarregpagoBean,  es un metodo que Actualiza un  regpagoBean
  * @param poregpagoBean, Objeto correspondiente a regpagoBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarregpagoBean(regpagoBean poregpagoBean) throws Exception {
  return Generic.getInstance(regpagoDAT.class).fnActualizarregpagoBean(poregpagoBean);
  }
    }

