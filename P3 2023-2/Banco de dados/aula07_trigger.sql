CREATE TABLE Produtos
(
	Referencia 	VARCHAR(3) PRIMARY KEY,
	Descricao 	VARCHAR(50) UNIQUE,
    Estoque 	INT NOT NULL DEFAULT 0
);

INSERT INTO Produtos VALUES ('001', 'Feijão', 10);
INSERT INTO Produtos VALUES ('002', 'Arroz', 5);
INSERT INTO Produtos VALUES ('003', 'Farinha', 15);

CREATE TABLE itens_venda
(
Venda 		INT,
Produto		VARCHAR(3),
Quantidade 	INT
);

DELIMITER $$
CREATE TRIGGER tgr_itens_venda_insert AFTER INSERT
ON itens_venda
FOR EACH ROW
BEGIN
	UPDATE Produtos SET Estoque = Estoque - NEW.Quantidade
WHERE Referencia = New.Produto;
END $$

CREATE TRIGGER tgr_itens_venda_delete AFTER DELETE
ON itens_venda
FOR EACH ROW
BEGIN
	UPDATE Produtos SET Estoque = Estoque + OLD.Quantidade
WHERE Referencia = OLD.Produto;
END $$

DELIMITER ;

INSERT INTO itens_venda VALUES (1, '001', 3);
INSERT INTO itens_venda VALUES (1, '002', 1);
INSERT INTO itens_venda VALUES (1, '003', 5);

-- SET SQL_SAFE_UPDATES = 0;
DELETE FROM itens_venda WHERE Venda = 1 AND Produto = '001';

SHOW TRIGGERS;

DROP TRIGGER tgr_itens_venda_delete;
