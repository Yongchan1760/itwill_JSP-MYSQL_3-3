package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*첫번째 서블릿으로 부터 전달된 request객체 메모리에 저장된 address키에 대응되는 객체를 얻는다
request 객체에 저장된 데이터 꺼내오기*/
@WebServlet("/s1")
public class SecondServlet1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request,
						HttpServletResponse respond)
						throws ServletException, IOException {
			request.setCharacterEncoding("utf-8");
			respond.setContentType("text/html;charset=utf-8");
			PrintWriter out =respond.getWriter();
			
			//반환이 부모 오브젝트 타입으로  반환이되기떄문 
			Object obj=request.getAttribute("address");//업캐스팅이일어남 
			String addresss  =(String)obj;
			System.out.println(obj);
			//서울시 성북구 -> 디스패쳐 방식으로 두번째 서블릿을 재요청
			//하기떄문에 두번쨰 서블릿 재요청시 웹브라우저를 거치지않고 재요청
			//한다.
			out.print(addresss.toString());
			//두번째 서블릿을 재요청 받을떄 리다이렉트 방식으로 재요청했기떄문에 
			
		
	}
	
}
