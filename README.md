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

## Diagramas C4
- Nivel 1: Context
- Nivel 2: Containers
- Nivel 3: ANT Service Components
