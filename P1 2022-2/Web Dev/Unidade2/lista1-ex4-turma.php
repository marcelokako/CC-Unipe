<?php
/* 
A partir do array declarado, implemente os seguintes algoritmos 
(para realizar as operações, usar a estrutura de repetição “foreach”)
    Exiba a média de cada aluno
    Exiba a média da turma
    Exiba a quantidade de alunos que passou por média.
    Exiba o nome do aluno que possui a maior média
*/
    $turma = [  "A" => [10,8,6],
                "B" => [5,3,8],
                "C" => [10,10,10],
                "D" => [8,6,3],
                "E" => [9,9,9],
                "F" => [2,3,5]];
    $acumuladorTurma = 0;
    $melhorNota = 0;

    foreach($turma as $aluno => $valor){
        for($i = 0; $i < count($valor); $i++){

            $acumuladorTurma += $valor[$i];
            $acumuladorAluno += $valor[$i];
            if ($preco > $precoMaisCaro){
                $livroMaisCaro = $titulo; 
                $precoMaisCaro = $preco;
            }
        
        }
    }

    echo "<br>Soma: $acumulador<br>Livro mais caro: $livroMaisCaro R$$precoMaisCaro";
?>