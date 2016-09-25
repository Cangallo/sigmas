/*****************************************************************************************************************************
-- Este procedimiento almacenado usp_regdetapago_upd
--     es el encargado de realizar actualizaciones a la tabla regdetapago
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
-- Creado por          : APP
-- Fecha creacion      : 22/05/2015 12:10:06
------------------------------------------------------------------------------------------------------------------------------
-- Fecha actualizacion : <Fecha de Actualizacion>  Responsable:    <Analista Programador>
-- Motivo              : <Motivo de la Modificacion>
--*****************************************************************************************************************************/


DELIMITER $$
DROP PROCEDURE IF EXISTS sisaguasaniamiento.usp_regdetapago_upd $$
CREATE PROCEDURE sisaguasaniamiento.usp_regdetapago_upd(
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

IF iOpSp=1 THEN 	

START TRANSACTION;

		UPDATE sisaguasaniamiento.regdetapago
		SET biIdRegDetaPago = _biIdRegDetaPago, biIdRegPago = _biIdRegPago, cCodRegContribuyente = _cCodRegContribuyente, biIdRegObligacion = _biIdRegObligacion, iIdEjercicio = _iIdEjercicio, cCodMaeEstaPago = _cCodMaeEstaPago, cCodMaeEstaCaja = _cCodMaeEstaCaja, cCodMaeConcepto = _cCodMaeConcepto, nvRegUnidad = _nvRegUnidad, nvNumRecibo = _nvNumRecibo, deTotalInsoluto = _deTotalInsoluto, deTotalReajuste = _deTotalReajuste, deTotalInteres = _deTotalInteres, deTotalGasto = _deTotalGasto, dePagoInsoluto = _dePagoInsoluto, dePagoReajuste = _dePagoReajuste, dePagoInteres = _dePagoInteres, dePagoGasto = _dePagoGasto, dePagoTotal = _dePagoTotal, iCantidad = _iCantidad, deValoUnitario = _deValoUnitario, iIdVencimiento = _iIdVencimiento, dtFechEmision = _dtFechEmision, dtFechVencimiento = _dtFechVencimiento, dtFechRecibo = _dtFechRecibo, nvObservacion = _nvObservacion, iIdRegUsuaRegistra = _iIdRegUsuaRegistra, dtFechRegistra = _dtFechRegistra, iCantidadModifica = _iCantidadModifica, bEstado = _bEstado
		WHERE biIdRegDetaPago = _biIdRegDetaPago;

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

