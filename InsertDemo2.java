//键盘输入两个数值，输出这两个值；
//键盘输入两个数据，求最大值，平均值

import java.util.Scanner;

class InsertDemo2{
	public static void main(String[] args){
	//键盘录入，需定义变量
	Scanner input=new Scanner(System.in);
	System.out.println("请输入第一个数据：");
	int x = input.nextInt();

	System.out.println("请输入第二个数据：");
	int y = input.nextInt();

	int max = x>y?x:y;
	int avg = (x+y)/2;

	System.out.println("请输入一个字符：");
	char z = 'w';// input();

	System.out.println("第一个数据为："+x+",第二个数据为："+y+"，输入的字符为："+z);
	System.out.println("最大值为："+max);
	System.out.println("平均值为："+avg);
	
	
	}

}
