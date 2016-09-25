/*****************************************************************************************************************************
-- Este procedimiento almacenado usp_regobligacion_upd
--     es el encargado de realizar actualizaciones a la tabla regobligacion
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
-- Creado por          : APP
-- Fecha creacion      : 22/05/2015 12:10:06
------------------------------------------------------------------------------------------------------------------------------
-- Fecha actualizacion : <Fecha de Actualizacion>  Responsable:    <Analista Programador>
-- Motivo              : <Motivo de la Modificacion>
--*****************************************************************************************************************************/


DELIMITER $$
DROP PROCEDURE IF EXISTS sisaguasaniamiento.usp_regobligacion_upd $$
CREATE PROCEDURE sisaguasaniamiento.usp_regobligacion_upd(
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

IF iOpSp=1 THEN 	

START TRANSACTION;

		UPDATE sisaguasaniamiento.regobligacion
		SET biIdRegObligacion = _biIdRegObligacion, iIdEjercicio = _iIdEjercicio, iIdValConcepto = _iIdValConcepto, biIdRegRecibo = _biIdRegRecibo, cCodMaeEstaObligacion = _cCodMaeEstaObligacion, cCodRegContribuyente = _cCodRegContribuyente, iIdVencimiento = _iIdVencimiento, deTotaInsoluto = _deTotaInsoluto, deTotaReajuste = _deTotaReajuste, deTotaInteres = _deTotaInteres, deTotaGasto = _deTotaGasto, dePagoInsoluto = _dePagoInsoluto, dePagoReajuste = _dePagoReajuste, dePagoInteres = _dePagoInteres, dePagoGasto = _dePagoGasto, deModiInsoluto = _deModiInsoluto, deModiReajuste = _deModiReajuste, deModiInteres = _deModiInteres, deModiGasto = _deModiGasto, dtFechEmision = _dtFechEmision, dtFechVencimiento = _dtFechVencimiento, dtFechPago = _dtFechPago, nvObservacion = _nvObservacion, iIdRegUsuaRegistra = _iIdRegUsuaRegistra, dtFechRegistra = _dtFechRegistra, iCantidadModifica = _iCantidadModifica, bEstado = _bEstado
		WHERE biIdRegObligacion = _biIdRegObligacion;

	SET @_error:=(SELECT @error);
	IF @_error = 0 THEN
	  SET bEstaOperacion=false;
	  ROLLBACK;
	ELSE
	  SET bEstaOperacion=true;
	  COMMIT;
  END IF;
END IF;
    


    END $$
    DELIMITER ;

