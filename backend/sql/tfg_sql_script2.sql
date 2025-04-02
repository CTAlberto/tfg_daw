-- Tabla de Direcciones
CREATE TABLE Direcciones (
                             direccion_id SERIAL PRIMARY KEY,
                             calle VARCHAR(255) NOT NULL,
                             numero VARCHAR(20),
                             extra VARCHAR(255),
                             ciudad VARCHAR(100),
                             estado VARCHAR(100),
                             codigo_postal VARCHAR(20),
                             pais VARCHAR(100)
);

-- Tabla de Ubicaciones
CREATE TABLE Ubicaciones (
                             ubicacion_id SERIAL PRIMARY KEY,
                             nombre VARCHAR(255) NOT NULL,
                             descripcion TEXT
);

-- Tabla de Tipos_Producto
CREATE TABLE Tipos_Producto (
                                tipo_producto_id SERIAL PRIMARY KEY,
                                nombre VARCHAR(255) NOT NULL,
                                descripcion TEXT
);

-- Tabla de Casas
CREATE TABLE Casas (
                       casa_id SERIAL PRIMARY KEY,
                       nombre VARCHAR(255) NOT NULL,
                       direccion_id INTEGER REFERENCES Direcciones(direccion_id)
);

-- Tabla de Categorías de Producto
CREATE TABLE Categorias_Producto (
                                     categoria_id SERIAL PRIMARY KEY,
                                     nombre VARCHAR(255) UNIQUE NOT NULL
);
CREATE  TABLE Tipos_Cantidad (
                                tipo_cantidad_id SERIAL PRIMARY KEY,
                                nombre VARCHAR(255) NOT NULL
);

-- Tabla de Productos
CREATE TABLE Productos (
                           producto_id SERIAL PRIMARY KEY,
                           nombre VARCHAR(255) NOT NULL,
                           descripcion TEXT,
                           stock INTEGER CHECK (stock >= 0),
                           precio NUMERIC CHECK (precio >= 0),
                           tipo_cantidad_id INTEGER REFERENCES Tipos_Cantidad(tipo_cantidad_id),
                           ubicacion_id INTEGER REFERENCES Ubicaciones(ubicacion_id),
                           tipo_producto_id INTEGER REFERENCES Tipos_Producto(tipo_producto_id),
                           categoria_id INTEGER REFERENCES Categorias_Producto(categoria_id),
                           casa_id INTEGER REFERENCES Casas(casa_id)
);

-- Tabla de Usuarios
CREATE TABLE Usuarios (
                          usuario_id SERIAL PRIMARY KEY,
                          nombre VARCHAR(255) NOT NULL,
                          email VARCHAR(255) UNIQUE NOT NULL,
                          password VARCHAR(255) NOT NULL,
                          direccion_id INTEGER REFERENCES Direcciones(direccion_id)
);
