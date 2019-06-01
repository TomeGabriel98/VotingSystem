CREATE DATABASE eleicao;

USE eleicao;

CREATE TABLE eleitor(
	id int not null auto_increment primary key,
    titulo varchar(50) not null,
    nome varchar(50) not null,
    senha varchar(50) not null,
    nasc date not null,
    municipio varchar(50) not null
);

CREATE TABLE candidato(
	id int not null auto_increment primary key,
    nome varchar(50) not null,
    numero varchar(12) not null
);