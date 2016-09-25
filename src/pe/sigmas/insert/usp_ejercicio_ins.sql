/*****************************************************************************************************************************
-- Este procedimiento almacenado usp_ejercicio_ins
--     es el encargado de realizar inserciones a la tabla ejercicio
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
-- Fecha creacion      : 22/05/2015 12:10:32
------------------------------------------------------------------------------------------------------------------------------
-- Fecha actualizacion : <Fecha de Actualizacion>  Responsable:    <Analista Programador>
-- Motivo              : <Motivo de la Modificacion>
--*****************************************************************************************************************************/


DELIMITER $$
DROP PROCEDURE IF EXISTS sisaguasaniamiento.usp_ejercicio_ins $$
CREATE PROCEDURE sisaguasaniamiento.usp_ejercicio_ins(
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

/*SET @iIdEjercicio:=(SELECT  COALESCE(MAX(iIdEjercicio),0)+1 FROM sisaguasaniamiento.ejercicio);*/

		INSERT INTO sisaguasaniamiento.ejercicio (iIdEjercicio, iAnioFiscal, deUit, nvDenominacion, nvObservacion, iIdRegUsuaRegistra, dtFechRegistra, iCantidadModifica, bEstado)
		VALUES (_iIdEjercicio, _iAnioFiscal, _deUit, _nvDenominacion, _nvObservacion, _iIdRegUsuaRegistra, _dtFechRegistra, _iCantidadModifica, _bEstado);

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

