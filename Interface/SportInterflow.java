/*
	教练和运动员案例(学生分析然后讲解)
		乒乓球运动员和篮球运动员。
		乒乓球教练和篮球教练。
		为了出国交流，跟乒乓球相关的人员都需要学习英语。
	分析
	
		运动员与教练员的共性是：Person——name, age, country, sex 等变量，吃饭、睡觉功能
		乒乓球运动员与篮球运动员的共性是：Sporter——抽象的，参加比赛功能
		乒乓球教练与篮球教练的共性是：Teacher——抽象的，指导比赛，管理队员功能
		PpSporter——抽象的，乒乓球运动
		BbSporter——抽象的，篮球运动
		PpTeacher——乒乓球教练，只管理乒乓球队员
		PpTeacher——篮球教练，只管理篮球队员
		学习英语是附加功能：StudyEnglish
		//
		PpSporterEnglish——
		PpTeacherEnglish——

*/
interface StudyEnglish{
	public abstract void studyEnglish();
}
abstract class Person{
	//成员变量
	private  String name;
	private int age;
	private String  country;
	private String sex;
	//构造方法
	public Person(){}
	public Person(String name,int age,String country,String sex){
		this.name = name;
		this.age = age;
		this.country = country;
		this.sex = sex;
	}
	//成员方法
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
	//无成员变量
	//构造方法
	public Sporter(){}
	public Sporter(String name,int age,String country,String sex){
		super(name,age,country,sex);
	}
	//成员方法
	public void eat(){
		System.out.println("运动员不能吃含兴奋剂的食物");
	}
	public void sleep(){
		System.out.println("运动员必须按时休息。");
	}
	public abstract void study();
}
abstract class Teacher extends Person{
	//无成员变量
	//构造方法
	public Teacher(){}
	public Teacher(String name,int age,String country,String sex){
		super(name,age,country,sex);
	}
	//成员方法
	public void eat(){
		System.out.println("教练员随便吃东西。");
	}
	public void sleep(){
		System.out.println("教练员保证队员充分睡眠，研究战术，睡眠较少。");
	}
	public abstract void teach();
}
//教练和运动员应该为抽象的。
class PpSporter extends Sporter  implements StudyEnglish{
	//无成员变量
	//构造方法
	public PpSporter(){}
	public PpSporter(String name,int age,String country,String sex){
		super(name,age,country,sex);
	}
	//成员方法
	public void study(){
		System.out.println("我是乒乓球运动员，学习乒乓球。");
	}
	public void studyEnglish(){
		System.out.println("我学会了英语，出国可以讲英语。");
	}
}
class BbSporter extends Sporter{
	//无成员变量
	//构造方法
	public BbSporter(){}
	public BbSporter(String name,int age,String country,String sex){
		super(name,age,country,sex);
	}
	//成员方法
	public void study(){
		System.out.println("我是篮球运动员，学习篮球攻防。");
	}
}

class PpTeacher extends Teacher implements StudyEnglish{
	//无成员变量
	//构造方法
	public PpTeacher(){}
	public PpTeacher(String name,int age,String country,String sex){
		super(name,age,country,sex);
	}
	//成员方法
	public void teach(){
		System.out.println("我是乒乓球教练员，教乒乓球。");
	}
	public void studyEnglish(){
		System.out.println("我学会了英语，出国之后可以用英语交流。");
	}
}
class BbTeacher extends Teacher{
	//无成员变量
	//构造方法
	public BbTeacher(){}
	public BbTeacher(String name,int age,String country,String sex){
		super(name,age,country,sex);
	}
	//成员方法
	public void teach(){
		System.out.println("我是篮球教练员，教篮球技术和战术。");
	}
}

/* 
class PpSporterEnglish extends PpSporter implements StudyEnglish{
	//无成员变量
	//构造方法
	public PpSporterEnglish(){}
	public PpSporterEnglish(String name,int age,String country,String sex){
		super(name,age,country,sex);
	}
	public void study(){
		System.out.println("我是乒乓球运动员,学习乒乓球。");
	}
	public void studyEnglish(){
		System.out.println("我要努力学习英语。");
	}
}
class PpTeacherEnglish extends PpTeacher implements StudyEnglish{
	//无成员变量
	//构造方法
	public PpTeacherEnglish(){}
	public PpTeacherEnglish(String name,int age,String country,String sex){
		super(name,age,country,sex);
	}
	public void studyEnglish(){
		System.out.println("我要努力学习英语。");
	}
}
*/
class SportInterflow{
	public static void main(String[] args){
		//乒乓球运动员		
		PpSporter ps = new PpSporter();
		ps.setName("Tom");
		ps.setAge(23);
		ps.setCountry("China");
		ps.setSex("男");
		System.out.println("name = " + ps.getName() + ", age = " + ps.getAge() + ", country = " + ps.getCountry() + ", sex = " + ps.getSex());
		ps.eat();
		ps.sleep();
		ps.study();
		ps.studyEnglish();
	}
}


