<%--
  Created by IntelliJ IDEA.
  User: khai trinh
  Date: 02/03/2021
  Time: 3:42 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Translate</title>
</head>
<body>
<table>
    <form method="post">
        <tr>
            <td>
                <select name="trans">
                    <option value="1">Vietnamese to english</option>
                    <option value="2">English to vietnamese</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>
                <input type="text" name="input" value="${input}">
            </td>
            <td>
                <input type="text" value="${result}" disabled>
            </td>
        </tr>
        <tr>
            <td><input type="submit" value="submit"></td>
        </tr>

    </form>
</table>

</body>
</html>
