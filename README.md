# Sistema Web de Consulta Tributaria y Vehicular
Sistema basado en microservicios para validación tributaria, consulta vehicular y verificación de puntos de licencia.

## Arquitectura
- Frontend Web
- API Gateway
- SRI Service
- Vehicle Service
- ANT Service
- Redis Cache
- PostgreSQL

## Cache-Aside Pattern
Implementado para manejar la baja disponibilidad del sistema ANT mediante Redis.

## Tecnologias
- Spring Boot
- PostgreSQL
- Redis
- Docker
- IcePanel

## Arquitectura actual
Se ha implementado una estructura de microservicios con los siguientes módulos backend:

- `api-gateway`
- `sri-service`
- `vehicle-service`
- `ant-service`

También se incluye un archivo `docker-compose.yml` para orquestar los servicios y Redis.

## Servicios creados
- `vehicle-service`: controlador, servicio, integración con SRI y modelo de dominio.
- `ant-service`: controlador de licencias, servicio de puntos, cache manager, integración externa y modelo de dominio.
- `sri-service`: controlador de SRI, servicio y capa de integración.
- `api-gateway`: controlador de entrada y servicio de gateway.

## Estructura recomendada del proyecto
consulta-tributaria-vehicular/
 ├── backend/
 │   ├── api-gateway/
 │   ├── sri-service/
 │   ├── vehicle-service/
 │   └── ant-service/
 ├── frontend/
 ├── docs/
 ├── docker-compose.yml
 └── README.md

Cada microservicio debe seguir una estructura interna clara:

vehicle-service/
 └── src/main/java/com/project/vehicle/
     ├── controller/
     ├── service/
     ├── integration/
     ├── repository/
     └── model/

ant-service/
 └── src/main/java/com/project/ant/
     ├── controller/
     ├── service/
     ├── cache/
     ├── integration/
     ├── repository/
     └── model/

sri-service/
 └── src/main/java/com/project/sri/
     ├── controller/
     ├── service/
     ├── integration/
     ├── repository/
     └── model/

api-gateway/
 └── src/main/java/com/project/apigateway/
     ├── controller/
     └── service/

Esta estructura refleja el diseño de microservicios, la separación de responsabilidades y los patrones clave del C4 propuesto.
