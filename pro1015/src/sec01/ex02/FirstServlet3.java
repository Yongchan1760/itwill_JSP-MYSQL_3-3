package sec01.ex02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/first3")
public class FirstServlet3 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Ŭ���̾�Ʈ�� ���������� ����(���)�� ������ ���� ����
		resp.setContentType("text/html;charset=utf-8");
		
		//dispatch ����� �̿��� �ι�° ������ secondservlet3���� ���û(������)
		//�ؼ� : request ��ü�� get�޼ҵ� ȣ��� ..���û�� �ι��� ������ �����ּ� �̸��� ����
		//�ϸ� �� �����ּҸ� ������ requestdispacher��ü�� ��ȯ�޴´�.
		//RequestDispatcher dispatcher=req.getRequestDispatcher("���û�� �ι�° ������ �����ּ�");
		RequestDispatcher dispatcher=req.getRequestDispatcher("second3");
	
		dispatcher.forward(req, resp);//�ι�° ���� ���û�� 
									//������ �����ϴ� request,respond��ü�� ������
		
		//�߿� !! ������ ����� ������ �����? �ι��� ������������ ���û�Ҷ� ���������� ��ġ�� �ʰ�
		//���û �ϱ⋚���� 
		
		//������1.ù���� ���� �������κ��� ���޹��� request��ü �޸𸮸� �ι��� ������������ �����ؼ� 
		//����Ҽ��ִ�. 
		
		//������2. Ŭ���̾�Ʈ�� ������ �ι�° ������������ ��°���� ȭ�鿡 ��������.
		// �������� �ּ�â�� �ּҸ� ���� ó�� ��û�Ҷ��� ù���� ������������ ��û�ּҰ� �״�� �����־� ���ȿ�����.
	}
	
}
