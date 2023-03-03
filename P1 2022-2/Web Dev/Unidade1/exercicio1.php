<?php

    define("mat", 1234567890);
    $nome = "Marcelo";
    $nota1 = 10;
    $nota2 = 9.0;
    // concatenação --> .
    echo "Nome: $nome, Matricula: " . mat . " <br> Nota 1:$nota1 <br> Nota 2: $nota2";
    
    // operadores aritmeticos
    $media = ($nota1 + $nota2)/2;
    echo "<br> Média: $media <br>";

    // operadores relacionais: além dos usuais temos === --> idêntico
    echo "<hr>";
    var_dump('3' == 3);
    var_dump('3' === 3);  
    echo "<hr>";

?>
