import java.util.Scanner;

class StructrueIfElse{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("�������·ݣ�");
	int month = input.nextInt();
	if(month<1||month>12){
	System.out.println("������������");
	}
	else if(month>=3 && month<=5){
	System.out.println("���������ǣ�"+month+"���Ǵ�����");
	}
	else if(month>=6 && month<=8){
	System.out.println("��������ǣ�"+month+"�����ļ���");
	}
	else if(month>=9 && month<=11){
	System.out.println("��������ǣ�"+month+"�����＾��");
	}
	else{
	System.out.println("��������ǣ�"+month+"���Ƕ�����");
	}
	
	
	}
}