/*
	定义一个类MyMath，提高基本的加减乘除功能，然后进行测试。
	功能分析：
		1. 输入一个数据+一个运算符+一个数据， 如 1233.2+2354
		2. 当输入等号时，数据结果
	
	关键点：
		1. 输入第一个操作数，立刻输入操作符，接着输入第二个操作数，中间不需要回车？
		2. 是输入过程中逐个字地符判断其合法性和操作指令； 
		3. 亦或是输入字符串后再对字符串解析判断其合法性和操作指令；
		4. 在输入过程中限制违法字符的输入；
		5. 再或者是简单的，分别输入两个操作数，然后输入操作符。
			
	MyMath类：
		成员变量：
		构造方法：
		成员方法：
*/
import java.util.Scanner;

class ClassObjectComputer{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		ClassComputer  operater = new ClassComputer();
		System.out.println("请输入第一个操作数：");
		int num01 = input.nextInt();
		
		System.out.println("请输入第二个操作数：");
		int num02 = input.nextInt();
		
		System.out.println("加法运算结果为："+operater.Add(num01,num02));
		
		System.out.println("减法运算结果为："+operater.subtraction(num01,num02));
		
		System.out.println("乘法运算结果为："+operater.multiply(num01,num02));
		
		System.out.println("除法运算结果为："+operater.devide(num01,num02));
	}
}

class ClassComputer{
	
	//定义加、减、乘、除 方法
	public int Add(int a,int b){
		return a + b;
	}
	public float Add(int a,float b){
		return  a + b;
	}
	public float Add(float a,int b){
		return  a + b;
	}
	public int subtraction(int a,int b){
		return a - b;
	}
	public float subtraction(int a,float b){
		return a - b;
	}
	public float subtraction(float a,int b){
		return a - b;
	}
	public int  multiply(int a,int b){
		return a * b;
	}
	public float multiply(int a,float b){
		return a * b;
	}
	public float multiply(float a,int b){
		return a * b;
	}
	public int  devide(int a,int b){
		return a / b;
	}
	public float  devide(int a,float b){
		return a / b;
	}
	public float  devide(float a,int b){
		return a / b;
	}
	
	
	
}








