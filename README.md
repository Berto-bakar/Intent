Intent

Tarea 01 PMDM

Comentarios
Como importar un proyecto desde GitHub a Android Studio
Clonar el repositorio desde GitHub Abre Android Studio. En la pantalla de inicio, selecciona "Get from Version Control", (Desde el menú escoge ""New/Project from Version Control"). En la ventana que aparece, selecciona Git. En el campo URL, pega la URL del repositorio de GitHub que deseas clonar.
https://github.com/Berto-bakar/MyApplicationTarea01.git

Elige la ubicación donde deseas guardar el proyecto en tu computadora. Haz clic en Clone.

Abrir el proyecto en Android Studio Si ya tienes el proyecto clonado en tu máquina: Abre Android Studio. Selecciona Open desde la pantalla de inicio. Navega hasta la carpeta donde se encuentra el proyecto clonado y selecciona el archivo build.gradle o la carpeta raíz del proyecto. Android Studio configurará el proyecto automáticamente y lo abrirá.

Sincronizar el proyecto Una vez que el proyecto esté abierto:

Android Studio puede pedirte que sincronices el proyecto con los archivos de Gradle. Haz clic en Sync Now en la barra superior para asegurarte de que todas las dependencias estén correctamente descargadas e instaladas.

Ejecutar el proyecto Cuando la sincronización termine, puedes ejecutar el proyecto seleccionando un dispositivo o un emulador y presionando el botón de Run (el icono de un triángulo verde).
Comentqarios acerca de la tarea
Presenta una tecla para cada dígito del 1 al 9 distribuidos en tres columnas y en tres filas.

GridLayout: Define una cuadrícula de 3 columnas y 3 filas (android:columnCount="3" y android:rowCount="3"). Botones: Cada botón ocupa una celda en el GridLayout. android:layout_width y android:layout_height en 0dp: Esto asegura que los botones ocupen el espacio disponible de forma proporcional dentro de la cuadrícula. layout_rowWeight y layout_columnWeight: Con el valor 1, los botones se distribuyen de forma equitativa en la pantalla. android:padding="15dp" ajusta el espacio entre el borde de la pantalla y el GridLayout, dejando el centro para los botones.

Este diseño se ajustará a pantallas de diferentes tamaños y orientaciones.
