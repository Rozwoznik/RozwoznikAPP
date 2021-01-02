<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodaj Ogłoszenie</title>
</head>
<body>

<form action="addAdvertisement" method="post">
    Nazwa produktu:<input type="text" name="name">
    Kategoria:<input type="text" name="category">
    Cena:<input type="text" name="price">
    Opis:<input type="text" name="description">

    <input type="submit" value="Dodaj">
</form>

</body>
</html>
