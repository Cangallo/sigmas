/*******************************************************************************
* Descripcion       : Clase que contiene los metodos transaccionales de logica del negocio de vencimiento
* Creado por        : APP
* Fecha de Creacion : 22/05/2015 12:08:02
********************************************************************************/

package pe.sigmas.logica;

import pe.sigmas.entity.vencimientoBean;
import pe.sigmas.datos.vencimientoDAT;
import pe.sigmas.util.Generic;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;


/**
*
* @author APP
 */
    public class vencimientoBL
    {
  /**
  * @fnIsvencimientoBean, es un metodo que retorna si existe un vencimientoBean metodo efectivo para validaciones
  * @param povencimientoBean, Objeto correspondiente a vencimientoBean
  * @return Retorna true cuando existe un vencimientoBean, false cuando no existe un vencimientoBean
  * @throws Exception
  */
        public boolean fnIsvencimientoBean (vencimientoBean povencimientoBean) throws Exception 
        {
         boolean status = Generic.getInstance(vencimientoDAT.class).fnIsvencimientoBean(povencimientoBean);
        if (!status) {
        povencimientoBean.setMensaje("El IndexBean buscado no existe");
        }
        return status;
        }
  /**
  * @fnGetListvencimientoBean, es un metodo que retorna una lista de objetos de vencimientoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param povencimientoBean, Objeto correspondiente a vencimientoBean
  * @return Retorna una lista de objetos vencimientoBean
  * @throws Exception
  */
  public List fnGetListvencimientoBean(vencimientoBean povencimientoBean) throws Exception {
  List list = Generic.getInstance(vencimientoDAT.class).fnGetListvencimientoBean(povencimientoBean);
  return list;
  }
  /**
  * @fnGridvencimientoBean, es un metodo que retorna una lista de objetos de vencimientoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param povencimientoBean, Objeto correspondiente a vencimientoBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridvencimientoBean(vencimientoBean povencimientoBean) throws Exception {
  List list= Generic.getInstance(vencimientoDAT.class).fnGridvencimientoBean(povencimientoBean);
  return list;
  }
  /**
  * @fnAutocompletevencimientoBean, es un metodo que retorna una lista de objetos de vencimientoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param povencimientoBean, Objeto correspondiente a vencimientoBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<vencimientoBean> fnAutocompletevencimientoBean(vencimientoBean povencimientoBean) throws Exception {
  ArrayList<vencimientoBean> listavencimientoBean = null;
  try {
  listavencimientoBean = Generic.getInstance(vencimientoDAT.class).fnAutocompletevencimientoBean(povencimientoBean);
  } catch (IllegalAccessException | InstantiationException | SQLException ex) {
  } finally {
  }
  return listavencimientoBean;
  }
  /**
  * @fnGetvencimientoBean, es un metodo que retorna un objeto especifico de vencimientoBean
  * @param povencimientoBean, Objeto correspondiente a vencimientoBean
  * @return Retorna el Objeto vencimientoBean
  * @throws Exception
  */
  public vencimientoBean fnGetvencimientoBean(vencimientoBean povencimientoBean) throws Exception {
  return Generic.getInstance(vencimientoDAT.class).fnGetvencimientoBean(povencimientoBean);
  }
  /**
  * @fnInsertarvencimientoBean,  es un metodo que Inserta un  vencimientoBean
  * @param povencimientoBean, Objeto correspondiente a vencimientoBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarvencimientoBean(vencimientoBean povencimientoBean) throws Exception {
  return Generic.getInstance(vencimientoDAT.class).fnInsertarvencimientoBean(povencimientoBean);
  }
  /**
  * @fnEliminarvencimientoBean,  es un metodo que Elimina un  vencimientoBean
  * @param povencimientoBean, Objeto correspondiente a vencimientoBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarvencimientoBean(vencimientoBean povencimientoBean) throws Exception {
  return Generic.getInstance(vencimientoDAT.class).fnEliminarvencimientoBean(povencimientoBean);
  }
  /**
  * @fnActualizarvencimientoBean,  es un metodo que Actualiza un  vencimientoBean
  * @param povencimientoBean, Objeto correspondiente a vencimientoBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarvencimientoBean(vencimientoBean povencimientoBean) throws Exception {
  return Generic.getInstance(vencimientoDAT.class).fnActualizarvencimientoBean(povencimientoBean);
  }
    }

