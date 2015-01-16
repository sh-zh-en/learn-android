/*
	��������в�����
*/
import java.util.Scanner;

class ArrayToolsTest{
	public static void main(String[] args){
		System.out.println("����һ������һ��������Ϊ���鳤�ȣ������������飬Ȼ��������顣");
		System.out.println("	��һ��������һ��������Ϊ���鳤��");
		int len = ArrayTools.arrayLengh();
		System.out.println("	�ڶ�����������������");
		int[] array01 = ArrayTools.arrayInput(len);
		System.out.println("	��������Ȼ���������");
		ArrayTools.arrayTriversal(array01);
		
		System.out.println("���Զ�����������ɱ䳤�����飬Ȼ��������顣");
		System.out.println("	��һ������������ɱ䳤������");
		int[] array02 = ArrayTools.arrayInput();
		System.out.println("	�ڶ�������������");
		ArrayTools.arrayTriversal(array02);
	}
}




class ArrayTools{
	private ArrayTools(){
		
	}
	//������;������y/n����
	public static char yesNo(){
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		char x;
		String str;
		while(flag){
			str = input.nextLine();
			x = str.charAt(0);
			if(x == 'y' || x == 'Y' || x == 'n' || x == 'N'){
				flag = false;
			}
			else{
				System.out.println("���������������������루y/n����");
			}
		}
		return x;
	}
	
	//������;����ʾ����һ������ĳ���
	public static int arrayLengh(){
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		int len;
		System.out.print("��������Ҫ���������鳤�ȣ�");
		while(flag){
			len = input.nextInt();
			if(len<1){
				System.out.println("����������ݲ��ܽ������飬���������룺");
			}
			else{
				flag = false;
			}		
		}
		
		return len;
	}
	
	//������;������һ��int��������x��Ϊ����ĳ��ȣ����̸����鸳ֵ
	public static int[] arrayInput(int x){
		int[] array = new int[x];
		Scanner input = new Scanner(System.in);
		for(int i=0;i<x;i++){
			System.out.print("�����������"+(i+1)+"��ֵ��");
			array[i] = input.nextInt();
		}
		return array;		
	}
	
	//������;����������һ���������ȵ����ݣ�ÿ����һ������ѯ���Ƿ�������ݣ�
	//���õ��϶��𸴺�����������ݣ��õ��񶨴𸴺��˳��������ݡ�
	public static int[] arrayInput(){
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		char yn;
		int[] array;
		int i=1;
		while(flag){
			System.out.print("����������� "+i+" �����ݣ�");
			array[i] = input.nextInt();
			i++;
			System.out.print("�Ƿ�����������ݣ�y/n����");
			yn = yesNo();
			if(yn=='y' || yn=='Y'){
				flag = false;
			}
		}
		return array;
	}
	
	//������;������һ�����飬�������ӡ��һ��
	public static void arrayTriversal(int[] array){
		for(int i=0;i<array.length;i++){
			if(i==array.length-1){
				System.out.println(array[i]);
			}
			else{
				System.out.print(array[i] + "��	");
			}
		}
	}
	
}



