/*******************************************************************************
* Descripcion       : Clase que contiene los metodos transaccionales de logica del negocio de regtrabajador
* Creado por        : APP
* Fecha de Creacion : 22/05/2015 12:08:02
********************************************************************************/

package pe.sigmas.logica;

import pe.sigmas.entity.regtrabajadorBean;
import pe.sigmas.datos.regtrabajadorDAT;
import pe.sigmas.util.Generic;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;


/**
*
* @author APP
 */
    public class regtrabajadorBL
    {
  /**
  * @fnIsregtrabajadorBean, es un metodo que retorna si existe un regtrabajadorBean metodo efectivo para validaciones
  * @param poregtrabajadorBean, Objeto correspondiente a regtrabajadorBean
  * @return Retorna true cuando existe un regtrabajadorBean, false cuando no existe un regtrabajadorBean
  * @throws Exception
  */
        public boolean fnIsregtrabajadorBean (regtrabajadorBean poregtrabajadorBean) throws Exception 
        {
         boolean status = Generic.getInstance(regtrabajadorDAT.class).fnIsregtrabajadorBean(poregtrabajadorBean);
        if (!status) {
        poregtrabajadorBean.setMensaje("El IndexBean buscado no existe");
        }
        return status;
        }
  /**
  * @fnGetListregtrabajadorBean, es un metodo que retorna una lista de objetos de regtrabajadorBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregtrabajadorBean, Objeto correspondiente a regtrabajadorBean
  * @return Retorna una lista de objetos regtrabajadorBean
  * @throws Exception
  */
  public List fnGetListregtrabajadorBean(regtrabajadorBean poregtrabajadorBean) throws Exception {
  List list = Generic.getInstance(regtrabajadorDAT.class).fnGetListregtrabajadorBean(poregtrabajadorBean);
  return list;
  }
  /**
  * @fnGridregtrabajadorBean, es un metodo que retorna una lista de objetos de regtrabajadorBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregtrabajadorBean, Objeto correspondiente a regtrabajadorBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridregtrabajadorBean(regtrabajadorBean poregtrabajadorBean) throws Exception {
  List list= Generic.getInstance(regtrabajadorDAT.class).fnGridregtrabajadorBean(poregtrabajadorBean);
  return list;
  }
  /**
  * @fnAutocompleteregtrabajadorBean, es un metodo que retorna una lista de objetos de regtrabajadorBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregtrabajadorBean, Objeto correspondiente a regtrabajadorBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<regtrabajadorBean> fnAutocompleteregtrabajadorBean(regtrabajadorBean poregtrabajadorBean) throws Exception {
  ArrayList<regtrabajadorBean> listaregtrabajadorBean = null;
  try {
  listaregtrabajadorBean = Generic.getInstance(regtrabajadorDAT.class).fnAutocompleteregtrabajadorBean(poregtrabajadorBean);
  } catch (IllegalAccessException | InstantiationException | SQLException ex) {
  } finally {
  }
  return listaregtrabajadorBean;
  }
  /**
  * @fnGetregtrabajadorBean, es un metodo que retorna un objeto especifico de regtrabajadorBean
  * @param poregtrabajadorBean, Objeto correspondiente a regtrabajadorBean
  * @return Retorna el Objeto regtrabajadorBean
  * @throws Exception
  */
  public regtrabajadorBean fnGetregtrabajadorBean(regtrabajadorBean poregtrabajadorBean) throws Exception {
  return Generic.getInstance(regtrabajadorDAT.class).fnGetregtrabajadorBean(poregtrabajadorBean);
  }
  /**
  * @fnInsertarregtrabajadorBean,  es un metodo que Inserta un  regtrabajadorBean
  * @param poregtrabajadorBean, Objeto correspondiente a regtrabajadorBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarregtrabajadorBean(regtrabajadorBean poregtrabajadorBean) throws Exception {
  return Generic.getInstance(regtrabajadorDAT.class).fnInsertarregtrabajadorBean(poregtrabajadorBean);
  }
  /**
  * @fnEliminarregtrabajadorBean,  es un metodo que Elimina un  regtrabajadorBean
  * @param poregtrabajadorBean, Objeto correspondiente a regtrabajadorBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarregtrabajadorBean(regtrabajadorBean poregtrabajadorBean) throws Exception {
  return Generic.getInstance(regtrabajadorDAT.class).fnEliminarregtrabajadorBean(poregtrabajadorBean);
  }
  /**
  * @fnActualizarregtrabajadorBean,  es un metodo que Actualiza un  regtrabajadorBean
  * @param poregtrabajadorBean, Objeto correspondiente a regtrabajadorBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarregtrabajadorBean(regtrabajadorBean poregtrabajadorBean) throws Exception {
  return Generic.getInstance(regtrabajadorDAT.class).fnActualizarregtrabajadorBean(poregtrabajadorBean);
  }
    }

