<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="user" type="unit10.user.User" beanName="unit10.user.UserBean" scope="request"/>

<label>First name property:
    <jsp:getProperty name="user" property="firstName"/>
</label><br/>
<label>Last name property: ${user.lastName}</label><br/>
<label>Date property: ${user.date}</label><br/>

<jsp:useBean id="pageDate" class="java.util.Date"/>

<c:set target="${user}" property="date" value="${pageDate}"/>
<label>Date after set: ${user.date}</label><br/>

pageScope: ${pageScope.user.firstName} ${pageScope.user.lastName}<br/>
requestScope: ${requestScope.user.firstName} ${requestScope.user.lastName}<br/>

<c:out value="${requestScope.user.firstName}"/>

<h3>Roles</h3>
<ol>
    <c:forEach var="role" items="${user.roles}" varStatus="status">
        <li><span
                <c:choose>
                    <c:when test="${role eq 'admin'}">
                        style="color: red;"
                    </c:when>
                    <c:when test="${role eq 'reader'}">
                        style="color: blue;"
                    </c:when>
                    <c:when test="${role eq 'author'}">
                        style="color: green;"
                    </c:when>
                </c:choose>
        >${role} - ${status.index}</span></li>
    </c:forEach>
</ol>


Direct: ${'<span>abc</span>'}<br/>
c:out: <c:out value="${'<span>abc</span>'}" /><br/>

</body>
</html>
