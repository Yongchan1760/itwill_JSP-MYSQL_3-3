<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

    <%
    //1.한글처리 
    	request.setCharacterEncoding("utf-8");
    //2. 요청한값 전달 받기
    	String choice=request.getParameter("gender");
    //3. 요청한값을 이용해서 포워딩한다 클라이언트에게(재 요청)
    	if(choice.equals("m")){//남성을 선택했다면
    		response.sendRedirect("man.html");
    	}else{//여자를 선택했다면
    		response.sendRedirect("woman.html");
    		//여성 전문 페이지를 재요청해 이동시키기
    	}
    %>