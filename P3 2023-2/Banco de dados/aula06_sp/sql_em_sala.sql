DELIMITER $$
CREATE PROCEDURE sp_livros()
BEGIN 
SELECT * FROM livro;
END $$

CALL sp_livros();
-- ---------------------------------------------------
DELIMITER $$
CREATE PROCEDURE sp_assunto_aula()
BEGIN 
SELECT 'Esta é uma aula e Banco de Dados' AS Mensagem;
END $$

CALL sp_assunto_aula();
-- ---------------------------------------------------
DELIMITER $$
CREATE PROCEDURE sp_cadastrar_assunto(IN p_sigla VARCHAR(2),IN p_nome VARCHAR(50))
BEGIN 
INSERT INTO assunto(sigla, nome) VALUES(p_sigla, p_nome);
END $$

CALL sp_cadastrar_assunto('DD', 'Direito Digital');
-- ---------------------------------------------------
DELIMITER $$
CREATE PROCEDURE sp_consulta_editora(p_editora VARCHAR(20))
BEGIN 
SELECT livro.codigo, livro.titulo, livro.valor, livro.ano 
FROM livro, editora
WHERE editora.codigo = livro.editora
AND editora.nome = p_editora;
END $$

CALL sp_consulta_editora('Pearson');
-- ---------------------------------------------------
DELIMITER $$
CREATE PROCEDURE sp_consulta_titulo(IN p_titulo VARCHAR(50))
BEGIN 
SELECT livro.titulo, livro.valor, livro.ano FROM livro
WHERE livro.titulo LIKE p_titulo;
END $$

CALL sp_consulta_titulo('Java');
-- ---------------------------------------------------
DELIMITER $$
CREATE PROCEDURE sp_consulta_tudo()
BEGIN 
SELECT editora.nome as editora, assunto.nome, livro.titulo, livro.valor, livro.ano
FROM editora
    LEFT JOIN livro ON livro.editora = editora.codigo
	LEFT JOIN assunto ON assunto.sigla = livro.assunto;
END $$

CALL sp_consulta_tudo();
-- ---------------------------------------------------
DELIMITER $$
CREATE PROCEDURE sp_consulta_editora2(IN p_editora VARCHAR(20))
BEGIN 
SELECT editora.nome as editora, assunto.nome as assunto, livro.titulo, livro.valor, livro.ano
FROM editora, assunto, livro
WHERE editora.codigo = livro.editora
	AND assunto.sigla = livro.assunto
    AND editora.nome = p_editora;
END $$

CALL sp_consulta_editora2('Saraiva');
-- ---------------------------------------------------
DELIMITER $$
CREATE PROCEDURE sp_exercicio1()
BEGIN 
UPDATE livro SET livro.valor = livro.valor * 1.1
WHERE livro.valor > 10;
END $$
-- DROP PROCEDURE sp_exercicio1;
CALL sp_exercicio1();
