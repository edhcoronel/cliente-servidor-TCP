# cliente-servidor-TCP
Parte practica del primer examen parcial de la materia Sistemas Distribuidos - 2022

# Primer Examen Parcial!

Examen practico


# Autor: Edher Coronel


## Carpeta entidad
 
* Se creo la entidad **Cliente** para referirnos a los datos de los bancos o entidades financieras que seran los clientes en la comunicacion TCP implementada en el proyecto.
*  Se creo el **ClienteJSON** en la cual creamos los metodos que nos ayudara a mapear de una estructura en formato JSON a un objeto y viceversa.

## Carpeta server

* Dentro de esta carpeta se encuentra la carpeta TCP que contienen las clases creadas que funcionaran como clientes y servidor en la comunicación TCP implementada en el proyecto.
* **TCPCliente** es la clase correspondiente al cliente.
* **TCPServer** es la clase correspondiete al servidor.

## Ejecucion 

Para hacer una prueba del proyecto se debe ejecutar los archivos *TCPServer.java* y *TCPCliente.java* para tener separado en dos ventanas de terminal y de esta forma visualizar los mensajes personalizados que tiene cada uno.

# Resumen del funcionamiento

## 1

Primeramente debe ser ejecutado el servidor. Una vez iniciado el servidor, se esperará la conexión del cliente.

## 2

Ejecutar el cliente. Al ejecutar el cliente, se solicitara ingresar un numero que corresponde al id del banco/financiera, dato que será enviado al servidor para su procesamiento.

## 3

El servidor recibe el dato enviado por el cliente conectado (el id) y verifica si se encuentra en su base de datos.
## 4

Si  se encuentra, le responde al cliente con un mensaje de éxito y la cotización del dólar que tiene asignado, esto se puede visualizar en la terminal del cliente. En la terminal del servidor aparece la información completa del cliente con estructura en forma de JSON
* *los nros para un mensaje exitoso son: 1, 2 o 3 ( ids reconocidos en la base de datos del servidor )*

## 5

Si  no se encuentra en la base, se envía al cliente que no ha sido reconocido.
## 6

Se cierra la conexión entre el cliente y servidor, luego el archivo *TCPCliente.java* correspondiente al Cliente termina la ejecución, no así el archivo *TCPServidor.java*  que continua la ejecución en espera de otra conexión con un cliente.
## 7

Para probar con otro numero de id, se debe volver a ejecutar *TCPCliente.java*.

# Capturas de pantalla
## Ejecución del servidor



- Servidor en espera.
	>![enter image description here](https://github.com/edhcoronel/cliente-servidor-TCP/blob/main/Capturas%20de%20Pantalla/ServidorCap1.png)
- Servidor respuesta exitosa.
	>![enter image description here](https://github.com/edhcoronel/cliente-servidor-TCP/blob/main/Capturas%20de%20Pantalla/ServidorCap2.png)

- Servidor respuesta error.
	>![enter image description here](https://github.com/edhcoronel/cliente-servidor-TCP/blob/main/Capturas%20de%20Pantalla/ClienteCap3.png)

- Cliente ingresar id.
	>![Image Text](https://github.com/edhcoronel/cliente-servidor-TCP/blob/main/Capturas%20de%20Pantalla/ClienteCap1.png)

- Cliente respuesta exitosa.
	>![enter image description here](https://github.com/edhcoronel/cliente-servidor-TCP/blob/main/Capturas%20de%20Pantalla/ClienteCap2.png)
- Cliente respuesta error.
	>![enter image description here](https://github.com/edhcoronel/cliente-servidor-TCP/blob/main/Capturas%20de%20Pantalla/ClienteCap3.png)
