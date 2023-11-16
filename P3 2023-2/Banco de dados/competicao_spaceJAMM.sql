CREATE TABLE `DEPENDENTE` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) DEFAULT NULL,
  `CodCliente` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  FOREIGN KEY (`CodCliente`) REFERENCES `cliente` (`codigo`));
  
  DELIMITER $$
  CREATE procedure sp_insert_dependente(in p_nome varchar(50), in p_codcliente int)
  BEGIN
  INSERT INTO DEPENDENTE(nome,CodCliente) values (p_nome, p_codcliente);
  END $$
  
 -- CALL sp_insert_dependente('Marcelo', 11);
  
  -- Fazer uma script SQL para fazer uma consulta com a PLACA, MODELO do veículo, o VALORPAGO do contrato, 
  -- o NOME E CIDADE do cliente para os VEICULOS com o ANO entre 2010 à 2018 e ordene pela UF dos clientes de forma descendente.
  DELIMITER ;
  SELECT 
	veiculo.placa,
    veiculo.modelo,
    contrato.valorPago,
    cidade.nome
	FROM 
		veiculo
			LEFT JOIN filial ON veiculo.codFilial = filial.codigo
            LEFT JOIN cidade ON filial.idCidade = cidade.codigo
            LEFT JOIN contrato ON contrato.idVeiculo = veiculo.id
    WHERE
		veiculo.ano < 2018
        AND veiculo.ano > 2000
    ORDER BY
		cidade.uf DESC;
        
-- Fazer uma script SQL para fazer uma consulta com a quantidade de clientes para cada UF, 
-- porém apenas para aqueles clientes que são do Nordeste (BA, SE, PE, PB, CE, PI)
SELECT
	count(*) AS quantidade
    FROM
		cliente
	WHERE
		cliente.uf IN ('BA', 'SE', 'PE', 'PB', 'CE', 'PI')
	GROUP BY
		cliente.uf;
        
-- Fazer uma script SQL para criar uma VIEW com os seguintes dados: NOME DA CIDADE, BAIRRO DA FILIAL, PLACA, MODELO, 
-- ANO DO VEÍCULO cujo o VALORDADIARIA seja menor do que R$ 120,00 e sejam das marcas Hyundai, Honda e Fiat     
CREATE VIEW v_sol5 AS (
SELECT 
	cidade.nome,
    filial.bairro,
    veiculo.placa,
    veiculo.modelo,
    veiculo.ano
    FROM 
		veiculo
			LEFT JOIN filial ON filial.codigo = veiculo.codFilial
            LEFT JOIN cidade ON cidade.codigo = filial.idCidade
	WHERE 
		veiculo.valorDiaria < 120
        AND veiculo.marca IN ('Hyundai', 'Honda', 'Fiat'));

SELECT * FROM v_sol5;

-- Fazer uma script SQL para fazer uma consulta da PLACA e MODELO do veículo que possuem o menor VALORDIARIA . 

SELECT
	veiculo.placa,
    veiculo.modelo
    from veiculo
    where veiculo.valorDiaria = (select min(veiculo.valorDiaria) from veiculo);

-- Fazer uma script SQL para criar um PROCEDIMENTO ARMAZENADO para consultar a PLACA, MODELO, MARCA dos 
-- veículos quando o usuário fornecer o ano do veículo como parâmetro de entrada para consulta.
DELIMITER $$
  CREATE procedure sp_search_ano(in p_ano int)
  BEGIN
	SELECT
		veiculo.placa,
		veiculo.modelo,
        veiculo.marca
	FROM veiculo
    WHERE veiculo.ano = p_ano;
  END $$
  
DELIMITER ;
call sp_search_ano(2015);

-- Fazer uma script SQL para fazer uma consulta que retorne o NOME, CPF do cliente, o VALORDARESERVA do contrato, 
-- o MODELO, MARCA e ANO do veículo, a RUA, BAIRRO,
--  CEP da filial para aqueles veículos entre os anos de 2015 à 2020 e a MULTA do contrato sejam maior ou igual à R$ 250,00. 
SELECT 
	cliente.nome,
    cliente.CPF,
    contrato.valorReserva,
    veiculo.modelo,
    veiculo.marca,
    veiculo.ano,
    filial.rua,
    filial.bairro,
    filial.CEP
    FROM
		contrato
			LEFT JOIN cliente ON cliente.codigo = contrato.codigoCliente
			left join veiculo on veiculo.id = contrato.idVeiculo
            left join filial on filial.codigo = veiculo.codFilial
	WHERE
		veiculo.ano <= 2020
        AND veiculo.ano >= 2015
        AND contrato.multa >= 30;
        
-- Fazer uma script SQL para atualizar os VALORDIARIA do Veículo em 12%, para aqueles veículo que são das marcas 
-- HONDA, TOYOTA E JEEP e possuam NUMPORTAS superior a 2.
UPDATE veiculo set veiculo.valorDiaria = veiculo.valorDiaria * 1.12 WHERE veiculo.marca IN ('HONDA', 'TOYOTA', 'JEEP') AND veiculo.numPortas > 2;
