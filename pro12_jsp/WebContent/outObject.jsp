<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>jspwriter객체의 out 참조 변수 </title>
</head>
<body>
 <% 
 		int a=10, b=5;
 %>
 
 	<h2> jspwriter객체의 out참조 변수 미사용 출력의 불편함 </h2>
 	
 	<%
 		if(a==10){
 	%>
 		<%=a+"을 가진 변수 a변수입니다."%> <br>
 	<% 		
 		}else if(b==10){
 	%>	
 		<%=b+"을 가진 변수는 b입니다." %> <br>
 	<%	
 		}
 	%>
 	<h2>jspwriter 객체의 out참조변수 사용!!</h2>
 	<%
 		if(a==10){
 			out.print(a+"을 가진 변수는 a변수 입니다.");
 		}else if(b==10){
 			out.print(b+"을 가진 변수는 a변수 입니다.");
 		}
 	%>
</body>
</html>