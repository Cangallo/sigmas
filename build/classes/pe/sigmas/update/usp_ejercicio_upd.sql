/*****************************************************************************************************************************
-- Este procedimiento almacenado usp_ejercicio_upd
--     es el encargado de realizar actualizaciones a la tabla ejercicio
--
-- Input               : iOpSp - Es de tipo int, indica la operacion a efectuar
                       :_iIdEjercicio int, <descripcion>
                       :_iAnioFiscal int, <descripcion>
                       :_deUit decimal(10,4), <descripcion>
                       :_nvDenominacion varchar(500), <descripcion>
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
DROP PROCEDURE IF EXISTS sisaguasaniamiento.usp_ejercicio_upd $$
CREATE PROCEDURE sisaguasaniamiento.usp_ejercicio_upd(
 IN iOpSp int,
 OUT bEstaOperacion bool,
IN _iIdEjercicio int,
IN _iAnioFiscal int,
IN _deUit decimal(10,4),
IN _nvDenominacion varchar(500),
IN _nvObservacion varchar(500),
IN _iIdRegUsuaRegistra int,
IN _dtFechRegistra datetime,
IN _iCantidadModifica int,
IN _bEstado bit
)
BEGIN

IF iOpSp=1 THEN 	

START TRANSACTION;

		UPDATE sisaguasaniamiento.ejercicio
		SET iIdEjercicio = _iIdEjercicio, iAnioFiscal = _iAnioFiscal, deUit = _deUit, nvDenominacion = _nvDenominacion, nvObservacion = _nvObservacion, iIdRegUsuaRegistra = _iIdRegUsuaRegistra, dtFechRegistra = _dtFechRegistra, iCantidadModifica = _iCantidadModifica, bEstado = _bEstado
		WHERE iIdEjercicio = _iIdEjercicio;

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

