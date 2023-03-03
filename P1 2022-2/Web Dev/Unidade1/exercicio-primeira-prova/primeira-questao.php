<?php

    $salario = (float) $_POST["salario"];
    $opcao = $_POST["opcao"];

    if ($opcao == "op1"){
        // calculo do imposto
        if ($salario < 500){
            $imposto = 5;
        } elseif ($salario <= 850){
            $imposto = 10;
        } else {
            $imposto = 15;
        }

        echo "O imposto de $imposto% sobre o salário R$$salario foi de R$" . $imposto*$salario/100;

    } elseif ($opcao == "op2"){
        // calculo do novo salario
        if ($salario > 1500){
            $aumento = 25;
        } elseif ($salario >= 750){
            $aumento = 50;
        } elseif ($salario >= 450){
            $aumento = 75;
        } else {
            $aumento = 100;
        }

        echo "O salário de R$$salario recebeu um aumento de R$$aumento, o novo salário é: R$" . $salario + $aumento;

    } else {
        // classificacao
        if ($salario <= 700){
            echo "O salário de R$$salario é considerado Mal Remunerado";
        } else {
            echo "O salário de R$$salario é considerado Bem Remunerado";
        }

    }
    
?>