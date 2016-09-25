/******************************************************************************************************************************
-- Este procedimiento almacenado usp_regpersona_lst
--     es el encargado de realizar consultas a la tabla regpersona
--     , mediante opciones de consultas se manejan los diferentes SELECT a regpersona
--
-- Input               : iOpSp - Es de tipo int, indica la operacion a efectuar
                       :_biIdRegPersona int, <descripcion>
                       :_cCodMaeEstaCivil char(5), <descripcion>
                       :_cCodMaeTipoPersona char(5), <descripcion>
                       :_cCodMaeSexo char(5), <descripcion>
                       :_nvNombre varchar(200), <descripcion>
                       :_nvApePaterno varchar(200), <descripcion>
                       :_nvApeMaterno varchar(200), <descripcion>
                       :_nvRazoSocial varchar(300), <descripcion>
                       :_nvNumDocumento varchar(20), <descripcion>
                       :_nvTeleFijo varchar(20), <descripcion>
                       :_nvTeleMovil varchar(20), <descripcion>
                       :_nvDomiProcesal varchar(200), <descripcion>
                       :_nvRpm varchar(20), <descripcion>
                       :_nvEmail varchar(200), <descripcion>
                       :_dtFechNacimiento datetime, <descripcion>
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
DROP PROCEDURE IF EXISTS sisaguasaniamiento.usp_regpersona_lst $$
CREATE PROCEDURE sisaguasaniamiento.usp_regpersona_lst(
 IN iOpSp int,
 OUT bEstaOperacion bool,
IN _biIdRegPersona int,
IN _cCodMaeEstaCivil char(5),
IN _cCodMaeTipoPersona char(5),
IN _cCodMaeSexo char(5),
IN _nvNombre varchar(200),
IN _nvApePaterno varchar(200),
IN _nvApeMaterno varchar(200),
IN _nvRazoSocial varchar(300),
IN _nvNumDocumento varchar(20),
IN _nvTeleFijo varchar(20),
IN _nvTeleMovil varchar(20),
IN _nvDomiProcesal varchar(200),
IN _nvRpm varchar(20),
IN _nvEmail varchar(200),
IN _dtFechNacimiento datetime,
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
-- Clases DANT Utilizando  : regpersonaDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 1
    THEN
        SELECT biIdRegPersona, cCodMaeEstaCivil, cCodMaeTipoPersona, cCodMaeSexo, nvNombre, nvApePaterno, nvApeMaterno, nvRazoSocial, nvNumDocumento, nvTeleFijo, nvTeleMovil, nvDomiProcesal, nvRpm, nvEmail, dtFechNacimiento, nvObservacion, iIdRegUsuaRegistra, dtFechRegistra, iCantidadModifica, bEstado
        FROM sisaguasaniamiento.regpersona 
        WHERE bEstado=1 AND biIdRegPersona = _biIdRegPersona;
    END IF;



/*****************************************************************************************************
--
-- Descripcion             : Consulta que devuelve un registro de la tabla que tenga estado = 1
-- Retorna                 : todas las columnas
-- Parametros Where        : biIdRegPersona
-- Creado por              : App
-- Fecha creacion          : 22/05/2015 12:09:34
-- ¿Esta siendo Utilizado? : NO
-- Clases DANT Utilizando  : regpersonaDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 2
    THEN
        SELECT biIdRegPersona, cCodMaeEstaCivil, cCodMaeTipoPersona, cCodMaeSexo, nvNombre, nvApePaterno, nvApeMaterno, nvRazoSocial, nvNumDocumento, nvTeleFijo, nvTeleMovil, nvDomiProcesal, nvRpm, nvEmail, dtFechNacimiento, nvObservacion, iIdRegUsuaRegistra, dtFechRegistra, iCantidadModifica, bEstado
        FROM sisaguasaniamiento.regpersona 
        WHERE bEstado=1;
    END IF;



/*****************************************************************************************************
--
-- Descripcion             : (Uso exclusivo para cargar controles de seleccion) Consulta que lista todos los registros de la tabla que tengan estado = 1
-- Retorna                 : biIdRegPersona y Observacion
-- Parametros Where        : ninguno
-- Creado por              : APP
-- Fecha creacion          : 22/05/2015 12:09:34
-- ¿Esta siendo Utilizado? : NO
-- Clases DANT Utilizando  : regpersonaDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 3
    THEN
        SELECT biIdRegPersona, nvObservacion
        FROM sisaguasaniamiento.regpersona 
        WHERE bEstado=1;
    END IF;



/****************************************************************************************************
--
-- Descripcion             : (Uso exclusivo para controles de autocompletado que recuperen 2 datos: id y un valor) Consulta que lista todos los registros de la tabla que tengan estado = 1 y coincidencias con la busqueda que se realiza
-- Retorna                 : biIdRegPersona y Observacion
-- Parametros Where        : Observacion
-- Creado por              : APP
-- Fecha creacion          : 22/05/2015 12:09:34
-- ¿Esta siendo Utilizado? : NO
-- Clases DANT Utilizando  : regpersonaDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 4
    THEN
        SELECT biIdRegPersona, nvObservacion
        FROM sisaguasaniamiento.regpersona 
        WHERE bEstado = 1 AND Observacion LIKE  CONCAT("%",_Observacion ,"%")    LIMIT 10; 
    END IF;



/****************************************************************************************************
--
-- Descripcion             : (Uso exclusivo para controles de autocompletado que recuperen 3 datos: id, codigo y un valor) Consulta que lista todos los registros de la tabla que tengan estado = 1 y coincidencias con la busqueda que se realiza
-- Retorna                 : biIdRegPersona, Observacion y Observacion
-- Parametros Where        : Observacion
-- Creado por              : APP
-- Fecha creacion          : 22/05/2015 12:09:34
-- ¿Esta siendo Utilizado? : NO
-- Clases DANT Utilizando  : regpersonaDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 5
    THEN
        SELECT biIdRegPersona, nvObservacion, iIdRegUsuaRegistra
        FROM sisaguasaniamiento.regpersona
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
-- Clases DANT Utilizando  : regpersonaDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 6
    THEN
    SET @rownum:=0;
	SELECT /*(@rownum:=@rownum+1) as RowNum,*/regpersona.*
	FROM sisaguasaniamiento.regpersona 
	WHERE bEstado=1;
    END IF;
    


    END $$
    DELIMITER ;

