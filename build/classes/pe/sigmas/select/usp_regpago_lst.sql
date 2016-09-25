/******************************************************************************************************************************
-- Este procedimiento almacenado usp_regpago_lst
--     es el encargado de realizar consultas a la tabla regpago
--     , mediante opciones de consultas se manejan los diferentes SELECT a regpago
--
-- Input               : iOpSp - Es de tipo int, indica la operacion a efectuar
                       :_biIdRegPago int, <descripcion>
                       :_cCodMaeEstaPago char(5), <descripcion>
                       :_cCodMaeEstaCaja char(5), <descripcion>
                       :_cCodRegContribuyente char(15), <descripcion>
                       :_biIdRegRecibo int, <descripcion>
                       :_nvNumRecibo varchar(20), <descripcion>
                       :_deMontRecibido decimal(10,4), <descripcion>
                       :_deMontVuelto decimal(10,4), <descripcion>
                       :_deMontCancRedondeado decimal(10,4), <descripcion>
                       :_deMontCancelado decimal(10,4), <descripcion>
                       :_deMontResiRedondeo decimal(10,4), <descripcion>
                       :_deTotalInsoluto decimal(10,4), <descripcion>
                       :_deTotalReajuste decimal(10,4), <descripcion>
                       :_deTotalInteres decimal(10,4), <descripcion>
                       :_deTotalGasto decimal(10,4), <descripcion>
                       :_dtFechRecibo datetime, <descripcion>
                       :_nvIp varchar(15), <descripcion>
                       :_nvNombPc varchar(30), <descripcion>
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
DROP PROCEDURE IF EXISTS sisaguasaniamiento.usp_regpago_lst $$
CREATE PROCEDURE sisaguasaniamiento.usp_regpago_lst(
 IN iOpSp int,
 OUT bEstaOperacion bool,
IN _biIdRegPago int,
IN _cCodMaeEstaPago char(5),
IN _cCodMaeEstaCaja char(5),
IN _cCodRegContribuyente char(15),
IN _biIdRegRecibo int,
IN _nvNumRecibo varchar(20),
IN _deMontRecibido decimal(10,4),
IN _deMontVuelto decimal(10,4),
IN _deMontCancRedondeado decimal(10,4),
IN _deMontCancelado decimal(10,4),
IN _deMontResiRedondeo decimal(10,4),
IN _deTotalInsoluto decimal(10,4),
IN _deTotalReajuste decimal(10,4),
IN _deTotalInteres decimal(10,4),
IN _deTotalGasto decimal(10,4),
IN _dtFechRecibo datetime,
IN _nvIp varchar(15),
IN _nvNombPc varchar(30),
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
-- Clases DANT Utilizando  : regpagoDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 1
    THEN
        SELECT biIdRegPago, cCodMaeEstaPago, cCodMaeEstaCaja, cCodRegContribuyente, biIdRegRecibo, nvNumRecibo, deMontRecibido, deMontVuelto, deMontCancRedondeado, deMontCancelado, deMontResiRedondeo, deTotalInsoluto, deTotalReajuste, deTotalInteres, deTotalGasto, dtFechRecibo, nvIp, nvNombPc, nvObservacion, iIdRegUsuaRegistra, dtFechRegistra, iCantidadModifica, bEstado
        FROM sisaguasaniamiento.regpago 
        WHERE bEstado=1 AND biIdRegPago = _biIdRegPago;
    END IF;



/*****************************************************************************************************
--
-- Descripcion             : Consulta que devuelve un registro de la tabla que tenga estado = 1
-- Retorna                 : todas las columnas
-- Parametros Where        : biIdRegPago
-- Creado por              : App
-- Fecha creacion          : 22/05/2015 12:09:34
-- ¿Esta siendo Utilizado? : NO
-- Clases DANT Utilizando  : regpagoDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 2
    THEN
        SELECT biIdRegPago, cCodMaeEstaPago, cCodMaeEstaCaja, cCodRegContribuyente, biIdRegRecibo, nvNumRecibo, deMontRecibido, deMontVuelto, deMontCancRedondeado, deMontCancelado, deMontResiRedondeo, deTotalInsoluto, deTotalReajuste, deTotalInteres, deTotalGasto, dtFechRecibo, nvIp, nvNombPc, nvObservacion, iIdRegUsuaRegistra, dtFechRegistra, iCantidadModifica, bEstado
        FROM sisaguasaniamiento.regpago 
        WHERE bEstado=1;
    END IF;



/*****************************************************************************************************
--
-- Descripcion             : (Uso exclusivo para cargar controles de seleccion) Consulta que lista todos los registros de la tabla que tengan estado = 1
-- Retorna                 : biIdRegPago y Observacion
-- Parametros Where        : ninguno
-- Creado por              : APP
-- Fecha creacion          : 22/05/2015 12:09:34
-- ¿Esta siendo Utilizado? : NO
-- Clases DANT Utilizando  : regpagoDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 3
    THEN
        SELECT biIdRegPago, nvObservacion
        FROM sisaguasaniamiento.regpago 
        WHERE bEstado=1;
    END IF;



/****************************************************************************************************
--
-- Descripcion             : (Uso exclusivo para controles de autocompletado que recuperen 2 datos: id y un valor) Consulta que lista todos los registros de la tabla que tengan estado = 1 y coincidencias con la busqueda que se realiza
-- Retorna                 : biIdRegPago y Observacion
-- Parametros Where        : Observacion
-- Creado por              : APP
-- Fecha creacion          : 22/05/2015 12:09:34
-- ¿Esta siendo Utilizado? : NO
-- Clases DANT Utilizando  : regpagoDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 4
    THEN
        SELECT biIdRegPago, nvObservacion
        FROM sisaguasaniamiento.regpago 
        WHERE bEstado = 1 AND Observacion LIKE  CONCAT("%",_Observacion ,"%")    LIMIT 10; 
    END IF;



/****************************************************************************************************
--
-- Descripcion             : (Uso exclusivo para controles de autocompletado que recuperen 3 datos: id, codigo y un valor) Consulta que lista todos los registros de la tabla que tengan estado = 1 y coincidencias con la busqueda que se realiza
-- Retorna                 : biIdRegPago, Observacion y Observacion
-- Parametros Where        : Observacion
-- Creado por              : APP
-- Fecha creacion          : 22/05/2015 12:09:34
-- ¿Esta siendo Utilizado? : NO
-- Clases DANT Utilizando  : regpagoDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 5
    THEN
        SELECT biIdRegPago, nvObservacion, iIdRegUsuaRegistra
        FROM sisaguasaniamiento.regpago
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
-- Clases DANT Utilizando  : regpagoDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 6
    THEN
    SET @rownum:=0;
	SELECT /*(@rownum:=@rownum+1) as RowNum,*/regpago.*
	FROM sisaguasaniamiento.regpago 
	WHERE bEstado=1;
    END IF;
    


    END $$
    DELIMITER ;

