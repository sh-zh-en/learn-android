//if分支结构练习
//if  else 分支结构练习
import java.util.Scanner;

class StructrueIf{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("请输入一个数据：");
	int x = input.nextInt();

//	int x = 10;
	if(x == 10){
		System.out.println("x=10");
	}
	else if(x == 20){
		System.out.println("X=20");
	}
	else{
	System.out.println("其实 x = "+x);	
	}
	
	}
}
