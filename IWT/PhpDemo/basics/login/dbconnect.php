<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "mydb";

// Create connection
$conn= new mysqli($servername,$username,$password,$dbname);
// Check connection
if (!$conn) {
  die("Connection failed: " . $conn->error);
}else{
echo "Connected Successfully.<br><br>";
}
