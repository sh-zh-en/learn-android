/*
	�������˶�Ա����(ѧ������Ȼ�󽲽�)
		ƹ�����˶�Ա�������˶�Ա��
		ƹ������������������
		Ϊ�˳�����������ƹ������ص���Ա����ҪѧϰӢ�
	����
	
		�˶�Ա�����Ա�Ĺ����ǣ�Person����name, age, country, sex �ȱ������Է���˯������
		ƹ�����˶�Ա�������˶�Ա�Ĺ����ǣ�Sporter��������ģ��μӱ�������
		ƹ�����������������Ĺ����ǣ�Teacher��������ģ�ָ��������������Ա����
		PpSporter��������ģ�ƹ�����˶�
		BbSporter��������ģ������˶�
		PpTeacher����ƹ���������ֻ����ƹ�����Ա
		PpTeacher�������������ֻ���������Ա
		ѧϰӢ���Ǹ��ӹ��ܣ�StudyEnglish
		//
		PpSporterEnglish����
		PpTeacherEnglish����

*/
interface StudyEnglish{
	public abstract void studyEnglish();
}
abstract class Person{
	//��Ա����
	private  String name;
	private int age;
	private String  country;
	private String sex;
	//���췽��
	public Person(){}
	public Person(String name,int age,String country,String sex){
		this.name = name;
		this.age = age;
		this.country = country;
		this.sex = sex;
	}
	//��Ա����
	public void setName(String name){
		this.name = name;		
	}
	public void setAge(int name){
		this.age = age;
	}
	public void setCountry(String country){
		this.country = country;
	}
	public void setSex(String sex){
		this.sex = sex;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getCountry(){
		return country;
	}
	public String getSex(){
		return sex;
	}
	
	public abstract void eat();
	public abstract void sleep();
}

abstract class Sporter extends Person{
	//�޳�Ա����
	//���췽��
	public Sporter(){}
	public Sporter(String name,int age,String country,String sex){
		super(name,age,country,sex);
	}
	//��Ա����
	public void eat(){
		System.out.println("�˶�Ա���ܳԺ��˷ܼ���ʳ��");
	}
	public void sleep(){
		System.out.println("�˶�Ա���밴ʱ��Ϣ��");
	}
	public abstract void study();
}
abstract class Teacher extends Person{
	//�޳�Ա����
	//���췽��
	public Teacher(){}
	public Teacher(String name,int age,String country,String sex){
		super(name,age,country,sex);
	}
	//��Ա����
	public void eat(){
		System.out.println("����Ա���Զ�����");
	}
	public void sleep(){
		System.out.println("����Ա��֤��Ա���˯�ߣ��о�ս����˯�߽��١�");
	}
	public abstract void teach();
}
//�������˶�ԱӦ��Ϊ����ġ�
class PpSporter extends Sporter  implements StudyEnglish{
	//�޳�Ա����
	//���췽��
	public PpSporter(){}
	public PpSporter(String name,int age,String country,String sex){
		super(name,age,country,sex);
	}
	//��Ա����
	public void study(){
		System.out.println("����ƹ�����˶�Ա��ѧϰƹ����");
	}
	public void studyEnglish(){
		System.out.println("��ѧ����Ӣ��������Խ�Ӣ�");
	}
}
class BbSporter extends Sporter{
	//�޳�Ա����
	//���췽��
	public BbSporter(){}
	public BbSporter(String name,int age,String country,String sex){
		super(name,age,country,sex);
	}
	//��Ա����
	public void study(){
		System.out.println("���������˶�Ա��ѧϰ���򹥷���");
	}
}

class PpTeacher extends Teacher implements StudyEnglish{
	//�޳�Ա����
	//���췽��
	public PpTeacher(){}
	public PpTeacher(String name,int age,String country,String sex){
		super(name,age,country,sex);
	}
	//��Ա����
	public void teach(){
		System.out.println("����ƹ�������Ա����ƹ����");
	}
	public void studyEnglish(){
		System.out.println("��ѧ����Ӣ�����֮�������Ӣ�ｻ����");
	}
}
class BbTeacher extends Teacher{
	//�޳�Ա����
	//���췽��
	public BbTeacher(){}
	public BbTeacher(String name,int age,String country,String sex){
		super(name,age,country,sex);
	}
	//��Ա����
	public void teach(){
		System.out.println("�����������Ա������������ս����");
	}
}

/* 
class PpSporterEnglish extends PpSporter implements StudyEnglish{
	//�޳�Ա����
	//���췽��
	public PpSporterEnglish(){}
	public PpSporterEnglish(String name,int age,String country,String sex){
		super(name,age,country,sex);
	}
	public void study(){
		System.out.println("����ƹ�����˶�Ա,ѧϰƹ����");
	}
	public void studyEnglish(){
		System.out.println("��ҪŬ��ѧϰӢ�");
	}
}
class PpTeacherEnglish extends PpTeacher implements StudyEnglish{
	//�޳�Ա����
	//���췽��
	public PpTeacherEnglish(){}
	public PpTeacherEnglish(String name,int age,String country,String sex){
		super(name,age,country,sex);
	}
	public void studyEnglish(){
		System.out.println("��ҪŬ��ѧϰӢ�");
	}
}
*/
class SportInterflow{
	public static void main(String[] args){
		//ƹ�����˶�Ա		
		PpSporter ps = new PpSporter();
		ps.setName("Tom");
		ps.setAge(23);
		ps.setCountry("China");
		ps.setSex("��");
		System.out.println("name = " + ps.getName() + ", age = " + ps.getAge() + ", country = " + ps.getCountry() + ", sex = " + ps.getSex());
		ps.eat();
		ps.sleep();
		ps.study();
		ps.studyEnglish();
	}
}

