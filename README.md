Este programa está diseñado para modelar y gestionar el control de temperatura de un dispositivo inteligente mediante la aplicación estricta del principio de encapsulamiento (ocultación de datos) y validaciones de rango operativo defensivas en programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la clase Termostato: Declara atributos privados (temperaturaActual y modoOperacion) para proteger el estado interno del dispositivo frente a modificaciones externas no controladas.

Implementa el método setTemperatura(double nuevaTemperatura): Incluye una validación estricta para verificar que el valor se encuentre dentro del rango permitido (15°C a 30°C). Si el valor está fuera de este intervalo, la operación es rechazada y se emite un mensaje de advertencia por consola.

Provee el método getTemperatura() (y métodos de consulta seguros): Permite obtener de forma controlada el estado actual del termostato sin exponer directamente las variables internas.

Ejecuta la prueba en el main: Instancia el termostato, intenta configurar temperaturas válidas (como 22.5°C) e inválidas (como 10°C o 35°C), y refleja el comportamiento defensivo y los cambios de estado por consola.
