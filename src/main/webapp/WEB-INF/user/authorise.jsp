<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="mytag" uri="/WEB-INF/tld/taglib.tld" %>
<mytag:page-template title="Roles example">
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
    <mytag:roles roles="${user.roles}" />

    Direct: ${'<span>abc</span>'}<br/>
    c:out: <c:out value="${'<span>abc</span>'}" /><br/>

</mytag:page-template>

