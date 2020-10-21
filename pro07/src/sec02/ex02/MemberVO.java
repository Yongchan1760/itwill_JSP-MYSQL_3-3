package sec02.ex02;

import java.sql.Date;

//VO(Value Object)������ �ϴ� Ŭ���� 
//VO�����̶�?
//1.DB�� ���̺��� ��ȸ�� ���ڵ��� �÷� ������  �Ʒ��� MemberVOŬ������ �� ������ ���� �ϰų� 
//2.ȸ�� ���� â���� �Է��� ȸ�� ��������  DB�� �߰� ��Ű�� ���� �ӽ÷� �������� ���� ����~~~~
//  new MemberVO��ü�� �����Ͽ� DB�� �ѹ��� ��ī���� �ֱ� ���� ���� ���ִ� Ŭ���� 

//VO������ �ϴ� Ŭ���� ���� ���
	//���̺��� ��ȸ�� ���ڵ��� �÷����� ������ ���� �ؾ� �ϹǷ�
	//�÷� �̸��� ������ �ڷ����� �̸����� ������ �����ϰ�  getter/setter�޼ҵ带 ���� ����� �ش�.

//���� ��� : 
//1. DB�� ���� ��ȸ�� ȸ������ �Ѹ��� ������ �ӽ÷� ������ Ŭ����
//2. ������ �ѻ���� ȸ�������� �ӽ÷� ���� �� ���� Ŭ���� �̸�  
//   DB�� INSERT��  new MemberVO();��ü ������  �߰���ų�� �ִ�.
public class MemberVO {

	//����
	private String	id;  //ȸ�����̵�
	private String pwd;  //ȸ����й�ȣ
	private String name; //ȸ���̸�
	private String email;//ȸ���̸���
	private Date joinDate;//ȸ�������� ��¥ 
	
	//�������� ���� setter , getter�޼ҵ� �߰� ~
	//����Ű  alt + shift + s   r
	
	//setter������ �ϴ� �޼ҵ�?
		//privet���� ����� �� ������ ���� ���Ӱ� ����(����)�� �������� ����
		//�޼ҵ带 �����ϴ� ��Ģ
		//1. public  2. ����Ÿ���� �����Ƿ� ������ void 
		//3. set���λ� �Է��ϰ� �׵ڿ� �������� ���̵� �������� ù���ڸ� �빮�ڷ� �ۼ�
		//4. �Ű������� ���� �ؾ� �Ѵ�.
		//5. �� private���� ����� id������ �Ű������� ���� ���� ���Ѿ� �Ѵ�. this.id = id;
	public void setId(String id){
		this.id = id;
	}
		
	//getter������ �ϴ� �޼ҵ� ?
		//private���� ����� �� ������ ���� ��ȯ�� �������� ����
		//�޼ҵ带 �����ϴ� ��Ģ
		//1.public 2.����Ÿ����������Ѵ�. 
	    //3.get���λ� �Է��ϰ� �׵ڿ� �������� ���̵� �������� ù���ڸ� �빮�ڷ� �ۼ�
		//4.�������� ����� ���� ���� �ؾ� �Ѵ�.
	public String getId(){
		return id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
}



