/*****************************************************************************************************************************
-- Este procedimiento almacenado usp_regtrabajador_ins
--     es el encargado de realizar inserciones a la tabla regtrabajador
--
-- Input               : iOpSp - Es de tipo int, indica la operacion a efectuar
                       :_cCodRegTrabajador char(8), <descripcion>
                       :_biIdRegPersona int, <descripcion>
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
DROP PROCEDURE IF EXISTS sisaguasaniamiento.usp_regtrabajador_ins $$
CREATE PROCEDURE sisaguasaniamiento.usp_regtrabajador_ins(
 IN iOpSp int,
 OUT bEstaOperacion bool,
IN _cCodRegTrabajador char(8),
IN _biIdRegPersona int,
IN _nvObservacion varchar(500),
IN _iIdRegUsuaRegistra int,
IN _dtFechRegistra datetime,
IN _iCantidadModifica int,
IN _bEstado bit
)
BEGIN

IF iOpSp=1 THEN 
	START TRANSACTION; 	

/*SET @cCodRegTrabajador:=(SELECT  COALESCE(MAX(cCodRegTrabajador),0)+1 FROM sisaguasaniamiento.regtrabajador);*/

		INSERT INTO sisaguasaniamiento.regtrabajador (cCodRegTrabajador, biIdRegPersona, nvObservacion, iIdRegUsuaRegistra, dtFechRegistra, iCantidadModifica, bEstado)
		VALUES (_cCodRegTrabajador, _biIdRegPersona, _nvObservacion, _iIdRegUsuaRegistra, _dtFechRegistra, _iCantidadModifica, _bEstado);

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

