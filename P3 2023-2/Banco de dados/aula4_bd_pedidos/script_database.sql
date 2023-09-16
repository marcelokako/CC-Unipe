create database aula_bd_sql;
use aula_bd_sql;
create table tb_vendedor (
    codigo SMALLINT AUTO_INCREMENT,
    nome varchar (100) not null,
    salario decimal (8,2),
    telefone int,
    sexo enum ('M','F'),
    PRIMARY KEY (codigo));
create table tb_fabricante (
    codigo SMALLINT,
    nome varchar(100) not null,
    PRIMARY key (codigo));
create table tb_produto (
    codigo SMALLINT AUTO_INCREMENT,
    nome varchar(100) not null,
    preco decimal (8,2),
    fabricante SMALLINT,
    PRIMARY KEY (codigo),
    FOREIGN key (fabricante) REFERENCES tb_fabricante (codigo));
    
create table tb_cliente (
    id SMALLINT AUTO_INCREMENT,
    nome varchar(100) not null,
    nome_rua varchar(60),
    bairro varchar(40),
    cep int not null,
    cpf varchar(15) UNIQUE,
    uf enum ('AC','AL','AP','AM','BA','CE','DF','ES','GO','MA','MT','MS','MG','PA','PB','PR','PE','PI','RJ','RN','RS','RO','RR','SC','SP','SE','TO'),
    telefone int not null,
    desconto decimal (3,1),
    sexo enum ('M','F'),
	PRIMARY key (id));
create table tb_pedido (
    id SMALLINT AUTO_INCREMENT,
    tipopagamento varchar(100) not null,
    idcliente SMALLINT,
    dataentrada date not null,
    dataembarque date not null,
    desconto int,
    valortotal decimal(8,2) not null,
    telefone int not null,
    formapagmento varchar(40),
    primary key (id),
    FOREIGN key (idcliente) REFERENCES tb_cliente(id));
create table tb_item_pedido (
    codigoproduto SMALLINT,
    idpedido SMALLINT,
    quantidade int not null,
    FOREIGN KEY (codigoproduto) REFERENCES tb_produto (codigo),
    FOREIGN key (idpedido) REFERENCES tb_pedido (id),
    PRIMARY key (codigoproduto,idpedido));
