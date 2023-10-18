-- Q1
SELECT 
	cliente.nome,
    telefone.numero as telefone,
    contrato.numero as numero_contrato,
    contrato.dataSaida,
    veiculo.placa,
    veiculo.modelo
FROM
	cliente
		LEFT JOIN telefone ON telefone.codigoCliente = cliente.codigo
		LEFT JOIN contrato ON contrato.codigoCliente = cliente.codigo
        LEFT JOIN veiculo ON veiculo.id = contrato.idVeiculo
ORDER BY
	contrato.dataSaida;
    
-- Q2
SELECT
	cidade.nome as cidade,
    cidade.anoFundacao,
    COUNT(veiculo.codFilial) AS total_veiculos
FROM 
	filial
		LEFT JOIN cidade ON cidade.codigo = filial.idCidade
		LEFT JOIN veiculo ON veiculo.codFilial = filial.codigo
GROUP BY
	cidade.codigo;
    
-- Q3
SELECT 
	cliente.nome as nome_cliente,
	contrato.numero as numero_contrato,
	veiculo.placa as placa_do_veiculo,
    veiculo.modelo as modelo_do_veiculo,
    contrato.dataSaida,
    contrato.dataDevolucao    
FROM
	cliente
		LEFT JOIN telefone ON telefone.codigoCliente = cliente.codigo
		LEFT JOIN contrato ON contrato.codigoCliente = cliente.codigo
        LEFT JOIN veiculo ON veiculo.id = contrato.idVeiculo
WHERE
	cliente.nome = 'Filomena'
    AND veiculo.placa = "MAB0002"
ORDER BY
	contrato.dataSaida;
    
-- Q4
SELECT
	filial.cidade as cidade,
    filial.rua,
    veiculo.placa,
    veiculo.modelo,
    veiculo.numPortas
FROM
	veiculo
		LEFT JOIN filial ON filial.codigo = veiculo.codFilial
        LEFT JOIN cidade ON cidade.codigo = filial.idCidade
WHERE
	cidade.populacao < 100000
    AND veiculo.numPortas = 4;

-- Q5
SELECT
    veiculo.modelo,
    COUNT(*) as QTD
FROM
	veiculo
		LEFT JOIN filial ON filial.codigo = veiculo.codFilial
        LEFT JOIN cidade ON cidade.codigo = filial.idCidade
WHERE
	cidade.populacao > 500000
    AND veiculo.valorDiaria > 100
GROUP BY
	veiculo.modelo;
    
-- Q6
SELECT
	veiculo.placa,
    veiculo.modelo,
    FORMAT(AVG(contrato.valorPago),2) as media_do_valor
FROM
	veiculo
		LEFT JOIN contrato ON contrato.idVeiculo = veiculo.id
GROUP BY 
	veiculo.id
ORDER BY
	AVG(contrato.valorPago) DESC;

-- Q7
SELECT
	veiculo.placa,
    veiculo.modelo,
    veiculo.valorDiaria
FROM
	veiculo
WHERE
	veiculo.valorDiaria = (SELECT MAX(veiculo.valorDiaria) FROM veiculo);
    
-- Q8
SELECT
    veiculo.modelo,
    veiculo.placa
FROM
	veiculo
WHERE
	veiculo.id NOT IN (SELECT distinct(contrato.idVeiculo) FROM contrato)





