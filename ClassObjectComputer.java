/*
	����һ����MyMath����߻����ļӼ��˳����ܣ�Ȼ����в��ԡ�
	���ܷ�����
		1. ����һ������+һ�������+һ�����ݣ� �� 1233.2+2354
		2. ������Ⱥ�ʱ�����ݽ��
	
	�ؼ��㣺
		1. �����һ���������������������������������ڶ������������м䲻��Ҫ�س���
		2. ���������������ֵط��ж���Ϸ��ԺͲ���ָ� 
		3. ����������ַ������ٶ��ַ��������ж���Ϸ��ԺͲ���ָ�
		4. ���������������Υ���ַ������룻
		5. �ٻ����Ǽ򵥵ģ��ֱ�����������������Ȼ�������������
			
	MyMath�ࣺ
		��Ա������
		���췽����
		��Ա������
*/
import java.util.Scanner;

class ClassObjectComputer{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		ClassComputer  operater = new ClassComputer();
		System.out.println("�������һ����������");
		int num01 = input.nextInt();
		
		System.out.println("������ڶ�����������");
		int num02 = input.nextInt();
		
		System.out.println("�ӷ�������Ϊ��"+operater.Add(num01,num02));
		
		System.out.println("����������Ϊ��"+operater.subtraction(num01,num02));
		
		System.out.println("�˷�������Ϊ��"+operater.multiply(num01,num02));
		
		System.out.println("����������Ϊ��"+operater.devide(num01,num02));
	}
}

class ClassComputer{
	
	//����ӡ������ˡ��� ����
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







