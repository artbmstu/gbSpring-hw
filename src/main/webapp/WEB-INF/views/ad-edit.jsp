<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <spring:url value="/resources/bootstrap.min.css" var="bootstrapCss"/>
    <link href="${bootstrapCss}" rel="stylesheet"/>
    <style type="text/css">
        table {
            margin: 20px 20px 20px;
        }
    </style>
    <title>Advertise edit</title>
</head>
<body>
<form:form method="post" action="/adsave" modelAttribute="ad">
    <p>
    <div>ID</div>
    <form:input path="idad" readonly="true"/>
    </p>
    <p>
    <div>NAME</div>
    <form:input path="adname"/>
    </p>
    <p>
    <div>CONTENT</div>
    <form:input path="content"/>
    </p>
    <p>
    <div>PHONE</div>
    <form:input path="phone"/>
    </p>
    <p>
        <button type="submit">SAVE</button>
    </p>
</form:form>
</body>
</html>
