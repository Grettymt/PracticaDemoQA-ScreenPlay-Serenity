# Práctica DemoQA con ScreenPlay

### **Requisitos**
Para este proyecto, se necesitará:

**Windows**
> - Java 11 o superior.
> - Gradle para compilar el proyecto.

### ¿Cómo correr el proyecto?
1. Posterior a clonar este repositorio en su ordenador, ingrese a la siguiente ruta ➜ src\test\java\com\practica\runners.
2. Presionar clic derecho en el archivo "FormularioTest".
3. Seleccionar la opción Run 'FormularioTest'.

### Estructura de las carpetas - Patrón ScreenPlay

**main/java/com/practica**

- interactions: Contiene las clases que modelan las interacciones entre los actores y los elementos de la interfaz de usuario.
- models: Contiene clases con las definiciones de objetos para automatizar interacciones en aplicaciones.
- questions: Contiene las clases que incluyen preguntas claves para cada test case.
- tasks: Contiene las clases con métodos que realizan tareas específicas dentro del sistema, lo cual nos permitiría reutilizar la lógica sí es necesitarlo.
- utils: Contiene las clases con métodos que nos realicen procesos que son comunes pero utiles.

**test/java/com/sofkau**

- runners: Clases para correr los test cases.
- setup: Clases para configuraciones.
- stepdefinitions: Clases con la ejecución de los pasos definidos en los feature .

**test/resources/java/com/practica**

- features: Contiene los gherkin con la definición de los casos de prueba en un lenguaje natural.