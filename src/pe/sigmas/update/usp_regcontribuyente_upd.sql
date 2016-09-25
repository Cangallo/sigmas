/*****************************************************************************************************************************
-- Este procedimiento almacenado usp_regcontribuyente_upd
--     es el encargado de realizar actualizaciones a la tabla regcontribuyente
--
-- Input               : iOpSp - Es de tipo int, indica la operacion a efectuar
                       :_cCodRegContribuyente char(15), <descripcion>
                       :_biIdRegPersona int, <descripcion>
                       :_cCodMaeCategoria char(5), <descripcion>
                       :_dtFechInicio datetime, <descripcion>
                       :_dtFechFin datetime, <descripcion>
                       :_bIndActivo bit, <descripcion>
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
DROP PROCEDURE IF EXISTS sisaguasaniamiento.usp_regcontribuyente_upd $$
CREATE PROCEDURE sisaguasaniamiento.usp_regcontribuyente_upd(
 IN iOpSp int,
 OUT bEstaOperacion bool,
IN _cCodRegContribuyente char(15),
IN _biIdRegPersona int,
IN _cCodMaeCategoria char(5),
IN _dtFechInicio datetime,
IN _dtFechFin datetime,
IN _bIndActivo bit,
IN _nvObservacion varchar(500),
IN _iIdRegUsuaRegistra int,
IN _dtFechRegistra datetime,
IN _iCantidadModifica int,
IN _bEstado bit
)
BEGIN

IF iOpSp=1 THEN 	

START TRANSACTION;

		UPDATE sisaguasaniamiento.regcontribuyente
		SET cCodRegContribuyente = _cCodRegContribuyente, biIdRegPersona = _biIdRegPersona, cCodMaeCategoria = _cCodMaeCategoria, dtFechInicio = _dtFechInicio, dtFechFin = _dtFechFin, bIndActivo = _bIndActivo, nvObservacion = _nvObservacion, iIdRegUsuaRegistra = _iIdRegUsuaRegistra, dtFechRegistra = _dtFechRegistra, iCantidadModifica = _iCantidadModifica, bEstado = _bEstado
		WHERE cCodRegContribuyente = _cCodRegContribuyente;

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

