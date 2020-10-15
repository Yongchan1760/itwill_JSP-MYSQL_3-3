package sec01.ex02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//second 3���� Ŭ������ ù���� ������ firstsevlet3 �������� ���û�� �޾�
//�����ϴ� �ι��� ���� Ŭ���� �Դϴ�.
@WebServlet("/second4")
public class SecondServlet4 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Ŭ���̾�Ʈ�� ���������� ����(���)�� ������ ���� ����
		resp.setContentType("text/html;charset=utf-8");
		
		req.setCharacterEncoding("utf-8");
		
		
		//ù��° �������� ���� ���޹޾� ������ request ��ü�޸� ������ ����� �� ��������
		String name=req.getParameter("name");
		
		//Ŭ���̾�Ʈ�� ���������� ����(���)�� ��Ʈ�� ��� ����
		PrintWriter out=resp.getWriter();
		
		
		out.println("<html><body>");
		out.println("�̸�:"+name+"<br>");
		out.println("</body></html>");
	}
	
}
