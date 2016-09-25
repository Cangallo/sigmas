/*****************************************************************************************************************************
-- Este procedimiento almacenado usp_regcontribuyente_ins
--     es el encargado de realizar inserciones a la tabla regcontribuyente
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
-- Fecha creacion      : 22/05/2015 12:10:32
------------------------------------------------------------------------------------------------------------------------------
-- Fecha actualizacion : <Fecha de Actualizacion>  Responsable:    <Analista Programador>
-- Motivo              : <Motivo de la Modificacion>
--*****************************************************************************************************************************/


DELIMITER $$
DROP PROCEDURE IF EXISTS sisaguasaniamiento.usp_regcontribuyente_ins $$
CREATE PROCEDURE sisaguasaniamiento.usp_regcontribuyente_ins(
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

/*SET @cCodRegContribuyente:=(SELECT  COALESCE(MAX(cCodRegContribuyente),0)+1 FROM sisaguasaniamiento.regcontribuyente);*/

		INSERT INTO sisaguasaniamiento.regcontribuyente (cCodRegContribuyente, biIdRegPersona, cCodMaeCategoria, dtFechInicio, dtFechFin, bIndActivo, nvObservacion, iIdRegUsuaRegistra, dtFechRegistra, iCantidadModifica, bEstado)
		VALUES (_cCodRegContribuyente, _biIdRegPersona, _cCodMaeCategoria, _dtFechInicio, _dtFechFin, _bIndActivo, _nvObservacion, _iIdRegUsuaRegistra, _dtFechRegistra, _iCantidadModifica, _bEstado);

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

