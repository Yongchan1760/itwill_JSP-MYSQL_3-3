package sec01.ex01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/input")
public class InputServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Ŭ���̾�Ʈ�� ��û�� �����߿� �ѱ��� �����ϸ� request�޸𸮿��� �����Ë� �ѱ��� �����Ƿ�
		//�ѱ�ó��
		request.setCharacterEncoding("UTF-8");
		
		//Ŭ���̾�Ʈ�� ��û�� �� ���
		//- �Է��� ���̵� , ��й�ȣ ��� 
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		System.out.println("�Է��� ���̵�:" + user_id);
		System.out.println("�Է��� ��й�ȣ:" + user_pw);
		
		//- üũ�ڽ��� üũ�� �������� �Ѳ����� ���� �ޱ� ���� 
		//  getParameterValues("input�� name�Ӽ���")�޼ҵ� ȣ��! 
		//  ��ȯ���� String[]�迭�� ��ȯ �޽��ϴ�.
		String[] subject = request.getParameterValues("subject");
		
		for(int i=0; i<subject.length; i++){
			System.out.println("������ ���� : " + subject[i]);
		}
		System.out.println("-------------------------------------");
		//���� for��
		for(String str  : subject){
			System.out.println("������ ���� : " + str);
		}
		
		
	}

	
	
}



