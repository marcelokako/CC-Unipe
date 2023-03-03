<!DOCTYPE html>
<html>

<head>
</head>

<body>
    <a href="aula-session.php"> voltar </a>
</body>

</html>

<?php

session_start();

if (isset($_SESSION["nome"]) && isset($_SESSION["email"])) {
    echo "Nome: $_SESSION[nome]<br>";
    echo "e-mail: $_SESSION[email]";
} else {
    echo "Sessão ainda não foi criada";
}

?>