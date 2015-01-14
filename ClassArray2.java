import java.util.Scanner;

class ClassArray2{
	public static void main(String[] args){
		trigonometry();
		
	}
	//二维数组示例。
	public static void array2(){
		System.out.println("练习一：动态初始化，列固定");
		//定义一个二维数组
		//这个二维数组有3个一维数组的元素，每一个一维数组有4个元素,即3行4列
		int[][] arr01 = new int[3][4];
		
		//输出二维数组的名称
		System.out.println(arr01);  //地址值
		
		//输出二维数组的第一个元素一维数组的名称
		System.out.println(arr01[0]);  //地址值
		System.out.println(arr01[1]);  //地址值
		System.out.println(arr01[2]);  //地址值
		
		//输出二维数组的元素
		System.out.println(arr01[0][0]);  // 0
		System.out.println(arr01[0][1]);  // 0
		
		System.out.println("练习二：动态初始化，列变化");
		int  m = 3;
		int  n = 4;
		int[][] arr02 = new int[m][];  //在给元素赋值时，报错。
		System.out.println(arr02);  //地址值
		
		System.out.println(arr02[0]);  //null
		System.out.println(arr02[1]);  //null
		System.out.println(arr02[2]);  //null
		
		arr02[0] = new int[2];
		arr02[1] = new int[4];
		arr02[2] = new int[3];
		
		System.out.println(arr02[0]);  //地址值
		System.out.println(arr02[1]);  //地址值
		System.out.println(arr02[2]);  //地址值
		
		System.out.println("练习三：静态初始化");
		int[][] arr03 = {{1,2,3},{4,5},{6,7,8,9},{2,3,4}};
	}
	
	/*打印杨辉三角
	1
	1	1
	1	2	1
	1	3	3	1
	1	4	6	4	1
	1	5	10	10	5	1
	1	6	15	20	15	6	1
	*/
	public static void trigonometry(){
		System.out.print("请输入杨辉三角的行数：");
		Scanner input = new Scanner(System.in);
		int  floor = input.nextInt();
		//int[][] tr = new int[floor][];  //如此初始化，在编译时可以通过，但是在解释时报错
		//int[] tr[] = new int[floor][];  //如此初始化，在编译时可以通过，但是在解释时报错
		int[][] tr = new int[floor][floor];
		
		if (floor<=1){
			System.out.println("您的输入不能构不成杨辉三角，谢谢。");
		}
		else{
			tr[0][0]=1;
			for(int i=1;i<floor;i++){
				tr[i][0]=1;
				for(int j=1;j<i;j++){
					tr[i][j]=tr[i-1][j-1]+tr[i-1][j];
				}
				tr[i][i]=1;
			}
			for(int i=0;i<floor;i++){
				for(int j=0;j<=i;j++){
					System.out.print("	"+tr[i][j]);
				}
				System.out.println();
			}
		}
		
		
			
	}
}