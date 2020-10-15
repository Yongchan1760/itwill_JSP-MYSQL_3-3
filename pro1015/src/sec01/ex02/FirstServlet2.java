package sec01.ex02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/first2")
public class FirstServlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//클라이언트의 웹브라우저로 응답(출력)할 데이터 종류 설정
		resp.setContentType("text/html;charset=utf-8");
		
		//첫번쨰 서블릿에서 out객체를 이용하여 (출력스트림 통로)를 이용해 자바 스크립트 코드를
		//작성해 두번쨰  secondservlet2로 location방법으로 재요청해서 이동시킴 
		PrintWriter outt=resp.getWriter();//1바이트 단위로 전달
		
		outt.print("<script type='text/javascript'>");
		outt.print("location.href='second2'");//재요청
		outt.print("</script>");
	}
	
}
