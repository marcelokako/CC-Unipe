DELIMITER $$
CREATE PROCEDURE sp_exercicio1()
BEGIN 
UPDATE livro SET livro.valor = livro.valor * 1.1
-- WHERE livro.valor > 10;
END $$
-- DROP PROCEDURE sp_exercicio1;
CALL sp_exercicio1();
