package sec01.ex01;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//순서1. 클라이언트가 웹브라우저 주소창에  http://localhost:8080/pro06/member주소로
//      회원정보를 모두 DB로 부터 검색해줘~ 라고 요청 한다.


@WebServlet("/member")
public class MemberServlet extends HttpServlet {
	
	//순서2. doGet메소드가 호출될때 요청시 새로운 HttpServletRequest객체 메모리를 인자로 전달 받는다.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//클라이언트에게 응답할 데이터 종류 설정
		response.setContentType("text/html;charset=utf-8");
		//클라이언트의 웹브라우저로 응답할 출력 스트림 통로 역할을 하는 PrintWriter객체 얻기
		PrintWriter out = response.getWriter();
		
		//DB작업(SQL문을 작성하여 조회작업)할 MemberDAO객체 생성
		MemberDAO dao = new MemberDAO();
		
		//listMembers()메소드를 호출하여  검색한 회원정보를 각각 MembeVO객체에 저장하여
		//각각의 MemberVO객체들을 최종적으로 ArrayList가변길이 배열에 저장후
		//DB에서 검색한 회원정보들(MemberVO객체들)을 담고 있는 ArrayList배열을 리턴 받는다.
		ArrayList list = dao.listMembers();
		out.print("<html><body>");
		out.print("<table border=1><tr align='center' bgcolor='lightgreen'>");
		out.print("<td>아이디</td><td>비밀번호</td><td>이름</td><td>이메일</td><td>가입</td></tr>");
		for (int i = 0; i < list.size(); i++) {
			//조회한 회원정보는 arraylist라는 가변길이 배열 공간에 저장되어 있으므로 
			//arraylist 가변길이 배열에 저장된 검색한 회원정보를 하니씩 얻는다.
			MemberVO memberVO=(MemberVO) list.get(i);
			
			String id = memberVO.getId(); //검색한 id 얻기 
			String pwd = memberVO.getPwd(); //검색한 비밀번호 얻기 
			String name =memberVO.getName();//검색한 회원이름 얻기 
			String email = memberVO.getEmail();//검색한 회원의 이메일주소 얻기 
			Date joinDate = memberVO.getJoinDate();//검색한 회원의 가입날짜 정보 얻기 
			
			//위 변수에 저장된 조회한 각컬럼값을 다시 MemberVO객체를 생성해 
			//그객체 내부에 있는 각각의 인스턴스 변수에 저장합니다.(setter메소드 호출)
			
			//조회한 회원정보를 바깥 for문과 <tr> 태그를 이용해 리스트로 출력합니다.
			
			out.print("<tr><td>"+id+"</td><td>"+
								pwd+"</td><td>"+
								name+"</td><td>"+
								email+"</td><td>"+
								joinDate+"</td></tr>");
		}
		out.print("</table></body></html>");
	}

}





