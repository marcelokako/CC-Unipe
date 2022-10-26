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
    $contadorAprovados = 0;

    foreach($turma as $aluno => $nota){
        $acumuladorAluno = 0;  
        for($i = 0; $i < count($nota); $i++){

            $acumuladorAluno += $nota[$i];
         
            if ($nota[$i] > $melhorNota){
                $alunoMelhorNota = $aluno; 
                $melhorNota = $nota[$i];
            }
            
        }
        echo "Aluno: $aluno | Média: " . $acumuladorAluno/count($nota) . "<br>";
        $acumuladorTurma += $acumuladorAluno;
        if ($acumuladorAluno/count($nota) >= 7){
            $contadorAprovados++;
        }
    }

    echo "<br>Média da turma: " . $acumuladorTurma/(count($turma)*count($nota));
    echo "<br>Qtde de alunos aprovados: $contadorAprovados";
    echo "<br>Aluno com a melhor nota: $alunoMelhorNota ($melhorNota)";
