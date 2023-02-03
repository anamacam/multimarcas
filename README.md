# multimarcas
## Aplicando los verbos principales de HTTP
### Códigos de estado de respuesta HTTP: 

Los códigos HTTP son la respuesta del servidor a la solicitud del cliente. Funciona como intérprete, permitiendo mejorar la cumunicacion entre el cliente y el servidor indiando si la respuesta ha sido satisfactoria o si a presentado algun error.
A continuación encontramos agunos códigos de estado utilizando la etiqueta @ResponseStatus:

#### Códigos de estado HTTP 200 :

Indica que la petición se ha complatado con éxito y el recurso se ha obtenido a través del GET.

<img width="439" alt="Captura de pantalla 2023-02-03 122840" src="https://user-images.githubusercontent.com/88153157/216684469-2b2fb83c-3cca-4c4b-b43c-735a306fb3cf.png">

### Códigos de estado HTTP 400: 

códigos de error de cliente. Indica que el recurso no esta disponible. Aquí hemos utilizado un ResponseEntity para agregar un mensaje al código de estado.


<img width="438" alt="Captura de pantalla 2023-02-03 130638" src="https://user-images.githubusercontent.com/88153157/216686922-e1573799-d628-42fa-a985-bb0f57a69526.png">

- 404: Not found. Un error muy común. No se reconoce la URL; la fuente no existe.

<img width="639" alt="Captura de pantalla 2023-02-03 130212" src="https://user-images.githubusercontent.com/88153157/216687584-dc7d18c3-4fec-4ecf-b4ef-b785f6368465.png">
