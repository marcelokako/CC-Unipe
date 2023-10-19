CREATE DATABASE aula_exemplo;

USE aula_exemplo;

CREATE TABLE curso (
	id int auto_increment,
    nome varchar(100),
    CONSTRAINT pk_curso primary key (id)
	);

CREATE TABLE aluno (
	matricula int auto_increment,
    nome varchar(100),
    curso int,
    CONSTRAINT pk_aluno primary key (matricula),
    CONSTRAINT fk_curso foreign key (curso) REFERENCES curso(id)
);

INSERT INTO curso (nome) VALUES ('Ciência da Computação');
INSERT INTO curso (nome) VALUES ('Sistemas para Internet');
INSERT INTO curso (nome) VALUES ('Análise e Desenvolvimento de Sistemas');

INSERT INTO aluno VALUES (null, 'Miguel', 1);
INSERT INTO aluno VALUES (null, 'Malu', 2);
INSERT INTO aluno VALUES (null, 'Manoel', 3);
INSERT INTO aluno VALUES (null, 'Alice', 1);

SHOW TABLES;

CREATE VIEW v_alunos_cc AS (
SELECT aluno.nome
FROM aluno INNER JOIN curso ON curso.id = aluno.curso
WHERE curso.id = 1
);

SELECT * FROM v_alunos_cc;

ALTER VIEW v_alunos_cc AS (
SELECT aluno.nome
FROM aluno INNER JOIN curso ON curso.id = aluno.curso
WHERE curso.id = 2
);

SELECT * FROM v_alunos_cc;

RENAME TABLE v_alunos_cc TO v_alunos_spi;

SHOW TABLES;

SHOW FULL TABLES;
