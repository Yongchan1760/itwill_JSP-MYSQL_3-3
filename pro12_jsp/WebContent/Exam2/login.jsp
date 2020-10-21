<?xml version="1.0" encoding="utf-8" ?>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Insert title here</title>
</head>
<body>
<!--현재 login.jsp화면에서 아이디와 비밀번호를 입력한후  현재 자신의 페이지 login.jsp로 로그인 처리 요청  -->
	<h1>로그인 </h1>
	<form action="login.jsp" method="post">
		<input type="text" name="id"/>아이디&nbsp;<br>
		<input type="text" name="pw"/>비밀번호&nbsp;<br>
		<input type="submit" value="로그인요청"></input>&nbsp;&nbsp;
		<input type="submit" value="취소"></input>
		
	</form>
	<% 
	//form 태그에서 요청하는 방식이 post방식일떄
		if(request.getMethod().equals("POST")){
			//1.한글처리
			request.setCharacterEncoding("utf-8");
			//2.입력한 값들을 내장객체 메모리 영역에서 꺼내오기
			String id= request.getParameter("id");
			String pw=request.getParameter("pw");
			//3. 디비에 저장되어있는 id  "master",pw="1111"와 비교 일단 가정
			// db에 저장되있는 master라는 id,pw를 login.jsp랑 비교하여 동일하며
			if("master".equals(id)){
				//db에 저장되어 있는 "1111" 라는 비밀번호값과 
				//입력한 비밀번호가 동일하면
				if("1111".equals(pw)){
					//session내장객체 메모리 영역에 세션값 저장 
					session.setAttribute("a", id);//키,값
					//index.jsp메인 페이지를 재요청해서 이동 
					response.sendRedirect("index.jsp");
					
				}else{//아이디는 동일하나 비밀번호가 다르다 
	%>			
					<script>
						window.alert("비밀번호 틀림");
					</script>
	<% 			
				}
			}
			else{//db에저장된 아이디와 다를때 
			
			//아이디는 다르지만 비밀번호는 같을때
			if("1111".equals(pw)){
	%>			
				<script>
					window.alert("아이디가다르고 비밀번호는 같습니다.");
				</script>
	<%			
			}else{//아이디는 다르지만 비밀번호는 다를때 
	%>		
				<script type="text/javascript">
					window.alert("아이디 비밀번호 전부 틀림.");
				</script>
	<% 			
			}
		}
	}
	
	%>
</body>
</html>