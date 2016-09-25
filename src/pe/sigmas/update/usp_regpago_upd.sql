/*****************************************************************************************************************************
-- Este procedimiento almacenado usp_regpago_upd
--     es el encargado de realizar actualizaciones a la tabla regpago
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
-- Creado por          : APP
-- Fecha creacion      : 22/05/2015 12:10:06
------------------------------------------------------------------------------------------------------------------------------
-- Fecha actualizacion : <Fecha de Actualizacion>  Responsable:    <Analista Programador>
-- Motivo              : <Motivo de la Modificacion>
--*****************************************************************************************************************************/


DELIMITER $$
DROP PROCEDURE IF EXISTS sisaguasaniamiento.usp_regpago_upd $$
CREATE PROCEDURE sisaguasaniamiento.usp_regpago_upd(
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

IF iOpSp=1 THEN 	

START TRANSACTION;

		UPDATE sisaguasaniamiento.regpago
		SET biIdRegPago = _biIdRegPago, cCodMaeEstaPago = _cCodMaeEstaPago, cCodMaeEstaCaja = _cCodMaeEstaCaja, cCodRegContribuyente = _cCodRegContribuyente, biIdRegRecibo = _biIdRegRecibo, nvNumRecibo = _nvNumRecibo, deMontRecibido = _deMontRecibido, deMontVuelto = _deMontVuelto, deMontCancRedondeado = _deMontCancRedondeado, deMontCancelado = _deMontCancelado, deMontResiRedondeo = _deMontResiRedondeo, deTotalInsoluto = _deTotalInsoluto, deTotalReajuste = _deTotalReajuste, deTotalInteres = _deTotalInteres, deTotalGasto = _deTotalGasto, dtFechRecibo = _dtFechRecibo, nvIp = _nvIp, nvNombPc = _nvNombPc, nvObservacion = _nvObservacion, iIdRegUsuaRegistra = _iIdRegUsuaRegistra, dtFechRegistra = _dtFechRegistra, iCantidadModifica = _iCantidadModifica, bEstado = _bEstado
		WHERE biIdRegPago = _biIdRegPago;

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

