create database Telcom;

--select * from categoria;

--Tabla artículo c
create table varticulo (
       idarticulo integer primary key identity,
       idcategoria integer not null,
       codigo varchar(50) null,
       nombre varchar(100) not null unique,
	   categoria varchar (100),
       precio decimal(11,2) not null,
       stock integer not null,
      -- descripcion varchar(256) null,
       estado bit default(1),
       
);

--Tabla empleado c
create table empleado(
       idempleado integer primary key identity,
       nombre varchar(100) not null,
       apellido varchar(100) not null,
       Ci int null,
       cargo varchar(200) null,
       direccion varchar(200) null,
       telefono int null,
       email varchar(50) null
);



--Tabla cliente ce
create table cliente(
       idcliente integer primary key identity,
	   idempleado integer not null,
	   idarticulo integer ,
       nombre varchar(100) not null,
       apellido varchar(100) not null,
       Cl int null,  
       direccion varchar(200) null,
       telefono int null,
       email varchar(50) null
	    FOREIGN KEY (idempleado) REFERENCES empleado (idempleado),
		FOREIGN KEY (idarticulo) REFERENCES varticulo (idarticulo)
);



--Tabla usuario ce
create table Usuarios(
       idusuario integer primary key identity,
       idcargo integer not null,
       nombre varchar(100) not null,
       tipo_documento varchar(20) null,
       num_documento varchar(20) null,
       direccion varchar(70) null,
       telefono varchar(20) null,
       email varchar(50) not null,
       password varbinary not null,
       estado bit default(1),
     
);


--Tabla Proveedor fl
create table Proveedor(
       idproveedor integer primary key identity,
       idempleado integer not null,
       nombre varchar(100) not null,
       aplellido varchar(20) null,
       direccion varchar(70) null,
       telefono varchar(20) null,
       email varchar(50) not null,
    
       estado bit default(1),
       FOREIGN KEY (idempleado) REFERENCES empleado (idempleado)
);

--Tabla ingreso fl
create table ingreso(
       idingreso integer primary key identity,
       idproveedor integer not null,
       idusuario integer not null,
       tipo_comprobante varchar(20) not null,
       serie_comprobante varchar(7) null,
       num_comprobante varchar (10) not null,
       fecha datetime not null,
       impuesto decimal (4,2) not null,
       total decimal (11,2) not null,
       estado varchar(20) not null,
       FOREIGN KEY (idproveedor) REFERENCES empleado (idempleado),
      -- FOREIGN KEY (idusuario) REFERENCES usu (idusuario)
);

--Tabla detalle_ingreso m
create table detalle_ingreso(
       iddetalle_ingreso integer primary key identity,
       idingreso integer not null,
       idarticulo integer not null,
       cantidad integer not null,
       precio decimal(11,2) not null,
       FOREIGN KEY (idingreso) REFERENCES ingreso (idingreso) ON DELETE CASCADE,
       FOREIGN KEY (idarticulo) REFERENCES varticulo (idarticulo)
);


--Tabla venta m
create table venta(
       idventa integer primary key identity,
       idcliente integer not null,
       idusuario integer not null,

       num_comprobante int not null,
       fecha_hora datetime not null,
       impuesto decimal (4,2) not null,
       total decimal (11,2) not null,
       estado varchar(20) not null,
       FOREIGN KEY (idcliente) REFERENCES empleado (idempleado)
       
);

--Tabla detalle_venta
create table factura(
       iddetalle_venta integer primary key identity,
       idventa integer not null,
       idarticulo integer not null,
	   idusuario integer ,
       cantidad integer not null,
       precio decimal(11,2) not null,
       descuento decimal(11,2) not null,
	   descripcion_garantia varchar (100),
       FOREIGN KEY (idventa) REFERENCES venta (idventa) ON DELETE CASCADE,
	   FOREIGN KEY (idusuario) REFERENCES Usuarios (idusuario),
       FOREIGN KEY (idarticulo) REFERENCES varticulo (idarticulo)
	   
);



DROP database Telcom;

