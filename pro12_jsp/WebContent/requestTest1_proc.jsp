<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<%--requesttest1.jsp 로부터 요청받은 데이터를 이용해  국어점수와 영어점수의 평균을 구해
	클라이언트의 웹브라우저로 응답하는 페이지  --%>
	
	<%
		//1. 한글처리 
		request.setCharacterEncoding("utf-8");
	
		//2.요청한값 얻기
		int kor=Integer.parseInt(request.getParameter("kor"));
		int eng=Integer.parseInt(request.getParameter("eng"));
		
		//3. 요청한값을 이용해 응답할 값마련 국어 영어 점수평균
		int avg=(kor+eng)/2;
		
		
	%>
	
	<%-- 클라이언트의 웹브라우저로 응답 출력--%>
	당신의 평균은 <%=avg %>입니다.
	
	
</body>
</html>