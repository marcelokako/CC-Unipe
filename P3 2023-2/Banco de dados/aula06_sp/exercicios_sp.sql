DELIMITER $$
CREATE PROCEDURE sp_exercicio1()
BEGIN 
UPDATE livro SET livro.valor = livro.valor * 1.1;
END $$

CALL sp_exercicio1();
-- ---------------------------------------
DELIMITER $$
CREATE PROCEDURE sp_exercicio2()
BEGIN 
UPDATE livro SET livro.valor = livro.valor * 1.05
WHERE livro.editora = 4;
END $$

CALL sp_exercicio2();
-- ---------------------------------------
DELIMITER $$
CREATE PROCEDURE sp_exercicio3()
BEGIN 
SELECT 
	livro.titulo,
    livro.ano,
    editora.nome,
    assunto.nome
FROM livro
	INNER JOIN editora ON editora.codigo = livro.editora
    INNER JOIN assunto ON assunto.sigla = livro.assunto;
END $$

CALL sp_exercicio3();
