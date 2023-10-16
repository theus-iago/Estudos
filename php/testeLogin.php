<?php
session_start();
if (
  isset($_POST["btn"]) &&
  !empty($_POST["email"]) &&
  !empty($_POST["senha"])
) {
  //Acessa
  include_once "config.php";
  $email = $_POST["email"];
  $senha = $_POST["senha"];

  // print_r('Email: '. $email);
  // print_r('<br>');
  // print_r('Senha: '. $senha);
  // print_r('<br>');
  $sql = "SELECT * FROM usuarios WHERE email = '$email' and senha = '$senha'";
  $result = $conexao->query($sql);

  //print_r($result);
  if (mysqli_num_rows($result) < 1) {
    unset($_SESSION["email"]);
    unset($_SESSION["senha"]);
    header("Location: ../html/login.html");
  } else {
    $_SESSION["email"] = $email;
    $_SESSION["senha"] = $senha;
    header("Location: index.php");
  }
} else {
  //Nao Acessa
  header("Location: ../html/login.html");
}
?>
