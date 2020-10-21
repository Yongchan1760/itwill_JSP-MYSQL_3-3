package sec02.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//����1. Ŭ���̾�Ʈ�� �������� �ּ�â��  http://localhost:8080/pro06/member2�ּҷ�
//      ȸ�������� ��� DB�� ���� �˻�����~ ��� ��û �Ѵ�.

@WebServlet("/member2")
public class MemberServlet extends HttpServlet {
	
	//����2. doGet�޼ҵ尡 ȣ��ɶ� ��û�� ���ο� HttpServletRequest��ü �޸𸮸� ���ڷ� ���� �޴´�.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Ŭ���̾�Ʈ���� ������ ������ ���� ����
		response.setContentType("text/html;charset=utf-8");
		//Ŭ���̾�Ʈ�� ���������� ������ ��� ��Ʈ�� ��� ������ �ϴ� PrintWriter��ü ���
		PrintWriter out = response.getWriter();
		
		//DB�۾�(SQL���� �ۼ��Ͽ� ��ȸ�۾�)�� MemberDAO��ü ����
		MemberDAO dao = new MemberDAO();
		
		//listMembers()�޼ҵ带 ȣ���Ͽ�  �˻��� ȸ�������� ���� MembeVO��ü�� �����Ͽ�
		//������ MemberVO��ü���� ���������� ArrayList�������� �迭�� ������
		//DB���� �˻��� ȸ��������(MemberVO��ü��)�� ��� �ִ� ArrayList�迭�� ���� �޴´�.
		ArrayList list = dao.listMembers();
			
		out.print("<html><body>");
		out.print("<table border=1>");
		out.print("<tr align=center bgcolor=lightgreen>");		
		out.print("<td>���̵�</td><td>��й�ȣ</td><td>�̸�</td><td>�̸���</td><td>������</td>");
		out.print("</tr>");
		
		//ArrayList�迭 ���ο� ����� MemberVO��ü���� ������ŭ �ݺ�
		for(int i=0; i<list.size(); i++){
		//��ȸ�� ȸ��������(MemberVO��ü��)�� ArrayList�������� �迭�� ����Ǿ� �����Ƿ�
		//ArrayList�������� �迭 ������ �����Ͽ�  ��ȸ�� ȸ��������(MemberVO)�� ��´�(get(index��ġ��))
			Object obj	 = list.get(i);//ArrayList�迭�� �ε��� ��ġ�� �̿��Ͽ� 
									   //�ε��� ��ġ�� ����� MemberVO��ü�� �����´�.
									   //��ĳ������ �Ͼ 
			//obj.getter?X
			//�ٿ�ĳ������ ���������ν�,  MemeberVO��ü�� getter�޼ҵ���� ȣ���Ҽ� �ְ� �Ǿ���.
			MemberVO memberVO = (MemberVO)obj;
			
			String id = memberVO.getId();//��ȸ�� ȸ�������� ���̵� ���
			String pwd = memberVO.getPwd();
			String name = memberVO.getName();
			String email = memberVO.getEmail();
			Date joinDate = memberVO.getJoinDate();
			
			//��ȸ�� ȸ�� ������ �ٱ� for���� <tr>�±׸� �̿��� ���(����)
			out.print("<tr>");
			out.print("<td>"+id+"</td>");
			out.print("<td>"+pwd+"</td>");
			out.print("<td>"+name+"</td>");
			out.print("<td>"+email+"</td>");
			out.print("<td>"+joinDate+"</td>");
			out.print("</tr>");
			
		}//for	
		out.print("</table>");
		out.print("</body></html>");	
	}
}





