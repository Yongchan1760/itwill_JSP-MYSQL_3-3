package sec01.ex02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/first3")
public class FirstServlet3 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//클라이언트의 웹브라우저로 응답(출력)할 데이터 종류 설정
		resp.setContentType("text/html;charset=utf-8");
		
		//dispatch 방법을 이용해 두번째 서블릿인 secondservlet3으로 재요청(포워딩)
		//해석 : request 객체의 get메소드 호출시 ..재요청할 두번쨰 서블릿의 매팽주소 이름을 전달
		//하면 그 매핑주소를 저장한 requestdispacher객체를 반환받는다.
		//RequestDispatcher dispatcher=req.getRequestDispatcher("재요청할 두번째 서블릿의 매핑주소");
		RequestDispatcher dispatcher=req.getRequestDispatcher("second3");
	
		dispatcher.forward(req, resp);//두번째 서블릿 재요청시 
									//기존에 존재하던 request,respond객체를 전달함
		
		//중요 !! 디스패쳐 방식의 포워딩 기술은? 두번쨰 서버페이지를 재요청할때 웹브라우저를 거치지 않고
		//재요청 하기떄문에 
		
		//좋은점1.첫번쨰 서버 페이지로부터 전달받은 request객체 메모리를 두번쨰 서버페이지에 공유해서 
		//사용할수있다. 
		
		//좋은점2. 클라이언트의 응답한 두번째 서버페이지의 출력결과는 화면에 나오지만.
		// 웹브라우저 주소창의 주소를 보면 처음 요청할때의 첫번쨰 서버페이지의 요청주소가 그대로 남아있어 보안에좋다.
	}
	
}
