<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value="${sessionScope.locale}"/>
<fmt:setBundle basename="i18n.locale" var="loc"/>

<div class="select-locale">
    <form action="locale" method="post">
        <input type="hidden" name="action" value="set_locale"/>
        <input type="hidden" name="locale" value="ru"/>
        <fmt:message bundle="${loc}" key="locale.select.lang.ru" var="ru"/>
        <input type="submit" value="${ru}"/>
    </form>
    <form action="locale" method="post">
        <input type="hidden" name="action" value="set_locale"/>
        <input type="hidden" name="locale" value="en"/>
        <fmt:message bundle="${loc}" key="locale.select.lang.en" var="en"/>
        <input type="submit" value="${en}"/>
    </form>
</div>