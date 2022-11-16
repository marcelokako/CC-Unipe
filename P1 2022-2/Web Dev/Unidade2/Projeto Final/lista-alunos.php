<?php
function cadastrar($nome, $matricula, float $nota1, float $nota2){

    $media = ($nota1 + $nota2) / 2;
    $arquivo = fopen("alunos.txt", 'a');
    $texto = [$nome, $matricula, $nota1, $nota2, $media];
    foreach ($texto as $item){
        fwrite($arquivo, $item);
        fwrite($arquivo, '|');
    }
    fwrite($arquivo, "\n");
    fclose($arquivo);
    
    return 0;
}
?>

<!--
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista de Alunos</title>
</head>
<body>
    <fieldset>
        <?php
        $nome = $_POST["nome"];
        $matricula = $_POST["matricula"];
        $nota1 = $_POST["nota1"];
        $nota2 = $_POST["nota2"];
        
        echo "hello world1";

        cadastrar($nome,$matricula,$nota1,$nota2);
        ?>
    </fieldset>

</body>
</html>
-->
