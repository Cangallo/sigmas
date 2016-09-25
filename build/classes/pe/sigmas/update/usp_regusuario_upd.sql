/*****************************************************************************************************************************
-- Este procedimiento almacenado usp_regusuario_upd
--     es el encargado de realizar actualizaciones a la tabla regusuario
--
-- Input               : iOpSp - Es de tipo int, indica la operacion a efectuar
                       :_iIdRegUsuario int, <descripcion>
                       :_cCodRegTrabajador char(8), <descripcion>
                       :_dtFechaVigencia datetime, <descripcion>
                       :_nvNombUsuario varchar(50), <descripcion>
                       :_nvContrasenia varchar(50), <descripcion>
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
DROP PROCEDURE IF EXISTS sisaguasaniamiento.usp_regusuario_upd $$
CREATE PROCEDURE sisaguasaniamiento.usp_regusuario_upd(
 IN iOpSp int,
 OUT bEstaOperacion bool,
IN _iIdRegUsuario int,
IN _cCodRegTrabajador char(8),
IN _dtFechaVigencia datetime,
IN _nvNombUsuario varchar(50),
IN _nvContrasenia varchar(50),
IN _nvObservacion varchar(500),
IN _iIdRegUsuaRegistra int,
IN _dtFechRegistra datetime,
IN _iCantidadModifica int,
IN _bEstado bit
)
BEGIN

IF iOpSp=1 THEN 	

START TRANSACTION;

		UPDATE sisaguasaniamiento.regusuario
		SET iIdRegUsuario = _iIdRegUsuario, cCodRegTrabajador = _cCodRegTrabajador, dtFechaVigencia = _dtFechaVigencia, nvNombUsuario = _nvNombUsuario, nvContrasenia = _nvContrasenia, nvObservacion = _nvObservacion, iIdRegUsuaRegistra = _iIdRegUsuaRegistra, dtFechRegistra = _dtFechRegistra, iCantidadModifica = _iCantidadModifica, bEstado = _bEstado
		WHERE iIdRegUsuario = _iIdRegUsuario;

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

