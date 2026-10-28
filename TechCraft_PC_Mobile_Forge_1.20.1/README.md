# TechCraft: PC & Mobile — proyecto inicial

Proyecto base para Minecraft Java Edition 1.20.1 con Minecraft Forge 47.x.

## Importante
Este es un **prototipo inicial del proyecto**, no un mod terminado. Registra objetos y bloques de TechCraft para comenzar a implementar las mecánicas. Aún no incluye la interfaz de Windows, minijuegos jugables, navegador real, reproducción de YouTube, lógica completa de componentes, modelos/texturas finales ni pruebas de compilación.

## Requisitos
- Minecraft Java Edition 1.20.1
- Minecraft Forge 1.20.1 (47.x)
- JDK 17 de 64 bits
- Gradle/IDE compatible (por ejemplo, IntelliJ IDEA)

## Cómo usar este proyecto
1. Descarga el **MDK oficial de Forge 1.20.1** y extrae sus archivos en esta carpeta.
2. Conserva los archivos Gradle del MDK (`gradlew`, `gradlew.bat`, carpeta `gradle`, `build.gradle`, `settings.gradle`).
3. Copia/combina la carpeta `src` de este proyecto con la del MDK.
4. En `build.gradle`, configura `archivesName = 'techcraft'` si tu plantilla usa esa propiedad.
5. Ejecuta `gradlew genIntellijRuns` o `gradlew genEclipseRuns`, y luego `gradlew build`.
6. Copia el JAR resultante de `build/libs` a la carpeta `mods` de una instalación Forge 1.20.1.

No incluimos los juegos comerciales originales. La idea es crear minijuegos propios inspirados en géneros conocidos.
