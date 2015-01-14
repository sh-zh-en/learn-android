//for  循环练习

import java.util.Scanner;
class CycleFor{
	public static void main(String[] args){
		//for(初始化语句;判断语句;控制条件语句){}
		//重复n次输出”hello world“ 
		System.out.println("请输入循环输出\"hello world .\"次数：");
		Scanner input = new Scanner(System.in);
		int counts = input.nextInt();
		for(int i=0;i<counts;i++){
			System.out.println("Hello World ！");
		}
		
		//求1到100之和
		int sum01 = 0;
		for(int i=1;i<=100;i++){
			sum01 += i;
		}		
		System.out.println("1-100的和为："+sum01);
		
		//求阶乘 n!
		// n! = n*(n-1)! 即 n! = n*(n-1)*……*3*2*1
		
		
	}
}
