# Polideportivo BBDD 

User

-id (Long)
-name (String)
-lastName (String)
-registrationDate (LocalDateTime)
-phone (Long)


Reservation

-id (Long)
-description (String)
-date (LocalDateTime)
-status (Boolean)
-userId (Long)
-eventId (Long)


Payment

-id (Long)
-amount (BigDecimal)
-date (LocalDateTime)
-reserveId


Event

-id (Long)
-type (Enum) (KARATE_CHAMPIONSHIP, BASKETBALL_MATCH, TENNIS_MATCH, GYMNASTIC_CHAMPIONSHIP, SWIMMING_CHAMPIONSHIP).
-description (String)
-date (LocalDateTime)
-prize (BigDecimal)


Trainer

-id (Long)
-name (String)
-lastName (String)

Sport

-id (Long)
-type (Enum) (KARATE, BASKETBALL, TENNIS, GYMNASTIC, SWIMMING)
-description (String)
-trainerId (Long)


TrainningSesion

-id (Long)
-description (String)
-initDate (LocalDateTime)
-endDate (LocalDateTime)
-trainerId (Long)
-userId (Long)


<--------------Relaciones-------------->

Un usuario puede hacer muchas reservas para eventos. Muchas reservas pertenecen a un usuario.
Un usuario puede contratar muchas sesiones de entrenamiento. Muchas sesiones pertenecen a un usuario.

Una reserva solo puede registrar un evento. Cada evento es registrado por una reserva.
Cada reserva se establece mediante un solo pago. Un pago es registrado por cada reserva.

Un entrenador  imparte muchas sesiones de entrenamiento. Muchas sesiones de entrenamiento son impartidas por un entrenador.
Un entrenador imparte un solo deporte. Cada deporte es impartido por un entrenador

