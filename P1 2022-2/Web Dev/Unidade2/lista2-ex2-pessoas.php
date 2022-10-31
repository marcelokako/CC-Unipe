<?php
/*
media das idades
soma dos pesos
imc de cada pessoa
nome de quem tem peso ideal
*/
include "lista2-imports.php";

$pessoas = 
    ["Ana" => ["idade"=>50,"peso"=>100 ,"altura"=>1.85],
    "Maria" => ["idade"=>25,"peso"=>65 ,"altura"=>1.60],
    "Pedro" => ["idade"=>32,"peso"=>110 ,"altura"=>1.98],
    "Joana" => ["idade"=>20,"peso"=>120 ,"altura"=>1.80],
    "João" => ["idade"=>65,"peso"=>62 ,"altura"=>1.70],
    "Paulo" => ["idade"=>28,"peso"=>95 ,"altura"=>1.90]];
    
$i = 0;
foreach ($pessoas as $nome => $info){
    $idades[$i] = $info["idade"];
    $pesos[$i] = $info["peso"];
    $alturas[$i] = $info["altura"];
    $imcs[$i] = imc($info["peso"], $info["altura"]);
    echo "IMC de $nome: " . $imcs[$i];
    if ($imcs[$i] < 24.9 && $imcs > 18.6){
        echo " (IDEAL)";
    }
    echo "<br>";
    $i++;
}
echo "Media das idades: " . media($idades);
echo "<br>";

echo "Soma dos pesos: " . soma($pesos);
echo "<br>";

?>