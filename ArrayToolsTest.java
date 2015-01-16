/*
	对数组进行操作的
*/
import java.util.Scanner;

class ArrayToolsTest{
	public static void main(String[] args){
		System.out.println("测试一：输入一个数据作为数组长度，键盘输入数组，然后遍历数组。");
		System.out.println("	第一步，输入一个数据作为数组长度");
		int len = ArrayTools.arrayLengh();
		System.out.println("	第二步，键盘输入数组");
		int[] array01 = ArrayTools.arrayInput(len);
		System.out.println("	第三步，然后遍历数组");
		ArrayTools.arrayTriversal(array01);
		
		System.out.println("测试二：键盘输入可变长度数组，然后遍历数组。");
		System.out.println("	第一步，键盘输入可变长度数组");
		int[] array02 = ArrayTools.arrayInput();
		System.out.println("	第二步，遍历数组");
		ArrayTools.arrayTriversal(array02);
	}
}




class ArrayTools{
	private ArrayTools(){
		
	}
	//方法用途：控制y/n输入
	public static char yesNo(){
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		char x;
		String str;
		while(flag){
			str = input.nextLine();
			x = str.charAt(0);
			if(x == 'y' || x == 'Y' || x == 'n' || x == 'N'){
				flag = false;
			}
			else{
				System.out.println("您的输入有误，请重新输入（y/n）：");
			}
		}
		return x;
	}
	
	//方法用途：提示输入一个数组的长度
	public static int arrayLengh(){
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		int len;
		System.out.print("请输入您要建立的数组长度：");
		while(flag){
			len = input.nextInt();
			if(len<1){
				System.out.println("您输入的数据不能建立数组，请重新输入：");
			}
			else{
				flag = false;
			}		
		}
		
		return len;
	}
	
	//方法用途，传入一个int类型数据x作为数组的长度，键盘给数组赋值
	public static int[] arrayInput(int x){
		int[] array = new int[x];
		Scanner input = new Scanner(System.in);
		for(int i=0;i<x;i++){
			System.out.print("请输入数组第"+(i+1)+"个值：");
			array[i] = input.nextInt();
		}
		return array;		
	}
	
	//方法用途：键盘输入一个不定长度的数据，每输入一个数据询问是否继续数据，
	//当得到肯定答复后继续数据数据，得到否定答复后，退出输入数据。
	public static int[] arrayInput(){
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		char yn;
		int[] array;
		int i=1;
		while(flag){
			System.out.print("请输入数组第 "+i+" 个数据：");
			array[i] = input.nextInt();
			i++;
			System.out.print("是否继续输入数据（y/n）：");
			yn = yesNo();
			if(yn=='y' || yn=='Y'){
				flag = false;
			}
		}
		return array;
	}
	
	//方法用途：传入一个数组，将数组打印成一行
	public static void arrayTriversal(int[] array){
		for(int i=0;i<array.length;i++){
			if(i==array.length-1){
				System.out.println(array[i]);
			}
			else{
				System.out.print(array[i] + "，	");
			}
		}
	}
	
}




