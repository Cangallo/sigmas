/*******************************************************************************
* Descripcion       : Clase que contiene los metodos transaccionales de logica del negocio de maeestaobligacion
* Creado por        : APP
* Fecha de Creacion : 22/05/2015 12:08:02
********************************************************************************/

package pe.sigmas.logica;

import pe.sigmas.entity.maeestaobligacionBean;
import pe.sigmas.datos.maeestaobligacionDAT;
import pe.sigmas.util.Generic;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;


/**
*
* @author APP
 */
    public class maeestaobligacionBL
    {
  /**
  * @fnIsmaeestaobligacionBean, es un metodo que retorna si existe un maeestaobligacionBean metodo efectivo para validaciones
  * @param pomaeestaobligacionBean, Objeto correspondiente a maeestaobligacionBean
  * @return Retorna true cuando existe un maeestaobligacionBean, false cuando no existe un maeestaobligacionBean
  * @throws Exception
  */
        public boolean fnIsmaeestaobligacionBean (maeestaobligacionBean pomaeestaobligacionBean) throws Exception 
        {
         boolean status = Generic.getInstance(maeestaobligacionDAT.class).fnIsmaeestaobligacionBean(pomaeestaobligacionBean);
        if (!status) {
        pomaeestaobligacionBean.setMensaje("El IndexBean buscado no existe");
        }
        return status;
        }
  /**
  * @fnGetListmaeestaobligacionBean, es un metodo que retorna una lista de objetos de maeestaobligacionBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaeestaobligacionBean, Objeto correspondiente a maeestaobligacionBean
  * @return Retorna una lista de objetos maeestaobligacionBean
  * @throws Exception
  */
  public List fnGetListmaeestaobligacionBean(maeestaobligacionBean pomaeestaobligacionBean) throws Exception {
  List list = Generic.getInstance(maeestaobligacionDAT.class).fnGetListmaeestaobligacionBean(pomaeestaobligacionBean);
  return list;
  }
  /**
  * @fnGridmaeestaobligacionBean, es un metodo que retorna una lista de objetos de maeestaobligacionBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaeestaobligacionBean, Objeto correspondiente a maeestaobligacionBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridmaeestaobligacionBean(maeestaobligacionBean pomaeestaobligacionBean) throws Exception {
  List list= Generic.getInstance(maeestaobligacionDAT.class).fnGridmaeestaobligacionBean(pomaeestaobligacionBean);
  return list;
  }
  /**
  * @fnAutocompletemaeestaobligacionBean, es un metodo que retorna una lista de objetos de maeestaobligacionBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaeestaobligacionBean, Objeto correspondiente a maeestaobligacionBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<maeestaobligacionBean> fnAutocompletemaeestaobligacionBean(maeestaobligacionBean pomaeestaobligacionBean) throws Exception {
  ArrayList<maeestaobligacionBean> listamaeestaobligacionBean = null;
  try {
  listamaeestaobligacionBean = Generic.getInstance(maeestaobligacionDAT.class).fnAutocompletemaeestaobligacionBean(pomaeestaobligacionBean);
  } catch (IllegalAccessException | InstantiationException | SQLException ex) {
  } finally {
  }
  return listamaeestaobligacionBean;
  }
  /**
  * @fnGetmaeestaobligacionBean, es un metodo que retorna un objeto especifico de maeestaobligacionBean
  * @param pomaeestaobligacionBean, Objeto correspondiente a maeestaobligacionBean
  * @return Retorna el Objeto maeestaobligacionBean
  * @throws Exception
  */
  public maeestaobligacionBean fnGetmaeestaobligacionBean(maeestaobligacionBean pomaeestaobligacionBean) throws Exception {
  return Generic.getInstance(maeestaobligacionDAT.class).fnGetmaeestaobligacionBean(pomaeestaobligacionBean);
  }
  /**
  * @fnInsertarmaeestaobligacionBean,  es un metodo que Inserta un  maeestaobligacionBean
  * @param pomaeestaobligacionBean, Objeto correspondiente a maeestaobligacionBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarmaeestaobligacionBean(maeestaobligacionBean pomaeestaobligacionBean) throws Exception {
  return Generic.getInstance(maeestaobligacionDAT.class).fnInsertarmaeestaobligacionBean(pomaeestaobligacionBean);
  }
  /**
  * @fnEliminarmaeestaobligacionBean,  es un metodo que Elimina un  maeestaobligacionBean
  * @param pomaeestaobligacionBean, Objeto correspondiente a maeestaobligacionBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarmaeestaobligacionBean(maeestaobligacionBean pomaeestaobligacionBean) throws Exception {
  return Generic.getInstance(maeestaobligacionDAT.class).fnEliminarmaeestaobligacionBean(pomaeestaobligacionBean);
  }
  /**
  * @fnActualizarmaeestaobligacionBean,  es un metodo que Actualiza un  maeestaobligacionBean
  * @param pomaeestaobligacionBean, Objeto correspondiente a maeestaobligacionBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarmaeestaobligacionBean(maeestaobligacionBean pomaeestaobligacionBean) throws Exception {
  return Generic.getInstance(maeestaobligacionDAT.class).fnActualizarmaeestaobligacionBean(pomaeestaobligacionBean);
  }
    }

