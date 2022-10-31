<?php

include "lista2-imports.php";

$peso = (float) $_GET["peso"];
$altura = (float) $_GET["altura"];

$imc = imc($peso, $altura);

echo "O imc calculado foi: $imc";

?>