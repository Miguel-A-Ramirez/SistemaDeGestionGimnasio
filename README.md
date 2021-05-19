# **SistemaDeGestionGimnasio**

## Descripción breve
Sistema basico para un gimnasio desarrollado en JAVA y usando una B.D. hecha en SQL y que puede ser cargado en un sistema MySQL.

## Descripción detallada
El sistema esta desarrollado en Apache netbeans 12.3 y usando el JDK 15, tambien se a provado exitosamente en el JDK 8.

La base de datos es funcional para el sistema actualmente desarrollado, ya cuenta con datos para hacer funcionar correctamente la aplicación.

#### El sistema cuenta con las siguientes carecteristicas:
- Listar, modificar y eliminar clientes.
- Renovar membresias.
- Listar, modificar y eliminar productos de venta.
- Actualizar productos.
- Vender productos.
- Generar reporte de ventas.
- Registrar equipos de gimnasio.
- Pasar y listar asistencias.

## Requisitos de funcionamiento.
- JDK 8 o superior.
- Libreria mysql-connector-java 5.1.46 o superior (ya incluido).
- Base de datos gimnasio.sql (ya incluido).

## IMPORTANTE
Para que el proyecto funcione, es necesario primero cargar la base de datos a su respectivo gestor de BD, la base de datos se encuentra dentro del la carpeta sql con el nombre de "gimnasio.sql" y configurar las respectivas conexiones en el archivo "ConexionBD.java" con la informacion de su servidor de BD.

En caso de que netbeans no cargue la libreria de conexion de MySQL, puede agregarlo de forma manual, esta dentro de la carpeta driver con el nombre de "mysql-connector-java-5.1.46.jar".

## Capturas de pantalla
![Main principal](https://raw.githubusercontent.com/Miguel-A-Ramirez/SistemaDeGestionGimnasio/master/capturas/Main%20principal.PNG)

![Registrar membresias](https://raw.githubusercontent.com/Miguel-A-Ramirez/SistemaDeGestionGimnasio/master/capturas/Registrar%20membresia.PNG)

![Lista de productos](https://raw.githubusercontent.com/Miguel-A-Ramirez/SistemaDeGestionGimnasio/master/capturas/Lista%20de%20productos.PNG)

![Vender productos](https://raw.githubusercontent.com/Miguel-A-Ramirez/SistemaDeGestionGimnasio/master/capturas/Vender%20producto.PNG)

![Asistencias](https://raw.githubusercontent.com/Miguel-A-Ramirez/SistemaDeGestionGimnasio/master/capturas/Asistencias.PNG)
