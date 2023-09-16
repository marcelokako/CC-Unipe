-- Q13
SELECT 
	nome, sexo
FROM
	cliente
ORDER BY
	nome;
    
-- Q14
SELECT 
	SUM(saldo) AS Soma_saldo
FROM
	conta
GROUP BY
	num_agencia;
    
-- Q15
SELECT
	num_agencia, COUNT(*) AS qtd_contas
FROM
	conta
GROUP BY
	num_agencia;
    
-- Q16
SELECT 
	nome, endereco, historico.num_conta
FROM
	cliente
		JOIN historico ON historico.cpf_cliente = cliente.cpf;
        
-- Q17
SELECT
	sexo, COUNT(*) as qtd_por_sexo
FROM
	cliente
GROUP BY
	sexo;

-- Q18
SELECT
    cliente.nome

FROM
	conta
		JOIN historico ON historico.num_conta = conta.numero_conta
		JOIN cliente ON cliente.cpf = historico.cpf_cliente
WHERE
	saldo = (SELECT MAX(saldo) FROM conta);
    
-- Q19
SELECT 
	numero_conta,
    saldo,
    truncate(saldo*1.035, 2) AS novo_saldo,
    num_agencia
FROM
	conta;
    
-- Q20
SELECT
	nome
FROM
	cliente
WHERE
	endereco LIKE 'Av.%';