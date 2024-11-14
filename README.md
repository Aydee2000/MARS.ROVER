# 🚀 Mars Rover Project: ¡Explorando Marte desde tu navegador! 🌌

Este proyecto fue desarrollado durante el **bootcamp de ATL Academy**, un programa intensivo que se centra en el desarrollo de software utilizando **Spring Boot**, **Java** y herramientas modernas para crear aplicaciones web robustas y escalables. En este proyecto, hemos simulado el control de un rover que explora Marte, utilizando una combinación de **frontend** y **backend**, todo integrado a través de una API RESTful.

¡Imagina estar al mando de un rover en Marte, controlando su movimiento y decisiones a medida que explora el planeta rojo! 🪐 Este proyecto te permite experimentar esa sensación, todo mientras aplicamos buenas prácticas de desarrollo de software como **TDD**, **POO** y metodologías ágiles.

## 🚀 Tecnologías utilizadas

Este proyecto ha sido desarrollado utilizando una combinación de tecnologías que hacen posible esta simulación increíble. Algunas de las herramientas y tecnologías clave que hemos utilizado son:

### 🌐 **Frontend**
- **HTML**: Para estructurar la interfaz de usuario.
- **CSS**: Para darle vida y estilo al diseño.
- **JavaScript**: Para la interacción dinámica y el control del rover en el mapa.

### ⚙️ **Backend**
- **Java**: El corazón del proyecto, impulsando la lógica detrás del rover.
- **Spring Boot**: Para facilitar el desarrollo de la API RESTful que controla todo el sistema.
- **Hibernate & Spring Data JPA**: Para manejar la persistencia de datos y la comunicación con la base de datos MySQL.

### 🧪 **Pruebas**
- **JUnit** y **Mockito**: Para asegurar que todo funcione correctamente con pruebas unitarias.
- **Cucumber**: Para pruebas de integración de comportamiento y asegurarnos de que la experiencia de usuario es impecable.
- **TDD**: Enfoque de desarrollo basado en pruebas, asegurando una base de código más robusta y confiable.

### 🗃 **Bases de Datos**
- **MySQL**: Base de datos que almacena la información del estado del rover y los comandos enviados.

### 🛠 **Herramientas y Metodologías**
- **Git & GitHub**: Para el control de versiones y colaboración.
- **Postman**: Para probar los endpoints de la API y asegurarnos de que todo esté funcionando correctamente.
- **Metodologías Ágiles**: Para gestionar el desarrollo de forma eficiente y flexible.

## 🌍 Descripción

Imagina estar al mando de un rover en Marte, controlando su movimiento y decisiones a medida que explora el terreno rocoso y desconocido. Este proyecto trae esa visión a la vida mediante una interfaz web simple pero poderosa.

### ¿Cómo funciona?

El rover es controlado por comandos enviados a través de la interfaz web, los cuales se procesan por una API RESTful. Cada vez que un comando es emitido (como "mueve al norte" o "gira 90°"), el backend verifica que el movimiento sea válido y mantiene un registro en la base de datos MySQL de la posición y estado del rover.

#### ¿Qué hace especial este proyecto?

- **Simulación en tiempo real**: El rover responde a comandos de movimiento en un mapa 2D simulado, lo que te permite interactuar con el entorno de forma dinámica.
- **Validación de movimientos**: Evitamos que el rover se salga de los límites del mapa, asegurándonos de que cada movimiento esté bien gestionado.
- **Desarrollo robusto**: Utilizamos **TDD (Desarrollo Basado en Pruebas)** con herramientas como **JUnit**, **Mockito** y **Cucumber** para garantizar que cada parte del sistema funcione correctamente.
- **Persistencia de datos**: Gracias a **MySQL**, almacenamos el estado del rover, lo que nos permite realizar un seguimiento de sus movimientos y decisiones.

## ✨ Características principales

- **Control del rover**: Envía comandos al rover y observa cómo se mueve en el mapa de Marte.
- **Validación de movimientos**: El rover no puede salirse de los límites del terreno, asegurando una experiencia de exploración más realista.
- **API RESTful**: El backend, desarrollado con **Spring Boot**, maneja las solicitudes y responde con el estado actualizado del rover.
- **Base de datos MySQL**: Todos los movimientos y estados se almacenan para realizar un seguimiento detallado de la misión.
- **Pruebas unitarias y de integración**: Con **JUnit**, **Mockito** y **Cucumber**, aseguramos que todo el sistema esté probado y funcione correctamente, desde la lógica hasta la interacción del usuario.
- **Interfaz web**: Una interfaz sencilla y moderna que permite enviar comandos al rover y ver los resultados en tiempo real.

