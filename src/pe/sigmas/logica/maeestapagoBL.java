/*******************************************************************************
* Descripcion       : Clase que contiene los metodos transaccionales de logica del negocio de maeestapago
* Creado por        : APP
* Fecha de Creacion : 22/05/2015 12:08:02
********************************************************************************/

package pe.sigmas.logica;

import pe.sigmas.entity.maeestapagoBean;
import pe.sigmas.datos.maeestapagoDAT;
import pe.sigmas.util.Generic;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;


/**
*
* @author APP
 */
    public class maeestapagoBL
    {
  /**
  * @fnIsmaeestapagoBean, es un metodo que retorna si existe un maeestapagoBean metodo efectivo para validaciones
  * @param pomaeestapagoBean, Objeto correspondiente a maeestapagoBean
  * @return Retorna true cuando existe un maeestapagoBean, false cuando no existe un maeestapagoBean
  * @throws Exception
  */
        public boolean fnIsmaeestapagoBean (maeestapagoBean pomaeestapagoBean) throws Exception 
        {
         boolean status = Generic.getInstance(maeestapagoDAT.class).fnIsmaeestapagoBean(pomaeestapagoBean);
        if (!status) {
        pomaeestapagoBean.setMensaje("El IndexBean buscado no existe");
        }
        return status;
        }
  /**
  * @fnGetListmaeestapagoBean, es un metodo que retorna una lista de objetos de maeestapagoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaeestapagoBean, Objeto correspondiente a maeestapagoBean
  * @return Retorna una lista de objetos maeestapagoBean
  * @throws Exception
  */
  public List fnGetListmaeestapagoBean(maeestapagoBean pomaeestapagoBean) throws Exception {
  List list = Generic.getInstance(maeestapagoDAT.class).fnGetListmaeestapagoBean(pomaeestapagoBean);
  return list;
  }
  /**
  * @fnGridmaeestapagoBean, es un metodo que retorna una lista de objetos de maeestapagoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaeestapagoBean, Objeto correspondiente a maeestapagoBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridmaeestapagoBean(maeestapagoBean pomaeestapagoBean) throws Exception {
  List list= Generic.getInstance(maeestapagoDAT.class).fnGridmaeestapagoBean(pomaeestapagoBean);
  return list;
  }
  /**
  * @fnAutocompletemaeestapagoBean, es un metodo que retorna una lista de objetos de maeestapagoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaeestapagoBean, Objeto correspondiente a maeestapagoBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<maeestapagoBean> fnAutocompletemaeestapagoBean(maeestapagoBean pomaeestapagoBean) throws Exception {
  ArrayList<maeestapagoBean> listamaeestapagoBean = null;
  try {
  listamaeestapagoBean = Generic.getInstance(maeestapagoDAT.class).fnAutocompletemaeestapagoBean(pomaeestapagoBean);
  } catch (IllegalAccessException | InstantiationException | SQLException ex) {
  } finally {
  }
  return listamaeestapagoBean;
  }
  /**
  * @fnGetmaeestapagoBean, es un metodo que retorna un objeto especifico de maeestapagoBean
  * @param pomaeestapagoBean, Objeto correspondiente a maeestapagoBean
  * @return Retorna el Objeto maeestapagoBean
  * @throws Exception
  */
  public maeestapagoBean fnGetmaeestapagoBean(maeestapagoBean pomaeestapagoBean) throws Exception {
  return Generic.getInstance(maeestapagoDAT.class).fnGetmaeestapagoBean(pomaeestapagoBean);
  }
  /**
  * @fnInsertarmaeestapagoBean,  es un metodo que Inserta un  maeestapagoBean
  * @param pomaeestapagoBean, Objeto correspondiente a maeestapagoBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarmaeestapagoBean(maeestapagoBean pomaeestapagoBean) throws Exception {
  return Generic.getInstance(maeestapagoDAT.class).fnInsertarmaeestapagoBean(pomaeestapagoBean);
  }
  /**
  * @fnEliminarmaeestapagoBean,  es un metodo que Elimina un  maeestapagoBean
  * @param pomaeestapagoBean, Objeto correspondiente a maeestapagoBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarmaeestapagoBean(maeestapagoBean pomaeestapagoBean) throws Exception {
  return Generic.getInstance(maeestapagoDAT.class).fnEliminarmaeestapagoBean(pomaeestapagoBean);
  }
  /**
  * @fnActualizarmaeestapagoBean,  es un metodo que Actualiza un  maeestapagoBean
  * @param pomaeestapagoBean, Objeto correspondiente a maeestapagoBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarmaeestapagoBean(maeestapagoBean pomaeestapagoBean) throws Exception {
  return Generic.getInstance(maeestapagoDAT.class).fnActualizarmaeestapagoBean(pomaeestapagoBean);
  }
    }

