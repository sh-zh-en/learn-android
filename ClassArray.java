import java.util.Scanner;

class  ClassArray{
	public static void main(String[] args){
		System.out.print("����һ�����ݣ���ȷ���������������ݵĸ�����");
		int[] numbers = inputArray();        //����һ������
		System.out.print("���������������Ϊ��");
		outputArray(numbers);          //�������
		System.out.print("�������У�");
		///int[] nums=ascendingSort(numbers);  //������������
		//outputArray(nums);  //�������
		numbers = ascendingSort(numbers);
		outputArray(numbers);  
		
	}
	
	//����һ������
	public static int[] inputArray(){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int[] nums = new int[num];
		for(int i=0;i<num;i++){
			System.out.print("�������һ�����ݣ�");
			nums[i] = input.nextInt();
		}
		return nums;
	}
	
	//�������
	public static void outputArray(int[] nums){
		for(int i=0;i<nums.length;i++){
			System.out.print(""+nums[i]+"   ");
		}
		System.out.println();
	}
	//������������
	public static int[]  ascendingSort(int[] nums){
		int min;
		for(int i=0;i<nums.length;i++){
			for(int j=i;j<nums.length;j++){
				if(nums[i]>nums[j]){
					min =nums[j];
					nums[j] = nums[i];
					nums[i] = min;
				}
				//nums[j] = nums[j]<nums[j+1]?nums[j]:nums[j+1];   //��Ԫ�������������Сֵ
			}
		}
		return nums;
	}
	
	
	
	
	
}