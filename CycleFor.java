//for  ѭ����ϰ

import java.util.Scanner;
class CycleFor{
	public static void main(String[] args){
		//for(��ʼ�����;�ж����;�����������){}
		//�ظ�n�������hello world�� 
		System.out.println("������ѭ�����\"hello world .\"������");
		Scanner input = new Scanner(System.in);
		int counts = input.nextInt();
		for(int i=0;i<counts;i++){
			System.out.println("Hello World ��");
		}
		
		//��1��100֮��
		int sum01 = 0;
		for(int i=1;i<=100;i++){
			sum01 += i;
		}		
		System.out.println("1-100�ĺ�Ϊ��"+sum01);
		
		//��׳� n!
		// n! = n*(n-1)! �� n! = n*(n-1)*����*3*2*1
		
		
	}
}