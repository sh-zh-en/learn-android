//��������������ֵ�����������ֵ��
//���������������ݣ������ֵ��ƽ��ֵ

import java.util.Scanner;

class InsertDemo2{
	public static void main(String[] args){
	//����¼�룬�趨�����
	Scanner input=new Scanner(System.in);
	System.out.println("�������һ�����ݣ�");
	int x = input.nextInt();

	System.out.println("������ڶ������ݣ�");
	int y = input.nextInt();

	int max = x>y?x:y;
	int avg = (x+y)/2;

	System.out.println("������һ���ַ���");
	char z = 'w';// input();

	System.out.println("��һ������Ϊ��"+x+",�ڶ�������Ϊ��"+y+"��������ַ�Ϊ��"+z);
	System.out.println("���ֵΪ��"+max);
	System.out.println("ƽ��ֵΪ��"+avg);
	
	
	}

}