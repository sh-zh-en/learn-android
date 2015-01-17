/*
	对数组进行操作；
	实现：不需要用类定义对象，直接调用类中方法，将构造方法定义为private,成员方法均为 public Static。
	
	
	数组list
	ArrayList<int[]> list = new ArrayList<int[]>(); 
	整数list
	ArrayList<Integer> list = new ArrayList<Integer>();
*/
/*
	import java.util.ArrayList;
	class Test{
		public static void main(String[] args){
			
			String[] array;// 要初始化的数组
		
			ArrayList<Integer> fieldList = new ArrayList<Integer>();  //首先创建一个ArrayList类型的对象
			fieldList.add(23);      //向其中添加元素field1
			//将ArrayList类型的对象转换为String类型，即初始化数组array.
			array= (int[])fieldList.toArray(new int [fieldList.size()]);
		
			for(int i=0;i<array.length;i++){
				System.out.println(array[i]);
			}
		}
	}
*/
import java.util.Scanner;
import java.util.ArrayList;
//import java.util.Integer;

class ArrayToolsTest{
	public static void main(String[] args){
		System.out.println("测试一：输入一个数据作为数组长度，键盘输入数组，然后遍历数组。");
		System.out.println("第一步，输入一个数据作为数组长度");
		int len = ArrayTools.arrayLengh();
		System.out.println("第二步，键盘输入int类型数组");
		int[] array01 = ArrayTools.arrayInputInt(len);
		System.out.print("第三步，遍历int类型数组：");
		ArrayTools.arrayTriversal(array01);		
		System.out.println("第四步，键盘输入int类型数组");
		String[] array02 = ArrayTools.arrayInputString(len);
		System.out.print("第五步，遍历String数组：");
		ArrayTools.arrayTriversal(array02);
	/*
		System.out.println("测试二：键盘输入可变长度数组，然后遍历数组。");
		System.out.println("	第一步，键盘输入可变长度数组");
		int[] array03 = ArrayTools.arrayInput();
		//String[] array03 = ArrayTools.arrayInput();
		System.out.println("	第二步，遍历数组");
		ArrayTools.arrayTriversal(array02);  */
	}
}

class ArrayTools{
	private ArrayTools(){
		
	}
	//方法用途：控制y/n输入
	public static char yesNo(){
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		char x = '0';
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
		int len = 0;
		System.out.print("	请输入您要建立的数组长度：");
		while(flag){
			len = input.nextInt();
			if(len<1){
				System.out.println("	您输入的数据不能建立数组，请重新输入：");
			}
			else{
				flag = false;
			}		
		}
		
		return len;
	}
	
	//方法用途，传入一个int类型数据x作为数组的长度，键盘给数组赋值
	public static int[] arrayInputInt(int x){
		int[] array = new int[x];
		Scanner input = new Scanner(System.in);
		for(int i=0;i<x;i++){
			System.out.print("	请输入数组第"+i+"个值：");
			array[i] = input.nextInt();
		}
		return array;		
	}
	public static String[] arrayInputString(int x){
		String[] array = new String[x];
		Scanner input = new Scanner(System.in);
		for(int i=0;i<x;i++){
			System.out.print("	请输入数组第"+i+"个值：");
			array[i] = input.nextLine();
		}
		return array;		
	}
	
	//方法用途：键盘输入一个不定长度的数据，每输入一个数据询问是否继续数据，
	//当得到肯定答复后继续数据数据，得到否定答复后，退出输入数据。
	/*
	public static int[] arrayInput(){
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		char yn;
		int[] array;
		int i=0;
		while(flag){
			System.out.print("		请输入数组第 "+i+" 个数据：");
			array[i] = input.nextInt();
			i++;
			System.out.print("是否继续输入数据（y/n）：");
			yn = yesNo();
			if(yn=='y' || yn=='Y'){
				flag = false;
				return array;
			}
		}
		return array;
	}
	
		public static int[] arrayInput(){
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		char yn;
		int i=0;
		int[] array;
		//String[] array;		
		ArrayList<int[]> fieldList = new ArrayList<int[]>();
		//ArrayList<String> fieldList = new ArrayList<String>();
		while(flag){
			System.out.print("	请输入数组第 "+i+" 个数据：");
			//fieldList.add(input.nextInt());
			fieldList.add(input.nextInt());
			i++;
			System.out.print("是否继续输入数据（y/n）：");
			yn = yesNo();
			if(yn=='y' || yn=='Y'){
				flag = false;
			}
		}
		array = (int[])fieldList.toArray(new int [fieldList.size()]);
		//array = (String[])fieldList.<String>toArray(new String[fieldList.size()]);
		return array;
	}
	*/
	
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
		//方法用途：传入一个数组，将数组打印成一行
	public static void arrayTriversal(String[] array){
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




