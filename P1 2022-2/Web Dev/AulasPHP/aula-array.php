<?php
    // array pode ser iniciada como $array = []
    // indices sao contados comecando pelo 0

    $medias = [10, 8, 7.5, 9, 8.5];
    //id -->   0   1  2    3  4

    for ($i = 0; $i <= sizeof($medias) - 1; $i++) {
        echo $medias[$i] . "<br>";
    }

?>
