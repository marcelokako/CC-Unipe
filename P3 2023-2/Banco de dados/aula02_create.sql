-- Aula simulando locadora de veículos

CREATE DATABASE aula_bd_qui;
USE aula_bd_qui; -- Fica em negrito quando está habilitada

Criação da tabela veículo

CREATE TABLE veiculo (
chassi CHAR(17) PRIMARY KEY, -- Espaço no disco sempre fixo à quantidade máxima
marca VARCHAR(20) NOT NULL, -- Espaço no disco se adapta ao tamanho inserido
ano INT NOT NULL
);


Criação da tabela cliente
CREATE TABLE cliente (
codigo INT PRIMARY KEY,
cpf CHAR(11) NOT NULL UNIQUE,
nome varchar(60),
sexo CHAR(1),
cidade VARCHAR(20) DEFAULT 'João Pessoa',
CHECK (sexo IN ('m','f'))
);

Criação da tabela relacional locacao 
CREATE TABLE locacao (
id INT,
data_loc DATE,
valor DECIMAL(8,2), -- 8 será a quantidade total de algarismos e o 2 a quantidade destes algarismos apos a virgula
chassi_vei CHAR(17), -- não precisa ser o nome identico, mas o tipo é bom que seja o mesmo
codigo INT,
PRIMARY KEY (id),
FOREIGN KEY (chassi_vei) REFERENCES veiculo(chassi),
FOREIGN KEY (codigo) REFERENCES cliente(codigo)
);

