
import java.util.Scanner;
class  ClassMethod{
	public static void main(String[] args){
		System.out.println("������һ�����ݣ�");
		Scanner input = new Scanner(System.in);
		int side = input.nextInt();
		Square(side);//����Square ����
		Rhombus(side);//����Rhombus ����
		System.out.println("**"*4);
	}
	//��ӡ�߳�Ϊside��ʵ��������
	public static void Square(int side){
		if(side<1){
			System.out.println("����������ݲ�����Ϊ�����εı߳���лл��");
		}
		else{
			for(int i=1;i<=side;i++){
				for(int j=1;j<=side;j++){
					System.out.print(" *");	
				}
				System.out.println();
			}
		}
	}
	
	//��ӡ���Ϊside��ʵ������
	public static void Rhombus(int side){
		if(side<1){
			System.out.println("����������ݲ�����Ϊ���εı߳���лл��");
		}
		else{
			for(int i=1;i<=side;i++){
				for(int j=1;j<(side-i+1);j++){
					System.out.print("-");
				}
				for(int k=1;k<2*i;k++){
					System.out.print("*");
				}
				System.out.println("");
			}
			for(int i=1;i<side;i++){
				for(int j=1;j<=i;j++){
					System.out.print("-");
				}
				for(int k=1;k<2*(side-i);k++){
					System.out.print("*");
				}
				System.out.println("");
			}
		}
	}

}