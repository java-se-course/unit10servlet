<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value="${sessionScope.locale}" />
<fmt:setBundle basename="i18n.locale" var="loc" />

<html>
<head>
    <title><fmt:message bundle="${loc}" key="locale.message"/></title>
</head>
<body>
<tags:select_locale/>
<h2><fmt:message bundle="${loc}" key="locale.message" /></h2>
<fmt:message bundle="${loc}" key="locale.another.message" />

</body>
</html>
