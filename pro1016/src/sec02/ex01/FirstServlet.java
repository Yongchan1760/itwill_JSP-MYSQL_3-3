package sec02.ex01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/f")
public class FirstServlet extends HttpServlet{

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
		response.sendRedirect("s");
	}
	
}
