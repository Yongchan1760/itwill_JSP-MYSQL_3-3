package sec02.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//실행순서1. 사용자(클라이언트)가 웹브라우저 주소창에 
//http://localhost:8080/pro07/memberForm.html   입력 하여 정적인 회원가입 양식 페이지  웹서버에 요청

//실행순서2.
//웹서버는 memberForm.html페이지의 코드를 읽어들여 클라이언트의 웹브라우저 화면에 회원가입 화면을 출력(응답) 함.

//실행순서3.
//클라이언트는 회원가입 화면(memberForm.html)에서 회원가입을 위해 새회원 정보를 입력하고 회원가입 버튼을 클릭해
//<form>태그를 이용해 MemberServlet서블릿 요청시..
//HttpServletRequest객체 메모리에 입력한 회원정보를 저장시켜 전송 한다.

//실행순서4. Post전송방식으로 요청받은 MemberServlet서블릿의 doPost메소드가 호출될때 
//         매개변수로 HttpServletRequest객체메모리를 얻는다.
// 참고) HttpServletRequest객체 메모리에는 입력한 회원정보들이 저장되어 있다.

//첫번째 서블렛에서 조회한 회원정보를 arraylist배열에 저장한후 다시 request객체에 arraylist를 바인딩 한후
//두번째 서블릿 재요청시 request객체 메모리를 전달하여 공유 하여  
//뷰페이지 역할을 하는 두번째 서블릿이 받아 클라이언트의 웹브라우저로 조회된 회원정보 출력


//회원정보를 모두 조회할 요청값 주소 http:localhost:8080/pro08/member
//첫번째 서블릿 
@WebServlet("/member")
public class MemberServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	
	
	//순서2. doGet메소드가 호출될때 요청시 새로운 HttpServletRequest객체 메모리를 인자로 전달 받는다.
	protected void doHandle(HttpServletRequest request, 
						  HttpServletResponse response)	
								  throws ServletException, IOException {
		
		//1. 인코딩 방식을 설정
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset:utf-8");
		//3.클라이언트로 전달된 통로 만듬
		PrintWriter out =response.getWriter();
		//4. meberdao객체 만들어서  listMembers()메소드 호출
		//이유 db에 저장된 모든 회원정보들을 조회해서 얻기 위함.
		MemberDAO dao=new MemberDAO();
		ArrayList memberList=dao.listMembers();
		//5. 조회된 회원정보(arraylist)를 두번째 서블릿 (뷰페이지로 )공유해서 사용하기 위해
		//request 내장객체 메모리에 arraylis배열을 바인딩시킴
		request.setAttribute("list", memberList);
		//6. 두번째 서블릿 (뷰 페이지)로 디스패치방식으로 포워딩시 기존에 존재했던 request메모리 전달
		RequestDispatcher dispatcher=request.getRequestDispatcher("viewMembers");
		dispatcher.forward(request, response);
		
	}//doPost메소드 끝
	
}//MemberServlet클래스 끝





