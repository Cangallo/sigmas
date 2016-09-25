/******************************************************************************************************************************
-- Este procedimiento almacenado usp_regobligacion_lst
--     es el encargado de realizar consultas a la tabla regobligacion
--     , mediante opciones de consultas se manejan los diferentes SELECT a regobligacion
--
-- Input               : iOpSp - Es de tipo int, indica la operacion a efectuar
                       :_biIdRegObligacion int, <descripcion>
                       :_iIdEjercicio int, <descripcion>
                       :_iIdValConcepto int, <descripcion>
                       :_biIdRegRecibo int, <descripcion>
                       :_cCodMaeEstaObligacion char(5), <descripcion>
                       :_cCodRegContribuyente char(15), <descripcion>
                       :_iIdVencimiento int, <descripcion>
                       :_deTotaInsoluto decimal(10,4), <descripcion>
                       :_deTotaReajuste decimal(10,4), <descripcion>
                       :_deTotaInteres decimal(10,4), <descripcion>
                       :_deTotaGasto decimal(10,4), <descripcion>
                       :_dePagoInsoluto decimal(10,4), <descripcion>
                       :_dePagoReajuste decimal(10,4), <descripcion>
                       :_dePagoInteres decimal(10,4), <descripcion>
                       :_dePagoGasto decimal(10,4), <descripcion>
                       :_deModiInsoluto decimal(10,4), <descripcion>
                       :_deModiReajuste decimal(10,4), <descripcion>
                       :_deModiInteres decimal(10,4), <descripcion>
                       :_deModiGasto decimal(10,4), <descripcion>
                       :_dtFechEmision datetime, <descripcion>
                       :_dtFechVencimiento datetime, <descripcion>
                       :_dtFechPago datetime, <descripcion>
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
DROP PROCEDURE IF EXISTS sisaguasaniamiento.usp_regobligacion_lst $$
CREATE PROCEDURE sisaguasaniamiento.usp_regobligacion_lst(
 IN iOpSp int,
 OUT bEstaOperacion bool,
IN _biIdRegObligacion int,
IN _iIdEjercicio int,
IN _iIdValConcepto int,
IN _biIdRegRecibo int,
IN _cCodMaeEstaObligacion char(5),
IN _cCodRegContribuyente char(15),
IN _iIdVencimiento int,
IN _deTotaInsoluto decimal(10,4),
IN _deTotaReajuste decimal(10,4),
IN _deTotaInteres decimal(10,4),
IN _deTotaGasto decimal(10,4),
IN _dePagoInsoluto decimal(10,4),
IN _dePagoReajuste decimal(10,4),
IN _dePagoInteres decimal(10,4),
IN _dePagoGasto decimal(10,4),
IN _deModiInsoluto decimal(10,4),
IN _deModiReajuste decimal(10,4),
IN _deModiInteres decimal(10,4),
IN _deModiGasto decimal(10,4),
IN _dtFechEmision datetime,
IN _dtFechVencimiento datetime,
IN _dtFechPago datetime,
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
-- Clases DANT Utilizando  : regobligacionDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 1
    THEN
        SELECT biIdRegObligacion, iIdEjercicio, iIdValConcepto, biIdRegRecibo, cCodMaeEstaObligacion, cCodRegContribuyente, iIdVencimiento, deTotaInsoluto, deTotaReajuste, deTotaInteres, deTotaGasto, dePagoInsoluto, dePagoReajuste, dePagoInteres, dePagoGasto, deModiInsoluto, deModiReajuste, deModiInteres, deModiGasto, dtFechEmision, dtFechVencimiento, dtFechPago, nvObservacion, iIdRegUsuaRegistra, dtFechRegistra, iCantidadModifica, bEstado
        FROM sisaguasaniamiento.regobligacion 
        WHERE bEstado=1 AND biIdRegObligacion = _biIdRegObligacion;
    END IF;



/*****************************************************************************************************
--
-- Descripcion             : Consulta que devuelve un registro de la tabla que tenga estado = 1
-- Retorna                 : todas las columnas
-- Parametros Where        : biIdRegObligacion
-- Creado por              : App
-- Fecha creacion          : 22/05/2015 12:09:34
-- ¿Esta siendo Utilizado? : NO
-- Clases DANT Utilizando  : regobligacionDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 2
    THEN
        SELECT biIdRegObligacion, iIdEjercicio, iIdValConcepto, biIdRegRecibo, cCodMaeEstaObligacion, cCodRegContribuyente, iIdVencimiento, deTotaInsoluto, deTotaReajuste, deTotaInteres, deTotaGasto, dePagoInsoluto, dePagoReajuste, dePagoInteres, dePagoGasto, deModiInsoluto, deModiReajuste, deModiInteres, deModiGasto, dtFechEmision, dtFechVencimiento, dtFechPago, nvObservacion, iIdRegUsuaRegistra, dtFechRegistra, iCantidadModifica, bEstado
        FROM sisaguasaniamiento.regobligacion 
        WHERE bEstado=1;
    END IF;



/*****************************************************************************************************
--
-- Descripcion             : (Uso exclusivo para cargar controles de seleccion) Consulta que lista todos los registros de la tabla que tengan estado = 1
-- Retorna                 : biIdRegObligacion y Observacion
-- Parametros Where        : ninguno
-- Creado por              : APP
-- Fecha creacion          : 22/05/2015 12:09:34
-- ¿Esta siendo Utilizado? : NO
-- Clases DANT Utilizando  : regobligacionDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 3
    THEN
        SELECT biIdRegObligacion, nvObservacion
        FROM sisaguasaniamiento.regobligacion 
        WHERE bEstado=1;
    END IF;



/****************************************************************************************************
--
-- Descripcion             : (Uso exclusivo para controles de autocompletado que recuperen 2 datos: id y un valor) Consulta que lista todos los registros de la tabla que tengan estado = 1 y coincidencias con la busqueda que se realiza
-- Retorna                 : biIdRegObligacion y Observacion
-- Parametros Where        : Observacion
-- Creado por              : APP
-- Fecha creacion          : 22/05/2015 12:09:34
-- ¿Esta siendo Utilizado? : NO
-- Clases DANT Utilizando  : regobligacionDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 4
    THEN
        SELECT biIdRegObligacion, nvObservacion
        FROM sisaguasaniamiento.regobligacion 
        WHERE bEstado = 1 AND Observacion LIKE  CONCAT("%",_Observacion ,"%")    LIMIT 10; 
    END IF;



/****************************************************************************************************
--
-- Descripcion             : (Uso exclusivo para controles de autocompletado que recuperen 3 datos: id, codigo y un valor) Consulta que lista todos los registros de la tabla que tengan estado = 1 y coincidencias con la busqueda que se realiza
-- Retorna                 : biIdRegObligacion, Observacion y Observacion
-- Parametros Where        : Observacion
-- Creado por              : APP
-- Fecha creacion          : 22/05/2015 12:09:34
-- ¿Esta siendo Utilizado? : NO
-- Clases DANT Utilizando  : regobligacionDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 5
    THEN
        SELECT biIdRegObligacion, nvObservacion, iIdRegUsuaRegistra
        FROM sisaguasaniamiento.regobligacion
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
-- Clases DANT Utilizando  : regobligacionDANT
-- Modificado por          : <Analista Programador>
-- Fecha Actualizacion     : <Fecha de Actualizacion>
-- Motivo                  : <Motivo de la modificacion>
--
--****************************************************************************************************/
IF iOpSp = 6
    THEN
    SET @rownum:=0;
	SELECT /*(@rownum:=@rownum+1) as RowNum,*/regobligacion.*
	FROM sisaguasaniamiento.regobligacion 
	WHERE bEstado=1;
    END IF;
    


    END $$
    DELIMITER ;

