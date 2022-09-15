<?php

    $nome_da_pessoa = $_POST["nome"];
    $peso = (float) $_POST["peso"];

    $novoPeso1 = $peso * 1.15;
    $novoPeso2 = $peso * 1.2;

    echo "Olá $nome_da_pessoa, seu novo peso será $novoPeso1 kg se engordar 15%, e $novoPeso2 kg se engordar 20%";

?>