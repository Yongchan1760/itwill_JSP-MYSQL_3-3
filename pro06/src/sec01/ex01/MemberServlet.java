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

//����1. Ŭ���̾�Ʈ�� �������� �ּ�â��  http://localhost:8080/pro06/member�ּҷ�
//      ȸ�������� ��� DB�� ���� �˻�����~ ��� ��û �Ѵ�.


@WebServlet("/member")
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
		out.print("<table border=1><tr align='center' bgcolor='lightgreen'>");
		out.print("<td>���̵�</td><td>��й�ȣ</td><td>�̸�</td><td>�̸���</td><td>����</td></tr>");
		for (int i = 0; i < list.size(); i++) {
			//��ȸ�� ȸ�������� arraylist��� �������� �迭 ������ ����Ǿ� �����Ƿ� 
			//arraylist �������� �迭�� ����� �˻��� ȸ�������� �ϴϾ� ��´�.
			MemberVO memberVO=(MemberVO) list.get(i);
			
			String id = memberVO.getId(); //�˻��� id ��� 
			String pwd = memberVO.getPwd(); //�˻��� ��й�ȣ ��� 
			String name =memberVO.getName();//�˻��� ȸ���̸� ��� 
			String email = memberVO.getEmail();//�˻��� ȸ���� �̸����ּ� ��� 
			Date joinDate = memberVO.getJoinDate();//�˻��� ȸ���� ���Գ�¥ ���� ��� 
			
			//�� ������ ����� ��ȸ�� ���÷����� �ٽ� MemberVO��ü�� ������ 
			//�װ�ü ���ο� �ִ� ������ �ν��Ͻ� ������ �����մϴ�.(setter�޼ҵ� ȣ��)
			
			//��ȸ�� ȸ�������� �ٱ� for���� <tr> �±׸� �̿��� ����Ʈ�� ����մϴ�.
			
			out.print("<tr><td>"+id+"</td><td>"+
								pwd+"</td><td>"+
								name+"</td><td>"+
								email+"</td><td>"+
								joinDate+"</td></tr>");
		}
		out.print("</table></body></html>");
	}

}





