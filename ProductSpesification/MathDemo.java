/*
	Math�������ϰ
	��ȡ������ķ���
	����¼����µ�����
	���ز����ˡ���´��ˡ����С��
	������β������ᣬ���оͽ���
*/
import java.util.Scanner;

class MathDemo{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double d = Math.random();		
		System.out.println(d);
		
		boolean flag = true;
		while(flag){
			System.out.print("��������µ�����");
			int guess = input.nextInt();
			int num = (int)(Math.random()*100)+1;
			System.out.println("1~100֮��"+num);
			if(guess<num){
				System.out.print("���С����");
				System.out.println("���ε�������ǣ�"+num);
			}
			else if(guess>num){
				System.out.print("��´󿩡�");
				System.out.println("���ε�������ǣ�"+num);
			}
			else{
				System.out.println("��ϲ�㣬�����ˡ�");
				flag = false;
			}
		}
		
		
		
	}
}


