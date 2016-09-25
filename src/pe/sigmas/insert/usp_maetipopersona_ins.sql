/*****************************************************************************************************************************
-- Este procedimiento almacenado usp_maetipopersona_ins
--     es el encargado de realizar inserciones a la tabla maetipopersona
--
-- Input               : iOpSp - Es de tipo int, indica la operacion a efectuar
                       :_cCodMaeTipoPersona char(5), <descripcion>
                       :_nvAbreviatura varchar(20), <descripcion>
                       :_nvDenominacion varchar(200), <descripcion>
                       :_nvDescripcion varchar(500), <descripcion>
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
DROP PROCEDURE IF EXISTS sisaguasaniamiento.usp_maetipopersona_ins $$
CREATE PROCEDURE sisaguasaniamiento.usp_maetipopersona_ins(
 IN iOpSp int,
 OUT bEstaOperacion bool,
IN _cCodMaeTipoPersona char(5),
IN _nvAbreviatura varchar(20),
IN _nvDenominacion varchar(200),
IN _nvDescripcion varchar(500),
IN _nvObservacion varchar(500),
IN _iIdRegUsuaRegistra int,
IN _dtFechRegistra datetime,
IN _iCantidadModifica int,
IN _bEstado bit
)
BEGIN

IF iOpSp=1 THEN 
	START TRANSACTION; 	

/*SET @cCodMaeTipoPersona:=(SELECT  COALESCE(MAX(cCodMaeTipoPersona),0)+1 FROM sisaguasaniamiento.maetipopersona);*/

		INSERT INTO sisaguasaniamiento.maetipopersona (cCodMaeTipoPersona, nvAbreviatura, nvDenominacion, nvDescripcion, nvObservacion, iIdRegUsuaRegistra, dtFechRegistra, iCantidadModifica, bEstado)
		VALUES (_cCodMaeTipoPersona, _nvAbreviatura, _nvDenominacion, _nvDescripcion, _nvObservacion, _iIdRegUsuaRegistra, _dtFechRegistra, _iCantidadModifica, _bEstado);

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

