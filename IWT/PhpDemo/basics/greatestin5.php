<?php

$num = intval($_POST["number"]);
if(strlen($num) ==5){
    $x = intval($num%10);
    $num/=10;
    $y = intval($num%10);
    $num/=10;
    $z = intval($num%10);
    $num/=10;
    $a = intval($num%10);
    $num/=10;
    $b = intval($num%10);
    
    $max= $x;
  
    if ($x >= $y && $x >= $z && $x >=$a && $x >=$b)
      $max = $x;
    if ($y >= $x && $y >= $z && $y>=$a && $y >=$b)
      $max = $y;
    if ($z >= $x && $z >= $y &&  $z>=$a && $z >=$b)
      $max = $z;
    if ($a >= $x && $a >= $y &&  $a>=$z && $a >=$b)
    $max = $a;
    if ($b >= $x && $b >= $y &&  $b>=$a && $b >=$z)
    $max = $b;
    
    
    echo "Largest number among $x, $y, $z,$a and $b is: $max\n";

}else{
    echo "Please enter a 5 digit number.";
}