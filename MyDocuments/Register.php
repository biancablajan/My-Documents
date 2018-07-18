<?php
    $con = mysqli_connect("localhost", "id5982300_bia", "GoldenRatio1618", "id5982300_mydocumentsdata");
    
    $full_name = $_POST["full_name"];
    $email = $_POST["email"];
    $password = $_POST["password"];
    $statement = mysqli_prepare($con, "INSERT INTO user (full_name, email, password) VALUES (?, ?, ?)");
    mysqli_stmt_bind_param($statement, "sss", $full_name, $email, $password);
    mysqli_stmt_execute($statement);
    
    $response = array();
    $response["success"] = true;  
    
    echo json_encode($response);
?>