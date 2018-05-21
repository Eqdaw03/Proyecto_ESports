CREATE OR REPLACE TRIGGER maxJugadores
/*
* Autor Eqdaw03
* Un equipo no puede tener mas de 6 jugadores
*/
BEFORE INSERT ON jugador for each row
DECLARE
    numJugadores int; --Variable para guardar el numero de jugadores de un equipo
BEGIN
    select count(codJugador) into numJugadores from jugador where :new.equipo_codEquipo =  equipo_codEquipo;
    if numJugadores >=6 then
        Raise_Application_Error(-20001, 'LÍMITE DE JUGADORES');
    end if;
END;

-------------------------------------------------------------------------------------------------------------------------

CREATE OR REPLACE TRIGGER maxSalarioEquipo
/*
* Autor Eqdaw03
* El salario de los jugadores de un equipo no puede ser mayor que 200000
*/
BEFORE INSERT ON jugador for each row
DECLARE
    SalarioEquipo int; --Variable para guardar el salario de un equipo
BEGIN
    if :new.equipo_codEquipo is null then
        dbms_output.put_line(' ');
    else
        select sum(sueldo) into SalarioEquipo from jugador where Equipo_Codequipo = :new.equipo_codEquipo;
        if (salarioEquipo+:new.sueldo) >=200000 then
            Raise_Application_Error(-20002, 'LÍMITE DE SALARIO DE JUGADORES');
        end if;
    end if;    
END;