/*******************************************************************************
* Descripcion       : Clase que contiene los metodos transaccionales de logica del negocio de regcontribuyente
* Creado por        : APP
* Fecha de Creacion : 22/05/2015 12:08:02
********************************************************************************/

package pe.sigmas.logica;

import pe.sigmas.entity.regcontribuyenteBean;
import pe.sigmas.datos.regcontribuyenteDAT;
import pe.sigmas.util.Generic;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;


/**
*
* @author APP
 */
    public class regcontribuyenteBL
    {
  /**
  * @fnIsregcontribuyenteBean, es un metodo que retorna si existe un regcontribuyenteBean metodo efectivo para validaciones
  * @param poregcontribuyenteBean, Objeto correspondiente a regcontribuyenteBean
  * @return Retorna true cuando existe un regcontribuyenteBean, false cuando no existe un regcontribuyenteBean
  * @throws Exception
  */
        public boolean fnIsregcontribuyenteBean (regcontribuyenteBean poregcontribuyenteBean) throws Exception 
        {
         boolean status = Generic.getInstance(regcontribuyenteDAT.class).fnIsregcontribuyenteBean(poregcontribuyenteBean);
        if (!status) {
        poregcontribuyenteBean.setMensaje("El IndexBean buscado no existe");
        }
        return status;
        }
  /**
  * @fnGetListregcontribuyenteBean, es un metodo que retorna una lista de objetos de regcontribuyenteBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregcontribuyenteBean, Objeto correspondiente a regcontribuyenteBean
  * @return Retorna una lista de objetos regcontribuyenteBean
  * @throws Exception
  */
  public List fnGetListregcontribuyenteBean(regcontribuyenteBean poregcontribuyenteBean) throws Exception {
  List list = Generic.getInstance(regcontribuyenteDAT.class).fnGetListregcontribuyenteBean(poregcontribuyenteBean);
  return list;
  }
  /**
  * @fnGridregcontribuyenteBean, es un metodo que retorna una lista de objetos de regcontribuyenteBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregcontribuyenteBean, Objeto correspondiente a regcontribuyenteBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridregcontribuyenteBean(regcontribuyenteBean poregcontribuyenteBean) throws Exception {
  List list= Generic.getInstance(regcontribuyenteDAT.class).fnGridregcontribuyenteBean(poregcontribuyenteBean);
  return list;
  }
  /**
  * @fnAutocompleteregcontribuyenteBean, es un metodo que retorna una lista de objetos de regcontribuyenteBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregcontribuyenteBean, Objeto correspondiente a regcontribuyenteBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<regcontribuyenteBean> fnAutocompleteregcontribuyenteBean(regcontribuyenteBean poregcontribuyenteBean) throws Exception {
  ArrayList<regcontribuyenteBean> listaregcontribuyenteBean = null;
  try {
  listaregcontribuyenteBean = Generic.getInstance(regcontribuyenteDAT.class).fnAutocompleteregcontribuyenteBean(poregcontribuyenteBean);
  } catch (IllegalAccessException | InstantiationException | SQLException ex) {
  } finally {
  }
  return listaregcontribuyenteBean;
  }
  /**
  * @fnGetregcontribuyenteBean, es un metodo que retorna un objeto especifico de regcontribuyenteBean
  * @param poregcontribuyenteBean, Objeto correspondiente a regcontribuyenteBean
  * @return Retorna el Objeto regcontribuyenteBean
  * @throws Exception
  */
  public regcontribuyenteBean fnGetregcontribuyenteBean(regcontribuyenteBean poregcontribuyenteBean) throws Exception {
  return Generic.getInstance(regcontribuyenteDAT.class).fnGetregcontribuyenteBean(poregcontribuyenteBean);
  }
  /**
  * @fnInsertarregcontribuyenteBean,  es un metodo que Inserta un  regcontribuyenteBean
  * @param poregcontribuyenteBean, Objeto correspondiente a regcontribuyenteBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarregcontribuyenteBean(regcontribuyenteBean poregcontribuyenteBean) throws Exception {
  return Generic.getInstance(regcontribuyenteDAT.class).fnInsertarregcontribuyenteBean(poregcontribuyenteBean);
  }
  /**
  * @fnEliminarregcontribuyenteBean,  es un metodo que Elimina un  regcontribuyenteBean
  * @param poregcontribuyenteBean, Objeto correspondiente a regcontribuyenteBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarregcontribuyenteBean(regcontribuyenteBean poregcontribuyenteBean) throws Exception {
  return Generic.getInstance(regcontribuyenteDAT.class).fnEliminarregcontribuyenteBean(poregcontribuyenteBean);
  }
  /**
  * @fnActualizarregcontribuyenteBean,  es un metodo que Actualiza un  regcontribuyenteBean
  * @param poregcontribuyenteBean, Objeto correspondiente a regcontribuyenteBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarregcontribuyenteBean(regcontribuyenteBean poregcontribuyenteBean) throws Exception {
  return Generic.getInstance(regcontribuyenteDAT.class).fnActualizarregcontribuyenteBean(poregcontribuyenteBean);
  }
    }

