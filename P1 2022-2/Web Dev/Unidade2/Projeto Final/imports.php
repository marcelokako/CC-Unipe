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

}
function criar_tabela()
{
    $arquivo = file("alunos.txt");
    
    $dadosAluno =  ["nome" => "", "matricula" => "", "nota1" => "", "nota2" => "", "media" => ""];
        foreach ($arquivo as $linha_num => $conteudo) {
            
            foreach($dadosAluno as $coluna => $valor){

              }

            }
    

}
?>
