abstract class Person{
	private  String name;
	private  int age;
	public  Person(){} //���췽��
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	abstract void eat();
}

class Teacher extends Person{
	public Teacher(){}
	public Teacher(String name,int age){
		super(name,age);//
	}
	/*
	public void show(){
		System.out.println("��ʦ�������ǣ�"+ this.name + "�� �����ǣ�");
	}
	*/
	public void eat(){
		System.out.println("��ʦ�ڽ̹�ʳ�óԷ���");
	}
}

class Student extends Person{
	public Student(){}
	public Student(String name,int age){
		super(name,age);
	}
	/*
	public void show(){
		System.out.println("ѧ���������ǣ�"+ super.name + "�� �����ǣ�");
	}
	*/
	public void eat(){
		System.out.println("ѧ����ѧ��ʳ�óԷ���");
	}
}