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
@keyframes gradient {
  0%{background-position:50% 0%;}
  50%{background-position:100% 50%;}
  100%{background-position:50% 0%;}
}
#btn {
  background-color:#5597ff;
  color:white;
  border:none;
  border-radius:6px;
  margin:5px;
  padding:5px;
}
</style>
  <script src="../js/back.js" defer></script>
</head>
<body>
  <header>
      <h2><span>S</span>ervidor <span>P</span>H<span>P</span></h2>
    <div class="botao">
      <input type="button" id="btn" onclick="back()" value="Sair">
    </div>
  </header>
  <main>
    <p>
      Testando Servidor
    </p>
    <article>
    </article>
  </main>
  <footer>
    <p><a href="https://Instagram.com/iago_028" target="_blank">&copyIago</a></p>
  </footer>
</body>
</html>