<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<table width="100%" cellspacing="10" cellpadding="10" bgcolor="black">
    <tr>
        <td width="100%">
            <a href="/">MAIN</a>
            <sec:authorize access="isAuthenticated()">
                &nbsp;|&nbsp;
                <a href="/admin/ad-list">PROJECTS</a> &nbsp;|&nbsp;
            </sec:authorize>
        </td>
        <td nowrap="nowrap">
            <sec:authorize access="!isAuthenticated()">
                <a href="/login">LOGIN</a>
            </sec:authorize>
            <sec:authorize access="isAuthenticated()">
                <sec:authentication property="name"/> &nbsp;|&nbsp;
                <a href="/profile/profile-view">PROFILE</a> &nbsp;|&nbsp;
                <a href="/logout">LOGOUT</a>
            </sec:authorize>
        </td>
    </tr>
</table>
