<?php

$nome = $_GET["nome"];
$peso = (float)$_GET["peso"];
$altura = (float)$_GET["altura"];

$IMC = $peso / ($altura * $altura);

if ($IMC < 18.5){
    $msg = "abaixo do peso";
} elseif ($IMC <= 24.9){
    $msg = "Peso ideal (Parabéns)";
} elseif ($IMC <= 29.9){
    $msg = "Levemente acima do peso";
} elseif ($IMC <= 34.9){
    $msg = "Obesidade grau I";
} elseif ($IMC <= 39.9){
    $msg = "Obesidade grau II (severa)";
} else {
    $msg = "Obesidade grau III (mórbida)";
}

echo "Nome: $nome <br> IMC: $IMC <br> $msg";
?>