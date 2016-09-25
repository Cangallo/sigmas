/*******************************************************************************
* Descripcion       : Clase que contiene los metodos transaccionales de logica del negocio de maetipodocumento
* Creado por        : APP
* Fecha de Creacion : 22/05/2015 12:08:02
********************************************************************************/

package pe.sigmas.logica;

import pe.sigmas.entity.maetipodocumentoBean;
import pe.sigmas.datos.maetipodocumentoDAT;
import pe.sigmas.util.Generic;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;


/**
*
* @author APP
 */
    public class maetipodocumentoBL
    {
  /**
  * @fnIsmaetipodocumentoBean, es un metodo que retorna si existe un maetipodocumentoBean metodo efectivo para validaciones
  * @param pomaetipodocumentoBean, Objeto correspondiente a maetipodocumentoBean
  * @return Retorna true cuando existe un maetipodocumentoBean, false cuando no existe un maetipodocumentoBean
  * @throws Exception
  */
        public boolean fnIsmaetipodocumentoBean (maetipodocumentoBean pomaetipodocumentoBean) throws Exception 
        {
         boolean status = Generic.getInstance(maetipodocumentoDAT.class).fnIsmaetipodocumentoBean(pomaetipodocumentoBean);
        if (!status) {
        pomaetipodocumentoBean.setMensaje("El IndexBean buscado no existe");
        }
        return status;
        }
  /**
  * @fnGetListmaetipodocumentoBean, es un metodo que retorna una lista de objetos de maetipodocumentoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaetipodocumentoBean, Objeto correspondiente a maetipodocumentoBean
  * @return Retorna una lista de objetos maetipodocumentoBean
  * @throws Exception
  */
  public List fnGetListmaetipodocumentoBean(maetipodocumentoBean pomaetipodocumentoBean) throws Exception {
  List list = Generic.getInstance(maetipodocumentoDAT.class).fnGetListmaetipodocumentoBean(pomaetipodocumentoBean);
  return list;
  }
  /**
  * @fnGridmaetipodocumentoBean, es un metodo que retorna una lista de objetos de maetipodocumentoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaetipodocumentoBean, Objeto correspondiente a maetipodocumentoBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridmaetipodocumentoBean(maetipodocumentoBean pomaetipodocumentoBean) throws Exception {
  List list= Generic.getInstance(maetipodocumentoDAT.class).fnGridmaetipodocumentoBean(pomaetipodocumentoBean);
  return list;
  }
  /**
  * @fnAutocompletemaetipodocumentoBean, es un metodo que retorna una lista de objetos de maetipodocumentoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaetipodocumentoBean, Objeto correspondiente a maetipodocumentoBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<maetipodocumentoBean> fnAutocompletemaetipodocumentoBean(maetipodocumentoBean pomaetipodocumentoBean) throws Exception {
  ArrayList<maetipodocumentoBean> listamaetipodocumentoBean = null;
  try {
  listamaetipodocumentoBean = Generic.getInstance(maetipodocumentoDAT.class).fnAutocompletemaetipodocumentoBean(pomaetipodocumentoBean);
  } catch (IllegalAccessException | InstantiationException | SQLException ex) {
  } finally {
  }
  return listamaetipodocumentoBean;
  }
  /**
  * @fnGetmaetipodocumentoBean, es un metodo que retorna un objeto especifico de maetipodocumentoBean
  * @param pomaetipodocumentoBean, Objeto correspondiente a maetipodocumentoBean
  * @return Retorna el Objeto maetipodocumentoBean
  * @throws Exception
  */
  public maetipodocumentoBean fnGetmaetipodocumentoBean(maetipodocumentoBean pomaetipodocumentoBean) throws Exception {
  return Generic.getInstance(maetipodocumentoDAT.class).fnGetmaetipodocumentoBean(pomaetipodocumentoBean);
  }
  /**
  * @fnInsertarmaetipodocumentoBean,  es un metodo que Inserta un  maetipodocumentoBean
  * @param pomaetipodocumentoBean, Objeto correspondiente a maetipodocumentoBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarmaetipodocumentoBean(maetipodocumentoBean pomaetipodocumentoBean) throws Exception {
  return Generic.getInstance(maetipodocumentoDAT.class).fnInsertarmaetipodocumentoBean(pomaetipodocumentoBean);
  }
  /**
  * @fnEliminarmaetipodocumentoBean,  es un metodo que Elimina un  maetipodocumentoBean
  * @param pomaetipodocumentoBean, Objeto correspondiente a maetipodocumentoBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarmaetipodocumentoBean(maetipodocumentoBean pomaetipodocumentoBean) throws Exception {
  return Generic.getInstance(maetipodocumentoDAT.class).fnEliminarmaetipodocumentoBean(pomaetipodocumentoBean);
  }
  /**
  * @fnActualizarmaetipodocumentoBean,  es un metodo que Actualiza un  maetipodocumentoBean
  * @param pomaetipodocumentoBean, Objeto correspondiente a maetipodocumentoBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarmaetipodocumentoBean(maetipodocumentoBean pomaetipodocumentoBean) throws Exception {
  return Generic.getInstance(maetipodocumentoDAT.class).fnActualizarmaetipodocumentoBean(pomaetipodocumentoBean);
  }
    }

