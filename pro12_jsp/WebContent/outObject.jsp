<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>jspwriter��ü�� out ���� ���� </title>
</head>
<body>
 <% 
 		int a=10, b=5;
 %>
 
 	<h2> jspwriter��ü�� out���� ���� �̻�� ����� ������ </h2>
 	
 	<%
 		if(a==10){
 	%>
 		<%=a+"�� ���� ���� a�����Դϴ�."%> <br>
 	<% 		
 		}else if(b==10){
 	%>	
 		<%=b+"�� ���� ������ b�Դϴ�." %> <br>
 	<%	
 		}
 	%>
 	<h2>jspwriter ��ü�� out�������� ���!!</h2>
 	<%
 		if(a==10){
 			out.print(a+"�� ���� ������ a���� �Դϴ�.");
 		}else if(b==10){
 			out.print(b+"�� ���� ������ a���� �Դϴ�.");
 		}
 	%>
</body>
</html>