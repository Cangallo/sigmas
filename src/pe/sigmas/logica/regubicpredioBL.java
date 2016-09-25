/*******************************************************************************
* Descripcion       : Clase que contiene los metodos transaccionales de logica del negocio de regubicpredio
* Creado por        : APP
* Fecha de Creacion : 22/05/2015 12:08:02
********************************************************************************/

package pe.sigmas.logica;

import pe.sigmas.entity.regubicpredioBean;
import pe.sigmas.datos.regubicpredioDAT;
import pe.sigmas.util.Generic;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;


/**
*
* @author APP
 */
    public class regubicpredioBL
    {
  /**
  * @fnIsregubicpredioBean, es un metodo que retorna si existe un regubicpredioBean metodo efectivo para validaciones
  * @param poregubicpredioBean, Objeto correspondiente a regubicpredioBean
  * @return Retorna true cuando existe un regubicpredioBean, false cuando no existe un regubicpredioBean
  * @throws Exception
  */
        public boolean fnIsregubicpredioBean (regubicpredioBean poregubicpredioBean) throws Exception 
        {
         boolean status = Generic.getInstance(regubicpredioDAT.class).fnIsregubicpredioBean(poregubicpredioBean);
        if (!status) {
        poregubicpredioBean.setMensaje("El IndexBean buscado no existe");
        }
        return status;
        }
  /**
  * @fnGetListregubicpredioBean, es un metodo que retorna una lista de objetos de regubicpredioBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregubicpredioBean, Objeto correspondiente a regubicpredioBean
  * @return Retorna una lista de objetos regubicpredioBean
  * @throws Exception
  */
  public List fnGetListregubicpredioBean(regubicpredioBean poregubicpredioBean) throws Exception {
  List list = Generic.getInstance(regubicpredioDAT.class).fnGetListregubicpredioBean(poregubicpredioBean);
  return list;
  }
  /**
  * @fnGridregubicpredioBean, es un metodo que retorna una lista de objetos de regubicpredioBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregubicpredioBean, Objeto correspondiente a regubicpredioBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridregubicpredioBean(regubicpredioBean poregubicpredioBean) throws Exception {
  List list= Generic.getInstance(regubicpredioDAT.class).fnGridregubicpredioBean(poregubicpredioBean);
  return list;
  }
  /**
  * @fnAutocompleteregubicpredioBean, es un metodo que retorna una lista de objetos de regubicpredioBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregubicpredioBean, Objeto correspondiente a regubicpredioBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<regubicpredioBean> fnAutocompleteregubicpredioBean(regubicpredioBean poregubicpredioBean) throws Exception {
  ArrayList<regubicpredioBean> listaregubicpredioBean = null;
  try {
  listaregubicpredioBean = Generic.getInstance(regubicpredioDAT.class).fnAutocompleteregubicpredioBean(poregubicpredioBean);
  } catch (IllegalAccessException | InstantiationException | SQLException ex) {
  } finally {
  }
  return listaregubicpredioBean;
  }
  /**
  * @fnGetregubicpredioBean, es un metodo que retorna un objeto especifico de regubicpredioBean
  * @param poregubicpredioBean, Objeto correspondiente a regubicpredioBean
  * @return Retorna el Objeto regubicpredioBean
  * @throws Exception
  */
  public regubicpredioBean fnGetregubicpredioBean(regubicpredioBean poregubicpredioBean) throws Exception {
  return Generic.getInstance(regubicpredioDAT.class).fnGetregubicpredioBean(poregubicpredioBean);
  }
  /**
  * @fnInsertarregubicpredioBean,  es un metodo que Inserta un  regubicpredioBean
  * @param poregubicpredioBean, Objeto correspondiente a regubicpredioBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarregubicpredioBean(regubicpredioBean poregubicpredioBean) throws Exception {
  return Generic.getInstance(regubicpredioDAT.class).fnInsertarregubicpredioBean(poregubicpredioBean);
  }
  /**
  * @fnEliminarregubicpredioBean,  es un metodo que Elimina un  regubicpredioBean
  * @param poregubicpredioBean, Objeto correspondiente a regubicpredioBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarregubicpredioBean(regubicpredioBean poregubicpredioBean) throws Exception {
  return Generic.getInstance(regubicpredioDAT.class).fnEliminarregubicpredioBean(poregubicpredioBean);
  }
  /**
  * @fnActualizarregubicpredioBean,  es un metodo que Actualiza un  regubicpredioBean
  * @param poregubicpredioBean, Objeto correspondiente a regubicpredioBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarregubicpredioBean(regubicpredioBean poregubicpredioBean) throws Exception {
  return Generic.getInstance(regubicpredioDAT.class).fnActualizarregubicpredioBean(poregubicpredioBean);
  }
    }

