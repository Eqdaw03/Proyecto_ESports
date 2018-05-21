CREATE OR REPLACE PACKAGE INSERTAR1
/*
* Autor Eqdaw03
* Cabezera de paquete insertar1
*/
AS
  PROCEDURE IN_VER_JORNADA(cod OUT INTEGER, FECHAI IN DATE, FECHAF IN DATE);
  PROCEDURE insertarJugador(nombreJugador VARCHAR2,  apellidoJugador VARCHAR2, nicknameJugador VARCHAR2, sueldo number, codEquipoJugador number);
END;
/
CREATE OR REPLACE PACKAGE BODY INSERTAR1
AS
/*
* Autor Eqdaw03
* Cuerpo del paquete insertar1
*/
  PROCEDURE IN_VER_JORNADA(cod OUT INTEGER, FECHAI IN DATE, FECHAF IN DATE)
    IS
	/*
	* Procedimiento para insertar una jornada y ver la ultima jornada insertada
	*/
  BEGIN
    INSERT INTO JORNADA VALUES(DEFAULT, FECHAI, FECHAF);
    SELECT MAX(CODJORNADA) INTO cod FROM JORNADA;
  END IN_VER_JORNADA;
  
  PROCEDURE insertarJugador(nombreJugador VARCHAR2,  apellidoJugador VARCHAR2, nicknameJugador VARCHAR2, sueldo number, codEquipoJugador number)
  IS
  /*
  * Procedimiento para insertar un jugador con el código de su equipo
  */
  BEGIN
    INSERT INTO jugador(nombre,  apellido, nickname, sueldo, equipo_codEquipo)
     VALUES (INITCAP(nombreJugador),  INITCAP(apellidoJugador), UPPER(nicknameJugador), sueldo, codEquipoJugador);
  END insertarJugador;
  
END INSERTAR1;
/
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
CREATE OR REPLACE PACKAGE MODIFICAR1
AS
/*
* Autor Eqdaw03
* Cabezera de paquete modificar1
*/
  PROCEDURE ANADIR_JUG_EQUIP(NOMBRE_EQUIPO VARCHAR2, CODJ NUMBER);
  PROCEDURE ANADIR_EQUI_DUENNO(CODD NUMBER, NOMBRE_EQUIPO VARCHAR2);
END;
/
CREATE OR REPLACE PACKAGE BODY MODIFICAR1
AS
/*
* Autor Eqdaw03
* Cuerpo de paquete modificar1
*/
  PROCEDURE ANADIR_JUG_EQUIP(NOMBRE_EQUIPO VARCHAR2, CODJ NUMBER)
  IS
  /*
  * Procedimiento para insertar un jugador sin equipo en un equipo
  */
    E_COD NUMBER;
  BEGIN
    SELECT CODEQUIPO INTO E_COD FROM EQUIPO WHERE NOMBRE = NOMBRE_EQUIPO;
    UPDATE JUGADOR
      SET EQUIPO_CODEQUIPO = E_COD
    WHERE CODJUGADOR = CODJ;
  END ANADIR_JUG_EQUIP;
  
  PROCEDURE ANADIR_EQUI_DUENNO(CODD NUMBER, NOMBRE_EQUIPO VARCHAR2)
  IS
  /*
  * Procedimiento para insertar un equipo a un dueño sin equipo
  */
    E_COD NUMBER;
  BEGIN
    SELECT CODEQUIPO INTO E_COD FROM EQUIPO WHERE NOMBRE = NOMBRE_EQUIPO;
    UPDATE DUENNO
      SET EQUIPO_CODEQUIPO = E_COD
    WHERE CODDUENNO = CODD;
  END ANADIR_EQUI_DUENNO;
  
END MODIFICAR1;
/