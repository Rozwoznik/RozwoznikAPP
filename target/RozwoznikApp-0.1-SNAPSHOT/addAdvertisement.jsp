<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodaj Ogłoszenie</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="CSS/loginForm.css">
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" href="/resources/demos/style.css">
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script>
        $( function() {
            $( "#datepicker" ).datepicker();
        } );
    </script>
</head>
<body>
    <div id="parent">
        <form id="form_login" action="addAdvertisement" method="post">
            Nazwa produktu:<input type="text" name="name"><br>
            Kategoria:<input type="text" name="category"><br>
            Cena:<input type="text" name="price"><br>
            Opis:<input type="text" name="description"><br>
            Data realizacji zamówienia:<input type="text" id="datepicker"><br>
            <input type="submit" value="Dodaj">
        </form>
    </div>
</body>
</html>
