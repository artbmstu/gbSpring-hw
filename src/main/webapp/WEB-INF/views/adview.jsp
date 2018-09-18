<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <spring:url value="/resources/bootstrap.min.css" var="bootstrapCss"/>
    <link href="${bootstrapCss}" rel="stylesheet"/>
    <style type="text/css">
        table, form {
            margin: 20px 20px 20px;
        }
    </style>
    <title>Advertising View</title>
</head>
<body>
<table width="90%" cellspacing="10" cellpadding="10" border="1">
    <tr>
        <th colspan="4" align="center">
            ADVERTISING VIEW
        </th>
    </tr>
    <tr>
        <th width="150" nowrap="nowrap" align="center">ID</th>
        <th width="150" nowrap="nowrap" align="center">NAME</th>
        <th width="150" nowrap="nowrap" align="center">CONTENT</th>
        <th width="150" nowrap="nowrap" align="center">PHONE</th>
    </tr>

    <tr>
        <td align="center">${ad.idad}</td>
        <td align="center">${ad.adname}</td>
        <td align="center">${ad.content}</td>
        <td align="center">${ad.phone}</td>
    </tr>
</table>
<form action="/adlist">
    <button type="submit">PROJECTS</button>
</form>
</body>
</html>
