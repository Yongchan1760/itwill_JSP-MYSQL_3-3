package sec01.ex01;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/input2")
public class InputServlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Ŭ���̾�Ʈ�� ��û�� �����߿� �ѱ��� �����ϸ� request�޸𸮿��� �����Ë� �ѱ��� �����Ƿ�
		//�ѱ�ó��
		request.setCharacterEncoding("UTF-8");
	
	//���۵Ǿ� ���� �����Ͱ� ���� ��쿡�� getParameterNames()�޼ҵ� ȣ���Ͽ� 
	//<input>�±��� name�Ӽ������� ���~~ Enumeration�������̽��� ������ �ڽĹ迭��ü�� ��� ���Ϲ޴´�
		Enumeration  enu = request.getParameterNames();
		
		while (enu.hasMoreElements()) {//Enumeration�迭�� ���� ����Ǿ� �ִ� ���� �ݺ� 
			
			//input�±��� name�Ӽ����� Enumeraction�ݺ��� ������ �ϴ� �迭���� ������� �����´�.
			Object obj = enu.nextElement();//��ĳ������ �Ͼ
			
			String name = (String)obj;//�ٿ�ĳ����
			
			String[] values = request.getParameterValues(name);
			
			for(String str : values){
				
				System.out.println("name�Ӽ��� : " + name + ",value=" + str);
			}
			
		}
		
	}

	
	
}



