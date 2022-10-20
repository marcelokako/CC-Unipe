<?php

    $pessoas = [
        111 => [
            "nome" => "Maria",
            "nota1" => 5,
            "nota2" => 10],
        222 => [
            "nome" => "Pedro",
            "nota1" => 7,
            "nota2" => 4]
        ];

    foreach($pessoas as $chave => $valor){
        print_r($valor);
        echo "<br>";
        echo "Chave: $chave <br>";
        $media = ($valor["nota1"] + $valor["nota2"])/2;
        echo "Média: $media<br>";
    }

?>
