<?php
/*
function soma($array){
    $acumulador = 0;
    for ($i = 0; $i < count($array); $i++){
        $acumulador += $array[$i];
    }
    return $acumulador;
}

function media($array){
    $acumulador = 0;
    for ($i = 0; $i < count($array); $i++){
        $acumulador += $array[$i];
    }
    return $acumulador/count($array);
}

function maior($array){
    $maior = $array[0];
    for ($i = 0; $i < count($array); $i++){
        if ($array[$i] > $maior){
            $maior = $array[$i];
        }
    }
    return $maior;
}
*/
include "lista2-imports.php";

$idades = [18, 21, 65, 32, 80, 44, 25, 52, 38];

echo "Soma: " . soma($idades);
echo "<br>";
echo "Media: " . media($idades);
echo "<br>";
echo "Maior: " . maior($idades);

?>