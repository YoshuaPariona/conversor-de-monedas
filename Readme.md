# 💱 Conversor de Monedas

Esta aplicación permite convertir montos entre diferentes monedas utilizando la API [ExchangeRate-API](https://www.exchangerate-api.com/). 

## ✨ ONE G8

Este proyecto fue creado para completar el challenge ONE G8 Backend - conversor de monedas - Java.

## 🚀 Características

- Menú de consola con selección de opciones con moneda de origen y destino.
- Ingreso de monto para convertir.
- Repetición del menú tras cada operación hasta que el usuario decida salir.
- Obtención del tipo de cambio actual mediante la API de ExchangeRate.
- Configuración de la API Key a través de un archivo externo (`config.properties`).

## 🛠️ Requisitos

- Java 11 o superior.
- [Gson](https://github.com/google/gson) (`gson.jar`) para el manejo de JSON.
- Conexión a internet para acceder a la API.

## ⚙️ Configuración

1. Clona el repositorio:

   ```bash
   git clone https://github.com/tu-usuario/conversor-monedas.git
   cd conversor-monedas
   ```

2. Crea un archivo `config.properties` en la raíz del proyecto con el siguiente contenido:

   ```properties
   API_KEY=TU_API_KEY_AQUI
   ```

   Puedes obtener una API Key gratuita desde [ExchangeRate-API](https://www.exchangerate-api.com/).

3. Asegúrate de tener el archivo `gson.jar` configurado en tu classpath.



4. Ejecuta el main.java con el IDE de tu elección.

## 📁 Estructura del proyecto

```
├── src/
│   ├── ApiClient.java
│   ├── ApiResponse.java
│   ├── Currency.java
│   └── Main.java
├── config.properties
├── README.md
└── LICENSE
```

## 📄 Licencia

Este proyecto está licenciado bajo la **Licencia MIT**. Para más detalles, consulta el archivo [LICENSE](LICENSE).
