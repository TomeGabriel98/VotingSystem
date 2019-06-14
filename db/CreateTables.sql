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
    nome varchar(50) not null primary key,
    numero varchar(12) not null
);

CREATE TABLE voto(
	idVoto int not null auto_increment primary key,
	numero varchar(45) not null unique,
	constraint fk_numero foreign key(numero) references candidato(nome)
);

insert into eleitor values(1, "11111", "admin", "MESARIO", "00/00/00", "SJC");
insert into eleitor values(2, "22222", "admin", "ELEITOR", "01/01/01", "Jaca");
insert into eleitor values(3, "00000", "admin", "CHEFE", "02/02/02", "Caça");

insert into candidato values (13, 'Lula');
insert into candidato values (17, 'Bolsonaro');

select * from voto;
insert into voto values (1, "13");

drop database eleicao;
