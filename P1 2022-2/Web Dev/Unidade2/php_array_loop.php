<?php

    $idades = [80, 25, 30, 21, 45, 55];
    $acumulador = 0;
    $contador = 0;
    $contador30anos = 0;
    $maiorIdade = $idades[0];
    $indiceMaiorIdade = 0;
    $menorIdade = $idades[0];
    $indiceMenorIdade = 0;

    for ($i=0; $i < count($idades); $i++){
        echo $i+1 . "º idade: $idades[$i] <br>";

        if ($idades[$i] <= 30){
            $contador30anos++;
        }

        if ($idades[$i] < $menorIdade){
            $menorIdade = $idades[$i];
            $indiceMenorIdade = $i;
        }

        if ($idades[$i] > $maiorIdade){
            $maiorIdade = $idades[$i];
            $indiceMaiorIdade = $i;    
        }

        $acumulador += $idades[$i];
        $contador++;
    }

    echo "<br>Média de idades é igual a " . $acumulador/$contador;
    echo "<br>Quantidade de pessoas com menos de 30 anos: $contador30anos";
    echo "<br>Menor idade (" . $indiceMenorIdade+1 . "º): $menorIdade<br>Maior idade (" . $indiceMaiorIdade + 1 . "º): $maiorIdade";
?>
