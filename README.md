# Base de datos y tareas.

### User

- id (Long)
- name (String)
- lastName (String)
- registrationDate (LocalDateTime)
- phone (Long)

### Reservation

- id (Long)
- description (String)
- date (LocalDateTime)
- status (Boolean)
- userId (Long)
- eventId (Long)

### Payment

- id (Long)
- amount (BigDecimal)
- date (LocalDateTime)
- reserveId (Long)

### Event

- id (Long)
- type (Enum) (KARATE_CHAMPIONSHIP, BASKETBALL_MATCH, TENNIS_MATCH, GYMNASTIC_CHAMPIONSHIP, SWIMMING_CHAMPIONSHIP)
- description (String)
- date (LocalDateTime)
- prize (BigDecimal)

### Trainer

- id (Long)
- name (String)
- lastName (String)

### Sport

- id (Long)
- type (Enum) (KARATE, BASKETBALL, TENNIS, GYMNASTIC, SWIMMING)
- description (String)
- trainerId (Long)

### TrainingSession

- id (Long)
- description (String)
- initDate (LocalDateTime)
- endDate (LocalDateTime)
- trainerId (Long)
- userId (Long)

## Relaciones

- Un usuario puede hacer muchas reservas para eventos. Muchas reservas pertenecen a un usuario.
- Un usuario puede contratar muchas sesiones de entrenamiento. Muchas sesiones pertenecen a un usuario.

- Una reserva solo puede registrar un evento. Cada evento es registrado por una reserva.
- Cada reserva se establece mediante un solo pago. Un pago es registrado por cada reserva.

- Un entrenador imparte muchas sesiones de entrenamiento. Muchas sesiones de entrenamiento son impartidas por un entrenador.
- Un entrenador imparte un solo deporte. Cada deporte es impartido por un entrenador.

## Tareas 30/7

- Román: Entidades Reservation y Trainer. Repositorio de Trainer.
- Iván: Entidad TrainingSession. Repositorios de TrainingSession y Reservation.
- Vicente: Entidad Payment. Enumerados de Sport y Event.
- Jose: Entidades Sport y Event. Repositorio Payment.
- Sonia: Entidad User. Respositorios User, Sport y Event.

### Notas importantes

- Trabajar en la rama personal.
- No hacer push.
- BigDecimal es un dipo de dato en Java.
- El nombre de las variables y Entidades es exáctamente el mismo que figura anteriormente.
- Para los enumerados, crear un nuevo paquete llamado enum. El enum se llamara, por ejemplo, SportType en el caso de la entidad Sport y EvenType en el caso de la entidad Event.
- Cuando hagáis las entidades y relaciones, al no hacer todas la misma persona, tendréis el nombre de dicha entidad en rojo ya que no existe. Dejadlo así.
- Cualquier duda consultar.
    


