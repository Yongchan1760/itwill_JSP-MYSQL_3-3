package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;
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
		
		
	}

}





