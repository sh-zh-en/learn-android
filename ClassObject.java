/*
	һ����׼��������հ档
	ѧ���ࣺ
		��Ա������
		���췽�����޲ι��죬�вι���
		��Ա������getXxx(),setXxx(),show()
*/

class  ClassObject{
	public static void main(String[] args){
		//��ʽһ���޲ι��캯�� + setXxx()
		System.out.println("��ʽһ���޲ι��캯�� + setXxx()��");
		Student stu01 = new Student();
		stu01.setName("Java Class");
		stu01.setAge(23);
		stu01.show();
		System.out.println("stu01.getName = "+stu01.getName()+",stu01.getAge = "+stu01.getAge());
		System.out.println("---------------------------------");
		
		//��ʽ�����вι��캯�������Ը�ֵ
		System.out.println("��ʽ�����вι��캯�������Ը�ֵ");
		Student stu02 = new Student("Java Object", 23);
		stu02.show();
		System.out.println("stu02.getName = "+stu02.getName()+"	stu02.getAge = "+stu02.getAge());
	}

}



class Student{
	private String name;
	private int age;
	
	//���췽����
	public Student(){
		
	}
	
	public Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//��Ա������
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
	//������г�Ա�ĳ�Ա����ֵ
	public void show(){
		System.out.println("������"+this.name+",���䣺"+this.age);
	}
}


	
	