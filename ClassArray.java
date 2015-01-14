import java.util.Scanner;

class  ClassArray{
	public static void main(String[] args){
		System.out.print("输入一组数据，请确定您输入这组数据的个数：");
		int[] numbers = inputArray();        //输入一组数据
		System.out.print("您输入的这组数据为：");
		outputArray(numbers);          //数组输出
		System.out.print("升序排列：");
		///int[] nums=ascendingSort(numbers);  //数组升序排列
		//outputArray(nums);  //数组输出
		numbers = ascendingSort(numbers);
		outputArray(numbers);  
		
	}
	
	//输入一组数据
	public static int[] inputArray(){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int[] nums = new int[num];
		for(int i=0;i<num;i++){
			System.out.print("请输入第一个数据：");
			nums[i] = input.nextInt();
		}
		return nums;
	}
	
	//数组输出
	public static void outputArray(int[] nums){
		for(int i=0;i<nums.length;i++){
			System.out.print(""+nums[i]+"   ");
		}
		System.out.println();
	}
	//数组升序排列
	public static int[]  ascendingSort(int[] nums){
		int min;
		for(int i=0;i<nums.length;i++){
			for(int j=i;j<nums.length;j++){
				if(nums[i]>nums[j]){
					min =nums[j];
					nums[j] = nums[i];
					nums[i] = min;
				}
				//nums[j] = nums[j]<nums[j+1]?nums[j]:nums[j+1];   //三元运算计算数组最小值
			}
		}
		return nums;
	}
	
	
	
	
	
}