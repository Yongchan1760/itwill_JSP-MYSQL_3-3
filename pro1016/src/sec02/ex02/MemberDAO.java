package sec02.ex02;

import java.sql.*;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import javax.xml.datatype.DatatypeFactory;

//����Ŭ DBMS�� ���̺�� ���� �Ͽ� �۾��� Ŭ���� 
public class MemberDAO {

	//�� �װ��� ���� �������� �̿��ؼ� ����Ŭ DB�� ������ ������ ���ϰ� �ִ� Connection��ü�� ������ ���� ����
	private Connection con;
	
	//DB�� ������ �츮�� ���� SQL���� ������ ������ ���� ��ü�� ���� ���� ����
//	private Statement  stmt;
	//Statement�������̽��� ������ �ڽİ�ü ���~~ 
	//PreparedStatement�������̽��� ������ �ڽİ�ü�� ����ϱ� ���� ���� ����
	private PreparedStatement pstmt;
	
	//�˻��� ȸ���������� �ӽ÷� ������ �޸� ��ü�� ���� ���� ����
	private ResultSet  rs;
	
	//Ŀ�ؼ�Ǯ ��ü�� ������ ���� ���� 
	private DataSource dataFactory;
	
	//�⺻ ������ ���� : JNDI����� �̿��Ͽ�  context.xml������ Resource�� �ҷ��� Ŀ�ؼ�Ǯ�� ��´�.
	public MemberDAO() {   
		try{
			//��Ĺ�� ����Ǹ� context.xml�� <Resource/>�±��� ������ �о��
			//��Ĺ �޸𸮿� ������Ʈ���� Context��ü���� �����մϴ�.
			//�̶� InitialContext��ü�� �ϴ� ������ 
			//��Ĺ ����� context.xml�� ���ؼ� ������ Context��ü�鿡 �����ϴ� ������ �մϴ�.
			Context ctx = new InitialContext();
			
			//JNDI������� �����ϱ� ���� �⺻ ���(java:/comp/env)�� ���� �մϴ�
			//lookup("java:/comp/env")�� �� �� ȯ�� ������ ���õ� ���ؽ�Ʈ ��ü�� �����ϱ� ���� �⺻�ּ��Դϴ�.
			Context envContext = (Context)ctx.lookup("java:/comp/env");
			
			/*Ŀ�ؼ�Ǯ ���*/
			//�׷��� �ٽ� ��Ĺ��  context.xml�� ������ <Resource name="jdbc/oracle".../>�±��� 
			//name�� "jdbc/oracle"�� �̿��� ��Ĺ�� �̸� ������ DataSource��ü(Ŀ�ؼ�Ǯ ������ �ϴ� ��ü)�� �޾ƿɴϴ�
			dataFactory = (DataSource)envContext.lookup("jdbc/oracle");
			
			
		}catch(Exception e){
			System.out.println("Ŀ�ؼ�Ǯ(DataSource��ü)��� ����" + e);
		}
	}//MemberDAO������ 
	
	
	//DB�� ��� ȸ�������� ��ȸ �ϴ� ������ �޼ҵ�
	public ArrayList listMembers(){
		
		ArrayList list = new ArrayList(); //�������� �þ�� �迭��ü �޸� ����
		
		try{
			//DataSource(Ŀ�ؼ�Ǯ)��ü ������ Connection��ü�� ������ DBMS�� ������ ���� 
			con = dataFactory.getConnection(); //DB���� 
			
			//5. Query�ۼ��ϱ�
			String query = "select * from t_member";
		
			//�߰� > Connection��ü�� preparedStatement()�޼ҵ� ȣ���..
			//������ SQL������ ���ڷ� ���� �ϸ�  SQL������  PreparedStatement���ఴü�� ������ 
			//PreparedStatement���ఴü ��ü�� ��ȯ �޴´�.
			pstmt = con.prepareStatement(query);
			
			//6. Query DBMS�� �����Ͽ� �����ϱ�
			//Select�������� ȸ�������� �˻���  �˻��� ��� ���ڵ���� ResultSet��ü�� ��� ���
			//rs  = stmt.executeQuery(query);
			rs = pstmt.executeQuery();
			
		
			//�˻��� �����Ͱ� ResultSet��ü �޸𸮿� ���� �ϴ� ���� �ݺ�
			while (rs.next()) {
				//7. select���� ��� �˻��� ������� ����� ResultSet������ ������ ��������	
				String id = rs.getString("id"); //�˻��� id ��� 
				String pwd = rs.getString("pwd"); //�˻��� ��й�ȣ ��� 
				String name = rs.getString("name");//�˻��� ȸ���̸� ��� 
				String email = rs.getString("email");//�˻��� ȸ���� �̸����ּ� ��� 
				Date joinDate = rs.getDate("joinDate");//�˻��� ȸ���� ���Գ�¥ ���� ��� 
				
				//�� ������ ����� ��ȸ�� ���÷����� �ٽ� MemberVO��ü�� ������ 
				//�װ�ü ���ο� �ִ� ������ �ν��Ͻ� ������ �����մϴ�.(setter�޼ҵ� ȣ��)
				MemberVO vo = new MemberVO();
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoinDate(joinDate);
				
				//���� ������ MemberVO��ü�� �ٽ� ArrayList�������̹迭�� �߰��ؼ� ���� ��Ų��.
				list.add(vo);
			}
			
		}catch(Exception e){
			System.out.println("listMembers�޼ҵ� ���ο��� ���� : " + e);
		
		}finally{
			
			try {
				//8.�ڿ�����
				if(rs != null){//ResultSet��ü�� ����ϰ� �ִٸ�
					//�ڿ�����
					rs.close();
				}
				if(pstmt != null){
					pstmt.close();
				}
				if(con != null){
					con.close(); //DataSoruceĿ�ؼ�Ǯ�� Connection�ݳ� 
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}		
		}
		
		return list; //DB�κ��� �˻��� ȸ���������� ArrayList�迭�� ����Ǿ� �ֱ⋚����
					 //���� listMembers�޼ҵ带 ȣ���ϴ� �������� ArrayList�迭 ��ü�� ��ȯ
	}//listMembers()�޼ҵ� ��
	
	public void addMember(MemberVO memberVO){
		try {
			//1. db����
			//-> datasource Ŀ�ؼ�Ǯ ������ ����Ǿ� �ִ� db�� �̸� ������ ���� connection ��ü ��� 
			con=dataFactory.getConnection();
			
			//2.DB�� INSERTȸ������ ��ų �������� MEMBERVO��ü ������ �������� ����� �� ��� 
				String id=memberVO.getId();
				String pwd=memberVO.getPwd();
				String name=memberVO.getName();
				String email=memberVO.getEmail();
				
				//3. insert���� ����� 
				String query="insert into t_member(id,pwd,name,email)values(?,?,?,?)";
				
				//4. insert ���� ��ü�߿���..? ��ȣ�� �����Ǵ� ���� ������ ��ü ���ڿ���  
				//oraclepreparedstatementwrapper ���ఴü�� ���.. �̰� ��������
				//���ఴü[ ��ü�� ��ȯ �޴´�.
				pstmt=con.prepareStatement(query);
				
				//5.?��ȣ�鿡 �����Ǵ� ������ �츮�� �Է��� ȸ��������� ����������.
				
				pstmt.setString(1, id);
				pstmt.setString(2, pwd);
				pstmt.setString(3, name);
				pstmt.setString(4, email);
				
				//6.db�� insert 
				pstmt.executeUpdate();
				//���ǰ��� �̿��ؼ� insert, update,delete �����ϴ�.
		} catch (Exception e) {
			System.out.println("addmember�޼ҵ� ȣ�����"+e);
		}finally {
			//�ڿ����� 
			try {
				//8.�ڿ�����
				if(rs != null){//ResultSet��ü�� ����ϰ� �ִٸ�
					//�ڿ�����
					rs.close();
				}
				if(pstmt != null){
					pstmt.close();
				}
				if(con != null){
					con.close(); //DataSoruceĿ�ؼ�Ǯ�� Connection�ݳ� 
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}		
		}//finally��
	}//addmember()�޼ҵ� ��
	//memberform.html���� �Է��� ȸ���������� �������� ������ 
		//���� ���ο��� �Է��� ȸ����������-> memberVO��ü�� �������� �����Ͽ� 
		// memberDAO��ü�� addmember�޼ҵ� ȣ��� �Ű������� �����ϰ� �ȴ�.
		//���޹��� memberVO ��ü�� ������������ �̿��� db�� �����Ͽ� insert�۾��ϴ� �޼ҵ�

	public void delMember(String id) {
		try {
			//1. db����
			//-> datasource Ŀ�ؼ�Ǯ ������ ����Ǿ� �ִ� db�� �̸� ������ ���� connection ��ü ��� 
			con=dataFactory.getConnection();
			
			//2.query�� (delete���� �����)
			//�Ű������� ���޹��� ȸ�� id�� �ش�Ǵ� ȸ�����ڵ带 �������Ѷ�!
			String query="delete from t_member where id=?";
			
			
			//3. connection ��ü�� preparestatement()�޼ҵ带 ȣ���Ͽ�
			//dbms�� delete���� ��ü�� �����Ͽ� �����ų preparestatement���ఴü�� ��ȯ�޴´�.
			//�� �� delete���� ��ü��  preparestatement()ȣ��� �����Ͽ� ?��ȣ�� �����Ǵ� �������� ������
			
			pstmt=con.prepareStatement(query);
			
			//3-1 preparedstatment ���ఴü�� ? ��ȣ�� �����Ǵ� ���� ����
			pstmt.setString(1,id);
			
			
			//4. preparedstatement���ఴü�� excuteupdate�޼ҵ带 ȣ����
			//delete��ü ������ db�� �����Ͽ� ����!
			
			pstmt.executeUpdate();
			//insert, update, delete���� ���డ�� 
			
		
		} 
		catch (Exception e) {
			System.out.println("delmember�޼ҵ� ���ο��� ���� :"+e.toString());
			
		}
		try{
			if(con!=null) con.close();
			if(pstmt !=null) pstmt.close();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		
	
	}
	//���� ��ũ a�±׸� Ŭ�������� ������ ���� �����ؿ� ȸ�� id�� delmember�޼ҵ��� ���ڷ� ���޹޾�
	//db�� ����Ǿ��ִ� ȸ�� �Ѹ��� ������ ����
	


}//MemberDAOŬ���� ��





