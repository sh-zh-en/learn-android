/*
	一个标准代码的最终版。
	学生类：
		成员变量：
		构造方法：无参构造，有参构造
		成员方法：getXxx(),setXxx(),show()
*/

class  ClassObject{
	public static void main(String[] args){
		//方式一：无参构造函数 + setXxx()
		System.out.println("方式一：无参构造函数 + setXxx()。");
		Student stu01 = new Student();
		stu01.setName("Java Class");
		stu01.setAge(23);
		stu01.show();
		System.out.println("stu01.getName = "+stu01.getName()+",stu01.getAge = "+stu01.getAge());
		System.out.println("---------------------------------");
		
		//方式二：有参构造函数给属性赋值
		System.out.println("方式二：有参构造函数给属性赋值");
		Student stu02 = new Student("Java Object", 23);
		stu02.show();
		System.out.println("stu02.getName = "+stu02.getName()+"	stu02.getAge = "+stu02.getAge());
	}

}



class Student{
	private String name;
	private int age;
	
	//构造方法。
	public Student(){
		
	}
	//构造方法重载
	public Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//成员方法。
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
	//输出所有成员的成员变量值
	public void show(){
		System.out.println("姓名："+this.name+",年龄："+this.age);
	}
}


	
	
