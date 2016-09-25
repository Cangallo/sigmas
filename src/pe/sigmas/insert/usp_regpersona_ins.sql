/*****************************************************************************************************************************
-- Este procedimiento almacenado usp_regpersona_ins
--     es el encargado de realizar inserciones a la tabla regpersona
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
-- Fecha creacion      : 22/05/2015 12:10:32
------------------------------------------------------------------------------------------------------------------------------
-- Fecha actualizacion : <Fecha de Actualizacion>  Responsable:    <Analista Programador>
-- Motivo              : <Motivo de la Modificacion>
--*****************************************************************************************************************************/


DELIMITER $$
DROP PROCEDURE IF EXISTS sisaguasaniamiento.usp_regpersona_ins $$
CREATE PROCEDURE sisaguasaniamiento.usp_regpersona_ins(
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

/*SET @biIdRegPersona:=(SELECT  COALESCE(MAX(biIdRegPersona),0)+1 FROM sisaguasaniamiento.regpersona);*/

		INSERT INTO sisaguasaniamiento.regpersona (biIdRegPersona, cCodMaeEstaCivil, cCodMaeTipoPersona, cCodMaeSexo, nvNombre, nvApePaterno, nvApeMaterno, nvRazoSocial, nvNumDocumento, nvTeleFijo, nvTeleMovil, nvDomiProcesal, nvRpm, nvEmail, dtFechNacimiento, nvObservacion, iIdRegUsuaRegistra, dtFechRegistra, iCantidadModifica, bEstado)
		VALUES (_biIdRegPersona, _cCodMaeEstaCivil, _cCodMaeTipoPersona, _cCodMaeSexo, _nvNombre, _nvApePaterno, _nvApeMaterno, _nvRazoSocial, _nvNumDocumento, _nvTeleFijo, _nvTeleMovil, _nvDomiProcesal, _nvRpm, _nvEmail, _dtFechNacimiento, _nvObservacion, _iIdRegUsuaRegistra, _dtFechRegistra, _iCantidadModifica, _bEstado);

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

