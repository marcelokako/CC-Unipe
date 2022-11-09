<?php

function soma($array){
    $acumulador = 0;
    for ($i = 0; $i < count($array); $i++){
        $acumulador += $array[$i];
    }
    return $acumulador;
}

function media($array){
    $acumulador = 0;
    for ($i = 0; $i < count($array); $i++){
        $acumulador += $array[$i];
    }
    return $acumulador/count($array);
}

function maior($array){
    $maior = $array[0];
    for ($i = 0; $i < count($array); $i++){
        if ($array[$i] > $maior){
            $maior = $array[$i];
        }
    }
    return $maior;
}

function imc(float $peso, float $altura){
    $imc = $peso/($altura*$altura);
    return $imc;
}

function subtracao($array){
    $acumulador = $array[0];
    for ($i = 1; $i < count($array); $i++){
        $acumulador -= $array[$i];
    }
    return $acumulador;
}

function multiplicacao($array){
    $acumulador = 1;
    for ($i = 0; $i < count($array); $i++){
        $acumulador *= $array[$i];
    }
    return $acumulador;
}

function divisao(float $n1, float $n2){
    if ($n2 == 0){
        return false;
    }else{
        return $n1/$n2;
    }
}

?>
