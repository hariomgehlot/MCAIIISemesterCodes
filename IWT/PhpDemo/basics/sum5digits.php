<?php

$num = intval($_POST["number"]);
if(strlen($num) ==5){
    $digit1 = intval($num%10);
    $num/=10;
    $digit2 = intval($num%10);
    $num/=10;
    $digit3 = intval($num%10);
    $num/=10;
    $digit4 = intval($num%10);
    $num/=10;
    $digit5 = intval($num%10);
    
$ans =strval($digit1);
echo "Reverse is  $ans";

}else{
    echo "Please enter a 5 digit number.";
}

