/*******************************************************************************
* Descripcion       : Clase que contiene los metodos transaccionales de logica del negocio de regrecibo
* Creado por        : APP
* Fecha de Creacion : 22/05/2015 12:08:02
********************************************************************************/

package pe.sigmas.logica;

import pe.sigmas.entity.regreciboBean;
import pe.sigmas.datos.regreciboDAT;
import pe.sigmas.util.Generic;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;


/**
*
* @author APP
 */
    public class regreciboBL
    {
  /**
  * @fnIsregreciboBean, es un metodo que retorna si existe un regreciboBean metodo efectivo para validaciones
  * @param poregreciboBean, Objeto correspondiente a regreciboBean
  * @return Retorna true cuando existe un regreciboBean, false cuando no existe un regreciboBean
  * @throws Exception
  */
        public boolean fnIsregreciboBean (regreciboBean poregreciboBean) throws Exception 
        {
         boolean status = Generic.getInstance(regreciboDAT.class).fnIsregreciboBean(poregreciboBean);
        if (!status) {
        poregreciboBean.setMensaje("El IndexBean buscado no existe");
        }
        return status;
        }
  /**
  * @fnGetListregreciboBean, es un metodo que retorna una lista de objetos de regreciboBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregreciboBean, Objeto correspondiente a regreciboBean
  * @return Retorna una lista de objetos regreciboBean
  * @throws Exception
  */
  public List fnGetListregreciboBean(regreciboBean poregreciboBean) throws Exception {
  List list = Generic.getInstance(regreciboDAT.class).fnGetListregreciboBean(poregreciboBean);
  return list;
  }
  /**
  * @fnGridregreciboBean, es un metodo que retorna una lista de objetos de regreciboBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregreciboBean, Objeto correspondiente a regreciboBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridregreciboBean(regreciboBean poregreciboBean) throws Exception {
  List list= Generic.getInstance(regreciboDAT.class).fnGridregreciboBean(poregreciboBean);
  return list;
  }
  /**
  * @fnAutocompleteregreciboBean, es un metodo que retorna una lista de objetos de regreciboBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregreciboBean, Objeto correspondiente a regreciboBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<regreciboBean> fnAutocompleteregreciboBean(regreciboBean poregreciboBean) throws Exception {
  ArrayList<regreciboBean> listaregreciboBean = null;
  try {
  listaregreciboBean = Generic.getInstance(regreciboDAT.class).fnAutocompleteregreciboBean(poregreciboBean);
  } catch (IllegalAccessException | InstantiationException | SQLException ex) {
  } finally {
  }
  return listaregreciboBean;
  }
  /**
  * @fnGetregreciboBean, es un metodo que retorna un objeto especifico de regreciboBean
  * @param poregreciboBean, Objeto correspondiente a regreciboBean
  * @return Retorna el Objeto regreciboBean
  * @throws Exception
  */
  public regreciboBean fnGetregreciboBean(regreciboBean poregreciboBean) throws Exception {
  return Generic.getInstance(regreciboDAT.class).fnGetregreciboBean(poregreciboBean);
  }
  /**
  * @fnInsertarregreciboBean,  es un metodo que Inserta un  regreciboBean
  * @param poregreciboBean, Objeto correspondiente a regreciboBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarregreciboBean(regreciboBean poregreciboBean) throws Exception {
  return Generic.getInstance(regreciboDAT.class).fnInsertarregreciboBean(poregreciboBean);
  }
  /**
  * @fnEliminarregreciboBean,  es un metodo que Elimina un  regreciboBean
  * @param poregreciboBean, Objeto correspondiente a regreciboBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarregreciboBean(regreciboBean poregreciboBean) throws Exception {
  return Generic.getInstance(regreciboDAT.class).fnEliminarregreciboBean(poregreciboBean);
  }
  /**
  * @fnActualizarregreciboBean,  es un metodo que Actualiza un  regreciboBean
  * @param poregreciboBean, Objeto correspondiente a regreciboBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarregreciboBean(regreciboBean poregreciboBean) throws Exception {
  return Generic.getInstance(regreciboDAT.class).fnActualizarregreciboBean(poregreciboBean);
  }
    }

