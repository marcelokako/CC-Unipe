<?php
/*
No array associativo acima, a chave é o nome de uma pessoa e o valor é a idade. 
A partir do array declarado, implemente os seguintes algoritmos 
(para realizar as operações, usar a estrutura de repetição “foreach”):
    • Exiba ao nome de todas as pessoas
    • Exiba a soma de todas as idades
    • Exiba a média das idades*/
    $pessoas = ["João" => 35,
                "Maria" => 40,
                "Pedro" => 88,
                "José" => 55];
    $acumulador = 0;
    $aprovados = 0;

    foreach($pessoas as $nome => $idades){
        $acumulador += $idades;
        echo "Nome: $nome<br>";
    }

    $media = $acumulador / count($pessoas);

    echo "<br>Soma: $acumulador<br>Media: $media"
?>