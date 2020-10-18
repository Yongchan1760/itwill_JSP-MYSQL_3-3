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

//�������1. �����(Ŭ���̾�Ʈ)�� �������� �ּ�â�� 
//http://localhost:8080/pro07/memberForm.html   �Է� �Ͽ� ������ ȸ������ ��� ������  �������� ��û

//�������2.
//�������� memberForm.html�������� �ڵ带 �о�鿩 Ŭ���̾�Ʈ�� �������� ȭ�鿡 ȸ������ ȭ���� ���(����) ��.

//�������3.
//Ŭ���̾�Ʈ�� ȸ������ ȭ��(memberForm.html)���� ȸ�������� ���� ��ȸ�� ������ �Է��ϰ� ȸ������ ��ư�� Ŭ����
//<form>�±׸� �̿��� MemberServlet���� ��û��..
//HttpServletRequest��ü �޸𸮿� �Է��� ȸ�������� ������� ���� �Ѵ�.

//�������4. Post���۹������ ��û���� MemberServlet������ doPost�޼ҵ尡 ȣ��ɶ� 
//         �Ű������� HttpServletRequest��ü�޸𸮸� ��´�.
// ����) HttpServletRequest��ü �޸𸮿��� �Է��� ȸ���������� ����Ǿ� �ִ�.

//ù��° �������� ��ȸ�� ȸ�������� arraylist�迭�� �������� �ٽ� request��ü�� arraylist�� ���ε� ����
//�ι�° ���� ���û�� request��ü �޸𸮸� �����Ͽ� ���� �Ͽ�  
//�������� ������ �ϴ� �ι�° ������ �޾� Ŭ���̾�Ʈ�� ���������� ��ȸ�� ȸ������ ���


//ȸ�������� ��� ��ȸ�� ��û�� �ּ� http:localhost:8080/pro08/member
//ù��° ���� 
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
	
	
	//����2. doGet�޼ҵ尡 ȣ��ɶ� ��û�� ���ο� HttpServletRequest��ü �޸𸮸� ���ڷ� ���� �޴´�.
	protected void doHandle(HttpServletRequest request, 
						  HttpServletResponse response)	
								  throws ServletException, IOException {
		
		//1. ���ڵ� ����� ����
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset:utf-8");
		//3.Ŭ���̾�Ʈ�� ���޵� ��� ����
		PrintWriter out =response.getWriter();
		//4. meberdao��ü ����  listMembers()�޼ҵ� ȣ��
		//���� db�� ����� ��� ȸ���������� ��ȸ�ؼ� ��� ����.
		MemberDAO dao=new MemberDAO();
		ArrayList memberList=dao.listMembers();
		//5. ��ȸ�� ȸ������(arraylist)�� �ι�° ���� (���������� )�����ؼ� ����ϱ� ����
		//request ���尴ü �޸𸮿� arraylis�迭�� ���ε���Ŵ
		request.setAttribute("list", memberList);
		//6. �ι�° ���� (�� ������)�� ����ġ������� �������� ������ �����ߴ� request�޸� ����
		RequestDispatcher dispatcher=request.getRequestDispatcher("viewMembers");
		dispatcher.forward(request, response);
		
	}//doPost�޼ҵ� ��
	
}//MemberServletŬ���� ��





