
interface Jump{
	public static final int high = 20;
	public abstract void jump();
}

abstract class Animal{
	private String name;
	private int age;
	public Animal(){}
	public Animal(String name,int age){
		this.name = name;
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	public  void setAge(int age){
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public abstract void eat();
	public  void sleep(){
		System.out.println("���ж��ﶼ��Ҫ��Ϣ��");
	}	
}

class Cat extends Animal{
	public Cat(){}
	public Cat(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("è���㡣");
	}
}

class Dog extends Animal{
	public Dog(){}
	public Dog(String name,int age){
		super(name,age);
	}
	public void eat(){
		System.out.println("�����⡣");
	}
}



class  CatJump extends Cat implements Jump{
	public void jump(){
		System.out.println("����è");
	}
}

class DogJump extends Dog implements Jump{
	public void jump(){
		System.out.println("���߹�");
	}	
}




class  ClassExtendInterface{
	public static void main(String[] args){
		//��������è
		CatJump jc = new CatJump();
		jc.setName("����A��");
		jc.setAge(3);
		System.out.println("jc.name = "+jc.getName()+", jc.age = "+jc.getAge());
		jc.eat();
		jc.sleep();
		jc.jump();
		System.out.println("---------------------------------------------");
		
	}
}






