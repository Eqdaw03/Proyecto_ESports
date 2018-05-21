INSERT INTO usuarios VALUES(default,'admin','alexsandro','ruiz','admin','administrador');

INSERT INTO usuarios (nickname, nombre, apellido, contrasenna, permiso) VALUES('a','a','a','1','duenno');
INSERT INTO duenno (codduenno,usuarios_codusuario) VALUES ((select codusuario from usuarios where nickname = 'a' ),(select codusuario from usuarios where nickname = 'a' ));

INSERT INTO equipo VALUES(default,'a',2);

INSERT INTO jugador VALUES(default,'a0','a0','a0',1000,1);
INSERT INTO jugador VALUES(default,'b0','b0','b0',1000,1);
INSERT INTO jugador VALUES(default,'c0','c0','c0',1000,1);
INSERT INTO jugador VALUES(default,'d0','d0','d0',1000,1);
INSERT INTO jugador VALUES(default,'e0','e0','e0',1000,1);
INSERT INTO jugador VALUES(default,'f0','f0','f0',1000,1);

INSERT INTO usuarios (nickname, nombre, apellido, contrasenna, permiso) VALUES('b','b','b','1','duenno');
INSERT INTO duenno (codduenno,usuarios_codusuario) VALUES ((select codusuario from usuarios where nickname = 'b' ),(select codusuario from usuarios where nickname = 'b' ));

INSERT INTO equipo VALUES(default,'b',3);

INSERT INTO jugador VALUES(default,'a1','a1','a1',1000,2);
INSERT INTO jugador VALUES(default,'b1','b1','b1',1000,2);
INSERT INTO jugador VALUES(default,'c1','c1','c1',1000,2);
INSERT INTO jugador VALUES(default,'d1','d1','d1',1000,2);
INSERT INTO jugador VALUES(default,'e1','e1','e1',1000,2);
INSERT INTO jugador VALUES(default,'f1','f1','f1',1000,2);

INSERT INTO usuarios (nickname, nombre, apellido, contrasenna, permiso) VALUES('c','c','c','1','duenno');
INSERT INTO duenno (codduenno,usuarios_codusuario) VALUES ((select codusuario from usuarios where nickname = 'c' ),(select codusuario from usuarios where nickname = 'c' ));

INSERT INTO equipo VALUES(default,'c',4);

INSERT INTO jugador VALUES(default,'a2','a2','a2',1000,3);
INSERT INTO jugador VALUES(default,'b2','b2','b2',1000,3);
INSERT INTO jugador VALUES(default,'c2','c2','c2',1000,3);
INSERT INTO jugador VALUES(default,'d2','d2','d2',1000,3);
INSERT INTO jugador VALUES(default,'e2','e2','e2',1000,3);
INSERT INTO jugador VALUES(default,'f2','f2','f2',1000,3);

INSERT INTO usuarios (nickname, nombre, apellido, contrasenna, permiso) VALUES('d','d','d','1','duenno');
INSERT INTO duenno (codduenno,usuarios_codusuario) VALUES ((select codusuario from usuarios where nickname = 'd' ),(select codusuario from usuarios where nickname = 'd' ));

INSERT INTO equipo VALUES(default,'d',5);

INSERT INTO jugador VALUES(default,'a3','a3','a3',1000,4);
INSERT INTO jugador VALUES(default,'b3','b3','b3',1000,4);
INSERT INTO jugador VALUES(default,'c3','c3','c3',1000,4);
INSERT INTO jugador VALUES(default,'d3','d3','d3',1000,4);
INSERT INTO jugador VALUES(default,'e3','e3','e3',1000,4);
INSERT INTO jugador VALUES(default,'f3','f3','f3',1000,4);

INSERT INTO usuarios (nickname, nombre, apellido, contrasenna, permiso) VALUES('e','e','e','1','duenno');
INSERT INTO duenno (codduenno,usuarios_codusuario) VALUES ((select codusuario from usuarios where nickname = 'e' ),(select codusuario from usuarios where nickname = 'e' ));

INSERT INTO equipo VALUES(default,'e',6);

INSERT INTO jugador VALUES(default,'a4','a4','a4',1000,5);
INSERT INTO jugador VALUES(default,'b4','b4','b4',1000,5);
INSERT INTO jugador VALUES(default,'c4','c4','c4',1000,5);
INSERT INTO jugador VALUES(default,'d4','d4','d4',1000,5);
INSERT INTO jugador VALUES(default,'e4','e4','e4',1000,5);
INSERT INTO jugador VALUES(default,'f4','f4','f4',1000,5);

INSERT INTO usuarios (nickname, nombre, apellido, contrasenna, permiso) VALUES('f','f','f','1','duenno');
INSERT INTO duenno (codduenno,usuarios_codusuario) VALUES ((select codusuario from usuarios where nickname = 'f' ),(select codusuario from usuarios where nickname = 'f' ));

INSERT INTO equipo VALUES(default,'f',7);

INSERT INTO jugador VALUES(default,'a5','a5','a5',1000,6);
INSERT INTO jugador VALUES(default,'b5','b5','b5',1000,6);
INSERT INTO jugador VALUES(default,'c5','c5','c5',1000,6);
INSERT INTO jugador VALUES(default,'d5','d5','d5',1000,6);
INSERT INTO jugador VALUES(default,'e5','e5','e5',1000,6);
INSERT INTO jugador VALUES(default,'f5','f5','f5',1000,6);

commit;