package sec01.ex02;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/first1")
public class FirstServlet1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//클라이언트의 웹브라우저로 응답(출력)할 데이터 종류 설정
		resp.setContentType("text/html;charset=utf-8");
		
		//리플러시 방식의 재요청(포워딩) 기술 ->resp.addHeader("Refresh","휴식시간;url=재요청할 서블릿 매핑주소")
		resp.addHeader("Refresh","1;url=second1");
		
		//addHeader 메소드 호출시..refresh로 설정하고 1초후 url =second로 지정한 secondservlet1 
		//두번쨰 서블릿을 재요청하게 됩니다. 
		
	}
	
}
