

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인창</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
%>
<h1>아이디를 입력하지 않았습니다. 아이디를 입력해 주세요.</h1>
	<!-- //웹브라우저에서 최초로 접속시에는 request 내장객체 메모리 영역에 값이 저장되어 있지 않으므로 null이다
	//그러므로 아무런 메시지를 표시하지 않는다 -->

	<form action="result.jsp" method="post">
		아이디 : <input type="text" name="userID" > <br>
		비밀번호 : <input type="password" name="userPW" > <br>
		<input type="submit" value="로그인" >
		<input type="reset" value="다시입력">
	</form>
</body>
</html>