-- /*
-- Q1
CREATE DATABASE sistema_bancario;

-- Q2 INICIO
USE sistema_bancario;
CREATE TABLE banco (
codigo int,
nome varchar(20),
PRIMARY KEY (codigo)
);

CREATE TABLE agencia (
cod_banco int,
numero_agencia varchar(5),
endereco varchar(50),
PRIMARY KEY (numero_agencia),
FOREIGN KEY (cod_banco) REFERENCES banco(codigo) ON DELETE SET NULL
);

CREATE TABLE cliente (
cpf char(14),
nome varchar(50),
sexo char(1),
endereco varchar(50),
PRIMARY KEY (cpf),
CHECK (sexo IN ('m','f'))
);

CREATE TABLE conta (
numero_conta char(7),
saldo DECIMAL(9,2),
tipo_conta INT,
num_agencia varchar(5),
PRIMARY KEY (numero_conta),
FOREIGN KEY (num_agencia) REFERENCES agencia(numero_agencia) ON DELETE SET NULL
);

CREATE TABLE historico (
cpf_cliente char(14),
num_conta char(7),
data_inicio date,
FOREIGN KEY (cpf_cliente) REFERENCES cliente(cpf),
FOREIGN KEY (num_conta) REFERENCES conta(numero_conta) ON DELETE SET NULL
);

CREATE TABLE telefone_cliente (
cpf_cli char(14),
telefone varchar(20),
PRIMARY KEY (telefone),
FOREIGN KEY (cpf_cli) REFERENCES cliente(cpf)  ON DELETE SET NULL
);
-- Q2 FIM

-- Q3 INICIO
INSERT INTO banco (codigo, nome) VALUES
(1, 'Banco do Brasil'),
(4, 'CEF');

INSERT INTO agencia(numero_agencia, endereco, cod_banco) VALUES
('322', 'Av. Walfredo Macedo Brandao, 1139', 4),
('1253', 'R. Bancário Sérgio Guerra, 17', 1);

INSERT INTO cliente VALUES
('111.222.333-44','Bruna Andrade','f','Rua José Firmino Ferreira, 1050'),
('666.777.888-99','Radegondes Silva', 'm', 'Av. Epitácio Pessoa, 1008'),
('555.444.777-33','Miguel Xavier', 'm', 'Rua Bancário Sérgio Guerra, 640'),
('123.456.789-10','Marcelo Camilo', 'm', 'Rua Giacomo Porto, 145');

INSERT INTO conta VALUES
('11765-2', 22745.05, 2,'322'),
('21010-7', 3100.96, 1, '1253'),
('12345-6', 99999.99, 2, '1253');

INSERT INTO historico VALUES
('111.222.333-44', '11765-2', '2015-12-22'),
('666.777.888-99', '11765-2', '2016-12-05'),
('555.444.777-33', '21010-7', '2012-08-29'),
('123.456.789-10', '12345-6', '2023-09-12');

INSERT INTO telefone_cliente VALUES
('111.222.333-44', '(83)3222-1234'),
('666.777.888-99', '(83)99443-9999'),
('555.444.777-33', '(83)3233-2267'),
('123.456.789-10', '(83)9121-9549');
-- Q3 FIM */

-- /*
-- Q4 
ALTER TABLE cliente ADD COLUMN pais char(3) DEFAULT 'BRA';

-- Q5
ALTER TABLE cliente ADD COLUMN email varchar(50);

-- Q6
DELETE FROM conta WHERE numero_conta = '11765-2';

-- Q7
UPDATE agencia SET numero_agencia = '6342' WHERE cod_banco = 4; 

-- Q8
ALTER TABLE conta MODIFY COLUMN numero_conta char(7);

-- Q9
UPDATE cliente SET email = 'radegondes.silva@gmail.com' WHERE cpf = '666.777.888-99'; 

-- Q10
UPDATE conta SET saldo = 1.1*saldo WHERE numero_conta = '21010-7'; 

-- Q11
UPDATE cliente SET nome = 'Bruna Fernandes' WHERE cpf = '111.222.333-44'; 

-- Q12
UPDATE conta SET tipo_conta = 3 WHERE saldo > 10000; 
-- Fim Primeira parte Exercicio */

