/******************************************************************************************************************************
-- Este procedimiento almacenado usp_regubicpredio_lst
--     es el encargado de realizar consultas a la tabla regubicpredio
--     , mediante opciones de consultas se manejan los diferentes SELECT a regubicpredio
--
-- Input               : iOpSp - Es de tipo int, indica la operacion a efectuar
                       :_biIdRegUbicPredio int, <descripcion>
                       :_biIdRegPersona int, <descripcion>
                       :_cCodRegPredio char(16), <descripcion>
                       :_nvInterior varchar(5), <descripcion>
                       :_nvManzana varchar(5), <descripcion>
                       :_nvLote varchar(5), <descripcion>
                       :_nvSubLote varchar(5), <descripcion>
                       :_nvPiso varchar(5), <descripcion>
                       :_nvDepartamento varchar(5), <descripcion>
                       :_nvNumAnterior varchar(5), <descripcion>
                       :_nvDireCompleta varchar(500), <descripcion>
                       :_nvRefeUbicacion varchar(200), <descripcion>
                       :_bIndForaneo bit, <descripcion>
                       :_bIndDomiFiscal bit, <descripcion>
                       :_iEjerIniVigencia int, <descripcion>
                       :_iEjerFinVigencia int, <descripcion>
                       :_bIndVigencia bit, <descripcion>
                       :_bIndConsentido bit, <descripcion>
                       :_nvObservacion varchar(500), <descripcion>
                       :_iIdRegUsuaRegistra int, <descripcion>
                       :_dtFechRegistra datetime, <descripcion>
                       :_iCantidadModifica int, <descripcion>
                       :_cCodRegContribuyente char(15), <descripcion>
                       :_bEstado bit <descripcion>
--
-- Output              : bEstaOperacion - Es de tipo bit, indica el estado de la operacion
--
-- Creado por          : App
-- Fecha creacion      : 22/05/2015 12:09:34
------------------------------------------------------------------------------------------------------------------------------
-- Fecha actualizacion : <Fecha de Actualizacion>  Responsable:    <Analista Programador>
-- Motivo              : <Motivo de la Modificacion>
--*****************************************************************************************************************************/


DELIMITER $$
DROP PROCEDURE IF EXISTS sisaguasaniamiento.usp_regubicpredio_lst $$
CREATE PROCEDURE sisaguasaniamiento.usp_regubicpredio_lst(
 IN iOpSp int,
 OUT bEstaOperacion bool,
IN _biIdRegUbicPredio int,
IN _biIdRegPersona int,
IN _cCodRegPredio char(16),
IN _nvInterior varchar(5),
IN _nvManzana varchar(5),
IN _nvLote varchar(5),
IN _nvSubLote varchar(5),
IN _nvPiso varchar(5),
IN _nvDepartamento varchar(5),
IN _nvNumAnterior varchar(5),
IN _nvDireCompleta varchar(500),
IN _nvRefeUbicacion varchar(200),
IN _bIndForaneo bit,
IN _bIndDomiFiscal bit,
IN _iEjerIniVigencia int,
IN _iEjerFinVigencia int,
IN _bIndVigencia bit,
IN _bIndConsentido bit,
IN _nvObservacion varchar(500),
IN _iIdRegUsuaRegistra int,
IN _dtFechRegistra datetime,
IN _iCantidadModifica int,
IN _cCodRegContribuyente char(15),
IN _bEstado bit
)
BEGIN



