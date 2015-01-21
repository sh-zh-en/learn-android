/*
	实现：从抽象到具体
		动物类:
			成员变量：姓名，年龄
			构造方法：无参，带参
			成员方法：吃饭();
			
		狗类：
			继承自动物类
			重写吃饭();
			
		猫类：
			继承自动物类
			重写吃饭();
*/


class  AbstractDemo{
	public static void main(String[] args){
		
		//模块一：抽象类的学习
		Animal a = new Cat();  //创建对象Cat
		a.num = 100;
		System.out.println("a.num = " + a.num);
		//a.num2 = 200;
		System.out.println("a.num2 = " + a.num2);
		a.eat();	
		Animal b = new Dog();  //创建对象Dog		
		b.eat();
		
		//模块二：抽象类的练习
		Person t = new Teacher("师A",34);
		String name = t.getName();
		int age = t.getAge();
		System.out.println("教师的名字是：" + name + ", 年龄是：" + age);
		t.eat();
		Person s = new Student("生A",13);
		String name2 = s.getName();
		int age2 = s.getAge();
		System.out.println("学生的名字是：" + name2 + ", 年龄是：" + age2);
		s.eat();
		
	}
}

//定义动物类
abstract class Animal {
	public int num = 10;  //变量
	public final int num2 = 20;  //常量
	public abstract void eat();
	//public abstract void eat(){};  //空方法体，抽象方法不能有主体。
	public Animal(){};
	public abstract void show();
}

//定义抽象的动物类的抽象子类——Fish类
abstract class Fish extends Animal{}

//定义抽象的动物类的子类——Cat类
class Cat extends Animal{
	public void show(){
		System.out.println("动物类实例化成-Cat。");
	}
	public void eat(){
		System.out.println("猫吃鱼。");
	}
}
//定义抽象的动物类的子类——Dog类
class Dog extends Animal{
	public void eat(){
		System.out.println("狗吃肉。");
	}
	public void show(){
		System.out.println("动物类实例化成-Dog。");
	}
}

