<?php
include_once("dbconnect.php");
$username = $_POST["uname"];
$password = $_POST["pass"];



echo "username is ".$username."<br>";
echo "password is ".$password."<br>";

$sql = "Select * from user_pass WHERE uname='$username' and password ='$password' ;";
$res = $conn->query($sql);
if(!$res){
    echo "Invalid Username or Password ".$conn->error;
    echo "<br>";
}else{
    echo "Logged in successfully!";
}
