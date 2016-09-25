/*****************************************************************************************************************************
-- Este procedimiento almacenado usp_regrecibo_ins
--     es el encargado de realizar inserciones a la tabla regrecibo
--
-- Input               : iOpSp - Es de tipo int, indica la operacion a efectuar
                       :_biIdRegRecibo int, <descripcion>
                       :_iIdEjercicio int, <descripcion>
                       :_cCodRegContribuyente char(15), <descripcion>
                       :_iIdVencimiento int, <descripcion>
                       :_nvNumRecibo char(6), <descripcion>
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
DROP PROCEDURE IF EXISTS sisaguasaniamiento.usp_regrecibo_ins $$
CREATE PROCEDURE sisaguasaniamiento.usp_regrecibo_ins(
 IN iOpSp int,
 OUT bEstaOperacion bool,
IN _biIdRegRecibo int,
IN _iIdEjercicio int,
IN _cCodRegContribuyente char(15),
IN _iIdVencimiento int,
IN _nvNumRecibo char(6),
IN _nvObservacion varchar(500),
IN _iIdRegUsuaRegistra int,
IN _dtFechRegistra datetime,
IN _iCantidadModifica int,
IN _bEstado bit
)
BEGIN

IF iOpSp=1 THEN 
	START TRANSACTION; 	

/*SET @biIdRegRecibo:=(SELECT  COALESCE(MAX(biIdRegRecibo),0)+1 FROM sisaguasaniamiento.regrecibo);*/

		INSERT INTO sisaguasaniamiento.regrecibo (biIdRegRecibo, iIdEjercicio, cCodRegContribuyente, iIdVencimiento, nvNumRecibo, nvObservacion, iIdRegUsuaRegistra, dtFechRegistra, iCantidadModifica, bEstado)
		VALUES (_biIdRegRecibo, _iIdEjercicio, _cCodRegContribuyente, _iIdVencimiento, _nvNumRecibo, _nvObservacion, _iIdRegUsuaRegistra, _dtFechRegistra, _iCantidadModifica, _bEstado);

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

