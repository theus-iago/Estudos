<?php
  if(isset($_POST['btn'])) 
  {
    // print_r($_POST['nome']);
//     print_r($_POST['idade']);
  include_once('config.php');
    $nome = $_POST['nome'];
    $idade = $_POST['idade'];
    $cpf = $_POST['cpf'];
    $email = $_POST['email'];
    $senha = $_POST['senha'];
    $genero = $_POST['genero'];
    
    $result = mysqli_query($conexao, "INSERT INTO usuarios(nome,idade,cpf,email,senha,genero) VALUES ('$nome','$idade','$cpf', '$email','$senha', '$genero')");
  }
?>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Usuário Cadastrado no sistema!</title>
  <link rel="stylesheet" href="../style/index.css" type="text/css">
  <script src="../js/log.js" defer></script>
</head>
<body>
  <form action="" method="">
    <p>
    <?php
     echo "Usuário Cadastrado com sucesso!";
    ?>
    </p>
    <p>
      <input type="button" name="btn" id="btn" value="Logar" onclick="log()">
    </p>
  </form>
</body>
</html>
