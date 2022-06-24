create database Bibliotecavirtual
Use Bibliotecavirtual
CREATE TABLE Categorias (
ID_categoria int primary key identity,
nome varchar (80) not null);
CREATE TABLE Autores (
id_autor int primary key identity,
nome varchar (120) not null,
ano_nascimento smallint null);
CREATE TABLE Livros (
Id_livro int primary key identity,
nome varchar (120) not null,
numero_pags smallint not null,
sinopse varchar(max) null,
ID_Categoria int not null foreign key REFERENCES Categorias(ID_categoria),
id_autor int not null foreign key REFERENCES Autores(id_autor))
CREATE TABLE teste (
codigo int);
ALTER TABLE Livros
ADD ano_pub smallint;
DROP TABLE teste;


