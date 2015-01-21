abstract class Person{
	private  String name;
	private  int age;
	public  Person(){} //构造方法
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
		System.out.println("教师的名字是："+ this.name + "， 年龄是：");
	}
	*/
	public void eat(){
		System.out.println("老师在教工食堂吃饭。");
	}
}

class Student extends Person{
	public Student(){}
	public Student(String name,int age){
		super(name,age);
	}
	/*
	public void show(){
		System.out.println("学生的名字是："+ super.name + "， 年龄是：");
	}
	*/
	public void eat(){
		System.out.println("学生在学生食堂吃饭。");
	}
}