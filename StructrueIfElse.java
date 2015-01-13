import java.util.Scanner;

class StructrueIfElse{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("请输入月份：");
	int month = input.nextInt();
	if(month<1||month>12){
	System.out.println("您的输入有误。");
	}
	else if(month>=3 && month<=5){
	System.out.println("您的输入是："+month+"，是春季。");
	}
	else if(month>=6 && month<=8){
	System.out.println("您输入的是："+month+"，是夏季。");
	}
	else if(month>=9 && month<=11){
	System.out.println("您输入的是："+month+"，是秋季。");
	}
	else{
	System.out.println("您输入的是："+month+"，是冬季。");
	}
	
	
	}
}
