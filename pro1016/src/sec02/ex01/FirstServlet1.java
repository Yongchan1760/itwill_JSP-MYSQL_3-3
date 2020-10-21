package sec02.ex01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.rmi.server.Dispatcher;


//1. 웹브라우저 주소창에 주소를 http:localhost:8080/pro07/f1 입력하여
//firstservlet서블릿 요청 
//2.firstservlet 클래스 내부에서 웹브라우저의 요청으로 받은 request객체 메모리에
//address-서울시 성북구 쌍으로 묶어서 바인딩
//3. 디스패치방식으로 두번째 서블릿인 secondservlet1서블릿을 재요청시
//기존의 request 메모리를 두번째 서블릿으로 전달 공유 해서 사용하게됩니다.


@WebServlet("/f1")
public class FirstServlet1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request,
						HttpServletResponse response) 
						throws ServletException, IOException {
		//한글처리 
		request.setCharacterEncoding("utf-8");//가져오는거 
		response.setContentType("text/html;charset=utf-8");//클라이언트로 보낼꺼
		
		
		//웹브라우저에서 요청한 request객체 메모리에 address값으로 서울시 성북구 를 바인딩(저장)합니다.
		request.setAttribute("address", "서울시 성북구");
		
		//두번째 서블릿 재요청 (포워딩)
		RequestDispatcher dispatcher=request.getRequestDispatcher("s1");
		dispatcher.forward(request, response);
		//두번쨰 서블릿 요청시 request와 response객체 전달
		}
	
}
