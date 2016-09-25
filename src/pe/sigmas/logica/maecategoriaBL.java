/*******************************************************************************
* Descripcion       : Clase que contiene los metodos transaccionales de logica del negocio de maecategoria
* Creado por        : APP
* Fecha de Creacion : 22/05/2015 12:08:01
********************************************************************************/

package pe.sigmas.logica;

import pe.sigmas.entity.maecategoriaBean;
import pe.sigmas.datos.maecategoriaDAT;
import pe.sigmas.util.Generic;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;


/**
*
* @author APP
 */
    public class maecategoriaBL
    {
  /**
  * @fnIsmaecategoriaBean, es un metodo que retorna si existe un maecategoriaBean metodo efectivo para validaciones
  * @param pomaecategoriaBean, Objeto correspondiente a maecategoriaBean
  * @return Retorna true cuando existe un maecategoriaBean, false cuando no existe un maecategoriaBean
  * @throws Exception
  */
        public boolean fnIsmaecategoriaBean (maecategoriaBean pomaecategoriaBean) throws Exception 
        {
         boolean status = Generic.getInstance(maecategoriaDAT.class).fnIsmaecategoriaBean(pomaecategoriaBean);
        if (!status) {
        pomaecategoriaBean.setMensaje("El IndexBean buscado no existe");
        }
        return status;
        }
  /**
  * @fnGetListmaecategoriaBean, es un metodo que retorna una lista de objetos de maecategoriaBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaecategoriaBean, Objeto correspondiente a maecategoriaBean
  * @return Retorna una lista de objetos maecategoriaBean
  * @throws Exception
  */
  public List fnGetListmaecategoriaBean(maecategoriaBean pomaecategoriaBean) throws Exception {
  List list = Generic.getInstance(maecategoriaDAT.class).fnGetListmaecategoriaBean(pomaecategoriaBean);
  return list;
  }
  /**
  * @fnGridmaecategoriaBean, es un metodo que retorna una lista de objetos de maecategoriaBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaecategoriaBean, Objeto correspondiente a maecategoriaBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridmaecategoriaBean(maecategoriaBean pomaecategoriaBean) throws Exception {
  List list= Generic.getInstance(maecategoriaDAT.class).fnGridmaecategoriaBean(pomaecategoriaBean);
  return list;
  }
  /**
  * @fnAutocompletemaecategoriaBean, es un metodo que retorna una lista de objetos de maecategoriaBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaecategoriaBean, Objeto correspondiente a maecategoriaBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<maecategoriaBean> fnAutocompletemaecategoriaBean(maecategoriaBean pomaecategoriaBean) throws Exception {
  ArrayList<maecategoriaBean> listamaecategoriaBean = null;
  try {
  listamaecategoriaBean = Generic.getInstance(maecategoriaDAT.class).fnAutocompletemaecategoriaBean(pomaecategoriaBean);
  } catch (IllegalAccessException | InstantiationException | SQLException ex) {
  } finally {
  }
  return listamaecategoriaBean;
  }
  /**
  * @fnGetmaecategoriaBean, es un metodo que retorna un objeto especifico de maecategoriaBean
  * @param pomaecategoriaBean, Objeto correspondiente a maecategoriaBean
  * @return Retorna el Objeto maecategoriaBean
  * @throws Exception
  */
  public maecategoriaBean fnGetmaecategoriaBean(maecategoriaBean pomaecategoriaBean) throws Exception {
  return Generic.getInstance(maecategoriaDAT.class).fnGetmaecategoriaBean(pomaecategoriaBean);
  }
  /**
  * @fnInsertarmaecategoriaBean,  es un metodo que Inserta un  maecategoriaBean
  * @param pomaecategoriaBean, Objeto correspondiente a maecategoriaBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarmaecategoriaBean(maecategoriaBean pomaecategoriaBean) throws Exception {
  return Generic.getInstance(maecategoriaDAT.class).fnInsertarmaecategoriaBean(pomaecategoriaBean);
  }
  /**
  * @fnEliminarmaecategoriaBean,  es un metodo que Elimina un  maecategoriaBean
  * @param pomaecategoriaBean, Objeto correspondiente a maecategoriaBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarmaecategoriaBean(maecategoriaBean pomaecategoriaBean) throws Exception {
  return Generic.getInstance(maecategoriaDAT.class).fnEliminarmaecategoriaBean(pomaecategoriaBean);
  }
  /**
  * @fnActualizarmaecategoriaBean,  es un metodo que Actualiza un  maecategoriaBean
  * @param pomaecategoriaBean, Objeto correspondiente a maecategoriaBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarmaecategoriaBean(maecategoriaBean pomaecategoriaBean) throws Exception {
  return Generic.getInstance(maecategoriaDAT.class).fnActualizarmaecategoriaBean(pomaecategoriaBean);
  }
    }

