<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
  <body>
  <table width="100%" cellspacing="10" cellpadding="10" border="1">
    <tr>
      <th colspan="7" align="center">
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
          <a href="adview/${ad.idad}">VIEW</a>
        </td>
      </tr>
    </c:forEach>
  </table>
  </body>
</html>
