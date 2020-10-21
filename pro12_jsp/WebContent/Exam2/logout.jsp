<?xml version="1.0" encoding="utf-8" ?>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

    <% 
    //session 내장객체 메모리 영역에 접근하여 저장된 데이터를 모두 제거
    	session.invalidate();	
    
    //session a변수의 값만 제거 
  //  session.removeAttribute("a");
    	
    
    
    
    //session 값 제거후 다시 index.jsp메인 화면을 포워딩(재요청)해 이동
	response.sendRedirect("index.jsp");
     
    %>