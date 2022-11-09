<?php

include "lista2-imports.php";

$numero1 = (float) $_POST["num1"];
$numero2 = (float) $_POST["num2"];
$operacao = $_POST["calculo"];

switch ($_POST["calculo"]){
    case "soma":
        $resultado = soma([$numero1,$numero2]);
        break;
    case "subtracao":
        $resultado = subtracao([$numero1,$numero2]);
        break;
    case "multiplicacao":
        $resultado = multiplicacao([$numero1,$numero2]);
        break;
    case "divisao":
        $resultado = divisao($numero1, $numero2);
        break;
    default:
        $resultado = "ERRO";
}

if (resultado){
    echo "Operação: " . $_POST["calculo"] . "<br>Resultado: $resultado";
}
?>
