package sec01.ex01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//1. ����� ���� ���� Ŭ���� �����
//- ��Ĺ ���� �ʿ��� ����Ǹ鼭 ����� ���� �ϴ� Ŭ���� 
//- Ŭ���̾�Ʈ�� ���������� �̿��� ��û�� ����� �����ϴ� Ŭ���� 
//- HttpServletŬ������ ��ӹ޴� ���·� ����� ���� ���� Ŭ������ ���� �ؾ��Ѵ�. 

public class FirstServlet extends HttpServlet{

	//�޼ҵ� �������̵� ����Ű -> alt  + shift  + s   v
	
	//init�޼ҵ�� ����Ŭ���� ��û�� �� ó���� �ѹ��� ȣ��Ǵ� �޼ҵ��
	//���� ������ �ʱ�ȭ �۾��� �ַ� ���� �մϴ�.
	//�뵵 : ���� �ʱ⿡ ���� ��� ����� ���õ� ����� �����ϴ� �뵵�� ���˴ϴ�.
	@Override
	public void init() throws ServletException {//��������! �����ص� ȣ��ȴ�.
		System.out.println("init �޼ҵ� ȣ��");
	}
	
	//Ŭ���̾�Ʈ�� GET������� ��û�ϸ� ȣ��Ǵ� �ݹ� �޼ҵ�μ�,
	//��û�� ���� ������ ������ ó���� �޼ҵ� �����̴�.(�ݵ�� �ۼ��� �־�� �ϴ� �޼ҵ�)
	//�뵵 : ���������� �̿��� ��û�� ������ ó�� �ϴ� �޼ҵ� 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet �޼ҵ� ȣ��");
	}

	//������ ����� �����ϰ� ��Ĺ �޸𸮿��� �Ҹ�ɶ� ȣ��Ǵ� �ݹ� �޼ҵ�.
	//������ ������ �۾��� �ַ� �����մϴ�.
	@Override
	public void destroy() {//���� ������. �׷��� �����ص� ȣ��ȴ�.
		System.out.println("destory �޼ҵ� ȣ��");
	}
}
