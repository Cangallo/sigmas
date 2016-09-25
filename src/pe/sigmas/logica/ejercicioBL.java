/*******************************************************************************
* Descripcion       : Clase que contiene los metodos transaccionales de logica del negocio de ejercicio
* Creado por        : APP
* Fecha de Creacion : 22/05/2015 12:08:01
********************************************************************************/

package pe.sigmas.logica;

import pe.sigmas.entity.ejercicioBean;
import pe.sigmas.datos.ejercicioDAT;
import pe.sigmas.util.Generic;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;


/**
*
* @author APP
 */
    public class ejercicioBL
    {
  /**
  * @fnIsejercicioBean, es un metodo que retorna si existe un ejercicioBean metodo efectivo para validaciones
  * @param poejercicioBean, Objeto correspondiente a ejercicioBean
  * @return Retorna true cuando existe un ejercicioBean, false cuando no existe un ejercicioBean
  * @throws Exception
  */
        public boolean fnIsejercicioBean (ejercicioBean poejercicioBean) throws Exception 
        {
         boolean status = Generic.getInstance(ejercicioDAT.class).fnIsejercicioBean(poejercicioBean);
        if (!status) {
        poejercicioBean.setMensaje("El IndexBean buscado no existe");
        }
        return status;
        }
  /**
  * @fnGetListejercicioBean, es un metodo que retorna una lista de objetos de ejercicioBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poejercicioBean, Objeto correspondiente a ejercicioBean
  * @return Retorna una lista de objetos ejercicioBean
  * @throws Exception
  */
  public List fnGetListejercicioBean(ejercicioBean poejercicioBean) throws Exception {
  List list = Generic.getInstance(ejercicioDAT.class).fnGetListejercicioBean(poejercicioBean);
  return list;
  }
  /**
  * @fnGridejercicioBean, es un metodo que retorna una lista de objetos de ejercicioBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poejercicioBean, Objeto correspondiente a ejercicioBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridejercicioBean(ejercicioBean poejercicioBean) throws Exception {
  List list= Generic.getInstance(ejercicioDAT.class).fnGridejercicioBean(poejercicioBean);
  return list;
  }
  /**
  * @fnAutocompleteejercicioBean, es un metodo que retorna una lista de objetos de ejercicioBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poejercicioBean, Objeto correspondiente a ejercicioBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<ejercicioBean> fnAutocompleteejercicioBean(ejercicioBean poejercicioBean) throws Exception {
  ArrayList<ejercicioBean> listaejercicioBean = null;
  try {
  listaejercicioBean = Generic.getInstance(ejercicioDAT.class).fnAutocompleteejercicioBean(poejercicioBean);
  } catch (IllegalAccessException | InstantiationException | SQLException ex) {
  } finally {
  }
  return listaejercicioBean;
  }
  /**
  * @fnGetejercicioBean, es un metodo que retorna un objeto especifico de ejercicioBean
  * @param poejercicioBean, Objeto correspondiente a ejercicioBean
  * @return Retorna el Objeto ejercicioBean
  * @throws Exception
  */
  public ejercicioBean fnGetejercicioBean(ejercicioBean poejercicioBean) throws Exception {
  return Generic.getInstance(ejercicioDAT.class).fnGetejercicioBean(poejercicioBean);
  }
  /**
  * @fnInsertarejercicioBean,  es un metodo que Inserta un  ejercicioBean
  * @param poejercicioBean, Objeto correspondiente a ejercicioBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarejercicioBean(ejercicioBean poejercicioBean) throws Exception {
  return Generic.getInstance(ejercicioDAT.class).fnInsertarejercicioBean(poejercicioBean);
  }
  /**
  * @fnEliminarejercicioBean,  es un metodo que Elimina un  ejercicioBean
  * @param poejercicioBean, Objeto correspondiente a ejercicioBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarejercicioBean(ejercicioBean poejercicioBean) throws Exception {
  return Generic.getInstance(ejercicioDAT.class).fnEliminarejercicioBean(poejercicioBean);
  }
  /**
  * @fnActualizarejercicioBean,  es un metodo que Actualiza un  ejercicioBean
  * @param poejercicioBean, Objeto correspondiente a ejercicioBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarejercicioBean(ejercicioBean poejercicioBean) throws Exception {
  return Generic.getInstance(ejercicioDAT.class).fnActualizarejercicioBean(poejercicioBean);
  }
    }

