<?php

    $nome_da_pessoa = $_POST["nome"];
    $salario = (float) $_POST["salario"];

    $aumento = $salario * 1.25;

    echo "Olá $nome_da_pessoa, seu novo salário é $aumento";

?>