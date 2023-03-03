<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Listagem de Alunos</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>

<body>

    <!-- Cabeçalho -->
    <div style="text-align: center;">

        <h1>Escola Bílingue Papa Lorem Ipsum III <br></h1>
        <h4>Português e Latim</h2>
            <br>
            <br>

            <!-- Botão para trocar de página -->
            <form action="pagina-cadastro.html">
                <button>Cadastrar Aluno</button> | <button type="button" disabled>Listar Alunos</button>
            </form>
            <br>
            <br>


            <h2>Listar Alunos</h2>
            <br>
<?php

                include "imports.php";

                if (isset($_POST["nome"]) && isset($_POST["matricula"]) && isset($_POST["nota1"]) && isset($_POST["nota2"])) {
                    $nome = $_POST["nome"];
                    $matricula = $_POST["matricula"];
                    $nota1 = $_POST["nota1"];
                    $nota2 = $_POST["nota2"];
                    cadastrar($nome, $matricula, $nota1, $nota2);
                }

                criar_tabela();

?>
            <br><br>
            <hr>
            <p>Direitos Reservados: Marcelo Camilo Gomes, Marco Túlio S.M Duarte</p>
    </div>


</body>

</html>