/******************************************************************************************************************************
-- Este procedimiento almacenado usp_maesexo_lst
--     es el encargado de realizar consultas a la tabla maesexo
--     , mediante opciones de consultas se manejan los diferentes SELECT a maesexo
--
-- Input               : iOpSp - Es de tipo int, indica la operacion a efectuar
                       :_cCodMaeSexo char(5), <descripcion>
                       :_nvAbreviatura varchar(20), <descripcion>
                       :_nvDenominacion varchar(200), <descripcion>
                       :_nvDescripcion varchar(500), <descripcion>
                       :_nvObservacion varchar(500), <descripcion>
                       :_iIdRegUsuaRegistra int, <descripcion>
                       :_dtFechRegistra datetime, <descripcion>
                       :_iCantidadModifica int, <descripcion>
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
DROP PROCEDURE IF EXISTS sisaguasaniamiento.usp_maesexo_lst $$
CREATE PROCEDURE sisaguasaniamiento.usp_maesexo_lst(
 IN iOpSp int,
 OUT bEstaOperacion bool,
IN _cCodMaeSexo char(5),
IN _nvAbreviatura varchar(20),
IN _nvDenominacion varchar(200),
IN _nvDescripcion varchar(500),
IN _nvObservacion varchar(500),
IN _iIdRegUsuaRegistra int,
IN _dtFechRegistra datetime,
IN _iCantidadModifica int,
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
-- Clases DANT Utilizando  : maesexoDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 1
    THEN
        SELECT cCodMaeSexo, nvAbreviatura, nvDenominacion, nvDescripcion, nvObservacion, iIdRegUsuaRegistra, dtFechRegistra, iCantidadModifica, bEstado
        FROM sisaguasaniamiento.maesexo 
        WHERE bEstado=1 AND cCodMaeSexo = _cCodMaeSexo;
    END IF;



/*****************************************************************************************************
--
-- Descripcion             : Consulta que devuelve un registro de la tabla que tenga estado = 1
-- Retorna                 : todas las columnas
-- Parametros Where        : cCodMaeSexo
-- Creado por              : App
-- Fecha creacion          : 22/05/2015 12:09:34
-- ¿Esta siendo Utilizado? : NO
-- Clases DANT Utilizando  : maesexoDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 2
    THEN
        SELECT cCodMaeSexo, nvAbreviatura, nvDenominacion, nvDescripcion, nvObservacion, iIdRegUsuaRegistra, dtFechRegistra, iCantidadModifica, bEstado
        FROM sisaguasaniamiento.maesexo 
        WHERE bEstado=1;
    END IF;



/*****************************************************************************************************
--
-- Descripcion             : (Uso exclusivo para cargar controles de seleccion) Consulta que lista todos los registros de la tabla que tengan estado = 1
-- Retorna                 : cCodMaeSexo y Observacion
-- Parametros Where        : ninguno
-- Creado por              : APP
-- Fecha creacion          : 22/05/2015 12:09:34
-- ¿Esta siendo Utilizado? : NO
-- Clases DANT Utilizando  : maesexoDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 3
    THEN
        SELECT cCodMaeSexo, nvObservacion
        FROM sisaguasaniamiento.maesexo 
        WHERE bEstado=1;
    END IF;



/****************************************************************************************************
--
-- Descripcion             : (Uso exclusivo para controles de autocompletado que recuperen 2 datos: id y un valor) Consulta que lista todos los registros de la tabla que tengan estado = 1 y coincidencias con la busqueda que se realiza
-- Retorna                 : cCodMaeSexo y Observacion
-- Parametros Where        : Observacion
-- Creado por              : APP
-- Fecha creacion          : 22/05/2015 12:09:34
-- ¿Esta siendo Utilizado? : NO
-- Clases DANT Utilizando  : maesexoDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 4
    THEN
        SELECT cCodMaeSexo, nvObservacion
        FROM sisaguasaniamiento.maesexo 
        WHERE bEstado = 1 AND Observacion LIKE  CONCAT("%",_Observacion ,"%")    LIMIT 10; 
    END IF;



/****************************************************************************************************
--
-- Descripcion             : (Uso exclusivo para controles de autocompletado que recuperen 3 datos: id, codigo y un valor) Consulta que lista todos los registros de la tabla que tengan estado = 1 y coincidencias con la busqueda que se realiza
-- Retorna                 : cCodMaeSexo, Observacion y Observacion
-- Parametros Where        : Observacion
-- Creado por              : APP
-- Fecha creacion          : 22/05/2015 12:09:34
-- ¿Esta siendo Utilizado? : NO
-- Clases DANT Utilizando  : maesexoDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 5
    THEN
        SELECT cCodMaeSexo, nvObservacion, iIdRegUsuaRegistra
        FROM sisaguasaniamiento.maesexo
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
-- Clases DANT Utilizando  : maesexoDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 6
    THEN
    SET @rownum:=0;
	SELECT /*(@rownum:=@rownum+1) as RowNum,*/maesexo.*
	FROM sisaguasaniamiento.maesexo 
	WHERE bEstado=1;
    END IF;
    


    END $$
    DELIMITER ;

