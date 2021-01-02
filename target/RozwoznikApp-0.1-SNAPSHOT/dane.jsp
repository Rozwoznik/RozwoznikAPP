<%--
  Created by IntelliJ IDEA.
  User: Tomasz
  Date: 03.12.2020
  Time: 16:46
  To change this template use File | Settings | File Templates.


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>dane</title>
</head>
<body>

<form action="dane" method="post">
    Wyszukiwanaa kolumna: <input type="text" name="column">
    Przeszukiwana tabela:<input type="text" name="table">

    <input type="submit" value="podaj dane">


</form>

</body>
</html>
--%>

<%@page import="java.sql.*"%>
<%@page import="java.util.Date"%>
<%
    String driverName = "com.mysql.cj.jdbc.Driver";
    try {
        Class.forName(driverName);
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
%>
<h2 align="center"><strong>Retrieve data from database in jsp</strong></h2>
<table align="center" cellpadding="5" cellspacing="5" border="1">
    <%
        Date date = new Date();
        String name = null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://192.168.1.83:3306/rozwoznik", "kacper", "admin");
            statement=connection.createStatement();
            String sql ="select * from `Advertisement`";
            resultSet = statement.executeQuery(sql);

            name = resultSet.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }
    %>
    <form>
        Mamy teraz <%=name%>
    </form>
</table>