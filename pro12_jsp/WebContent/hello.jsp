<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
    <%-- 선언문을 이용해 멤버 변수 name과 멤버 메소드 getname()를 선언 합니다.--%>
   
    <%!
    	String name ="듀크";// 멤버변수선언
    	public String getName(){ //멤버 메소드 선언 
    		return name;
    	}
    %>
    
    <%--위 name변수에 저장되어 있는 값을 얻어 클라이언트의 웹브라우저에 출력 응답 하자.--%>
    <%-- 표현식을 이용해 선언문에서 선언한 name변수의 값을 얻어 출력--%>
   <h1> 안녕하세요<%=name %> 님!</h1>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>