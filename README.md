# Guía de Métodos Abreviados y Sintaxis Comprimidas en Java

Este repositorio contiene una colección de recursos, ejemplos prácticos y documentación sobre las sintaxis abreviadas, azúcares sintácticos y características modernas introducidas en Java desde sus versiones clásicas hasta Java 21.

---

## 📂 Estructura del Proyecto

De acuerdo con los archivos actuales en el directorio de trabajo, el proyecto está organizado de la siguiente manera:

* **[investigacion.pdf](file:///C:/Users/Samuel/Downloads/Trabajo_martes_2/investigacion.pdf)**: Documento teórico y práctico principal que detalla las características de Java (estructurado como archivo de investigación).
* **[README.md](file:///C:/Users/Samuel/Downloads/Trabajo_martes_2/README.md)**: Guía explicativa del proyecto y de los ejemplos prácticos.
* **[Ejemplos/](file:///C:/Users/Samuel/Downloads/Trabajo_martes_2/Ejemplos/)**: Carpeta que contiene los códigos fuente en Java (`.java`) y archivos compilados (`.class`) correspondientes a los primeros 5 temas de estudio.

---

## 📝 Análisis del Documento: "investigacion.pdf"

El documento principal [investigacion.pdf](file:///C:/Users/Samuel/Downloads/Trabajo_martes_2/investigacion.pdf) actúa como marco de referencia para entender la evolución de Java hacia un lenguaje más expresivo, menos redundante y de naturaleza funcional. Cubre los siguientes temas:

### Parte I: Sintaxis Comprimida (Temas 1 - 15)
1. **Operadores de Asignación Compuesta (`+=`, `-=`, etc.)**: Reducción de código y casteo implícito automático.
2. **Operadores de Incremento y Decremento (`++`, `--`)**: Variantes prefijas y posfijas para contadores.
3. **Ciclo For-each**: Iteración fluida sobre arreglos y colecciones sin usar índices locales ni constructores Iterator manuales.
4. **Inferencia de Tipos con `var` (Java 10)**: Declaración simplificada de variables locales manteniendo la seguridad en tiempo de compilación.
5. **Expresiones Lambda (Java 8)**: Implementación ágil y funcional de interfaces con un único método abstracto sin crear clases anónimas.
6. **Referencias a Métodos (`::`) (Java 8)**: Sintaxis simplificada de expresión lambda para llamar a un método por referencia.
7. **API Streams (Java 8)**: Procesamiento de datos fluido y funcional a través de pipelines de operaciones secuenciales o paralelas.
8. **Clase `Optional` (Java 8)**: Contenedor diseñado para marcar opcionalidad y evitar la incidencia directa de `NullPointerException`.
9. **Switch Expression (Java 14)**: Uso de switch como una expresión que produce un valor directo con operador flecha (`->`) eliminando caídas accidentales por falta de `break`.
10. **Text Blocks (Java 15)**: Bloques multilínea delimitados por `"""` que simplifican el manejo de formatos estructurados (SQL, JSON, HTML) en código fuente.
11. **Records (Java 16)**: Clases DTO inmutables con getters, equals, hashCode y toString pre-generados automáticamente por el compilador.
12. **Pattern Matching con `instanceof` (Java 16)**: Comprobación y casteo implícito en la misma condición booleana.
13. **`List.of()` (Java 9)**: Factoría estática para instanciar colecciones inmutables pobladas de forma inmediata.
14. **Método `forEach()`**: Iterador fluido en colecciones para aplicar funciones consumidoras rápidas.
15. **Método `removeIf()`**: Purga interactiva de elementos mutables que cumplan con una condición lógica (predicado).

### Parte II: Temas Autónomos (Temas 16 - 20)
16. **`Stream.toList()` (Java 16)**: Retorno integrado para finalizar streams y consolidar listas inmutables directamente.
17. **Pattern Matching para switch (Java 21)**: Utilización de tipos polimórficos como casos directos en la estructura switch.
18. **Record Patterns (Java 21)**: Deconstrucción condicional de campos internos de un Record de manera fluida.
19. **`Objects.requireNonNullElse()` (Java 9)**: Asignación limpia de valores alternativos por defecto ante entradas nulas.
20. **Try-with-resources con Variables Efectivamente Finales (Java 9)**: Reducción de alias temporales locales en la apertura de bloques try-with-resources.

---

## 💻 Ejemplos Implementados y Compilados

En el directorio [Ejemplos](file:///C:/Users/Samuel/Downloads/Trabajo_martes_2/Ejemplos) se encuentran los 5 archivos ejecutables en Java que ilustran la aplicación de las primeras 5 sintaxis abreviadas:

| Archivo | Tema | Descripción de la Sintaxis Abreviada Usada |
| :--- | :--- | :--- |
| **[Ejemplo1.java](file:///C:/Users/Samuel/Downloads/Trabajo_martes_2/Ejemplos/Ejemplo1.java)** | Operadores de Asignación Compuesta | Utiliza `x += 5` en lugar de `x = x + 5`. Demuestra el ahorro sintáctico. |
| **[Ejemplo2.java](file:///C:/Users/Samuel/Downloads/Trabajo_martes_2/Ejemplos/Ejemplo2.java)** | Operadores de Incremento | Emplea `contador++` en lugar del clásico `contador = contador + 1`. |
| **[Ejemplo3.java](file:///C:/Users/Samuel/Downloads/Trabajo_martes_2/Ejemplos/Ejemplo3.java)** | Ciclo For-each | Recorre una lista mediante `for (String nombre : nombres)` sin depender de índices `i` ni getters numéricos. |
| **[Ejemplo4.java](file:///C:/Users/Samuel/Downloads/Trabajo_martes_2/Ejemplos/Ejemplo4.java)** | Inferencia con `var` | Define un objeto complejo `var mapas = new HashMap<String, List<String>>()` deduciendo el tipo de inicialización. |
| **[Ejemplo5.java](file:///C:/Users/Samuel/Downloads/Trabajo_martes_2/Ejemplos/Ejemplo5.java)** | Expresiones Lambda | Implementa `Runnable` con la sintaxis de flecha `() -> System.out.println(...)` en lugar de una clase anónima redundante. |

---

## 🛠️ Cómo Compilar y Ejecutar los Ejemplos

### Requisitos Previos
* Tener instalado el JDK (Java Development Kit) versión 10 o superior (debido a la sintaxis `var` en Ejemplo 4).

### Ejecución de Comandos

1. Abre tu terminal (PowerShell o CMD).
2. Dirígete a la carpeta de ejemplos:
   ```bash
   cd "C:\Users\Samuel\Downloads\Trabajo_martes_2\Ejemplos"
   ```
3. Compila los archivos (opcional, ya se encuentran compilados):
   ```bash
   javac *.java
   ```
4. Ejecuta cada uno de los programas para observar sus salidas:
   ```bash
   java Ejemplo1
   java Ejemplo2
   java Ejemplo3
   java Ejemplo4
   java Ejemplo5
   ```
