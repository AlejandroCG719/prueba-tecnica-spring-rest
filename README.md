# prueba-tecnica-spring-rest

JSON para registrar una foto 
METODO POST
http://localhost:8080/PruebaTecnica/Foto
{ 
    "descripcion":"Una foto de covid 19 ",
    "fecha_creacion": "2021-01-21",
    "url_documento":"http://HolaMundo"
}

JSON para crear un album
METODO POST
http://localhost:8080/PruebaTecnica/Album
{
    "nombre":"Hola Mundo",
    "fecha_creacion": "2021-01-21",
    "foto_id" : 1
}

Api para ver todas los albumnes
METODOS GET 
http://localhost:8080/PruebaTecnica/Album

Api para eliminar un albumn
METODO DELETE
http://localhost:8080/PruebaTecnica/Album/{album_id}
