# Intent

## Tarea 02 PMDM

Crear un Intent

*Instrucciones
Queremos construir un Intent para gestionar la comunicación entre dos actividades, de manera que se pueda realizar una petición y esperar el resultado en la actividad original.
Una Actividad envía datos a otra, y espera una respuesta si fuera necesario

*Obligatorio
Debe contar con al menos dos Actividades
La Actividad principal debe presentar un mensaje de bienvenida (ie, Hola Mundo!)
La Actividad principal debe solicitar un nombre al usuario
La Actividad principal debe presentar un botón que nos lleve a la segunda Actividad (ie, Adiós)
La segunda Actividad debe presentar un mensaje de despedida que incluya el nombre introducido por el usuario en la Actividad principal
La Actividad principal debe mostrar un mensaje de error si se pulsa el botón y no hay nombre introducido
Esta comprobación debe ocurrir en el backend (Java)
Se debe visualizar en Android en al menos un Dispositivo Móvil
Fecha máxima de entrega: 2 de Diciembre de 2024

*Opcional que mejora nota
Se entregan explicaciones de la tarea (explicación de la solución, razonamiento de su elección, resultados esperados, descripción de cómo se obtienen, en qué entornos y circunstancias funciona...)
La aplicación cumple su cometido en varios modos de presentación y en un mayor número de Dispositivos Móviles diferentes
La aplicación se visualiza correctamente en varios modos de presentación y en un mayor número de Dispositivos Móviles diferentes
Se ajusta adecuadamente a varias pantallas diferentes
La lógica de negocio tiene en cuenta varios parámetros
Existen tests automatizados (en carpeta de test)

### Comentarios acerca de la tarea

Realizadas dos Activitys. La actividad principal es un login cuyo nombre de usuario es Berto cuya contraseña es bakar.
Desde está actividad podemos logearnos o salir de la aplicación mediante el uso de dos botones, cada uno con su tarea correspondiente.
La segunda actividad nos muestra el mensaje de bienbenid@ junto con el nombre de usuario.
Las dos actividades cuentan con un fragmento superior en el que se muestra el "título" de la tarea y otro inferior,
en el que se muestra el texto by berto_bakar, osease yo mismo.

### Prueba de la tarea en modelo Pixel 8 API 35

![image](https://github.com/user-attachments/assets/1ce8ebc5-8b21-4c90-8637-954435056572)

![image](https://github.com/user-attachments/assets/ac3232b0-5b7d-49b0-bd23-2e931489bc8a)

### Prueba de la tarea en modelo Pixel Fold API 35

![image](https://github.com/user-attachments/assets/5a70588b-5983-451c-b648-a02129ccbc16)

![image](https://github.com/user-attachments/assets/9cdcf45f-f73c-4c43-b8eb-5ee6bdf4eb4a)

![image](https://github.com/user-attachments/assets/fba583b8-8879-4b51-913f-48ad13a6d3ea)






  


## Comentarios

* Como importar un proyecto desde GitHub a Android Studio

1. Clonar el repositorio desde GitHub
Abre Android Studio.
En la pantalla de inicio, selecciona "Get from Version Control", (Desde el menú escoge ""New/Project from Version Control").
En la ventana que aparece, selecciona Git.
En el campo URL, pega la URL del repositorio de GitHub que deseas clonar.
https://github.com/Berto-bakar/Intent.git
Elige la ubicación donde deseas guardar el proyecto en tu computadora.
Haz clic en Clone.

2. Abrir el proyecto en Android Studio
Si ya tienes el proyecto clonado en tu máquina:
Abre Android Studio.
Selecciona Open desde la pantalla de inicio.
Navega hasta la carpeta donde se encuentra el proyecto clonado y selecciona el archivo build.gradle o la carpeta raíz del proyecto.
Android Studio configurará el proyecto automáticamente y lo abrirá.

3. Sincronizar el proyecto
Una vez que el proyecto esté abierto:
Android Studio puede pedirte que sincronices el proyecto con los archivos de Gradle. Haz clic en Sync Now en la barra superior para asegurarte de que todas las dependencias estén correctamente descargadas e instaladas.

4. Ejecutar el proyecto
Cuando la sincronización termine, puedes ejecutar el proyecto seleccionando un dispositivo o un emulador y presionando el botón de Run (el icono de un triángulo verde).
