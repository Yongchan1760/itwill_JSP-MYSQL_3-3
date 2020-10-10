package sec01.ex01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//����1. Ŭ���̾�Ʈ�� ���������� �̿��ؼ� �Ʒ��� ThirdSertvlet������������ ��û�մϴ�.
//      ��û�� �ּ� : http://192.168.3.200:8080/pro05/third

//����2. ��Ĺ(�����ø����̼Ǽ���)��  ����û �ּҿ� �ش��ϴ�  ThirdServelt������������ ã�� ��Ī��Ų�� 
//      ThirdServlet�� ���� ��ŵ�ϴ�.

//����3. Ŭ���̾�Ʈ�� �������� �ּ�â�� �ּҸ� �Է��ؼ� ��û(GET��û���) �Ͽ����� ThirdServletŬ����������
//      doGet()�޼ҵ尡 �ڵ� ȣ��Ǹ鼭  �ѻ���� ��û�� �ϳ��� HttpServletRequest���尴ü �޸� ���� �� ��
//      doGet()�޼ҵ��� �Ű������� �װ�ü�� ���� �޾� ��� �ϰ� �˴ϴ�.

//����3. doGet�޼ҵ� ���ο��� 
//      ��û���� HttpServletRequest��ü �޸𸮸� �̿��ؼ� ��û�� Ŭ���̾�Ʈ�� ������ ������ �ִ�.

@WebServlet("/third")
public class ThirdServlet extends HttpServlet {
	
	//Ŭ���̾�Ʈ�� GET������� ��û�ϸ� ȣ��Ǵ� �ݹ� �޼ҵ��  
	//��û �ϴ� ���� ������ ���ο� HttpServletRequest��ü �޸𸮰� ���� �Ǹ鼭 ��û�� ������ ���� ������ �ִ�.
	@Override
	protected void doGet(HttpServletRequest request, 
			             HttpServletResponse response) 
			            		 throws ServletException, IOException {
		
		//Ŭ���̾�Ʈ�� ��û�� ��ü �ּ� http://192.168.3.200:8080/pro05/third �߿���...
		//��Ĺ�� ������Ʈ�� ������ �� �ְ� ���ִ� ���ؽ�Ʈ�ּ�(pro05)�� ���� �� �ִ�.
		String path = request.getContextPath(); //  /pro05  <--���ؽ�Ʈ �ּ� ��� 
		System.out.println(path);
	}

}

