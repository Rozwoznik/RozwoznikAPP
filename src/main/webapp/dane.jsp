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
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.sql.*"%>
<%@page import="java.util.Date"%>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="Services.DatabaseService" %>
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
        PrintWriter ou = response.getWriter();
        try {
            String query = "SELECT * FROM `Advertisement`";
            ResultSet rs = DatabaseService.executeQuery(query);

            ou.print("<link rel=\"stylesheet\" href=\"CSS/AdvertisementStyle.css\">");
            ou.print("<table style=\"width:100%\">");
            ou.print("<tr>" +
                    "    <th>ID</th>" +
                    "    <th>Nazwa</th> " +
                    "    <th>Kategoria</th>" +
                    "    <th>Cena</th>" +
                    "    <th>Kiedy dodane</th>" +
                    "    <th>Kto dodal</th>" +
                    "    <th>Usun ogloszenie</th>" +
                    "</tr>");
            try {
                while (rs.next()) {
                    ou.print("<tr>");
                    ou.print("<th>" + rs.getInt(1) + "</th>");
                    ou.print("<th>" + rs.getString(2) + "</th>");
                    ou.print("<th>" + rs.getString(3) + "</th>");
                    ou.print("<th>" + rs.getString(4) + "</th>");
                    ou.print("<th>" + rs.getString(6) + "</th>");
                    ou.print("<th>" + rs.getString(8) + "</th>");
                    ou.print("<th> <button name=\"kasacja\" type=\"\" >KASUJ ID:"+rs.getInt(1)+"</button></th>");
                    ou.print("</tr>");
                }
                ou.print("</table>");
            } catch (SQLException sqlException) {
                System.out.println(sqlException);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    %>
    <form>
        Mamy teraz <%=%>
    </form>
</table>