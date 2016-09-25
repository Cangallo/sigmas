/*******************************************************************************
* Descripcion       : Clase que contiene los metodos transaccionales de logica del negocio de maetipopersona
* Creado por        : APP
* Fecha de Creacion : 22/05/2015 12:08:02
********************************************************************************/

package pe.sigmas.logica;

import pe.sigmas.entity.maetipopersonaBean;
import pe.sigmas.datos.maetipopersonaDAT;
import pe.sigmas.util.Generic;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;


/**
*
* @author APP
 */
    public class maetipopersonaBL
    {
  /**
  * @fnIsmaetipopersonaBean, es un metodo que retorna si existe un maetipopersonaBean metodo efectivo para validaciones
  * @param pomaetipopersonaBean, Objeto correspondiente a maetipopersonaBean
  * @return Retorna true cuando existe un maetipopersonaBean, false cuando no existe un maetipopersonaBean
  * @throws Exception
  */
        public boolean fnIsmaetipopersonaBean (maetipopersonaBean pomaetipopersonaBean) throws Exception 
        {
         boolean status = Generic.getInstance(maetipopersonaDAT.class).fnIsmaetipopersonaBean(pomaetipopersonaBean);
        if (!status) {
        pomaetipopersonaBean.setMensaje("El IndexBean buscado no existe");
        }
        return status;
        }
  /**
  * @fnGetListmaetipopersonaBean, es un metodo que retorna una lista de objetos de maetipopersonaBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaetipopersonaBean, Objeto correspondiente a maetipopersonaBean
  * @return Retorna una lista de objetos maetipopersonaBean
  * @throws Exception
  */
  public List fnGetListmaetipopersonaBean(maetipopersonaBean pomaetipopersonaBean) throws Exception {
  List list = Generic.getInstance(maetipopersonaDAT.class).fnGetListmaetipopersonaBean(pomaetipopersonaBean);
  return list;
  }
  /**
  * @fnGridmaetipopersonaBean, es un metodo que retorna una lista de objetos de maetipopersonaBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaetipopersonaBean, Objeto correspondiente a maetipopersonaBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridmaetipopersonaBean(maetipopersonaBean pomaetipopersonaBean) throws Exception {
  List list= Generic.getInstance(maetipopersonaDAT.class).fnGridmaetipopersonaBean(pomaetipopersonaBean);
  return list;
  }
  /**
  * @fnAutocompletemaetipopersonaBean, es un metodo que retorna una lista de objetos de maetipopersonaBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaetipopersonaBean, Objeto correspondiente a maetipopersonaBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<maetipopersonaBean> fnAutocompletemaetipopersonaBean(maetipopersonaBean pomaetipopersonaBean) throws Exception {
  ArrayList<maetipopersonaBean> listamaetipopersonaBean = null;
  try {
  listamaetipopersonaBean = Generic.getInstance(maetipopersonaDAT.class).fnAutocompletemaetipopersonaBean(pomaetipopersonaBean);
  } catch (IllegalAccessException | InstantiationException | SQLException ex) {
  } finally {
  }
  return listamaetipopersonaBean;
  }
  /**
  * @fnGetmaetipopersonaBean, es un metodo que retorna un objeto especifico de maetipopersonaBean
  * @param pomaetipopersonaBean, Objeto correspondiente a maetipopersonaBean
  * @return Retorna el Objeto maetipopersonaBean
  * @throws Exception
  */
  public maetipopersonaBean fnGetmaetipopersonaBean(maetipopersonaBean pomaetipopersonaBean) throws Exception {
  return Generic.getInstance(maetipopersonaDAT.class).fnGetmaetipopersonaBean(pomaetipopersonaBean);
  }
  /**
  * @fnInsertarmaetipopersonaBean,  es un metodo que Inserta un  maetipopersonaBean
  * @param pomaetipopersonaBean, Objeto correspondiente a maetipopersonaBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarmaetipopersonaBean(maetipopersonaBean pomaetipopersonaBean) throws Exception {
  return Generic.getInstance(maetipopersonaDAT.class).fnInsertarmaetipopersonaBean(pomaetipopersonaBean);
  }
  /**
  * @fnEliminarmaetipopersonaBean,  es un metodo que Elimina un  maetipopersonaBean
  * @param pomaetipopersonaBean, Objeto correspondiente a maetipopersonaBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarmaetipopersonaBean(maetipopersonaBean pomaetipopersonaBean) throws Exception {
  return Generic.getInstance(maetipopersonaDAT.class).fnEliminarmaetipopersonaBean(pomaetipopersonaBean);
  }
  /**
  * @fnActualizarmaetipopersonaBean,  es un metodo que Actualiza un  maetipopersonaBean
  * @param pomaetipopersonaBean, Objeto correspondiente a maetipopersonaBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarmaetipopersonaBean(maetipopersonaBean pomaetipopersonaBean) throws Exception {
  return Generic.getInstance(maetipopersonaDAT.class).fnActualizarmaetipopersonaBean(pomaetipopersonaBean);
  }
    }