------------------------------------------ INSERTS ----------------------------------------------------------------
insert into tb_vendedor (codigo, nome, salario, telefone, sexo) VALUES (1, 'Radagondes Oliveira', 856.00, 98771234, 'M');
insert into tb_vendedor (codigo, nome, salario, telefone, sexo) VALUES (2, 'Esmeraldina Silva', 1234.35, 89870909, 'F');
insert into tb_vendedor (codigo, nome, salario, telefone, sexo) VALUES (3, 'Antonieta Silvestre', 2146.89, 98716542, 'F');
insert into tb_vendedor (codigo, nome, salario, telefone, sexo) VALUES (4, 'Joselino Pedro Cabral', 1765.54, 99985454, 'M');
insert into tb_vendedor (codigo, nome, salario, telefone, sexo) VALUES (5, 'Fulustreco de Amaral', 987.01, 90877667, 'M');
insert into tb_vendedor (codigo, nome, salario, telefone, sexo) VALUES (6, 'Zefilina Xavier', 1000.98, 98984252, 'F');
insert into tb_vendedor (codigo, nome, salario, telefone, sexo) VALUES (7, 'Dom Manuel ', 1987.10, 987901824, 'M');
insert into tb_fabricante (codigo, nome) VALUES (100, 'HP');
insert into tb_fabricante (codigo, nome) VALUES (101, 'DELL');
insert into tb_fabricante (codigo, nome) VALUES (102, 'APPLE');
insert into tb_fabricante (codigo, nome) VALUES (103, 'ITAUTEC');
insert into tb_fabricante (codigo, nome) VALUES (104, 'XEROX');
insert into tb_fabricante (codigo, nome) VALUES (105, 'SAMSUNG');
insert into tb_fabricante (codigo, nome) VALUES (106, 'SONY');
insert into tb_produto (codigo, nome, preco, fabricante) VALUES (1, 'Iphone x',6856.00, 102);
insert into tb_produto (codigo, nome, preco, fabricante) VALUES (2, 'Laptop',10234.35, 103);
insert into tb_produto (codigo, nome, preco, fabricante) VALUES (3, 'Monitor',846.89, 101);
insert into tb_produto (codigo, nome, preco, fabricante) VALUES (4, 'Impressora',765.54, 100);
insert into tb_produto (codigo, nome, preco, fabricante) VALUES (5, 'Impressora',987.01, 104);
insert into tb_produto (codigo, nome, preco, fabricante) VALUES (6, 'Mouse',79.98, 105);
insert into tb_produto (codigo, nome, preco, fabricante) VALUES (7, 'Teclado',87.10, 103);
insert into tb_produto (codigo, nome, preco, fabricante) VALUES (8, 'Tv 20”',1987.10, 106);
insert into tb_produto (codigo, nome, preco, fabricante) VALUES (9, 'Tv 59”',4987.00, 105);
insert into tb_produto (codigo, nome, preco, fabricante) VALUES (10, 'Monitor led',960.10,100);
insert into tb_produto (codigo, nome, preco, fabricante) VALUES (11, 'Monitor',787.16, 102);
insert into tb_produto (codigo, nome, preco, fabricante) VALUES (12, 'Impressora',867.17, 104);
insert into tb_produto (codigo, nome, preco, fabricante) VALUES (13, 'Projetor multimídia',1087.40, 106);
insert into tb_produto (codigo, nome, preco, fabricante) VALUES (14, 'Iphone 7',4987.70, 102);
insert into tb_produto (codigo, nome, preco, fabricante) VALUES (15, 'Macbook ',14987.80, 102);
insert into tb_cliente (id, nome, nome_rua, bairro, cep, uf, cpf, telefone, desconto,sexo) VALUES (1,'José', 'das flores','centro', 454, 'RN',111,987118,0,'M');
insert into tb_cliente (id, nome, nome_rua, bairro, cep, uf, cpf, telefone, desconto,sexo) VALUES (2,'Pires da Silva', 'do rio','grotão', 565, 'PB',222,123478,0,'M');
insert into tb_cliente (id, nome, nome_rua, bairro, cep, uf, cpf, telefone, desconto,sexo) VALUES (3,'Mariana', 'do horizonte','derba', 573, 'BA',333,765432,0.05,'F');
insert into tb_cliente (id, nome, nome_rua, bairro, cep, uf, cpf, telefone, desconto,sexo) VALUES (4,'Yasmin Moneta','do litoral','ondina', 762, 'BA',444,223444,0,'F');
insert into tb_cliente (id, nome, nome_rua, bairro, cep, uf, cpf, telefone, desconto,sexo) VALUES (5,'Igor Ralf','do interior','marés', 656, 'RJ',555,556677,0.03,'M');
insert into tb_cliente (id, nome, nome_rua, bairro, cep, uf, cpf, telefone, desconto,sexo) VALUES (6,'Pedro','Conselheiro da silva','amaralina', 656, 'BA',666,654333,0,'M');
insert into tb_cliente (id, nome, nome_rua, bairro, cep, uf, cpf, telefone, desconto,sexo) VALUES (7,'Mariana Dantas','das flores','cristo', 456, 'PB',777,222111,0,'F');
insert into tb_cliente (id, nome, nome_rua, bairro, cep, uf, cpf, telefone, desconto,sexo) VALUES (8,'Isabelle Silva','Caimbinhas','manaira', 456, 'PB',888,112277,0,'F');
insert into tb_cliente (id, nome, nome_rua, bairro, cep, uf, cpf, telefone, desconto,sexo) VALUES (9,'Wilson Souza','Ilariê','bessa', 322, 'PB',999,987889,0.1,'M');
insert into tb_cliente (id, nome, nome_rua, bairro, cep, uf, cpf, telefone, desconto,sexo) VALUES (10,'Everton Alves','derba','bessa', 134, 'PB',007,767676,0.08,'M');
insert into tb_cliente (id, nome, nome_rua, bairro, cep, uf, cpf, telefone, desconto,sexo) VALUES (11,'Pedro Lima','Titanic afundou','manaira', 567, 'PB',998,568009,0,'M');
insert into tb_cliente (id, nome, nome_rua, bairro, cep, uf, cpf, telefone, desconto,sexo) VALUES (12,'Antonio Jose','segundo turno','centro', 453, 'SP',788,900087,0.02,'M');
insert into tb_cliente (id, nome, nome_rua, bairro, cep, uf, cpf, telefone, desconto,sexo) VALUES (13,'Pierre Matias','do rio','centro', 222, 'SP',443,808070,0,'M');
insert into tb_cliente (id, nome, nome_rua, bairro, cep, uf, cpf, telefone, desconto,sexo) VALUES (14,'Alvaro George','bancario Waldemar','bancários', 58051, 'PB',030,9966842,0.05,'M');
insert into tb_cliente (id, nome, nome_rua, bairro, cep, uf, cpf, telefone, desconto,sexo) VALUES (15,'Moneta Alves','das flores','marés', 356, 'RJ',356,260921,1.1,'F');
insert into tb_pedido (id, tipopagamento, idcliente, dataentrada, dataembarque, desconto, valortotal, telefone, formapagmento) VALUES (1,'à vista',8,'2017/05/12', '2018/06/12',0.05,3346.00,11,'cash');
insert into tb_pedido (id, tipopagamento, idcliente, dataentrada, dataembarque, desconto, valortotal, telefone, formapagmento) VALUES (2,'cartão',5,'2015/01/02', '2016/03/12',0,987.00,22,'dividido');
insert into tb_pedido (id, tipopagamento, idcliente, dataentrada, dataembarque, desconto, valortotal, telefone, formapagmento) VALUES (3,'boleto',12,'2012/03/24', '2013/04/02',0.03,8765.00,33,'total');
insert into tb_pedido (id, tipopagamento, idcliente, dataentrada, dataembarque, desconto, valortotal, telefone, formapagmento) VALUES (4,'boleto',3,'2018/05/13', '2018/07/12',0.03,5436.00,44,'total');
insert into tb_pedido (id, tipopagamento, idcliente, dataentrada, dataembarque, desconto, valortotal, telefone, formapagmento) VALUES (5,'cartão',5,'2016/06/11', '2017/08/21',0,5414.01,55,'dividido');
insert into tb_pedido (id, tipopagamento, idcliente, dataentrada, dataembarque, desconto, valortotal, telefone, formapagmento) VALUES (6,'cartão',3,'2018/09/16', '2018/10/24',0,8761.05,66,'vencimento');
insert into tb_pedido (id, tipopagamento, idcliente, dataentrada, dataembarque, desconto, valortotal, telefone, formapagmento) VALUES (7,'cartão',6,'2015/04/29', '2016/05/02',0,651.98,77,'vencimento');
insert into tb_pedido (id, tipopagamento, idcliente, dataentrada, dataembarque, desconto, valortotal, telefone, formapagmento) VALUES (8,'à vista',3,'2018/10/21', '2018/10/28',0.05,6700.87,88,'cash');
insert into tb_pedido (id, tipopagamento, idcliente, dataentrada, dataembarque, desconto, valortotal, telefone, formapagmento) VALUES (9,'cartão',4,'2014/11/21', '2015/12/23',0,6529.65,99,'dividido');
insert into tb_item_pedido (codigoproduto, idpedido, quantidade) VALUES (3,1,5);
insert into tb_item_pedido (codigoproduto, idpedido, quantidade) VALUES (4,2,12);
insert into tb_item_pedido (codigoproduto, idpedido, quantidade) VALUES (5,4,10);
insert into tb_item_pedido (codigoproduto, idpedido, quantidade) VALUES (12,5,4);
insert into tb_item_pedido (codigoproduto, idpedido, quantidade) VALUES (14,8,5);
insert into tb_item_pedido (codigoproduto, idpedido, quantidade) VALUES (12,6,17);
insert into tb_item_pedido (codigoproduto, idpedido, quantidade) VALUES (10,2,22);
