/*******************************************************************************
* Descripcion       : Clase que contiene los metodos transaccionales de logica del negocio de maesexo
* Creado por        : APP
* Fecha de Creacion : 22/05/2015 12:08:02
********************************************************************************/

package pe.sigmas.logica;

import pe.sigmas.entity.maesexoBean;
import pe.sigmas.datos.maesexoDAT;
import pe.sigmas.util.Generic;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;


/**
*
* @author APP
 */
    public class maesexoBL
    {
  /**
  * @fnIsmaesexoBean, es un metodo que retorna si existe un maesexoBean metodo efectivo para validaciones
  * @param pomaesexoBean, Objeto correspondiente a maesexoBean
  * @return Retorna true cuando existe un maesexoBean, false cuando no existe un maesexoBean
  * @throws Exception
  */
        public boolean fnIsmaesexoBean (maesexoBean pomaesexoBean) throws Exception 
        {
         boolean status = Generic.getInstance(maesexoDAT.class).fnIsmaesexoBean(pomaesexoBean);
        if (!status) {
        pomaesexoBean.setMensaje("El IndexBean buscado no existe");
        }
        return status;
        }
  /**
  * @fnGetListmaesexoBean, es un metodo que retorna una lista de objetos de maesexoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaesexoBean, Objeto correspondiente a maesexoBean
  * @return Retorna una lista de objetos maesexoBean
  * @throws Exception
  */
  public List fnGetListmaesexoBean(maesexoBean pomaesexoBean) throws Exception {
  List list = Generic.getInstance(maesexoDAT.class).fnGetListmaesexoBean(pomaesexoBean);
  return list;
  }
  /**
  * @fnGridmaesexoBean, es un metodo que retorna una lista de objetos de maesexoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaesexoBean, Objeto correspondiente a maesexoBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridmaesexoBean(maesexoBean pomaesexoBean) throws Exception {
  List list= Generic.getInstance(maesexoDAT.class).fnGridmaesexoBean(pomaesexoBean);
  return list;
  }
  /**
  * @fnAutocompletemaesexoBean, es un metodo que retorna una lista de objetos de maesexoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaesexoBean, Objeto correspondiente a maesexoBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<maesexoBean> fnAutocompletemaesexoBean(maesexoBean pomaesexoBean) throws Exception {
  ArrayList<maesexoBean> listamaesexoBean = null;
  try {
  listamaesexoBean = Generic.getInstance(maesexoDAT.class).fnAutocompletemaesexoBean(pomaesexoBean);
  } catch (IllegalAccessException | InstantiationException | SQLException ex) {
  } finally {
  }
  return listamaesexoBean;
  }
  /**
  * @fnGetmaesexoBean, es un metodo que retorna un objeto especifico de maesexoBean
  * @param pomaesexoBean, Objeto correspondiente a maesexoBean
  * @return Retorna el Objeto maesexoBean
  * @throws Exception
  */
  public maesexoBean fnGetmaesexoBean(maesexoBean pomaesexoBean) throws Exception {
  return Generic.getInstance(maesexoDAT.class).fnGetmaesexoBean(pomaesexoBean);
  }
  /**
  * @fnInsertarmaesexoBean,  es un metodo que Inserta un  maesexoBean
  * @param pomaesexoBean, Objeto correspondiente a maesexoBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarmaesexoBean(maesexoBean pomaesexoBean) throws Exception {
  return Generic.getInstance(maesexoDAT.class).fnInsertarmaesexoBean(pomaesexoBean);
  }
  /**
  * @fnEliminarmaesexoBean,  es un metodo que Elimina un  maesexoBean
  * @param pomaesexoBean, Objeto correspondiente a maesexoBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarmaesexoBean(maesexoBean pomaesexoBean) throws Exception {
  return Generic.getInstance(maesexoDAT.class).fnEliminarmaesexoBean(pomaesexoBean);
  }
  /**
  * @fnActualizarmaesexoBean,  es un metodo que Actualiza un  maesexoBean
  * @param pomaesexoBean, Objeto correspondiente a maesexoBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarmaesexoBean(maesexoBean pomaesexoBean) throws Exception {
  return Generic.getInstance(maesexoDAT.class).fnActualizarmaesexoBean(pomaesexoBean);
  }
    }

