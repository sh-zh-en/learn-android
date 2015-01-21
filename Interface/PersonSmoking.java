/*
	��ʦ��ѧ��������������̵Ķ��⹦�ܡ�
	������
		�ӿڣ�Smoking
		���ࣺPerson  // ��ʦ��ѧ���Ĺ���
		���ࣺTeacher
			  Student
		�������̣�SmokingTeacher
				  SmokingStudent
		
*/
interface  Smoking{
	public abstract void smoking();
}
abstract class Person{
	private String name;
	private int age;
	public Person(){};
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public abstract void eat();
	public void sleep(){
		System.out.println("�����˶���Ҫ��Ϣ��");
	}
}
class Teacher extends Person{
	public Teacher(){}
	public Teacher(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("��ʦ�ڽ̹�ʳ�óԷ���");
	}
}
class Student extends Person{
	public Student(){}
	public Student(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("ѧ����ѧ��ʳ�óԷ���");
	}
}
class SmokingTeacher extends Teacher implements Smoking{
	public SmokingTeacher(){}
	public SmokingTeacher(String name,int age){
		super(name,age);
	}
	public void smoking(){
		System.out.println("���̵���ʦ��");
	}
}
class SmokingStudent extends Teacher implements Smoking{
	public SmokingStudent(){}
	public SmokingStudent(String name,int age){
		super(name,age);
	}
	public void smoking(){
		System.out.println("���̵�ѧ����");
	}
}

class  PersonSmoking{
	public static void main(String[] args){
		System.out.println("//SmokingStudent ss = new SmokingStudent(\"Tom\",34);" );
		SmokingStudent ss = new SmokingStudent("Tom",34);
		String name = ss.getName();
		int age = ss.getAge();
		System.out.println("name = " + name + ", age = " + age);
		ss.smoking();
		ss.eat();
		ss.sleep();
		System.out.println("-------------------------" );	
		
		System.out.println("Student s = new Student(\"Jeck\",35);	" );
		Student s = new Student("Jeck",35);		
		String name2 = s.getName();
		int age2 = s.getAge();
		System.out.println("name2 = " + name2 + ", age2 = " + age2);
		s.sleep();
		s.eat();
		System.out.println("-------------------------" );	
		
		//��̬��ʹ�ã�ֻ���ڽӿڵ�ʱ�򣬲����ö�̬����
		System.out.println("Person s = new Teacher(\"Lucy\",36);	" );
		Person p = new Teacher("Lucy",36);
		String name3 = p.getName();
		int age3 = p.getAge();
		System.out.println("name3 = " + name3 + ", age3 = " + age3);
		p.sleep();
		p.eat();
		System.out.println("-------------------------" );	
	}
}









