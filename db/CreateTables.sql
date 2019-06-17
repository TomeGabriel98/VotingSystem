CREATE DATABASE eleicao;

USE eleicao;

CREATE TABLE eleitor(
	idEleitor int not null auto_increment primary key,
    titulo varchar(50) not null unique,
    nome varchar(50) not null,
    senha varchar(50) not null,
    nasc date not null,
    categoria varchar(20) not null,
    libera boolean not null
    #municipio varchar(50) not null
);

CREATE TABLE candidato (
  numero VARCHAR(45) NOT NULL,
  nome VARCHAR(45) NOT NULL,
  PRIMARY KEY (`numero`));

CREATE TABLE voto (
    idvoto INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    voto VARCHAR(45) NOT NULL,
    CONSTRAINT fk_numero FOREIGN KEY (voto)
        REFERENCES candidato (numero)
);

insert into eleitor values(1, "11111", "admin", "MESARIO", "00/00/00", "MESARIO", false);
insert into eleitor values(2, "22222", "admin", "ELEITOR", "01/01/01", "ELEITOR", false);
insert into eleitor values(3, "00000", "admin", "CHEFE", "02/02/02", "CHEFE", false);

insert into candidato values (13, 'Lula');
insert into candidato values (17, 'Bolsonaro');

select * from voto;

select * from candidato;

insert into voto values (3, "17");

select * from eleitor;

drop table eleitor;

drop table candidato;

drop table voto;


