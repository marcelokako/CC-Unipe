<?php

    $nome_da_pessoa = $_GET["nome"];
    $deposito = (float) $_GET["deposito"];
    $juros = (float) $_GET["juros"];

    $rendimento = $deposito * $juros/100;
    $valorFinal = $rendimento + $deposito;

    echo "Olá $nome_da_pessoa, você rendeu $rendimento, seu saldo é: $valorFinal";

?>