<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista de Alunos</title>
</head>
<body>

        <?php

        include "imports.php";

        if (isset($_POST["nome"]) && isset($_POST["matricula"]) && isset($_POST["nota1"]) && isset($_POST["nota2"])){
            $nome = $_POST["nome"];
            $matricula = $_POST["matricula"];
            $nota1 = $_POST["nota1"];
            $nota2 = $_POST["nota2"];
            cadastrar($nome, $matricula, $nota1, $nota2);
        }
        
        criar_tabela();

        ?>

</body>
</html>
