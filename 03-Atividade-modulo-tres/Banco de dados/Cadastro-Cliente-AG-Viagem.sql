
create table usuario (
ID_cpf varchar(11) NOT NULL primary key,
nome varchar(255) NOT NULL,
telefone varchar(11) NOT NULL,
email varchar(255) NOT NULL
);

create table entra (
cpf varchar(11) NOT NULL,
destino int
);

create table destino (
ID_destino INT PRIMARY KEY,
nome_destino varchar(100),
ida_destino date,
volta_destino date
);




