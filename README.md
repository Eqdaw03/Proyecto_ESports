# ESports

Pasos para la ejecución de la aplicación

1- Primero abrimos la base de datos eqdaw03 con el sqldeveloper que lo podran obtener en:
http://www.oracle.com/technetwork/developer-tools/sql-developer/downloads/index.html,
luego ejecutamos los siguientes scripts en orden
```Ruta
1- \proyectoEv3\RAIZ\DATOS\BD\Modelo_Entidad_Relacion_y_Relacional\script_tablas.sql
2- \proyectoEv3\RAIZ\DATOS\BD\Modelo_Entidad_Relacion_y_Relacional\paquetes.sql
4- \proyectoEv3\RAIZ\DATOS\BD\Modelo_Entidad_Relacion_y_Relacional\triggers.sql
5- \proyectoEv3\RAIZ\DATOS\BD\Modelo_Entidad_Relacion_y_Relacional\sinonimos.sql
opcional 6- \proyectoEv3\RAIZ\DATOS\BD\Modelo_Entidad_Relacion_y_Relacional\datosInicial.sql
```

PD: hay que crear un administrador para poder acceder a nuestra aplicación,
si ejecutamos el script 'datosInicial.sql' se añadira un administrador con
nombre = admin,
contraseña = admin,
si no ejecutamos dicho script podemos insertar una admin con la siguiente sentencia sql:
```Ruta
INSERT INTO usuarios VALUES(default,'nombreUsuario','nombre','apellido','contraseña','administrador');
```

2- Ahora que ya tenemos nuestra base de datos con sus datos y un administrador podemos acceder a nuestra aplicación,
pero antes necesitaremos descargar Java en caso de que no lo tengamos
https://www.java.com/es/download/,
cuando ya tengamos Java descargado nos movemos a la siquiente ruta dentro del proyecto:

```Ruta
\proyectoEv3\RAIZ\DATOS\PR\Ejecutable
```

Ya en esta ruta ejecutamos el 'Master_ESport.jar' y ya podremos utilizar la aplicación.
