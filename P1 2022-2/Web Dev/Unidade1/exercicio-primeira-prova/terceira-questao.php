<?php

    $codigo = (float) $_POST["codigo"];
    $qtde = (float) $_POST["qtde"];

    if ($codigo >= 1 && $codigo <= 10){
        $preco = 10;
    } elseif ($codigo <= 20){
        $preco = 15;
    } elseif ($codigo <= 30){
        $preco = 20;
    } elseif ($codigo <= 40){
        $preco = 30;
    }

    $conta = $preco * $qtde;

    if ($conta <= 250){
        $desconto = 5;
    } elseif ($conta < 500){
        $desconto = 10;
    } else {
        $desconto = 15;
    }

    $precoDescontado = $conta * $desconto/100;
    $precoFinal = $conta - $precoDescontado;

    echo '<table border = "solid">';

    echo "<tr>";
    echo '<th colspan = "2"> Dados da compra </th>';
    echo "</tr>";
    echo "<tr>";
    echo "<td> Preço unitário </td> <td> R$$preco </td>";
    echo "</tr>";
    echo "<tr>";
    echo "<td> Preço Total </td> <td> R$$conta </td>";
    echo "</tr>";
    echo "<tr>";
    echo "<td> Desconto ($desconto%) </td> <td> R$$precoDescontado </td>";
    echo "</tr>";
    echo "<tr>";
    echo "<td> Preço Final </td> <td> R$$precoFinal </td>";
    echo "</tr>";

    echo "</table>";
?>
