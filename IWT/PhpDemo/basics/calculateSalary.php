<?php

/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$bs = $_POST["salary"];
if(is_numeric($bs))
{
        print "The Basic salary u enetered is ". $bs;
        $da = ($bs * 40)/100;
        $hra = ($bs * 20)/100;
        $gs = $bs + $hra + $da;

echo "<br/>" ;
        echo "Gross Salary is ".$gs;
     
}else{
    print "Wrong Input";
}
?>
