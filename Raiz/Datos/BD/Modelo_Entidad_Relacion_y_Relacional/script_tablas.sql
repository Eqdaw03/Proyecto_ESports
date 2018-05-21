DROP TABLE  duenno cascade constraints;
DROP TABLE jugador cascade constraints;
DROP TABLE partido cascade constraints;
DROP TABLE equipo cascade constraints;
DROP TABLE jornada cascade constraints;
DROP TABLE usuarios cascade constraints;
DROP TABLE peticion cascade constraints;

CREATE TABLE peticion(
  
  codPeticion INTEGER GENERATED ALWAYS AS IDENTITY ,
  nickname VARCHAR(15),
  nombre VARCHAR(15),
  apellido VARCHAR(15),
  sueldo NUMBER,
  equipo VARCHAR2(15),
  contrasenna VARCHAR(15),
  permiso VARCHAR(15),
  tipo VARCHAR(15)
);
ALTER TABLE peticion ADD CONSTRAINT peticion_PK PRIMARY KEY ( codPeticion ) ;

CREATE TABLE duenno
  (
    codDuenno           INTEGER,
    equipo_codEquipo    INTEGER ,
    usuarios_codUsuario INTEGER NOT NULL
  ) ;
ALTER TABLE duenno ADD CONSTRAINT duenno_PK PRIMARY KEY ( codDuenno ) ;


CREATE TABLE equipo
  (
    codEquipo        INTEGER GENERATED ALWAYS AS IDENTITY ,
    nombre           VARCHAR2 (10) UNIQUE NOT NULL ,
    duenno_codDuenno INTEGER NOT NULL
  ) ;
ALTER TABLE equipo ADD CONSTRAINT equipo_PK PRIMARY KEY ( codEquipo ) ;


CREATE TABLE jornada
  (
    codJornada    INTEGER GENERATED ALWAYS AS IDENTITY ,
    fechaJornadaI DATE NOT NULL ,
    fechaJornadaF DATE NOT NULL
  ) ;
ALTER TABLE jornada ADD CONSTRAINT jornada_PK PRIMARY KEY ( codJornada ) ;


CREATE TABLE jugador
  (
    codJugador       INTEGER GENERATED ALWAYS AS IDENTITY ,
    nombre           VARCHAR2 (10) NOT NULL ,
    apellido         VARCHAR2 (15) ,
    nickname         VARCHAR2 (10) UNIQUE NOT NULL ,
    sueldo           NUMBER ,
    equipo_codEquipo INTEGER
  ) ;
ALTER TABLE jugador ADD CONSTRAINT jugador_PK PRIMARY KEY ( codJugador ) ;


CREATE TABLE partido
  (
    codPartido         INTEGER GENERATED ALWAYS AS IDENTITY ,
    fecha              DATE NOT NULL ,
    hora               VARCHAR2 (5) NOT NULL ,
    jugado             VARCHAR2 (10) default 'false' ,
    jornada_codJornada INTEGER NOT NULL ,
    equipo_codEquipoVisitante   INTEGER NOT NULL ,
    equipo_codEquipoLocal  INTEGER NOT NULL ,
    resultadoEL        INTEGER default 0 ,
    resultadoEV        INTEGER default 0
  ) ;
ALTER TABLE partido ADD CONSTRAINT partido_PK PRIMARY KEY ( codPartido ) ;


CREATE TABLE usuarios
  (
    codUsuario  INTEGER GENERATED ALWAYS AS IDENTITY ,
   nickname     VARCHAR2 (15) UNIQUE NOT NULL ,
   nombre VARCHAR2(15) NOT NULL,
   apellido VARCHAR2(15) NOT NULL,
    contrasenna VARCHAR2 (15) NOT NULL ,
    permiso     VARCHAR2 (15) NOT NULL
  ) ;
ALTER TABLE usuarios ADD CONSTRAINT usuarios_PK PRIMARY KEY ( codUsuario ) ;


ALTER TABLE duenno ADD CONSTRAINT duenno_equipo_FK FOREIGN KEY ( equipo_codEquipo ) REFERENCES equipo ( codEquipo ) ON
DELETE CASCADE ;

ALTER TABLE duenno ADD CONSTRAINT duenno_usuarios_FK FOREIGN KEY ( usuarios_codUsuario ) REFERENCES usuarios ( codUsuario ) ON
DELETE CASCADE;

ALTER TABLE equipo ADD CONSTRAINT equipo_duenno_FK FOREIGN KEY ( duenno_codDuenno ) REFERENCES duenno ( codDuenno ) ON
DELETE CASCADE ;

ALTER TABLE jugador ADD CONSTRAINT jugador_equipo_FK FOREIGN KEY ( equipo_codEquipo ) REFERENCES equipo ( codEquipo );

ALTER TABLE partido ADD CONSTRAINT partido_equipo_FK FOREIGN KEY ( equipo_codEquipoVisitante ) REFERENCES equipo ( codEquipo ) ON
DELETE CASCADE ;

ALTER TABLE partido ADD CONSTRAINT partido_equipo_FKv1 FOREIGN KEY ( equipo_codEquipoLocal ) REFERENCES equipo ( codEquipo ) ON
DELETE CASCADE ;

ALTER TABLE partido ADD CONSTRAINT partido_jornada_FK FOREIGN KEY ( jornada_codJornada ) REFERENCES jornada ( codJornada ) ON
DELETE CASCADE ;
