<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
</head>
<body>
    <h1>Login</h1>
    
    <?php
        session_start();
        if(isset($_SESSION["erro"])){
            echo $_SESSION["erro"] . "<br>";
            unset($_SESSION["erro"]);
        }
        if(isset($_POST["email"]) && isset($_POST["senha"]) ){  //
            
            if ($_POST["email"]=="admin" && $_POST["senha"] == 123){
                $_SESSION["email"] = $_POST["email"];
                header("Location: ex-cadastrar-dados.php");
            } else {
                echo "login nao realizado";
            }
        }
    ?>

    <fieldset>
        <form action="ex-login.php" method="post"> <!-- enviar para si mesmo para entrar na condição acima -->
            <br>
            E-mail: <input type="text" name="email"><br><br>
            Senha: <input type="password" name="senha"><br><br>
           
            <br>
            <br>
            <button>Logar</button>
        </form>
    </fieldset>

</body>
</html>