<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Rozwoźnik rejestracja</title>
</head>
<body>
<form action="RegisterServlet" method="post">
    Nickname:<input type="text" name="nick"><br>
    Hasło:<input type="password" name="pass"><br>
    Powtórz hasło:<input type="password" name="re-pass"><br>
    Email:<input type="text" name="email"><br>
    <input type="submit" value="Zarejestruj">
</form>
</body>
</html>