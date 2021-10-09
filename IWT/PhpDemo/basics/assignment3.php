<?php

$a = $_POST["a"];
$b = $_POST["b"];
if(is_numeric($a)and is_numeric($b)){

$c =$a+$b;
echo "Numeric Data added : ans : ".$c;
}
else{
    echo "String data concatenated ans : ".$a.$b;
}

