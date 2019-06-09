CREATE DATABASE eleicao;

USE eleicao;

CREATE TABLE eleitor(
	idEleitor int not null auto_increment primary key,
    titulo varchar(50) not null unique,
    nome varchar(50) not null,
    senha varchar(50) not null,
    nasc date not null,
    municipio varchar(50) not null
);

CREATE TABLE candidato(
	idCandidato int not null auto_increment primary key,
    nome varchar(50) not null,
    numero varchar(12) not null
);

CREATE TABLE voto(
	idVoto int not null auto_increment primary key,
	numero varchar(45) not null unique,
	constraint fk_numero foreign key(numero) references candidato(numero)
);
