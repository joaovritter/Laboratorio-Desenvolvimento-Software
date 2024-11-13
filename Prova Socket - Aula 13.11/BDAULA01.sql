CREATE DATABASE BDAULA01;
USE BDAULA01;

CREATE TABLE PRODUTO (
	id int auto_increment primary key,
	nome varchar (50),
    codigo int,
    descricao varchar (100),
    preco decimal(10,2),
    quantidade int
    
);

select * from produto;