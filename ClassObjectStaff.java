
/*
	定义一个员工类，自己分析出几个成员，然后给出成员变量，构造方法，getXxx()/setXxx() 方法，以及一个现实所有成员信息的方法，并测试。
	员工类： ClassObjectStaff
	成员变量：name,birthday,sex,high,staffId,address
	构造方法：无参构造，有参构造
	成员方法：setXxx()/getXxx()/
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
	//定义私有成员变量
	private String name;
	private String sex;
	private int age;
	private int high;
	private String staffId;
	private String address;
	//定义构造方法
	public ClassStaff(){
		System.out.println("这是无参构造方法。");
	}
	public ClassStaff(String name){
		this.name = name;
	}	
	public ClassStaff(String name,String sex){
		this.name = name;
		this.sex = sex;
	}
	
	//定义成员方法
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
	
	//定义一个输入员工信息的方法
	public void inputStaff(){
		Scanner input = new Scanner(System.in);
		System.out.println("您将输入员工信息，包括员工姓名、性别、身高、年龄、员工号，家庭住址。");
		System.out.print("请输入员工姓名：");
		this.name = input.nextLine();
		//setName(input.nextLine());
		System.out.print("请输入员工性别：");
		this.sex = input.nextLine();
		//setSex(input.nextLine());	
		System.out.print("请输入员工年龄：");
		this.age = input.nextInt();
		//setAge(input.nextInt());		
		System.out.print("请输入员工身高：");
		this.high = input.nextInt();
		//setHigh(input.nextInt());		    
		input.nextLine();   //键盘输入int类型后，下面输入字符型直接跳转，可能的解释，回车字符在寄存器中，直到下一个可以接收他的方法。
		System.out.print("请输入员工工号：");
		this.staffId = input.nextLine();
		//setStaffId(input.nextLine());	
		System.out.print("请输入员工住址：");
		this.address = input.nextLine();
		//setAddress(input.nextLine());	
	}
	
	//定义一个输出员工信息的方法
	public void outputStaff(){
		System.out.println("您输入的员工信息为：");
		System.out.println("姓名--"+getName());
		System.out.println("性别--"+getSex());
		System.out.println("年龄--"+getAge());
		System.out.println("身高--"+getHigh());
		System.out.println("工号--"+getStaffId());
		System.out.println("住址--"+getAddress());
	}
	
	
}
