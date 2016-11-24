<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Authorisation</title>
</head>
<body>
<h2>Представьтесь, пожалуйста</h2>
<form action="authorise" method="post">
    <label>Имя: <input type="text" name="firstName" placeholder="Ваше имя" /></label><br/>
    <label>Фамилия: <input type="text" name="lastName" placeholder="Ваша фамилия" /></label><br/>
    <input type="submit" value="Отправить" />
</form>
</body>
</html>
