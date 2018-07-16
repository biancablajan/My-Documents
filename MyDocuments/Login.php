<?php
    $con = mysqli_connect("localhost", "id5982300_bia", "GoldenRatio1618", "id5982300_mydocumentsdata");
    
    $email = $_POST["email"];
    $password = $_POST["password"];
    
    $statement = mysqli_prepare($con, "SELECT * FROM user WHERE email = ? AND password = ?");
    mysqli_stmt_bind_param($statement, "ss", $email, $password);
    mysqli_stmt_execute($statement);
    
    mysqli_stmt_store_result($statement);
    mysqli_stmt_bind_result($statement, $user_id, $full_name, $email, $password);
    
    $response = array();
    $response["success"] = false;  
    
    while(mysqli_stmt_fetch($statement)){
        $response["success"] = true;  
        $response["full_name"] = $full_name;
        $response["email"] = $email;
        $response["password"] = $password;
    }
    
    echo json_encode($response);
?>