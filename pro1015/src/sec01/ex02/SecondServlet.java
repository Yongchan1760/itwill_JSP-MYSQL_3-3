package sec01.ex02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//second ���� Ŭ������ ù���� ������ firstsevlet �������� ���û�� �޾�
//�����ϴ� �ι��� ���� Ŭ���� �Դϴ�.
@WebServlet("/second1")
public class SecondServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Ŭ���̾�Ʈ�� ���������� ����(���)�� ������ ���� ����
		resp.setContentType("text/html;charset=utf-8");
		
		//Ŭ���̾�Ʈ�� ���������� ����(���)�� ��Ʈ�� ��� ����
		
		PrintWriter out=resp.getWriter();
		
		out.println("<html><body>");
		out.println("refresh����� �̿��� (���û)�ǽ��Դϴ�..");
		out.println("</body></html>");
	}
	
}
