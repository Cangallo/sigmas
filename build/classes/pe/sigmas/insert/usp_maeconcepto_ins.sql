/*****************************************************************************************************************************
-- Este procedimiento almacenado usp_maeconcepto_ins
--     es el encargado de realizar inserciones a la tabla maeconcepto
--
-- Input               : iOpSp - Es de tipo int, indica la operacion a efectuar
                       :_cCodMaeConcepto char(5), <descripcion>
                       :_cCodMaeTipoConcepto char(5), <descripcion>
                       :_nvDenominacion varchar(200), <descripcion>
                       :_nvDescripcion varchar(500), <descripcion>
                       :_nvAbreviatura varchar(15), <descripcion>
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
DROP PROCEDURE IF EXISTS sisaguasaniamiento.usp_maeconcepto_ins $$
CREATE PROCEDURE sisaguasaniamiento.usp_maeconcepto_ins(
 IN iOpSp int,
 OUT bEstaOperacion bool,
IN _cCodMaeConcepto char(5),
IN _cCodMaeTipoConcepto char(5),
IN _nvDenominacion varchar(200),
IN _nvDescripcion varchar(500),
IN _nvAbreviatura varchar(15),
IN _nvObservacion varchar(500),
IN _iIdRegUsuaRegistra int,
IN _dtFechRegistra datetime,
IN _iCantidadModifica int,
IN _bEstado bit
)
BEGIN

IF iOpSp=1 THEN 
	START TRANSACTION; 	

/*SET @cCodMaeConcepto:=(SELECT  COALESCE(MAX(cCodMaeConcepto),0)+1 FROM sisaguasaniamiento.maeconcepto);*/

		INSERT INTO sisaguasaniamiento.maeconcepto (cCodMaeConcepto, cCodMaeTipoConcepto, nvDenominacion, nvDescripcion, nvAbreviatura, nvObservacion, iIdRegUsuaRegistra, dtFechRegistra, iCantidadModifica, bEstado)
		VALUES (_cCodMaeConcepto, _cCodMaeTipoConcepto, _nvDenominacion, _nvDescripcion, _nvAbreviatura, _nvObservacion, _iIdRegUsuaRegistra, _dtFechRegistra, _iCantidadModifica, _bEstado);

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

