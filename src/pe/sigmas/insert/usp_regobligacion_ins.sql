/*****************************************************************************************************************************
-- Este procedimiento almacenado usp_regobligacion_ins
--     es el encargado de realizar inserciones a la tabla regobligacion
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
-- Fecha creacion      : 22/05/2015 12:10:32
------------------------------------------------------------------------------------------------------------------------------
-- Fecha actualizacion : <Fecha de Actualizacion>  Responsable:    <Analista Programador>
-- Motivo              : <Motivo de la Modificacion>
--*****************************************************************************************************************************/


DELIMITER $$
DROP PROCEDURE IF EXISTS sisaguasaniamiento.usp_regobligacion_ins $$
CREATE PROCEDURE sisaguasaniamiento.usp_regobligacion_ins(
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

/*SET @biIdRegObligacion:=(SELECT  COALESCE(MAX(biIdRegObligacion),0)+1 FROM sisaguasaniamiento.regobligacion);*/

		INSERT INTO sisaguasaniamiento.regobligacion (biIdRegObligacion, iIdEjercicio, iIdValConcepto, biIdRegRecibo, cCodMaeEstaObligacion, cCodRegContribuyente, iIdVencimiento, deTotaInsoluto, deTotaReajuste, deTotaInteres, deTotaGasto, dePagoInsoluto, dePagoReajuste, dePagoInteres, dePagoGasto, deModiInsoluto, deModiReajuste, deModiInteres, deModiGasto, dtFechEmision, dtFechVencimiento, dtFechPago, nvObservacion, iIdRegUsuaRegistra, dtFechRegistra, iCantidadModifica, bEstado)
		VALUES (_biIdRegObligacion, _iIdEjercicio, _iIdValConcepto, _biIdRegRecibo, _cCodMaeEstaObligacion, _cCodRegContribuyente, _iIdVencimiento, _deTotaInsoluto, _deTotaReajuste, _deTotaInteres, _deTotaGasto, _dePagoInsoluto, _dePagoReajuste, _dePagoInteres, _dePagoGasto, _deModiInsoluto, _deModiReajuste, _deModiInteres, _deModiGasto, _dtFechEmision, _dtFechVencimiento, _dtFechPago, _nvObservacion, _iIdRegUsuaRegistra, _dtFechRegistra, _iCantidadModifica, _bEstado);

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

