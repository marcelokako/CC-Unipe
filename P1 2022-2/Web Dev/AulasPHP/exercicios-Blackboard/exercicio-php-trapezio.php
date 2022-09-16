<?php

    $base1 = $_REQUEST["base1"]; 
    $base2 = $_REQUEST["base2"]; 
    $altura = $_REQUEST["altura"];
    
    $area = (($base1 + $base2)*$altura)/2;

    echo "A área do trapézio é: $area";

?>