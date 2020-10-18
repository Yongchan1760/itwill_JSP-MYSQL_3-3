package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*ù��° �������� ���� ���޵� request��ü �޸𸮿� ����� addressŰ�� �����Ǵ� ��ü�� ��´�
request ��ü�� ����� ������ ��������*/
@WebServlet("/s1")
public class SecondServlet1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request,
						HttpServletResponse respond)
						throws ServletException, IOException {
			request.setCharacterEncoding("utf-8");
			respond.setContentType("text/html;charset=utf-8");
			PrintWriter out =respond.getWriter();
			
			//��ȯ�� �θ� ������Ʈ Ÿ������  ��ȯ�̵Ǳ⋚�� 
			Object obj=request.getAttribute("address");//��ĳ�������Ͼ 
			String addresss  =(String)obj;
			System.out.println(obj);
			//����� ���ϱ� -> ������ ������� �ι�° ������ ���û
			//�ϱ⋚���� �ι��� ���� ���û�� ���������� ��ġ���ʰ� ���û
			//�Ѵ�.
			out.print(addresss.toString());
			//�ι�° ������ ���û ������ �����̷�Ʈ ������� ���û�߱⋚���� 
			
		
	}
	
}
