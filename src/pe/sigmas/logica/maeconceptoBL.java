/*******************************************************************************
* Descripcion       : Clase que contiene los metodos transaccionales de logica del negocio de maeconcepto
* Creado por        : APP
* Fecha de Creacion : 22/05/2015 12:08:01
********************************************************************************/

package pe.sigmas.logica;

import pe.sigmas.entity.maeconceptoBean;
import pe.sigmas.datos.maeconceptoDAT;
import pe.sigmas.util.Generic;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;


/**
*
* @author APP
 */
    public class maeconceptoBL
    {
  /**
  * @fnIsmaeconceptoBean, es un metodo que retorna si existe un maeconceptoBean metodo efectivo para validaciones
  * @param pomaeconceptoBean, Objeto correspondiente a maeconceptoBean
  * @return Retorna true cuando existe un maeconceptoBean, false cuando no existe un maeconceptoBean
  * @throws Exception
  */
        public boolean fnIsmaeconceptoBean (maeconceptoBean pomaeconceptoBean) throws Exception 
        {
         boolean status = Generic.getInstance(maeconceptoDAT.class).fnIsmaeconceptoBean(pomaeconceptoBean);
        if (!status) {
        pomaeconceptoBean.setMensaje("El IndexBean buscado no existe");
        }
        return status;
        }
  /**
  * @fnGetListmaeconceptoBean, es un metodo que retorna una lista de objetos de maeconceptoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaeconceptoBean, Objeto correspondiente a maeconceptoBean
  * @return Retorna una lista de objetos maeconceptoBean
  * @throws Exception
  */
  public List fnGetListmaeconceptoBean(maeconceptoBean pomaeconceptoBean) throws Exception {
  List list = Generic.getInstance(maeconceptoDAT.class).fnGetListmaeconceptoBean(pomaeconceptoBean);
  return list;
  }
  /**
  * @fnGridmaeconceptoBean, es un metodo que retorna una lista de objetos de maeconceptoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaeconceptoBean, Objeto correspondiente a maeconceptoBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridmaeconceptoBean(maeconceptoBean pomaeconceptoBean) throws Exception {
  List list= Generic.getInstance(maeconceptoDAT.class).fnGridmaeconceptoBean(pomaeconceptoBean);
  return list;
  }
  /**
  * @fnAutocompletemaeconceptoBean, es un metodo que retorna una lista de objetos de maeconceptoBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param pomaeconceptoBean, Objeto correspondiente a maeconceptoBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<maeconceptoBean> fnAutocompletemaeconceptoBean(maeconceptoBean pomaeconceptoBean) throws Exception {
  ArrayList<maeconceptoBean> listamaeconceptoBean = null;
  try {
  listamaeconceptoBean = Generic.getInstance(maeconceptoDAT.class).fnAutocompletemaeconceptoBean(pomaeconceptoBean);
  } catch (IllegalAccessException | InstantiationException | SQLException ex) {
  } finally {
  }
  return listamaeconceptoBean;
  }
  /**
  * @fnGetmaeconceptoBean, es un metodo que retorna un objeto especifico de maeconceptoBean
  * @param pomaeconceptoBean, Objeto correspondiente a maeconceptoBean
  * @return Retorna el Objeto maeconceptoBean
  * @throws Exception
  */
  public maeconceptoBean fnGetmaeconceptoBean(maeconceptoBean pomaeconceptoBean) throws Exception {
  return Generic.getInstance(maeconceptoDAT.class).fnGetmaeconceptoBean(pomaeconceptoBean);
  }
  /**
  * @fnInsertarmaeconceptoBean,  es un metodo que Inserta un  maeconceptoBean
  * @param pomaeconceptoBean, Objeto correspondiente a maeconceptoBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarmaeconceptoBean(maeconceptoBean pomaeconceptoBean) throws Exception {
  return Generic.getInstance(maeconceptoDAT.class).fnInsertarmaeconceptoBean(pomaeconceptoBean);
  }
  /**
  * @fnEliminarmaeconceptoBean,  es un metodo que Elimina un  maeconceptoBean
  * @param pomaeconceptoBean, Objeto correspondiente a maeconceptoBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarmaeconceptoBean(maeconceptoBean pomaeconceptoBean) throws Exception {
  return Generic.getInstance(maeconceptoDAT.class).fnEliminarmaeconceptoBean(pomaeconceptoBean);
  }
  /**
  * @fnActualizarmaeconceptoBean,  es un metodo que Actualiza un  maeconceptoBean
  * @param pomaeconceptoBean, Objeto correspondiente a maeconceptoBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarmaeconceptoBean(maeconceptoBean pomaeconceptoBean) throws Exception {
  return Generic.getInstance(maeconceptoDAT.class).fnActualizarmaeconceptoBean(pomaeconceptoBean);
  }
    }

