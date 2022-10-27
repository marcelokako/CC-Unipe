<?php
    //  Funções


    //  Declaração da função
    function br($linhas){
        for ($i = 0; $i < $linhas; $i++){
            echo "<br>";
        }

    } //    Fim da declaração

    //  Chamando as minhas funções de outro arquivo
    include "import_funcoes_import.php"; // arquivo onde está a função tionfunct - DEVE ESTAR NA MESMA PASTA

    //  Execução 
    echo "ola mundo meu nome é ";
    br(7);  //  ESTA FUNÇÃO ESTÁ NESTE ARQUIVO

    tionfunct("ABCDEFGHIJKLMNOPQRSTUVWXYZ"); // ESTA FUNÇÃO ESTÁ SENDO CHAMADA
    
?>