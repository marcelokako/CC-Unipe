<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
</head>
<body>
    <?php
        session_start();
        if(isset($_SESSION["erro"])){
            echo $_SESSION["erro"] . "<br>";
            unset($_SESSION["erro"]);
        }
        if(isset($_POST["email"]) && isset($_POST["senha"])){
            if($_POST["email"] == "admin@email.com" && $_POST["senha"] == "123"){
                $_SESSION["email"] = $_POST["email"];
                header("Location: dados.php");
            }else{
                echo "Erro ao realizar Login";
            }
        }
    ?>
    <h1>Página Login</h1>
    <form action="login.php" method="POST">
        Email: <input type="text" name="email" /> <br><br>
        Senha: <input type="password" name="senha" /> <br><br>
        <button>Logar</button>
    </form>
</body>
</html>