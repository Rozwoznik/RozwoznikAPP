<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Rozwoźnik rejestracja</title>
    <link rel="stylesheet" href="CSS/loginForm.css">
</head>
<body>
    <div id="parent">
        <form id="form_login" action="RegisterServlet" method="post">
        Nazwa uzytkownika:<input type="text" name="nick"><br>
        Haslo:<input type="password" name="pass"><br>
        Powtorz haslo:<input type="password" name="repass"><br>
        Email:<input type="text" name="email"><br><br>
        <input class="blue_button" type="submit" value="Zarejestruj"><br>
        Masz konto? <a href="login.jsp">Zaloguj się!</a>
        </form>
    </div>
</body>
</html>