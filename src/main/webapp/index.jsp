<%@ page language="java" contentType="text/html; charset=UTF-16"
    pageEncoding="UTF-16"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-16">
<title>My Jsp page</title>

<style type="text/css">

body {
	font-size: 40px;
	text-align: center;
	background: linear-gradient(to right,  #2b40ff,#07121a);
}
h1,h3{
	color: white;
	margin: 15px;
}
input,button{
	font-size: 40px;
	background-color: black;
	color:white;
	border: 2px solid white;
	border-radius: 5%;
}
input,a{
	color:white;
	margin: 15px;
}
input,a:hover{
	color: red;
	margin: 20px;
}
img{
	height: 10%;
	width: 10%;
	margin-top: 12px;
}
img:hover{
	-ms-transform: scale(1.1);
	-webkit-transform: scale(1.1);
	transform: scale(1.1);
}
</style>
</head>

<body>
<img alt="" src="image\emoji.gif">
	<h1>Joke of the Day!</h1>
	<h3>😀<%=request.getParameter("joke")%>😀🌝</h3>
	
<form action="myServlet">
			
		<input name="num1" placeholder="FirstNumber">
		<input name="num2" placeholder="SecondNumber">
		
		<button name="btn1" value=1>+</button>
		<button name="btn1" value=2>-</button>
		<button name="btn1" value=3>*</button>
		<button name="btn1" value=4>/</button>
	</form>

<h1>Output=<%=request.getParameter("output")%> </h1>
<a href="index.html" target="_parent">
		back
	</a>
</body>
</html>