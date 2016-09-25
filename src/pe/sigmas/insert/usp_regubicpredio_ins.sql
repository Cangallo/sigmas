/*****************************************************************************************************************************
-- Este procedimiento almacenado usp_regubicpredio_ins
--     es el encargado de realizar inserciones a la tabla regubicpredio
--
-- Input               : iOpSp - Es de tipo int, indica la operacion a efectuar
                       :_biIdRegUbicPredio int, <descripcion>
                       :_biIdRegPersona int, <descripcion>
                       :_cCodRegPredio char(16), <descripcion>
                       :_nvInterior varchar(5), <descripcion>
                       :_nvManzana varchar(5), <descripcion>
                       :_nvLote varchar(5), <descripcion>
                       :_nvSubLote varchar(5), <descripcion>
                       :_nvPiso varchar(5), <descripcion>
                       :_nvDepartamento varchar(5), <descripcion>
                       :_nvNumAnterior varchar(5), <descripcion>
                       :_nvDireCompleta varchar(500), <descripcion>
                       :_nvRefeUbicacion varchar(200), <descripcion>
                       :_bIndForaneo bit, <descripcion>
                       :_bIndDomiFiscal bit, <descripcion>
                       :_iEjerIniVigencia int, <descripcion>
                       :_iEjerFinVigencia int, <descripcion>
                       :_bIndVigencia bit, <descripcion>
                       :_bIndConsentido bit, <descripcion>
                       :_nvObservacion varchar(500), <descripcion>
                       :_iIdRegUsuaRegistra int, <descripcion>
                       :_dtFechRegistra datetime, <descripcion>
                       :_iCantidadModifica int, <descripcion>
                       :_cCodRegContribuyente char(15), <descripcion>
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
DROP PROCEDURE IF EXISTS sisaguasaniamiento.usp_regubicpredio_ins $$
CREATE PROCEDURE sisaguasaniamiento.usp_regubicpredio_ins(
 IN iOpSp int,
 OUT bEstaOperacion bool,
IN _biIdRegUbicPredio int,
IN _biIdRegPersona int,
IN _cCodRegPredio char(16),
IN _nvInterior varchar(5),
IN _nvManzana varchar(5),
IN _nvLote varchar(5),
IN _nvSubLote varchar(5),
IN _nvPiso varchar(5),
IN _nvDepartamento varchar(5),
IN _nvNumAnterior varchar(5),
IN _nvDireCompleta varchar(500),
IN _nvRefeUbicacion varchar(200),
IN _bIndForaneo bit,
IN _bIndDomiFiscal bit,
IN _iEjerIniVigencia int,
IN _iEjerFinVigencia int,
IN _bIndVigencia bit,
IN _bIndConsentido bit,
IN _nvObservacion varchar(500),
IN _iIdRegUsuaRegistra int,
IN _dtFechRegistra datetime,
IN _iCantidadModifica int,
IN _cCodRegContribuyente char(15),
IN _bEstado bit
)
BEGIN

IF iOpSp=1 THEN 
	START TRANSACTION; 	

/*SET @biIdRegUbicPredio:=(SELECT  COALESCE(MAX(biIdRegUbicPredio),0)+1 FROM sisaguasaniamiento.regubicpredio);*/

		INSERT INTO sisaguasaniamiento.regubicpredio (biIdRegUbicPredio, biIdRegPersona, cCodRegPredio, nvInterior, nvManzana, nvLote, nvSubLote, nvPiso, nvDepartamento, nvNumAnterior, nvDireCompleta, nvRefeUbicacion, bIndForaneo, bIndDomiFiscal, iEjerIniVigencia, iEjerFinVigencia, bIndVigencia, bIndConsentido, nvObservacion, iIdRegUsuaRegistra, dtFechRegistra, iCantidadModifica, cCodRegContribuyente, bEstado)
		VALUES (_biIdRegUbicPredio, _biIdRegPersona, _cCodRegPredio, _nvInterior, _nvManzana, _nvLote, _nvSubLote, _nvPiso, _nvDepartamento, _nvNumAnterior, _nvDireCompleta, _nvRefeUbicacion, _bIndForaneo, _bIndDomiFiscal, _iEjerIniVigencia, _iEjerFinVigencia, _bIndVigencia, _bIndConsentido, _nvObservacion, _iIdRegUsuaRegistra, _dtFechRegistra, _iCantidadModifica, _cCodRegContribuyente, _bEstado);

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

