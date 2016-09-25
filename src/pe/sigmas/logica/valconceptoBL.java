/*******************************************************************************
* Descripcion       : Clase que contiene los metodos transaccionales de logica del negocio de valconcepto
* Creado por        : APP
* Fecha de Creacion : 22/05/2015 12:08:02
********************************************************************************/

package pe.sigmas.logica;

import pe.sigmas.entity.valconceptoBean;
import pe.sigmas.datos.valconceptoDAT;
import pe.sigmas.util.Generic;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;


/**
*
* @author APP
 */
    public class valconceptoBL
    {
  /**
  * @fnIsvalconceptoBean, es un metodo que retorna si existe un valconceptoBean metodo efectivo para validaciones
  * @param povalconceptoBean, Objeto correspondiente a valconceptoBean
  * @return Retorna true cuando existe un valconceptoBean, false cuando no existe un valconceptoBean
  * @throws Exception
  */
        public boolean fnIsvalconceptoBean (valconceptoBean povalconceptoBean) throws Exception 
        {
         boolean status = Generic.getInstance(valconceptoDAT.class).fnIsvalconceptoBean(povalconceptoBean);
        if (!status) {
        povalconceptoBean.setMensaje("El IndexBean buscado no existe");
        }
        return status;
        }
  /**
  * @fnGetListvalconceptoBean, es un metodo que retorna una lista de objetos de valconceptoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param povalconceptoBean, Objeto correspondiente a valconceptoBean
  * @return Retorna una lista de objetos valconceptoBean
  * @throws Exception
  */
  public List fnGetListvalconceptoBean(valconceptoBean povalconceptoBean) throws Exception {
  List list = Generic.getInstance(valconceptoDAT.class).fnGetListvalconceptoBean(povalconceptoBean);
  return list;
  }
  /**
  * @fnGridvalconceptoBean, es un metodo que retorna una lista de objetos de valconceptoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param povalconceptoBean, Objeto correspondiente a valconceptoBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridvalconceptoBean(valconceptoBean povalconceptoBean) throws Exception {
  List list= Generic.getInstance(valconceptoDAT.class).fnGridvalconceptoBean(povalconceptoBean);
  return list;
  }
  /**
  * @fnAutocompletevalconceptoBean, es un metodo que retorna una lista de objetos de valconceptoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param povalconceptoBean, Objeto correspondiente a valconceptoBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<valconceptoBean> fnAutocompletevalconceptoBean(valconceptoBean povalconceptoBean) throws Exception {
  ArrayList<valconceptoBean> listavalconceptoBean = null;
  try {
  listavalconceptoBean = Generic.getInstance(valconceptoDAT.class).fnAutocompletevalconceptoBean(povalconceptoBean);
  } catch (IllegalAccessException | InstantiationException | SQLException ex) {
  } finally {
  }
  return listavalconceptoBean;
  }
  /**
  * @fnGetvalconceptoBean, es un metodo que retorna un objeto especifico de valconceptoBean
  * @param povalconceptoBean, Objeto correspondiente a valconceptoBean
  * @return Retorna el Objeto valconceptoBean
  * @throws Exception
  */
  public valconceptoBean fnGetvalconceptoBean(valconceptoBean povalconceptoBean) throws Exception {
  return Generic.getInstance(valconceptoDAT.class).fnGetvalconceptoBean(povalconceptoBean);
  }
  /**
  * @fnInsertarvalconceptoBean,  es un metodo que Inserta un  valconceptoBean
  * @param povalconceptoBean, Objeto correspondiente a valconceptoBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarvalconceptoBean(valconceptoBean povalconceptoBean) throws Exception {
  return Generic.getInstance(valconceptoDAT.class).fnInsertarvalconceptoBean(povalconceptoBean);
  }
  /**
  * @fnEliminarvalconceptoBean,  es un metodo que Elimina un  valconceptoBean
  * @param povalconceptoBean, Objeto correspondiente a valconceptoBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarvalconceptoBean(valconceptoBean povalconceptoBean) throws Exception {
  return Generic.getInstance(valconceptoDAT.class).fnEliminarvalconceptoBean(povalconceptoBean);
  }
  /**
  * @fnActualizarvalconceptoBean,  es un metodo que Actualiza un  valconceptoBean
  * @param povalconceptoBean, Objeto correspondiente a valconceptoBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarvalconceptoBean(valconceptoBean povalconceptoBean) throws Exception {
  return Generic.getInstance(valconceptoDAT.class).fnActualizarvalconceptoBean(povalconceptoBean);
  }
    }

