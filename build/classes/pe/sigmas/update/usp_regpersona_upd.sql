/*****************************************************************************************************************************
-- Este procedimiento almacenado usp_regpersona_upd
--     es el encargado de realizar actualizaciones a la tabla regpersona
--
-- Input               : iOpSp - Es de tipo int, indica la operacion a efectuar
                       :_biIdRegPersona int, <descripcion>
                       :_cCodMaeEstaCivil char(5), <descripcion>
                       :_cCodMaeTipoPersona char(5), <descripcion>
                       :_cCodMaeSexo char(5), <descripcion>
                       :_nvNombre varchar(200), <descripcion>
                       :_nvApePaterno varchar(200), <descripcion>
                       :_nvApeMaterno varchar(200), <descripcion>
                       :_nvRazoSocial varchar(300), <descripcion>
                       :_nvNumDocumento varchar(20), <descripcion>
                       :_nvTeleFijo varchar(20), <descripcion>
                       :_nvTeleMovil varchar(20), <descripcion>
                       :_nvDomiProcesal varchar(200), <descripcion>
                       :_nvRpm varchar(20), <descripcion>
                       :_nvEmail varchar(200), <descripcion>
                       :_dtFechNacimiento datetime, <descripcion>
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
DROP PROCEDURE IF EXISTS sisaguasaniamiento.usp_regpersona_upd $$
CREATE PROCEDURE sisaguasaniamiento.usp_regpersona_upd(
 IN iOpSp int,
 OUT bEstaOperacion bool,
IN _biIdRegPersona int,
IN _cCodMaeEstaCivil char(5),
IN _cCodMaeTipoPersona char(5),
IN _cCodMaeSexo char(5),
IN _nvNombre varchar(200),
IN _nvApePaterno varchar(200),
IN _nvApeMaterno varchar(200),
IN _nvRazoSocial varchar(300),
IN _nvNumDocumento varchar(20),
IN _nvTeleFijo varchar(20),
IN _nvTeleMovil varchar(20),
IN _nvDomiProcesal varchar(200),
IN _nvRpm varchar(20),
IN _nvEmail varchar(200),
IN _dtFechNacimiento datetime,
IN _nvObservacion varchar(500),
IN _iIdRegUsuaRegistra int,
IN _dtFechRegistra datetime,
IN _iCantidadModifica int,
IN _bEstado bit
)
BEGIN

IF iOpSp=1 THEN 	

START TRANSACTION;

		UPDATE sisaguasaniamiento.regpersona
		SET biIdRegPersona = _biIdRegPersona, cCodMaeEstaCivil = _cCodMaeEstaCivil, cCodMaeTipoPersona = _cCodMaeTipoPersona, cCodMaeSexo = _cCodMaeSexo, nvNombre = _nvNombre, nvApePaterno = _nvApePaterno, nvApeMaterno = _nvApeMaterno, nvRazoSocial = _nvRazoSocial, nvNumDocumento = _nvNumDocumento, nvTeleFijo = _nvTeleFijo, nvTeleMovil = _nvTeleMovil, nvDomiProcesal = _nvDomiProcesal, nvRpm = _nvRpm, nvEmail = _nvEmail, dtFechNacimiento = _dtFechNacimiento, nvObservacion = _nvObservacion, iIdRegUsuaRegistra = _iIdRegUsuaRegistra, dtFechRegistra = _dtFechRegistra, iCantidadModifica = _iCantidadModifica, bEstado = _bEstado
		WHERE biIdRegPersona = _biIdRegPersona;

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

