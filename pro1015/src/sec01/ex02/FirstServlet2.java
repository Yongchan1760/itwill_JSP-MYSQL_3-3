package sec01.ex02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/first2")
public class FirstServlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Ŭ���̾�Ʈ�� ���������� ����(���)�� ������ ���� ����
		resp.setContentType("text/html;charset=utf-8");
		
		//ù���� �������� out��ü�� �̿��Ͽ� (��½�Ʈ�� ���)�� �̿��� �ڹ� ��ũ��Ʈ �ڵ带
		//�ۼ��� �ι���  secondservlet2�� location������� ���û�ؼ� �̵���Ŵ 
		PrintWriter outt=resp.getWriter();//1����Ʈ ������ ����
		
		outt.print("<script type='text/javascript'>");
		outt.print("location.href='second2'");//���û
		outt.print("</script>");
	}
	
}
