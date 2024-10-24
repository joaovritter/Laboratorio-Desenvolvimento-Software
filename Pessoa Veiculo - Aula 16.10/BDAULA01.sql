-- Cria o banco de dados
CREATE DATABASE BDAULA01;
-- Usa o banco de dados criado
USE BDAULA01;


-- Dropa o banco de dados (caso necessário, mas pode ser omitido)
DROP DATABASE BDAULA01;


-- Criação da tabela PESSOA
CREATE TABLE PESSOA (
	id INT auto_increment PRIMARY KEY,
	nome VARCHAR(50) NOT NULL,
	sexo VARCHAR(50) NOT NULL,
	idioma VARCHAR(10) NOT NULL
);


-- Inserção de registros na tabela PESSOA (com sintaxe corrigida)
INSERT INTO PESSOA (nome, sexo, idioma)
VALUES ('Joãozão', 'M', 'Português'),
	   ('Marcelo', 'M', 'Inglês'),
       ('Ritter', 'M', 'Espanhol');

-- Seleciona todos os registros da tabela PESSOA
SELECT * FROM PESSOA;


-- Criação da tabela VEICULO com chave estrangeira para PESSOA
CREATE TABLE VEICULO (
	id INT auto_increment PRIMARY KEY,
	modelo VARCHAR(30),
	placa VARCHAR(7),
	id_pessoa INT NOT NULL,
	FOREIGN KEY (id_pessoa) REFERENCES PESSOA(id)
);


-- Inserção de registros na tabela VEICULO
INSERT INTO VEICULO (modelo, placa, id_pessoa)
VALUES ('Lancer', 'IVR3103', 1),
	   ('Grand Cherokee', 'OZQ6D69', 3),
       ('Uno', 'UNO1234', 2);


-- Seleciona todos os registros da tabela VEICULO
SELECT * FROM VEICULO;

