/*
	ʵ�֣��ӳ��󵽾���
		������:
			��Ա����������������
			���췽�����޲Σ�����
			��Ա�������Է�();
			
		���ࣺ
			�̳��Զ�����
			��д�Է�();
			
		è�ࣺ
			�̳��Զ�����
			��д�Է�();
*/


class  AbstractDemo{
	public static void main(String[] args){
		
		//ģ��һ���������ѧϰ
		Animal a = new Cat();  //��������Cat
		a.num = 100;
		System.out.println("a.num = " + a.num);
		//a.num2 = 200;
		System.out.println("a.num2 = " + a.num2);
		a.eat();	
		Animal b = new Dog();  //��������Dog		
		b.eat();
		
		//ģ��������������ϰ
		Person t = new Teacher("ʦA",34);
		String name = t.getName();
		int age = t.getAge();
		System.out.println("��ʦ�������ǣ�" + name + ", �����ǣ�" + age);
		t.eat();
		Person s = new Student("��A",13);
		String name2 = s.getName();
		int age2 = s.getAge();
		System.out.println("ѧ���������ǣ�" + name2 + ", �����ǣ�" + age2);
		s.eat();
		
	}
}

//���嶯����
abstract class Animal {
	public int num = 10;  //����
	public final int num2 = 20;  //����
	public abstract void eat();
	//public abstract void eat(){};  //�շ����壬���󷽷����������塣
	public Animal(){};
	public abstract void show();
}

//�������Ķ�����ĳ������ࡪ��Fish��
abstract class Fish extends Animal{}

//�������Ķ���������ࡪ��Cat��
class Cat extends Animal{
	public void show(){
		System.out.println("������ʵ������-Cat��");
	}
	public void eat(){
		System.out.println("è���㡣");
	}
}
//�������Ķ���������ࡪ��Dog��
class Dog extends Animal{
	public void eat(){
		System.out.println("�����⡣");
	}
	public void show(){
		System.out.println("������ʵ������-Dog��");
	}
}
