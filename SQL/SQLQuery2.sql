CREATE DATABASE ex02
CREATE TABLE LOGRADOUROS(
ID_TIPO_LOGRADOURO smallint primary key identity,
nome varchar (100) )

CREATE TABLE ESTADOS (
ID_ESTADO int primary key identity,
NOME varchar(120) not null )

CREATE TABLE CIDADES (
ID_Cidade smallint primary key identity,
NOME varchar(120) not null,
ID_ESTADO int not null foreign key references ESTADOS(ID_ESTADO) )

CREATE TABLE BAIRROS (
ID_BAIRRO int primary key identity,
NOME varchar (120) not null,
ID_Cidade smallint not null foreign key REFERENCES CIDADES(ID_Cidade) )

CREATE TABLE LOGRADOURO (
ID_LOGRADOURO int primary key identity,
CEP int not null,
ID_TIPO_LOGRADOURO smallint not null foreign key REFERENCES LOGRADOUROS(ID_TIPO_LOGRADOURO),
ID_BAIRRO int not null foreign key references BAIRROS(ID_BAIRRO),
nome varchar (max) not null )

CREATE TABLE CARGOS (
ID_CARGO smallint primary key identity,
cargo varchar (120) not null )

CREATE TABLE FUNCIONARIOS (
CPF smallint primary key identity,
nome varchar (120),
ID_LOGRADOURO int not null foreign key REFERENCES LOGRADOURO(ID_LOGRADOURO),
DATA_NASCIMENTO date,
ID_CARGO smallint not null foreign key REFERENCES CARGOS(ID_CARGO),
Salario int )
