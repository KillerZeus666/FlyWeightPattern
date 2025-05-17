# 🎵 Flyweight Pattern - Java Implementation

Este proyecto demuestra el uso del **Patrón de Diseño Flyweight** en Java para optimizar el uso de memoria al manejar millones de objetos (canciones y listas de reproducción) reutilizando instancias compartidas.

---

## 📁 Estructura del Proyecto

```
com.pattern.demo
│
├── flyweight
│   └── FlyweightMain.java         # Clase principal, ejecuta la creación de listas
│
└── implementacion
    ├── Artista.java               # Clase con datos del artista
    ├── Cancion.java               # Clase que representa una canción (con contenido simulado)
    ├── FabricaArtistas.java       # Flyweight Factory para artistas
    ├── FabricaCanciones.java      # Flyweight Factory para canciones
    └── ListaReproduccion.java     # Clase que gestiona listas de reproducción
```




---

## 🚀 Ejecución

Para compilar y ejecutar el proyecto, asegúrate de tener **Java 17+ o superior** instalado. Luego, ejecuta:

```bash
javac com/pattern/demo/**/*.java
java com.pattern.demo.flyweight.FlyweightMain
La consola mostrará el avance del proceso de creación de listas, como por ejemplo:

python-repl
Copy
Edit
Proceso de creación de listas de reproducción iniciado...
Finalizado 10%
Listas Creadas 410000
...
Finalizado 100%
Listas Creadas 4100000
Memoria Usada => 1760 MB
🎯 Objetivo del Proyecto
Simular la creación de millones de objetos reutilizando los que ya existen (mismo nombre de canción o artista), ahorrando memoria mediante el patrón Flyweight.

🧠 Conceptos Clave
Flyweight Pattern: Reutiliza objetos compartidos para reducir consumo de memoria.

Memoria optimizada: Aunque se crean millones de listas, solo se instancian una cantidad limitada de canciones/artistas.

Comparación activable: Puedes deshabilitar el uso del patrón cambiando la variable HabilitarFlyweight en FabricaCanciones.

🛠 Personalización
Puedes cambiar el comportamiento del patrón en:


public static boolean HabilitarFlyweight = true; // false para comparar sin Flyweight
📌 Créditos
Autor original: Fabrizio Bolaño

Adaptado y ejecutado por: Katheryn Sofia Guasca

Universidad: Pontificia Universidad Javeriana

Asignatura: Patrones de Diseño de Software
