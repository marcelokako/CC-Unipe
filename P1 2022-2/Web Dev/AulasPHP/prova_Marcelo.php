<?php

  $codigo = 1; //$_POST["codigo"];

  $salario = 1000; //(float) $_POST["salario"];

  define("marcelo",2);
/*
Complemente o código PHP acima, com a lógica de exibir o cargo, 
o aumento e o novo salário de um funcionário de acordo com os dados de entrada e a tabela abaixo:
*/
if ($codigo == 1){
    $cargo = "Escrituário";
    $aumento = 50;
} else if ($codigo == 2){
    $cargo = "Secretário";
    $aumento = 35;
} else if ($codigo == 3){
    $cargo = "Caixa";
    $aumento = 20;
} else if (($codigo == 4)) {
    $cargo = "Gerente";
    $aumento = 10;
} else if (($codigo == 5)) {
    $cargo = "Diretor";
    $aumento = 0;
} else {
    $cargo = "invalido";
    $aumento = 0;
}

$valorAumento = $salario * $aumento/100;
$novoSalario = $salario + $valorAumento;

echo "Cargo: $cargo<br>Aumento ($aumento%): R$$valorAumento<br>Novo Salário: R$$novoSalario";
echo marcelo
?>