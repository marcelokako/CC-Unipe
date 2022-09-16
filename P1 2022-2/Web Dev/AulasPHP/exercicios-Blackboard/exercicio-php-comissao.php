<?php

    $nome_da_pessoa = $_GET["nome"];
    $salario = (float) $_GET["salario"];
    $vendas = (float) $_GET["vendas"];

    $comissao = $vendas * 0.04;
    $valorFinal = $salario + $comissao;

    echo "Olá $nome_da_pessoa, sua comissao foi de R$ $comissao, seu salario final foi de R$ $valorFinal";

?>