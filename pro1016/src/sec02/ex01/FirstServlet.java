package sec02.ex01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/f")
public class FirstServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request,
						HttpServletResponse response) 
						throws ServletException, IOException {
		//�ѱ�ó�� 
		request.setCharacterEncoding("utf-8");//�������°� 
		response.setContentType("text/html;charset=utf-8");//Ŭ���̾�Ʈ�� ������
		
		
		//������������ ��û�� request��ü �޸𸮿� address������ ����� ���ϱ� �� ���ε�(����)�մϴ�.
		request.setAttribute("address", "����� ���ϱ�");
		
		//�ι�° ���� ���û (������)
		response.sendRedirect("s");
	}
	
}
