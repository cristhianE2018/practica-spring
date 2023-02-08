CREATE TABLE Apicultores (
    id_apicultores varchar(50) primary key,
    nombre varchar(100) not null,
    numero_apiarios numeric not null,
    numero_empleados numeric not null,
    correo_electronico varchar(100) not null
);

