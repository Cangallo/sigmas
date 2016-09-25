/******************************************************************************************************************************
-- Este procedimiento almacenado usp_regdetapago_lst
--     es el encargado de realizar consultas a la tabla regdetapago
--     , mediante opciones de consultas se manejan los diferentes SELECT a regdetapago
--
-- Input               : iOpSp - Es de tipo int, indica la operacion a efectuar
                       :_biIdRegDetaPago int, <descripcion>
                       :_biIdRegPago int, <descripcion>
                       :_cCodRegContribuyente char(15), <descripcion>
                       :_biIdRegObligacion int, <descripcion>
                       :_iIdEjercicio int, <descripcion>
                       :_cCodMaeEstaPago char(5), <descripcion>
                       :_cCodMaeEstaCaja char(5), <descripcion>
                       :_cCodMaeConcepto char(5), <descripcion>
                       :_nvRegUnidad varchar(16), <descripcion>
                       :_nvNumRecibo varchar(20), <descripcion>
                       :_deTotalInsoluto decimal(10,4), <descripcion>
                       :_deTotalReajuste decimal(10,4), <descripcion>
                       :_deTotalInteres decimal(10,4), <descripcion>
                       :_deTotalGasto decimal(10,4), <descripcion>
                       :_dePagoInsoluto decimal(10,4), <descripcion>
                       :_dePagoReajuste decimal(10,4), <descripcion>
                       :_dePagoInteres decimal(10,4), <descripcion>
                       :_dePagoGasto decimal(10,4), <descripcion>
                       :_dePagoTotal decimal(10,4), <descripcion>
                       :_iCantidad int, <descripcion>
                       :_deValoUnitario decimal(10,4), <descripcion>
                       :_iIdVencimiento int, <descripcion>
                       :_dtFechEmision datetime, <descripcion>
                       :_dtFechVencimiento datetime, <descripcion>
                       :_dtFechRecibo datetime, <descripcion>
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
DROP PROCEDURE IF EXISTS sisaguasaniamiento.usp_regdetapago_lst $$
CREATE PROCEDURE sisaguasaniamiento.usp_regdetapago_lst(
 IN iOpSp int,
 OUT bEstaOperacion bool,
IN _biIdRegDetaPago int,
IN _biIdRegPago int,
IN _cCodRegContribuyente char(15),
IN _biIdRegObligacion int,
IN _iIdEjercicio int,
IN _cCodMaeEstaPago char(5),
IN _cCodMaeEstaCaja char(5),
IN _cCodMaeConcepto char(5),
IN _nvRegUnidad varchar(16),
IN _nvNumRecibo varchar(20),
IN _deTotalInsoluto decimal(10,4),
IN _deTotalReajuste decimal(10,4),
IN _deTotalInteres decimal(10,4),
IN _deTotalGasto decimal(10,4),
IN _dePagoInsoluto decimal(10,4),
IN _dePagoReajuste decimal(10,4),
IN _dePagoInteres decimal(10,4),
IN _dePagoGasto decimal(10,4),
IN _dePagoTotal decimal(10,4),
IN _iCantidad int,
IN _deValoUnitario decimal(10,4),
IN _iIdVencimiento int,
IN _dtFechEmision datetime,
IN _dtFechVencimiento datetime,
IN _dtFechRecibo datetime,
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
-- Clases DANT Utilizando  : regdetapagoDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 1
    THEN
        SELECT biIdRegDetaPago, biIdRegPago, cCodRegContribuyente, biIdRegObligacion, iIdEjercicio, cCodMaeEstaPago, cCodMaeEstaCaja, cCodMaeConcepto, nvRegUnidad, nvNumRecibo, deTotalInsoluto, deTotalReajuste, deTotalInteres, deTotalGasto, dePagoInsoluto, dePagoReajuste, dePagoInteres, dePagoGasto, dePagoTotal, iCantidad, deValoUnitario, iIdVencimiento, dtFechEmision, dtFechVencimiento, dtFechRecibo, nvObservacion, iIdRegUsuaRegistra, dtFechRegistra, iCantidadModifica, bEstado
        FROM sisaguasaniamiento.regdetapago 
        WHERE bEstado=1 AND biIdRegDetaPago = _biIdRegDetaPago;
    END IF;



/*****************************************************************************************************
--
-- Descripcion             : Consulta que devuelve un registro de la tabla que tenga estado = 1
-- Retorna                 : todas las columnas
-- Parametros Where        : biIdRegDetaPago
-- Creado por              : App
-- Fecha creacion          : 22/05/2015 12:09:34
-- ¿Esta siendo Utilizado? : NO
-- Clases DANT Utilizando  : regdetapagoDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 2
    THEN
        SELECT biIdRegDetaPago, biIdRegPago, cCodRegContribuyente, biIdRegObligacion, iIdEjercicio, cCodMaeEstaPago, cCodMaeEstaCaja, cCodMaeConcepto, nvRegUnidad, nvNumRecibo, deTotalInsoluto, deTotalReajuste, deTotalInteres, deTotalGasto, dePagoInsoluto, dePagoReajuste, dePagoInteres, dePagoGasto, dePagoTotal, iCantidad, deValoUnitario, iIdVencimiento, dtFechEmision, dtFechVencimiento, dtFechRecibo, nvObservacion, iIdRegUsuaRegistra, dtFechRegistra, iCantidadModifica, bEstado
        FROM sisaguasaniamiento.regdetapago 
        WHERE bEstado=1;
    END IF;



/*****************************************************************************************************
--
-- Descripcion             : (Uso exclusivo para cargar controles de seleccion) Consulta que lista todos los registros de la tabla que tengan estado = 1
-- Retorna                 : biIdRegDetaPago y Observacion
-- Parametros Where        : ninguno
-- Creado por              : APP
-- Fecha creacion          : 22/05/2015 12:09:34
-- ¿Esta siendo Utilizado? : NO
-- Clases DANT Utilizando  : regdetapagoDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 3
    THEN
        SELECT biIdRegDetaPago, nvObservacion
        FROM sisaguasaniamiento.regdetapago 
        WHERE bEstado=1;
    END IF;



/****************************************************************************************************
--
-- Descripcion             : (Uso exclusivo para controles de autocompletado que recuperen 2 datos: id y un valor) Consulta que lista todos los registros de la tabla que tengan estado = 1 y coincidencias con la busqueda que se realiza
-- Retorna                 : biIdRegDetaPago y Observacion
-- Parametros Where        : Observacion
-- Creado por              : APP
-- Fecha creacion          : 22/05/2015 12:09:34
-- ¿Esta siendo Utilizado? : NO
-- Clases DANT Utilizando  : regdetapagoDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 4
    THEN
        SELECT biIdRegDetaPago, nvObservacion
        FROM sisaguasaniamiento.regdetapago 
        WHERE bEstado = 1 AND Observacion LIKE  CONCAT("%",_Observacion ,"%")    LIMIT 10; 
    END IF;



/****************************************************************************************************
--
-- Descripcion             : (Uso exclusivo para controles de autocompletado que recuperen 3 datos: id, codigo y un valor) Consulta que lista todos los registros de la tabla que tengan estado = 1 y coincidencias con la busqueda que se realiza
-- Retorna                 : biIdRegDetaPago, Observacion y Observacion
-- Parametros Where        : Observacion
-- Creado por              : APP
-- Fecha creacion          : 22/05/2015 12:09:34
-- ¿Esta siendo Utilizado? : NO
-- Clases DANT Utilizando  : regdetapagoDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 5
    THEN
        SELECT biIdRegDetaPago, nvObservacion, iIdRegUsuaRegistra
        FROM sisaguasaniamiento.regdetapago
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
-- Clases DANT Utilizando  : regdetapagoDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 6
    THEN
    SET @rownum:=0;
	SELECT /*(@rownum:=@rownum+1) as RowNum,*/regdetapago.*
	FROM sisaguasaniamiento.regdetapago 
	WHERE bEstado=1;
    END IF;
    


    END $$
    DELIMITER ;

