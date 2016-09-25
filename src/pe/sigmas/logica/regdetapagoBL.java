/*******************************************************************************
* Descripcion       : Clase que contiene los metodos transaccionales de logica del negocio de regdetapago
* Creado por        : APP
* Fecha de Creacion : 22/05/2015 12:08:02
********************************************************************************/

package pe.sigmas.logica;

import pe.sigmas.entity.regdetapagoBean;
import pe.sigmas.datos.regdetapagoDAT;
import pe.sigmas.util.Generic;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;


/**
*
* @author APP
 */
    public class regdetapagoBL
    {
  /**
  * @fnIsregdetapagoBean, es un metodo que retorna si existe un regdetapagoBean metodo efectivo para validaciones
  * @param poregdetapagoBean, Objeto correspondiente a regdetapagoBean
  * @return Retorna true cuando existe un regdetapagoBean, false cuando no existe un regdetapagoBean
  * @throws Exception
  */
        public boolean fnIsregdetapagoBean (regdetapagoBean poregdetapagoBean) throws Exception 
        {
         boolean status = Generic.getInstance(regdetapagoDAT.class).fnIsregdetapagoBean(poregdetapagoBean);
        if (!status) {
        poregdetapagoBean.setMensaje("El IndexBean buscado no existe");
        }
        return status;
        }
  /**
  * @fnGetListregdetapagoBean, es un metodo que retorna una lista de objetos de regdetapagoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregdetapagoBean, Objeto correspondiente a regdetapagoBean
  * @return Retorna una lista de objetos regdetapagoBean
  * @throws Exception
  */
  public List fnGetListregdetapagoBean(regdetapagoBean poregdetapagoBean) throws Exception {
  List list = Generic.getInstance(regdetapagoDAT.class).fnGetListregdetapagoBean(poregdetapagoBean);
  return list;
  }
  /**
  * @fnGridregdetapagoBean, es un metodo que retorna una lista de objetos de regdetapagoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregdetapagoBean, Objeto correspondiente a regdetapagoBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridregdetapagoBean(regdetapagoBean poregdetapagoBean) throws Exception {
  List list= Generic.getInstance(regdetapagoDAT.class).fnGridregdetapagoBean(poregdetapagoBean);
  return list;
  }
  /**
  * @fnAutocompleteregdetapagoBean, es un metodo que retorna una lista de objetos de regdetapagoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregdetapagoBean, Objeto correspondiente a regdetapagoBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<regdetapagoBean> fnAutocompleteregdetapagoBean(regdetapagoBean poregdetapagoBean) throws Exception {
  ArrayList<regdetapagoBean> listaregdetapagoBean = null;
  try {
  listaregdetapagoBean = Generic.getInstance(regdetapagoDAT.class).fnAutocompleteregdetapagoBean(poregdetapagoBean);
  } catch (IllegalAccessException | InstantiationException | SQLException ex) {
  } finally {
  }
  return listaregdetapagoBean;
  }
  /**
  * @fnGetregdetapagoBean, es un metodo que retorna un objeto especifico de regdetapagoBean
  * @param poregdetapagoBean, Objeto correspondiente a regdetapagoBean
  * @return Retorna el Objeto regdetapagoBean
  * @throws Exception
  */
  public regdetapagoBean fnGetregdetapagoBean(regdetapagoBean poregdetapagoBean) throws Exception {
  return Generic.getInstance(regdetapagoDAT.class).fnGetregdetapagoBean(poregdetapagoBean);
  }
  /**
  * @fnInsertarregdetapagoBean,  es un metodo que Inserta un  regdetapagoBean
  * @param poregdetapagoBean, Objeto correspondiente a regdetapagoBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarregdetapagoBean(regdetapagoBean poregdetapagoBean) throws Exception {
  return Generic.getInstance(regdetapagoDAT.class).fnInsertarregdetapagoBean(poregdetapagoBean);
  }
  /**
  * @fnEliminarregdetapagoBean,  es un metodo que Elimina un  regdetapagoBean
  * @param poregdetapagoBean, Objeto correspondiente a regdetapagoBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarregdetapagoBean(regdetapagoBean poregdetapagoBean) throws Exception {
  return Generic.getInstance(regdetapagoDAT.class).fnEliminarregdetapagoBean(poregdetapagoBean);
  }
  /**
  * @fnActualizarregdetapagoBean,  es un metodo que Actualiza un  regdetapagoBean
  * @param poregdetapagoBean, Objeto correspondiente a regdetapagoBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarregdetapagoBean(regdetapagoBean poregdetapagoBean) throws Exception {
  return Generic.getInstance(regdetapagoDAT.class).fnActualizarregdetapagoBean(poregdetapagoBean);
  }
    }

