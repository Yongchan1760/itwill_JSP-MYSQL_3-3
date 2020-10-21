package sec02.ex01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.rmi.server.Dispatcher;


//1. �������� �ּ�â�� �ּҸ� http:localhost:8080/pro07/f1 �Է��Ͽ�
//firstservlet���� ��û 
//2.firstservlet Ŭ���� ���ο��� ���������� ��û���� ���� request��ü �޸𸮿�
//address-����� ���ϱ� ������ ��� ���ε�
//3. ����ġ������� �ι�° ������ secondservlet1������ ���û��
//������ request �޸𸮸� �ι�° �������� ���� ���� �ؼ� ����ϰԵ˴ϴ�.


@WebServlet("/f1")
public class FirstServlet1 extends HttpServlet{

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
		RequestDispatcher dispatcher=request.getRequestDispatcher("s1");
		dispatcher.forward(request, response);
		//�ι��� ���� ��û�� request�� response��ü ����
		}
	
}
