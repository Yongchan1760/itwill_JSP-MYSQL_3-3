package sec01.ex02;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/first1")
public class FirstServlet1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Ŭ���̾�Ʈ�� ���������� ����(���)�� ������ ���� ����
		resp.setContentType("text/html;charset=utf-8");
		
		//���÷��� ����� ���û(������) ��� ->resp.addHeader("Refresh","�޽Ľð�;url=���û�� ������ �����ּ�")
		resp.addHeader("Refresh","1;url=second1");
		
		//addHeader �޼ҵ� ȣ���..refresh�� �����ϰ� 1���� url =second�� ������ secondservlet1 
		//�ι��� �������� ���û�ϰ� �˴ϴ�. 
		
	}
	
}