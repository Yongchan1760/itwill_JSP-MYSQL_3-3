<?xml version="1.0" encoding="utf-8" ?>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
   
   <% 
   
 		  request.setCharacterEncoding("utf-8");   
   
   %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Insert title here</title>
</head>
<body>
	안녕하세요. 쇼핑몰 중심 jsp 시작입니다.
	<br>
	
	<!--duke_image.jsp를 동적으로 포워딩합니다.  -->
	<!--param액션태그를 이용해 duke.image.jsp로 이름과 파일이름을 전달합니다.  -->
	<jsp:include page="duke_image.jsp" >
	
		<jsp:param value="듀크" name="name"/>
		<jsp:param value="duke.png" name="imgName"/>
	</jsp:include>
	<br>
	안녕하세요 쇼핑몰 중심 jsp끝 부분입니다. 듀크이미지를 실행시키고 제어권을 다시 가져옵니다.
</body>
</html>