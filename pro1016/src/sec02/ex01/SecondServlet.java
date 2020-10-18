package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/s")
public class SecondServlet extends HttpServlet{

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
			
			out.print(addresss);
			//두번째 서블릿을 재요청 받을떄 리다이렉트 방식으로 재요청했기떄문에 
			
		
	}
	
}
