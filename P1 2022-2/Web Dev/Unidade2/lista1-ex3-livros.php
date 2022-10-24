<?php
/* 
A partir do array declarado, implemente os seguintes algoritmos 
(para realizar as operações, usar a estrutura de repetição “foreach”):
    • Exiba ao nome do livro de maior preco
    • Exiba a soma de todas os precos
*/
    $livros = [ "Introdução a Linguagem C" => ["qtdePaginas"=>350, "preco"=>150],
                "Introdução a Linguagem Python" => ["qtdePaginas"=>300, "preco"=>99.50],
                "Entendendo PHP" => ["qtdePaginas"=>290, "preco"=>105.90],
                "Introdução ao SQL" => ["qtdePaginas"=>150, "preco"=>85.90]];
    $acumulador = 0;
    $precoMaisCaro = 0;

    foreach($livros as $titulo => $valor){
        $acumulador += $valor["preco"];
        if ($valor["preco"] > $precoMaisCaro){
            $livroMaisCaro = $titulo; 
            $precoMaisCaro = $valor["preco"];
         }
    }

    echo "<br>Soma: R$$acumulador<br>Livro mais caro: $livroMaisCaro => R$$precoMaisCaro";
?>