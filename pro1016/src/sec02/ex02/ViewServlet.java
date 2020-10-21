package sec02.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//�ι�° ����

// ù��° �������� ��ȸ�� ȸ���������� ��� arraylist�� ������ 
//arraylist�迭�� request���ε� ����
//�ι�° ������ ���û ������ request ��ü�� �����޾Ƽ� ��� 
@WebServlet("/viewMembers")
public class ViewServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse respond) throws ServletException, IOException {
		
		//������ ������Ʈ �ȿ� �ѱ��� ������ ����� ���ڵ�
		request.setCharacterEncoding("utf-8");
		//Ŭ���̾�Ʈ�� ������ ��� ���ڵ� ����
		respond.setContentType("text/html;charset=utf-8");
		//Ŭ���̾�Ʈ ��Ʈ�� ��� ����� 
		PrintWriter out =respond.getWriter();
		//memberservlet���� ���κ��� ���ε��ؼ� �Ѿ�� request ��ü �������ο� �����
		//db�κ��� �˻��� ȸ��������� (arraylist������� membervo��ü��)�� ������ ������
		ArrayList memberList=(ArrayList)request.getAttribute("list");
		//arraylist�迭�� ����Ǿ��ִ� ��ȸ�� ȸ�������� (membervo)�� ��� �ݺ��ؼ� ���
		out.print("<html><body>");
			out.print("<table border='1'>");
				out.print("<tr align='center' bgcolor='lightgreen'>");
					out.print("<th>���̵�</th><th>��й�ȣ</th><th>�̸�</th><th>�̸���</th><th>������</th>"
							+ "<th>����</th>");
				out.print("</tr>");
					for (int i = 0; i < memberList.size(); i++) {
						//Object obj=memberList.get(i);//��ĳ����
						
						//�˻��� ȸ������(membervo)�� arraylist�迭�� ���ε��� ��ġ�κ��� ��´�.
						MemberVO memberVO=(MemberVO)memberList.get(i);//��ĳ���� ���� �ٿ� ĳ����
						out.print("<tr>");
						out.print("<td>"+memberVO.getId()+"</td>"
								+ "<td>"+memberVO.getPwd()+"</td>"
								+ "<td>"+memberVO.getName()+"</td>"
								+ "<td>"+memberVO.getEmail()+"</td>"
								+ "<td>"+memberVO.getJoinDate()+"</td>"
								+ "<td><a href='/pro08/member?command=delmember&id="+memberVO.getId()+"'>����</a></td>");
						out.print("</tr>");
					}
			out.print("</table>");
		out.print("</body></html>");
	}

}
