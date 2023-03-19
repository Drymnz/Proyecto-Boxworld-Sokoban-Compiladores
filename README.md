# Proyecto-Boxworld-Sokoban-Compiladores
El sistema consiste en dos, una parte para el móvil con el lenguaje de kotlin recomendado por Google para el desarrollo de Android, por otra parte un servidor orientado como socket que recibirá un archivo JSON para interpretar las peticiones de la aplicación móvil.

<img src='/recursos-git/01_1366x768_scrot.png'>

## Requisitos

* java
* version de android 10
* Maven

## Socket o servidor

Este servidor se activa mediante el uso de la máquina virtual de java, el proyecto fue desarrollado bajo la version 19, se aconseja como requisito dicha version, este socket o servidor tiene una ventana donde se mostrará las entradas y salidas del mismo , para notificar de forma visual lo que está pasando.


## Aplicacion mobil Android (kotlin)

Boxworld es un juego de rompecabezas en el cual el jugador está atrapado en un almacén dividido en espacios cuadrados, mueve cajas tratando de llevarlas a lugares de almacenamiento llamados objetivos(targets).

### Ejecucion del socket

Se ejecuta el JAR producciodo compilado por el codigo que esta en la carpeta Socket. se arranca el JAR con el siguiente comando

    ```bash

    java -jar Proyecto-Boxworld-Sokoban-Compiladores.jar

    ```
Después que fue exitoso la ejecución del JAR, se mostrar lo siguiente.

<img src='/recursos-git/consola.png'>

Donde dará el numero de puerto donde esta corriendo el socket, y su dirección IP del la computadora donde esta siendo ejecutada.

### Ejecucion del App

La aplicación se contrae en las Android Studio o obtener el app en la siguiente ruta.

    ```bash

    Proyecto-Boxworld-Sokoban-Compiladores/Android/app/release

    ```
Después de instalar la aplicación móvil con el .APK como fuentes desconocidas, ya se puede iniciar la aplicación móvil. Ya se puede encontrar con el nombre de “Boxworld-Sokoban”.

<img src='/recursos-git/imagen.jpg'>

Al iniciar la aplicación se mostrara lo siguiente.

<img src='/recursos-git/imagen_uno.jpg'>

Donde deberá introducir una estructura Json  (como esta en el ejemplo del manual técnico), También se deberá introducir la una de las IP que se muestra en la consola del socket, para poder comunicarse con dicho socket. La siguiente imagen es un ejemplo de como se vería llenado.

<img src='/recursos-git/imagen_dos.jpg'>

Ya podría ejecutar IR AL JUEGO para iniciar el intérprete del socket. Si todo salió bien se mostrara el mapa. La siguiente imagen es un ejemplo de como se vera el mapa.

<img src='/recursos-git/imagen_tres.jpg'>

Ahora ya se podrá ingresar los siguientes, comandos para mover el jugador, Solamente antes de ejecutar se puede realizar una simple ejecución para después será enviado a los reportes.

* Movimiento hacia la dirección Subir

    *    up(NUMERO_ENTERO);

* Movimiento hacia la dirección Abajo

    *    down(NUMERO_ENTERO);

* Movimiento hacia la dirección Izquierda

    *    left(NUMERO_ENTERO);

* Movimiento hacia la dirección Derecha

    *    right(NUMERO_ENTERO);  

* Empujar caja en la direccion 

    *    push (dirección) (NUMERO_ENTERO);  

