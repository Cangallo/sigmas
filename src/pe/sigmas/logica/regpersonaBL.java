/*******************************************************************************
* Descripcion       : Clase que contiene los metodos transaccionales de logica del negocio de regpersona
* Creado por        : APP
* Fecha de Creacion : 22/05/2015 12:08:02
********************************************************************************/

package pe.sigmas.logica;

import pe.sigmas.entity.regpersonaBean;
import pe.sigmas.datos.regpersonaDAT;
import pe.sigmas.util.Generic;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.List;


/**
*
* @author APP
 */
    public class regpersonaBL
    {
  /**
  * @fnIsregpersonaBean, es un metodo que retorna si existe un regpersonaBean metodo efectivo para validaciones
  * @param poregpersonaBean, Objeto correspondiente a regpersonaBean
  * @return Retorna true cuando existe un regpersonaBean, false cuando no existe un regpersonaBean
  * @throws Exception
  */
        public boolean fnIsregpersonaBean (regpersonaBean poregpersonaBean) throws Exception 
        {
         boolean status = Generic.getInstance(regpersonaDAT.class).fnIsregpersonaBean(poregpersonaBean);
        if (!status) {
        poregpersonaBean.setMensaje("El IndexBean buscado no existe");
        }
        return status;
        }
  /**
  * @fnGetListregpersonaBean, es un metodo que retorna una lista de objetos de regpersonaBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregpersonaBean, Objeto correspondiente a regpersonaBean
  * @return Retorna una lista de objetos regpersonaBean
  * @throws Exception
  */
  public List fnGetListregpersonaBean(regpersonaBean poregpersonaBean) throws Exception {
  List list = Generic.getInstance(regpersonaDAT.class).fnGetListregpersonaBean(poregpersonaBean);
  return list;
  }
  /**
  * @fnGridregpersonaBean, es un metodo que retorna una lista de objetos de regpersonaBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregpersonaBean, Objeto correspondiente a regpersonaBean
  * @return Retorna un jQgrid efectivo para cargar y mostrar registros en una grilla
  * @throws Exception
  */
  public List fnGridregpersonaBean(regpersonaBean poregpersonaBean) throws Exception {
  List list= Generic.getInstance(regpersonaDAT.class).fnGridregpersonaBean(poregpersonaBean);
  return list;
  }
  /**
  * @fnAutocompleteregpersonaBean, es un metodo que retorna una lista de objetos de regpersonaBean metodo efectivo para cargar controles de seleccion y/o controles de aucompletado
  * @param poregpersonaBean, Objeto correspondiente a regpersonaBean
  * @return Retorna una lista efectivo para cargar y mostrar registros en un autocomplete
  * @throws Exception
  */
  public ArrayList<regpersonaBean> fnAutocompleteregpersonaBean(regpersonaBean poregpersonaBean) throws Exception {
  ArrayList<regpersonaBean> listaregpersonaBean = null;
  try {
  listaregpersonaBean = Generic.getInstance(regpersonaDAT.class).fnAutocompleteregpersonaBean(poregpersonaBean);
  } catch (IllegalAccessException | InstantiationException | SQLException ex) {
  } finally {
  }
  return listaregpersonaBean;
  }
  /**
  * @fnGetregpersonaBean, es un metodo que retorna un objeto especifico de regpersonaBean
  * @param poregpersonaBean, Objeto correspondiente a regpersonaBean
  * @return Retorna el Objeto regpersonaBean
  * @throws Exception
  */
  public regpersonaBean fnGetregpersonaBean(regpersonaBean poregpersonaBean) throws Exception {
  return Generic.getInstance(regpersonaDAT.class).fnGetregpersonaBean(poregpersonaBean);
  }
  /**
  * @fnInsertarregpersonaBean,  es un metodo que Inserta un  regpersonaBean
  * @param poregpersonaBean, Objeto correspondiente a regpersonaBean
  * @return Retorna true cuando es exito, false cuando no hubo insercion alguna
  * @throws Exception
  */
  public boolean fnInsertarregpersonaBean(regpersonaBean poregpersonaBean) throws Exception {
  return Generic.getInstance(regpersonaDAT.class).fnInsertarregpersonaBean(poregpersonaBean);
  }
  /**
  * @fnEliminarregpersonaBean,  es un metodo que Elimina un  regpersonaBean
  * @param poregpersonaBean, Objeto correspondiente a regpersonaBean
  * @return Retorna true cuando es exito, false cuando no hubo eliminacion alguna
  * @throws Exception
  */
  public boolean fnEliminarregpersonaBean(regpersonaBean poregpersonaBean) throws Exception {
  return Generic.getInstance(regpersonaDAT.class).fnEliminarregpersonaBean(poregpersonaBean);
  }
  /**
  * @fnActualizarregpersonaBean,  es un metodo que Actualiza un  regpersonaBean
  * @param poregpersonaBean, Objeto correspondiente a regpersonaBean
  * @return Retorna true cuando es exito, false cuando no hubo actualizacion alguna
  * @throws Exception
  */
  public boolean fnActualizarregpersonaBean(regpersonaBean poregpersonaBean) throws Exception {
  return Generic.getInstance(regpersonaDAT.class).fnActualizarregpersonaBean(poregpersonaBean);
  }
  
  
   public String fnBuscarPersona(int codigoContri) throws Exception {
      String nombre=null;
  return nombre=Generic.getInstance(regpersonaDAT.class).fnBuscarPersona(codigoContri);
  }
  
   public String fnInsertarCorte(int codigo1,double mora1,String observacion) throws Exception {
      String resultado=null;
  return resultado=Generic.getInstance(regpersonaDAT.class).fnInsertarCorte(codigo1,mora1,observacion);
  }
  
 public String fnInsertarReconexion(int codigo1,double mora1,String observacion) throws Exception {
      String resultado=null;
  return resultado=Generic.getInstance(regpersonaDAT.class).fnInsertarRecoenxion(codigo1,mora1,observacion);
  }
    }

