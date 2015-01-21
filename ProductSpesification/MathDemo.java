/*
	Math类调用练习
	获取随机数的方法
	键盘录入你猜的数据
	返回猜中了、你猜大了、你猜小了
	给出多次猜数机会，猜中就结束
*/
import java.util.Scanner;

class MathDemo{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double d = Math.random();		
		System.out.println(d);
		
		boolean flag = true;
		while(flag){
			System.out.print("请输入你猜的数：");
			int guess = input.nextInt();
			int num = (int)(Math.random()*100)+1;
			System.out.println("1~100之间"+num);
			if(guess<num){
				System.out.print("你猜小咯。");
				System.out.println("本次的随机数是："+num);
			}
			else if(guess>num){
				System.out.print("你猜大咯。");
				System.out.println("本次的随机数是："+num);
			}
			else{
				System.out.println("恭喜你，猜中了。");
				flag = false;
			}
		}
		
		
		
	}
}



