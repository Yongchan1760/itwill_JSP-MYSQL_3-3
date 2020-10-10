package sec01.ex01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//순서1. 클라이언트가 웹브라우저를 이용해서 아래의 ThirdSertvlet서버페이지를 요청합니다.
//      요청할 주소 : http://192.168.3.200:8080/pro05/third

//순서2. 톰캣(웹애플리케이션서버)은  위요청 주소에 해당하는  ThirdServelt서블릿페이지를 찾아 매칭시킨후 
//      ThirdServlet을 실행 시킵니다.

//순서3. 클라이언트는 웹브라우저 주소창에 주소를 입력해서 요청(GET요청방식) 하였으니 ThirdServlet클래스내부의
//      doGet()메소드가 자동 호출되면서  한사람의 요청당 하나의 HttpServletRequest내장객체 메모리 생성 된 후
//      doGet()메소드의 매개변수로 그객체를 전달 받아 사용 하게 됩니다.

//순서3. doGet메소드 내부에서 
//      요청받은 HttpServletRequest객체 메모리를 이용해서 요청한 클라이언트의 정보를 얻을수 있다.

@WebServlet("/third")
public class ThirdServlet extends HttpServlet {
	
	//클라이언트가 GET방식으로 요청하면 호출되는 콜백 메소드로  
	//요청 하는 값이 있으면 새로운 HttpServletRequest객체 메모리가 생성 되면서 요청한 정보를 전달 받을수 있다.
	@Override
	protected void doGet(HttpServletRequest request, 
			             HttpServletResponse response) 
			            		 throws ServletException, IOException {
		
		//클라이언트가 요청한 전체 주소 http://192.168.3.200:8080/pro05/third 중에서...
		//톰캣이 프로젝트에 접근할 수 있게 해주는 컨텍스트주소(pro05)를 얻을 수 있다.
		String path = request.getContextPath(); //  /pro05  <--컨텍스트 주소 얻기 
		System.out.println(path);
	}

}

