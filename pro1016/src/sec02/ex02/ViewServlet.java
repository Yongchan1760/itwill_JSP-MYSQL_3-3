package sec02.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//두번째 서블릿

// 첫번째 서블릿에서 조회된 회원정보들을 모두 arraylist에 저장후 
//arraylist배열을 request바인딩 한후
//두번째 서블릿을 재요청 받을떄 request 객체를 공유받아서 사용 
@WebServlet("/viewMembers")
public class ViewServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse respond) throws ServletException, IOException {
		
		//꺼내올 리퀘스트 안에 한글이 있을걸 대비해 인코딩
		request.setCharacterEncoding("utf-8");
		//클라이언트에 내보낼 방식 인코딩 설정
		respond.setContentType("text/html;charset=utf-8");
		//클라이언트 스트림 통로 만들기 
		PrintWriter out =respond.getWriter();
		//memberservlet서블릿 으로부터 바인딩해서 넘어온 request 객체 영역내부에 저장된
		//db로부터 검색한 회우너정보들 (arraylist에저장된 membervo객체들)을 꺼내어 가져옴
		ArrayList memberList=(ArrayList)request.getAttribute("list");
		//arraylist배열에 저장되어있는 조회한 회원정보들 (membervo)을 얻어 반복해서 출력
		out.print("<html><body>");
			out.print("<table border='1'>");
				out.print("<tr align='center' bgcolor='lightgreen'>");
					out.print("<th>아이디</th><th>비밀번호</th><th>이름</th><th>이메일</th><th>가입일</th>"
							+ "<th>삭제</th>");
				out.print("</tr>");
					for (int i = 0; i < memberList.size(); i++) {
						//Object obj=memberList.get(i);//업캐스팅
						
						//검색한 회원정보(membervo)를 arraylist배열의 각인덱스 위치로부터 얻는다.
						MemberVO memberVO=(MemberVO)memberList.get(i);//업캐스팅 이후 다운 캐스팅
						out.print("<tr>");
						out.print("<td>"+memberVO.getId()+"</td>"
								+ "<td>"+memberVO.getPwd()+"</td>"
								+ "<td>"+memberVO.getName()+"</td>"
								+ "<td>"+memberVO.getEmail()+"</td>"
								+ "<td>"+memberVO.getJoinDate()+"</td>"
								+ "<td><a href='/pro08/member?command=delmember&id="+memberVO.getId()+"'>삭제</a></td>");
						out.print("</tr>");
					}
			out.print("</table>");
		out.print("</body></html>");
	}

}
