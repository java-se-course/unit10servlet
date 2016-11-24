<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="user" class="unit10.user.UserBean" scope="page" />

<jsp:setProperty name="user" property="*"/>

<label>First name property: <jsp:getProperty name="user" property="firstName"/></label><br/>
<label>Last name property: <jsp:getProperty name="user" property="lastName"/></label><br/>
<label>Date property: <jsp:getProperty name="user" property="date"/></label><br/>

<jsp:useBean id="pageDate" class="java.util.Date" />
<jsp:setProperty name="user" property="date" value="${pageDate}"/>
<label>Date property after `setProperty': <jsp:getProperty name="user" property="date"/></label><br/>

${pageScope.user.firstName} ${user.lastName}

</body>
</html>
