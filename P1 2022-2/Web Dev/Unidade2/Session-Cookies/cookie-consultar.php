<?php

    echo "Resgatando cookie<br>";
    //variável isset retorna se a variavel existe
    if (isset($_COOKIE["nome"])){
        $nome = $_COOKIE["nome"];
        echo "$nome";
    }else{
        echo "esse cookie não foi definido";
    }

?>