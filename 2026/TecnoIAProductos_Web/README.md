# TecnoIA Productos Web

Aplicación web lista para visualizar en navegador.

## Qué incluye
- Spring Boot
- Thymeleaf
- JDBC
- Base de datos H2 en memoria
- CRUD web de productos

## Requisitos
- Java JDK 17 o superior
- Maven
- Visual Studio Code con Extension Pack for Java

## Cómo ejecutar

Abra esta carpeta en VS Code y en la terminal ejecute:

```bash
mvn spring-boot:run
```

Luego abra:

```text
http://localhost:8080/productos
```

## Consola H2
Para ver la base de datos:

```text
http://localhost:8080/h2-console
```

Datos:
- JDBC URL: jdbc:h2:mem:tecnoia
- User: sa
- Password: vacío

## Nota
No necesita instalar MySQL para esta versión. Usa H2 para que abra rápido y sin cambios.