/*****************************************************************************************************
--
-- Descripcion             : Consulta que lista todos los registros de la tabla que tengan estado = 1
-- Retorna                 : todas las columnas
-- Parametros Where        : ninguno
-- Creado por              : APP
-- Fecha creacion          : 22/05/2015 12:09:34
-- ¿Esta siendo Utilizado? : NO
-- Clases DANT Utilizando  : regubicpredioDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 1
    THEN
        SELECT biIdRegUbicPredio, biIdRegPersona, cCodRegPredio, nvInterior, nvManzana, nvLote, nvSubLote, nvPiso, nvDepartamento, nvNumAnterior, nvDireCompleta, nvRefeUbicacion, bIndForaneo, bIndDomiFiscal, iEjerIniVigencia, iEjerFinVigencia, bIndVigencia, bIndConsentido, nvObservacion, iIdRegUsuaRegistra, dtFechRegistra, iCantidadModifica, cCodRegContribuyente, bEstado
        FROM sisaguasaniamiento.regubicpredio 
        WHERE bEstado=1 AND biIdRegUbicPredio = _biIdRegUbicPredio;
    END IF;



/*****************************************************************************************************
--
-- Descripcion             : Consulta que devuelve un registro de la tabla que tenga estado = 1
-- Retorna                 : todas las columnas
-- Parametros Where        : biIdRegUbicPredio
-- Creado por              : App
-- Fecha creacion          : 22/05/2015 12:09:34
-- ¿Esta siendo Utilizado? : NO
-- Clases DANT Utilizando  : regubicpredioDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 2
    THEN
        SELECT biIdRegUbicPredio, biIdRegPersona, cCodRegPredio, nvInterior, nvManzana, nvLote, nvSubLote, nvPiso, nvDepartamento, nvNumAnterior, nvDireCompleta, nvRefeUbicacion, bIndForaneo, bIndDomiFiscal, iEjerIniVigencia, iEjerFinVigencia, bIndVigencia, bIndConsentido, nvObservacion, iIdRegUsuaRegistra, dtFechRegistra, iCantidadModifica, cCodRegContribuyente, bEstado
        FROM sisaguasaniamiento.regubicpredio 
        WHERE bEstado=1;
    END IF;



/*****************************************************************************************************
--
-- Descripcion             : (Uso exclusivo para cargar controles de seleccion) Consulta que lista todos los registros de la tabla que tengan estado = 1
-- Retorna                 : biIdRegUbicPredio y Observacion
-- Parametros Where        : ninguno
-- Creado por              : APP
-- Fecha creacion          : 22/05/2015 12:09:34
-- ¿Esta siendo Utilizado? : NO
-- Clases DANT Utilizando  : regubicpredioDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 3
    THEN
        SELECT biIdRegUbicPredio, iIdRegUsuaRegistra
        FROM sisaguasaniamiento.regubicpredio 
        WHERE bEstado=1;
    END IF;



/****************************************************************************************************
--
-- Descripcion             : (Uso exclusivo para controles de autocompletado que recuperen 2 datos: id y un valor) Consulta que lista todos los registros de la tabla que tengan estado = 1 y coincidencias con la busqueda que se realiza
-- Retorna                 : biIdRegUbicPredio y Observacion
-- Parametros Where        : Observacion
-- Creado por              : APP
-- Fecha creacion          : 22/05/2015 12:09:34
-- ¿Esta siendo Utilizado? : NO
-- Clases DANT Utilizando  : regubicpredioDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 4
    THEN
        SELECT biIdRegUbicPredio, iIdRegUsuaRegistra
        FROM sisaguasaniamiento.regubicpredio 
        WHERE bEstado = 1 AND Observacion LIKE  CONCAT("%",_Observacion ,"%")    LIMIT 10; 
    END IF;



/****************************************************************************************************
--
-- Descripcion             : (Uso exclusivo para controles de autocompletado que recuperen 3 datos: id, codigo y un valor) Consulta que lista todos los registros de la tabla que tengan estado = 1 y coincidencias con la busqueda que se realiza
-- Retorna                 : biIdRegUbicPredio, Observacion y Observacion
-- Parametros Where        : Observacion
-- Creado por              : APP
-- Fecha creacion          : 22/05/2015 12:09:34
-- ¿Esta siendo Utilizado? : NO
-- Clases DANT Utilizando  : regubicpredioDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 5
    THEN
        SELECT biIdRegUbicPredio, iIdRegUsuaRegistra, dtFechRegistra
        FROM sisaguasaniamiento.regubicpredio
        WHERE bEstado = 1 AND Observacion LIKE CONCAT("%",_Observacion ,"%")  LIMIT 10; 
    END IF;



/****************************************************************************************************
--
-- Descripcion             : (Uso exclusivo para cargar grilla) Consulta que lista todos los registros de la tabla que tengan estado = 1 y coincidencias con la busqueda que se realiza
-- Retorna                 : todas las columnas
-- Parametros              :  Observacion
-- Creado por              : APP
-- Fecha creacion          : 22/05/2015 12:09:34
-- ¿Esta siendo Utilizado? : NO
-- Clases DANT Utilizando  : regubicpredioDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 6
    THEN
    SET @rownum:=0;
	SELECT /*(@rownum:=@rownum+1) as RowNum,*/regubicpredio.*
	FROM sisaguasaniamiento.regubicpredio 
	WHERE bEstado=1;
    END IF;
    


    END $$
    DELIMITER ;

