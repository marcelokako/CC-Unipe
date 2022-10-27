<?php
    function tionfunct($string){
        for ($i = 1; $i <= strlen($string);$i++){
            echo $string[strlen($string)-$i];
        }
    }
?>