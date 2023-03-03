<!DOCTYPE html>
<html>

<head>
</head>

<body>
    <a href="session-consultar.php"> consultar </a>
</body>

</html>


<?php

    //  Session é um arquivo que é gerenciado pelo servidor
    session_start(); // serve para criar, consultar, fechar // criar ou consulta o ID único do cliente

    $_SESSION["nome"] = "João";
    $_SESSION["email"] = "joao@email.com";

    //session_destroy();// para acabar com a sessão
?>