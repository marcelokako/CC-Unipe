<?php
    //soma, media e notas acima de 7
    $notas = [10, 5, 6.5, 8.5, 9, 5.5, 4.5, 8, 7.5];
    $acumulador = 0;
    $aprovados = 0;

    foreach($notas as $valor){
        $acumulador += $valor;
        if ($valor >= 7){
            $aprovados += 1;
        }
    }
    $media = $acumulador / count($notas);

    echo "Soma: $acumulador<br>Media: $media<br>Qtde. alunos aprovados: $aprovados"
?>