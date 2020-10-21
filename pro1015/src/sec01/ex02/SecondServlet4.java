package sec01.ex02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//second 3서블릿 클래스는 첫번쨰 서블릿인 firstsevlet3 서블릿에서 재요청을 받아
//실행하는 두번쨰 서블릿 클래스 입니다.
@WebServlet("/second4")
public class SecondServlet4 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//클라이언트의 웹브라우저로 응답(출력)할 데이터 종류 설정
		resp.setContentType("text/html;charset=utf-8");
		
		req.setCharacterEncoding("utf-8");
		
		
		//첫번째 서블릿으로 부터 전달받어 유지된 request 객체메모리 영역에 저장된 값 꺼내오기
		String name=req.getParameter("name");
		
		//클라이언트의 웹브라우저로 응답(출력)할 스트림 통로 생성
		PrintWriter out=resp.getWriter();
		
		
		out.println("<html><body>");
		out.println("이름:"+name+"<br>");
		out.println("</body></html>");
	}
	
}
