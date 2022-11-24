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
    echo '<table border = "solid">';
    echo "<tr>";
    echo "<th colspan=6> Lista de alunos </th>";
    echo "<tr><td><b>ID</b></td><td><b>Nome</b></td><td><b>Matrícula</b></td><td><b>Nota 1</b></td><td><b>Nota 2</b></td><td><b>Média</b></td></tr>";
    $arquivo = file("alunos.txt");

    foreach ($arquivo as $linha_num => $conteudo) {
        $dadosAluno = ["ID"=>"", "nome" => "", "matricula" => "", "nota1" => "", "nota2" => "", "media" => ""];
        $i = 0;
        echo "<tr>";
        foreach ($dadosAluno as $chave => $colunas) {
            if ($chave == "ID"){
                echo "<td>" . $linha_num+1 . "</td>";
                continue;
            }
            for ($i; $i < strlen($conteudo); $i++) {
                if ($conteudo[$i] != '|') {
                    $colunas = $colunas . $conteudo[$i];
                } else {
                    $i++;
                    break;
                }
            }
            echo "<td> $colunas </td>";
        }
        echo "<tr>";

    }
    echo "</table>";
}
?>
