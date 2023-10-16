<?php
session_start();
if (!isset($_SESSION["email"]) == true and !isset($_SESSION["senha"]) == true) {
  unset($_SESSION["email"]);
  unset($_SESSION["senha"]);
  header("Location: ../html/login.html");
}
$logado = $_SESSION["email"];
?>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Sistema</title>
  <link rel="stylesheet" href="../style/main.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Rounded:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
<style>
#btn {
  background-color:#5597ff;
  color:white;
  border:none;
  border-radius:8px;
  margin:5px;
  padding:3px;
}
</style>
  <script src="../js/back.js" defer></script>
</head>
<body>
  <header>
    <div class="titulo">
    <h1><span>B</span>em-Vin<span>d</span>o!</h1>
    </div>
    <div class="botao">
      <input type="button" id="btn" onclick="back()" value="Sair">
    </div>
  </header>
  <main>
    <article>
      <h2>Servidor</h2>
    </article>
  </main>
  <footer><h3><a href="https://www.Instagram.com/iago_028">&copyIago</a></h3></footer>
</body>
</html>