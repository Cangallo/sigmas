/*******************************************************************************
* Descripcion       : Clase que contiene los metodos transaccionales de logica del negocio de maeestacivil
* Creado por        : APP
* Fecha de Creacion : 22/05/2015 12:08:01
********************************************************************************/

package pe.sigmas.logica;

import pe.sigmas.entity.maeestacivilBean;
import pe.sigmas.datos.maeestacivilDAT;
import pe.sigmas.util.Generic;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;


/**
*
* @author APP
 */
    public class maeestacivilBL
    {
  /**
  * @fnIsmaeestacivilBean, es un metodo que retorna si existe un maeestacivilBean metodo efectivo para validaciones
  * @param pomaeestacivilBean, Objeto correspondiente a maeestacivilBean
  * @return Retorna true cuando existe un maeestacivilBean, false cuando no existe un maeestacivilBean
  * @throws Exception
  */
        public boolean fnIsmaeestacivilBean (maeestacivilBean pomaeestacivilBean) throws Exception 
        {
         boolean status = Generic.getInstance(maeestacivilDAT.class).fnIsmaeestacivilBean(pomaeestacivilBean);
        if (!status) {
        pomaeestacivilBean.setMensaje("El IndexBean buscado no existe");
        }
        return status;
        }
  /**
  * @fnGetListmaeestacivilBean, es un metodo que retorna una lista de objetos de maeestacivilBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaeestacivilBean, Objeto correspondiente a maeestacivilBean
  * @return Retorna una lista de objetos maeestacivilBean
  * @throws Exception
  */
  public List fnGetListmaeestacivilBean(maeestacivilBean pomaeestacivilBean) throws Exception {
  List list = Generic.getInstance(maeestacivilDAT.class).fnGetListmaeestacivilBean(pomaeestacivilBean);
  return list;
  }
  /**
  * @fnGridmaeestacivilBean, es un metodo que retorna una lista de objetos de maeestacivilBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaeestacivilBean, Objeto correspondiente a maeestacivilBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridmaeestacivilBean(maeestacivilBean pomaeestacivilBean) throws Exception {
  List list= Generic.getInstance(maeestacivilDAT.class).fnGridmaeestacivilBean(pomaeestacivilBean);
  return list;
  }
  /**
  * @fnAutocompletemaeestacivilBean, es un metodo que retorna una lista de objetos de maeestacivilBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaeestacivilBean, Objeto correspondiente a maeestacivilBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<maeestacivilBean> fnAutocompletemaeestacivilBean(maeestacivilBean pomaeestacivilBean) throws Exception {
  ArrayList<maeestacivilBean> listamaeestacivilBean = null;
  try {
  listamaeestacivilBean = Generic.getInstance(maeestacivilDAT.class).fnAutocompletemaeestacivilBean(pomaeestacivilBean);
  } catch (IllegalAccessException | InstantiationException | SQLException ex) {
  } finally {
  }
  return listamaeestacivilBean;
  }
  /**
  * @fnGetmaeestacivilBean, es un metodo que retorna un objeto especifico de maeestacivilBean
  * @param pomaeestacivilBean, Objeto correspondiente a maeestacivilBean
  * @return Retorna el Objeto maeestacivilBean
  * @throws Exception
  */
  public maeestacivilBean fnGetmaeestacivilBean(maeestacivilBean pomaeestacivilBean) throws Exception {
  return Generic.getInstance(maeestacivilDAT.class).fnGetmaeestacivilBean(pomaeestacivilBean);
  }
  /**
  * @fnInsertarmaeestacivilBean,  es un metodo que Inserta un  maeestacivilBean
  * @param pomaeestacivilBean, Objeto correspondiente a maeestacivilBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarmaeestacivilBean(maeestacivilBean pomaeestacivilBean) throws Exception {
  return Generic.getInstance(maeestacivilDAT.class).fnInsertarmaeestacivilBean(pomaeestacivilBean);
  }
  /**
  * @fnEliminarmaeestacivilBean,  es un metodo que Elimina un  maeestacivilBean
  * @param pomaeestacivilBean, Objeto correspondiente a maeestacivilBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarmaeestacivilBean(maeestacivilBean pomaeestacivilBean) throws Exception {
  return Generic.getInstance(maeestacivilDAT.class).fnEliminarmaeestacivilBean(pomaeestacivilBean);
  }
  /**
  * @fnActualizarmaeestacivilBean,  es un metodo que Actualiza un  maeestacivilBean
  * @param pomaeestacivilBean, Objeto correspondiente a maeestacivilBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarmaeestacivilBean(maeestacivilBean pomaeestacivilBean) throws Exception {
  return Generic.getInstance(maeestacivilDAT.class).fnActualizarmaeestacivilBean(pomaeestacivilBean);
  }
    }

