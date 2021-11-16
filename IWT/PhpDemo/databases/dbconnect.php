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
echo "Connected Successfully.<br>";
}


//create a table


$sql = "Create table user_pass(uname VARCHAR(30) NOT NULL ,password VARCHAR(30) NOT NULL );";
$result = $conn->query($sql);
if(!$result){
    echo "Error in creating table!" .$conn->error;
    echo "<br>";
}else{
    echo "Table created successfully!";
}

// insert data

$sql2 = "INSERT INTO user_pass values('hariom','01001')";
$result = $conn->query($sql2);
if(!$result){
    echo "Error in Inserting data" .$conn->error;
    echo "<br>";
}else{
    echo "Insert data successfully!";
}


?>