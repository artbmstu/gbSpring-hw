<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <spring:url value="/resources/bootstrap.min.css" var="bootstrapCss"/>
    <spring:url value="/resources/adcreate.js" var="adcreateJS"/>
    <link href="${bootstrapCss}" rel="stylesheet"/>
    <style type="text/css">
        table, form {
            margin: 20px 20px 20px;
        }
    </style>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
    <script src="${adcreateJS}"></script>
    <title>Title</title>
</head>
<body>
<table width="90%" cellspacing="10" cellpadding="10" border="1">
    <tr>
        <th colspan="8" align="center">
            ADVERTISING
        </th>
    </tr>
    <tr>
        <th width="60" nowrap="nowrap" align="center">№</th>
        <th width="150" nowrap="nowrap" align="center">ID</th>
        <th width="150" nowrap="nowrap" align="center">NAME</th>
        <th width="150" nowrap="nowrap" align="center">CONTENT</th>
        <th width="150" nowrap="nowrap" align="center">PHONE</th>
    </tr>

    <c:forEach var="ad" items="${ads}" varStatus="status">
        <tr>
            <td align="center" nowrap="nowrap">${status.index + 1}.</td>
            <td align="center">${ad.idad}</td>
            <td align="center">${ad.adname}</td>
            <td align="center">${ad.content}</td>
            <td align="center">${ad.phone}</td>
            <td align="center" nowrap="nowrap">
                <a href="/adview/${ad.idad}">VIEW</a>
            </td>
            <td align="center" nowrap="nowrap">
                <a href="/adedit/${ad.idad}">EDIT</a>
            </td>
            <td align="center" nowrap="nowrap">
                <a href="/addelete/${ad.idad}">DELETE</a>
            </td>
        </tr>
    </c:forEach>
</table>
<form action="/adcreate">
    <button type="submit">CREATE ADVERTISE</button>
</form>
</body>
</html>
