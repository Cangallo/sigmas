/*****************************************************************************************************************************
-- Este procedimiento almacenado usp_valconcepto_upd
--     es el encargado de realizar actualizaciones a la tabla valconcepto
--
-- Input               : iOpSp - Es de tipo int, indica la operacion a efectuar
                       :_iIdValConcepto int, <descripcion>
                       :_cCodMaeConcepto char(5), <descripcion>
                       :_cCodRegContribuyente char(15), <descripcion>
                       :_iIdVencimiento int, <descripcion>
                       :_deTotaInsoluto decimal(10,4), <descripcion>
                       :_bIndFijo bit, <descripcion>
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
DROP PROCEDURE IF EXISTS sisaguasaniamiento.usp_valconcepto_upd $$
CREATE PROCEDURE sisaguasaniamiento.usp_valconcepto_upd(
 IN iOpSp int,
 OUT bEstaOperacion bool,
IN _iIdValConcepto int,
IN _cCodMaeConcepto char(5),
IN _cCodRegContribuyente char(15),
IN _iIdVencimiento int,
IN _deTotaInsoluto decimal(10,4),
IN _bIndFijo bit,
IN _nvObservacion varchar(500),
IN _iIdRegUsuaRegistra int,
IN _dtFechRegistra datetime,
IN _iCantidadModifica int,
IN _bEstado bit
)
BEGIN

IF iOpSp=1 THEN 	

START TRANSACTION;

		UPDATE sisaguasaniamiento.valconcepto
		SET iIdValConcepto = _iIdValConcepto, cCodMaeConcepto = _cCodMaeConcepto, cCodRegContribuyente = _cCodRegContribuyente, iIdVencimiento = _iIdVencimiento, deTotaInsoluto = _deTotaInsoluto, bIndFijo = _bIndFijo, nvObservacion = _nvObservacion, iIdRegUsuaRegistra = _iIdRegUsuaRegistra, dtFechRegistra = _dtFechRegistra, iCantidadModifica = _iCantidadModifica, bEstado = _bEstado
		WHERE iIdValConcepto = _iIdValConcepto;

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

