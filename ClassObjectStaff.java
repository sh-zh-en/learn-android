
/*
	����һ��Ա���࣬�Լ�������������Ա��Ȼ�������Ա���������췽����getXxx()/setXxx() �������Լ�һ����ʵ���г�Ա��Ϣ�ķ����������ԡ�
	Ա���ࣺ ClassObjectStaff
	��Ա������name,birthday,sex,high,staffId,address
	���췽�����޲ι��죬�вι���
	��Ա������setXxx()/getXxx()/
*/	
import java.util.Scanner;

class ClassObjectStaff{
	public static void main(String[] args){
		ClassStaff staff = new ClassStaff();
		staff.inputStaff(); 
		System.out.println();	
		staff.outputStaff();
	}
}

class ClassStaff{
	//����˽�г�Ա����
	private String name;
	private String sex;
	private int age;
	private int high;
	private String staffId;
	private String address;
	//���幹�췽��
	public ClassStaff(){
		System.out.println("�����޲ι��췽����");
	}
	public ClassStaff(String name){
		this.name = name;
	}	
	public ClassStaff(String name,String sex){
		this.name = name;
		this.sex = sex;
	}
	
	//�����Ա����
	public void setName(String name){
		this.name = name;
	}
	public void setSex(String sex){
		this.sex = sex;
	}
	public void setAge(int age ){
		this.age = age;
	}
	public void setHigh(int high){
		this.high = high;
	}
	public void setStaffId(String staffId){
		this.staffId = staffId;
	}
	public void setAddress(String address){
		this.address = address;
	}
	
	public String getName(){
		return name;
	}
	public String getSex(){
		return sex;
	}
	public int getAge(){
		return age;
	}
	public int getHigh(){
		return high;
	}
	public String getStaffId(){
		return staffId;
	}
	public String getAddress(){
		return address;
	}
	
	//����һ������Ա����Ϣ�ķ���
	public void inputStaff(){
		Scanner input = new Scanner(System.in);
		System.out.println("��������Ա����Ϣ������Ա���������Ա����ߡ����䡢Ա���ţ���ͥסַ��");
		System.out.print("������Ա��������");
		this.name = input.nextLine();
		//setName(input.nextLine());
		System.out.print("������Ա���Ա�");
		this.sex = input.nextLine();
		//setSex(input.nextLine());	
		System.out.print("������Ա�����䣺");
		this.age = input.nextInt();
		//setAge(input.nextInt());		
		System.out.print("������Ա�����ߣ�");
		this.high = input.nextInt();
		//setHigh(input.nextInt());		    
		input.nextLine();   //��������int���ͺ����������ַ���ֱ����ת�����ܵĽ��ͣ��س��ַ��ڼĴ����У�ֱ����һ�����Խ������ķ�����
		System.out.print("������Ա�����ţ�");
		this.staffId = input.nextLine();
		//setStaffId(input.nextLine());	
		System.out.print("������Ա��סַ��");
		this.address = input.nextLine();
		//setAddress(input.nextLine());	
	}
	
	//����һ�����Ա����Ϣ�ķ���
	public void outputStaff(){
		System.out.println("�������Ա����ϢΪ��");
		System.out.println("����--"+getName());
		System.out.println("�Ա�--"+getSex());
		System.out.println("����--"+getAge());
		System.out.println("����--"+getHigh());
		System.out.println("����--"+getStaffId());
		System.out.println("סַ--"+getAddress());
	}
	
	
}