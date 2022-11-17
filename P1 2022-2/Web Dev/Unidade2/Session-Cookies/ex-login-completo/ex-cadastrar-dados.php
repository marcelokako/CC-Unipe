<?php
session_start();
if (!isset($_SESSION["email"])) { //se nao existir a sessao no email, enviar para tela de login
    $_SESSION["erro"] = "Error: Realize o login";
    header("Location: ex-login.php");
} else {
    echo "login realizado com sucesso";
}
?>