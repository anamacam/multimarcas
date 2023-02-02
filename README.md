# multimarcas
Aplicando los verbos principales de HTTP

## El verbo GET:

- Es un verbo idenpotente, eso significa que independientemente de cuants veces se haga la petición, esta  operación solo lee sin producir ningun cambio en el servidor.
- Es una operción READ-ONLY. 
- No lleva data el cuerpo de request.

## El verbo POST:

- Se utiliza para crear los recursos.
- No es idenpotente puesto que produce cambios en el servidor.
- El curpo de request si lleva data para crear el recurso.


## El verbo PUT:

- Este es utilizados para reemplar recursos exitentes.
- Se consider idempotente porque cuando se hace una llamada PUT, el efecto en el servidor siempre será el mismo.
- El curpo de request si lleva data para crear el nuevo recurso recurso que reemplazará el existente.

## El verbo DELETE:

Este es utilizados para eliminar recursos exitentes.
- E idempotente porque cuando se hace una llamada DELETE, el efecto en el servidor siempre será el mismo aunque esta se repita multiples veces.
- El curpo de request no lleva data.
