<?php
function cadastrar($nome, $matricula, float $nota1, float $nota2)
{
    $media = ($nota1 + $nota2) / 2;
    $arquivo = fopen("alunos.txt", 'a');
    $texto = ["nome" => $nome, "matricula" => $matricula, "nota1" => $nota1, "nota2" => $nota2, "media" => $media];
    foreach ($texto as $item) {
        fwrite($arquivo, $item);
        fwrite($arquivo, '|');
    }
    fwrite($arquivo, "\n");
    fclose($arquivo);

    return 0;
}

function criar_tabela(){
    $arquivo = fopen("alunos.txt",'r');
    $linha =  ["nome" => "", "matricula" => "", "nota1" => "", "nota2" => "", "media" => ""];
    while(feof("alunos.txt")){
        foreach ($linha as $coluna){

        }
    }

}
?>