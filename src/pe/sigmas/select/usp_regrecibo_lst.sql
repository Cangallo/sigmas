/******************************************************************************************************************************
-- Este procedimiento almacenado usp_regrecibo_lst
--     es el encargado de realizar consultas a la tabla regrecibo
--     , mediante opciones de consultas se manejan los diferentes SELECT a regrecibo
--
-- Input               : iOpSp - Es de tipo int, indica la operacion a efectuar
                       :_biIdRegRecibo int, <descripcion>
                       :_iIdEjercicio int, <descripcion>
                       :_cCodRegContribuyente char(15), <descripcion>
                       :_iIdVencimiento int, <descripcion>
                       :_nvNumRecibo char(6), <descripcion>
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
DROP PROCEDURE IF EXISTS sisaguasaniamiento.usp_regrecibo_lst $$
CREATE PROCEDURE sisaguasaniamiento.usp_regrecibo_lst(
 IN iOpSp int,
 OUT bEstaOperacion bool,
IN _biIdRegRecibo int,
IN _iIdEjercicio int,
IN _cCodRegContribuyente char(15),
IN _iIdVencimiento int,
IN _nvNumRecibo char(6),
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
-- Clases DANT Utilizando  : regreciboDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 1
    THEN
        SELECT biIdRegRecibo, iIdEjercicio, cCodRegContribuyente, iIdVencimiento, nvNumRecibo, nvObservacion, iIdRegUsuaRegistra, dtFechRegistra, iCantidadModifica, bEstado
        FROM sisaguasaniamiento.regrecibo 
        WHERE bEstado=1 AND biIdRegRecibo = _biIdRegRecibo;
    END IF;



/*****************************************************************************************************
--
-- Descripcion             : Consulta que devuelve un registro de la tabla que tenga estado = 1
-- Retorna                 : todas las columnas
-- Parametros Where        : biIdRegRecibo
-- Creado por              : App
-- Fecha creacion          : 22/05/2015 12:09:34
-- ¿Esta siendo Utilizado? : NO
-- Clases DANT Utilizando  : regreciboDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 2
    THEN
        SELECT biIdRegRecibo, iIdEjercicio, cCodRegContribuyente, iIdVencimiento, nvNumRecibo, nvObservacion, iIdRegUsuaRegistra, dtFechRegistra, iCantidadModifica, bEstado
        FROM sisaguasaniamiento.regrecibo 
        WHERE bEstado=1;
    END IF;



/*****************************************************************************************************
--
-- Descripcion             : (Uso exclusivo para cargar controles de seleccion) Consulta que lista todos los registros de la tabla que tengan estado = 1
-- Retorna                 : biIdRegRecibo y Observacion
-- Parametros Where        : ninguno
-- Creado por              : APP
-- Fecha creacion          : 22/05/2015 12:09:34
-- ¿Esta siendo Utilizado? : NO
-- Clases DANT Utilizando  : regreciboDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 3
    THEN
        SELECT biIdRegRecibo, nvObservacion
        FROM sisaguasaniamiento.regrecibo 
        WHERE bEstado=1;
    END IF;



/****************************************************************************************************
--
-- Descripcion             : (Uso exclusivo para controles de autocompletado que recuperen 2 datos: id y un valor) Consulta que lista todos los registros de la tabla que tengan estado = 1 y coincidencias con la busqueda que se realiza
-- Retorna                 : biIdRegRecibo y Observacion
-- Parametros Where        : Observacion
-- Creado por              : APP
-- Fecha creacion          : 22/05/2015 12:09:34
-- ¿Esta siendo Utilizado? : NO
-- Clases DANT Utilizando  : regreciboDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 4
    THEN
        SELECT biIdRegRecibo, nvObservacion
        FROM sisaguasaniamiento.regrecibo 
        WHERE bEstado = 1 AND Observacion LIKE  CONCAT("%",_Observacion ,"%")    LIMIT 10; 
    END IF;



/****************************************************************************************************
--
-- Descripcion             : (Uso exclusivo para controles de autocompletado que recuperen 3 datos: id, codigo y un valor) Consulta que lista todos los registros de la tabla que tengan estado = 1 y coincidencias con la busqueda que se realiza
-- Retorna                 : biIdRegRecibo, Observacion y Observacion
-- Parametros Where        : Observacion
-- Creado por              : APP
-- Fecha creacion          : 22/05/2015 12:09:34
-- ¿Esta siendo Utilizado? : NO
-- Clases DANT Utilizando  : regreciboDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 5
    THEN
        SELECT biIdRegRecibo, nvObservacion, iIdRegUsuaRegistra
        FROM sisaguasaniamiento.regrecibo
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
-- Clases DANT Utilizando  : regreciboDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 6
    THEN
    SET @rownum:=0;
	SELECT /*(@rownum:=@rownum+1) as RowNum,*/regrecibo.*
	FROM sisaguasaniamiento.regrecibo 
	WHERE bEstado=1;
    END IF;
    


    END $$
    DELIMITER ;

