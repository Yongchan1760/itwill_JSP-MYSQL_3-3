<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

    
    
    <% 
    	//1.request 내장객체 메모리에 저장되어 있는 데이터 한글 처리
    	request.setCharacterEncoding("utf-8");
    
    	//2.요청한 값얻기 request내장객체 메모리에 저장된 요청값 꺼내오기
    	String num=request.getParameter("num");
    	String name=request.getParameter("name");
    	String grade=request.getParameter("grade");
    	String subject=request.getParameter("subject");
    	
    	//3. 요청한값을 얻어 응답할 값 만들기 
    %>
    <!-- 클라이언트의 웹브라우저로 출력 -->
 <h2>입력한 학생 정보 출력</h2>
 <table border="1" width="300">
 	<tr> 
 		<th>학번</th>
 		<td>학번은<%=num%>입니다.</td>
 	</tr>
 	<tr> 
 		<th>이름</th>
 		<td>이름은<%=name%>입니다.</td>
 	</tr>
 	<tr> 
 		<th>학년</th>
 		<td>학년은<%=grade%>입니다.</td>
 	</tr>
 	<tr> 
 		<th>과목</th>
 		<td>과목은<%=subject%>입니다.</td>
 	</tr>
 </table>

  
    
   