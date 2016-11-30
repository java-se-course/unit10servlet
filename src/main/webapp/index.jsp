<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>

<h2>Hello World!</h2>
<a href="locale">Go to locale.</a><br/>

<a href="book" >Go to book.</a>
<a href="books" >Go to books.</a>
<a href="book_list" >Go to book list.</a><br/>
<a href="controller" >Controller - GET</a><br/>

<form action="controller" method="post">
    <input type="hidden" name="hiddenParam" value="param value">
    <label>Enter your name: <input type="text" name="name"></label><br/>
    <label>Enter your last name: <input type="text" name="lastName"></label><br/>
    <input type="submit" value="Send POST" />
</form><br/>

<form action="controller" method="GET">
    <input type="hidden" name="hiddenParam" value="param value">
    <label>Enter your name: <input type="text" name="name"></label><br/>
    <label>Enter your last name: <input type="text" name="lastName"></label><br/>
    <input type="submit" value="Send GET" />
</form><br/>

<form action="other_controller" method="get">
    <label>Enter your name2: <input type="text" name="name"></label><br/>
    <input type="submit" value="Send GET" />
</form><br/>

<form action="redirect" method="get">
    <input type="submit" value="Redirect" />
</form><br/>

<a href="redirect" >How to do something?</a>
</body>
</html>
