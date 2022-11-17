<?php
    //  Cookie é um arquivo que é gerenciado pelo cliente

    //  setcookie(nome, valor, expira, path, domain);
    //  expira é sem segundos, utiliza-se (time()+tempo em segundos) para determinar.
    //  se não colocar um valor no tempo, ele dura indefinidamente, até que o usuário delete
    setcookie("nome", "João", time()+30);

?>