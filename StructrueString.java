/*
	字符串键盘输入学习
*/
import java.util.Scanner;

class  StructrueString{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.println("请输入一个字符串：");
		String str=input.nextLine();
		
		System.out.println("您的输入是："+str);
	}
	
}
