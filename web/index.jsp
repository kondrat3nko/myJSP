<%--
  Created by IntelliJ IDEA.
  User: VladYA
  Date: 08.07.2015
  Time: 8:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="testform" method="post">
    <H3>
        Название проекта:
        <input type="text" name="Name's project" value="-write-"/><br><br>
        Технологии:
        <TABLE border="5">
            <tr>
                <td>JSPX</td>
                <td><input type="radio" name="Technology" value="JSP into XML format"/></td>
                <td>JSTL</td>
                <td><input type="radio" name="Technology" value="Library of tag JSTL"/></td>
            </tr>
        </table>
        <br>
        Язык программирования:
        <table border="5">
            <tr>
                <td> JAVA 6 <input type="radio" name="Language" value="Java SE 6"></td>
                <td> JAVA 5 <input type="radio" name="Language" value="Java SE 5"></td>
            </tr>

        </table>
    </H3>
    <input type="submit" value="Принять"/> <br>

</form>
</body>
</html>
