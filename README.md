Clases Java - Práctica de POO
Proyecto educativo en Java para practicar los fundamentos de la Programación Orientada a Objetos (POO).

Descripción
Este proyecto implementa una clase Product con sus atributos, constructores, métodos get, set y toString, aplicando los conceptos básicos de encapsulamiento en Java.

Estructura del proyecto
src/
└── main/
    └── java/
        └── com/
            └── example/
                ├── Main.java       # Clase principal con ejemplos de uso
                └── Product.java    # Clase Product con atributos y métodos
Clase Product
Atributos:

id - Identificador del producto (int)
nombre - Nombre del producto (String)
descripcion - Descripción del producto (String)
precio - Precio del producto (double)
Métodos implementados:

Constructores: sin parámetros y con parámetros
Getters: getId(), getNombre(), getDescripcion(), getPrecio()
Setters: setId(), setNombre(), setDescripcion(), setPrecio() (con validaciones que lanzan IllegalArgumentException)
toString() para representación en texto
equals() y hashCode() basados en el id del producto
Compilar y ejecutar
Con Maven desde la raíz del proyecto:

# Compilar
mvn compile

# Ejecutar
mvn exec:java -Dexec.mainClass="com.example.Main"

# Compilar y ejecutar en un solo paso
mvn compile exec:java -Dexec.mainClass="com.example.Main"
Temas practicados
Encapsulamiento (atributos privados)
Constructores
Métodos getter y setter
Validaciones en setters con IllegalArgumentException
Sobrescritura de toString(), equals() y hashCode()
Instanciación de objetos
Control de versiones con Git
El proyecto utiliza Git para registrar el progreso del desarrollo.

# Ver el estado de los archivos modificados
git status

# Agregar archivos al área de preparación
git add .

# Crear un commit con un mensaje descriptivo
git commit -m "descripción del cambio"

# Ver el historial de commits
git log --oneline

# Subir los cambios al repositorio remoto
git push origin main
Tecnologías
Java
Maven
Git
Autor
OSCAR NAVARRO — Proyecto educativo de práctica POO en Java.

Licencia
Este proyecto es de uso educativo.