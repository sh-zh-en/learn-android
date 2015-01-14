
import java.util.Scanner;
class  ClassMethod{
	public static void main(String[] args){
		System.out.println("请输入一个数据：");
		Scanner input = new Scanner(System.in);
		int side = input.nextInt();
		Square(side);//调用Square 方法
		Rhombus(side);//调用Rhombus 方法
		System.out.println("**"*4);
	}
	//打印边长为side的实心正方形
	public static void Square(int side){
		if(side<1){
			System.out.println("您输入的数据不能作为正方形的边长，谢谢。");
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
	
	//打印变成为side的实心菱形
	public static void Rhombus(int side){
		if(side<1){
			System.out.println("您输入的数据不能作为菱形的边长，谢谢。");
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