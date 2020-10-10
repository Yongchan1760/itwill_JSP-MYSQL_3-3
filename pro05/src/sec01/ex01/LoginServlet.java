package sec01.ex01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//����1. �������� �ּ�â�� http://localhost:8080/pro05/login.html�� ��û �մϴ�.
//      ���̵� , ��й�ȣ�� �Է� �Ҽ� �ִ� ȭ���� ��Ÿ����

//����2. login.htmlȭ�鿡�� ���̵�� ��й�ȣ�� �Է�����  �α������� ��ư�� Ŭ���ϸ� 
//      �Է��� ���̵�� ��й�ȣ�� request���尴ü �޸𸮿� ������ �������� ����(����)�Ѵ�.

//����3. GET������� ��û �߱� ������ doGet�޼ҵ尡 ȣ�� �ɶ�  �Ű������� request���尴ü �޸𸮸� ���� �޴´�

//����4. request���尴ü �޸𸮿����� �����  Ŭ���̾�Ʈ�� �Է��� ��û���� ����� ��´�.

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. Ŭ���̾�Ʈ�� �Է��� ��(��û�� ��) ��� 
    	
    	// - ���۵Ǿ� �� �����Ͱ� �ѱ��� �����ϸ� �ѱ��� �����Ƿ� request���尴ü �޸𸮿� ���ڵ� ��ļ���
    	request.setCharacterEncoding("UTF-8");
    	
    	// - request��ü�� getParameter()�޼ҵ带 �̿��Ͽ� �Է��� ��û������ request�޸𸮿��� ��������
    	// �Է��� ���̵� ���
    	//               request.getParameter("input�±��� name�Ӽ���");
    	String user_id = request.getParameter("user_id");
    	
    	// �Է��� ��й�ȣ ���
    	String user_pw = request.getParameter("user_pw");
    	
    	System.out.println("�Է��� ���̵�:" +   user_id);
    	System.out.println("�Է��� ��й�ȣ:" + user_pw);
    	
    	//2. ��û�� ���� �̿��ؼ� Ŭ���̾�Ʈ�� ���������� ������ ���� ����
    	
    	//3. ������ �����Ұ��� Ŭ���̾�Ʈ�� ���������� �ٽ� �����ؼ� ���(����)
    	
    	
    	System.out.println("doGet�޼ҵ� ȣ���");
	}

    @Override 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost�޼ҵ� ȣ���");
	}

}
