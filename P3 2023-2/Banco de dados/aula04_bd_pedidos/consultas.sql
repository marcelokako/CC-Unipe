-- Criação do DB está no blackboard dia 14/09/2023
USE aula_bd_sql;

-- SELECT lista_colunas FROM tabela WHERE filtros;
SELECT * FROM tB_cliente;	
SELECT nome, telefone, cpf FROM tb_cliente;
SELECT 
	nome AS Nome_da_pessoa,
	sexo AS Gênero,
	salario AS 'Salário Mensal'
FROM 
	tb_vendedor 
WHERE 	
	sexo = 'M'
ORDER BY 
	salario;

SELECT codigo, nome, 'LTDA' AS tipo_empresa
FROM tb_fabricante;

SELECT uf
FROM tb_cliente
GROUP BY
uf;
-- é igual a:
SELECT DISTINCT(uf) FROM tb_cliente;

SELECT nome, bairro, uf 
FROM tb_cliente
WHERE sexo = 'F';

SELECT nome, salario, TRUNCATE(salario*1.35, 2) AS novo_salario
FROM tb_vendedor;

SELECT *, IF(salario > 1000,'R','P') as tipo_conta
FROM tb_vendedor
ORDER BY nome DESC;

SELECT nome, codigo, preco
FROM tb_produto
WHERE 
	nome = 'Laptop'
	OR nome = 'Monitor'
    OR nome = 'Mouse';
    
SELECT nome, codigo, preco
FROM tb_produto
WHERE nome IN ('Laptop', 'Monitor', 'Mouse');

SELECT nome, bairro, uf, telefone 
FROM tb_cliente
WHERE 
	nome LIKE 'm%' 
	OR nome LIKE '%a'; -- Porcentagem é curinga de vários caracteres

SELECT nome, bairro, uf, telefone 
FROM tb_cliente
WHERE nome LIKE 'a_%ro%e'; -- Underline é curinga de só 1 caracter

INSERT INTO tb_vendedor (nome, salario) VALUES
('Zezim Pracista', 1568.55),
('Amaralindo Silva', 1465.23);

SELECT nome FROM tb_vendedor WHERE telefone IS NULL;
SELECT nome FROM tb_vendedor WHERE sexo IS NOT NULL; -- NOT PODE SER USADO EM VÁRIAS SINTAXES

SELECT tipopagamento, telefone, valortotal
FROM tb_pedido
WHERE valortotal BETWEEN 5414.01 AND 6700.87; -- Igual a valortotal >= 5000 and valortotal <=8000;

SELECT tipopagamento, telefone, valortotal, date_format(dataentrada, '%d/%m/%Y') as data_entrada
FROM tb_pedido
WHERE DAY(dataentrada) BETWEEN '15' AND '25'; 

select count(*) from tb_vendedor;
select max(salario) from tb_vendedor;
select avg(salario) from tb_vendedor;
