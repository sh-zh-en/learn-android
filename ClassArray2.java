import java.util.Scanner;

class ClassArray2{
	public static void main(String[] args){
		trigonometry();
		
	}
	//��ά����ʾ����
	public static void array2(){
		System.out.println("��ϰһ����̬��ʼ�����й̶�");
		//����һ����ά����
		//�����ά������3��һά�����Ԫ�أ�ÿһ��һά������4��Ԫ��,��3��4��
		int[][] arr01 = new int[3][4];
		
		//�����ά���������
		System.out.println(arr01);  //��ֵַ
		
		//�����ά����ĵ�һ��Ԫ��һά���������
		System.out.println(arr01[0]);  //��ֵַ
		System.out.println(arr01[1]);  //��ֵַ
		System.out.println(arr01[2]);  //��ֵַ
		
		//�����ά�����Ԫ��
		System.out.println(arr01[0][0]);  // 0
		System.out.println(arr01[0][1]);  // 0
		
		System.out.println("��ϰ������̬��ʼ�����б仯");
		int  m = 3;
		int  n = 4;
		int[][] arr02 = new int[m][];  //�ڸ�Ԫ�ظ�ֵʱ��������
		System.out.println(arr02);  //��ֵַ
		
		System.out.println(arr02[0]);  //null
		System.out.println(arr02[1]);  //null
		System.out.println(arr02[2]);  //null
		
		arr02[0] = new int[2];
		arr02[1] = new int[4];
		arr02[2] = new int[3];
		
		System.out.println(arr02[0]);  //��ֵַ
		System.out.println(arr02[1]);  //��ֵַ
		System.out.println(arr02[2]);  //��ֵַ
		
		System.out.println("��ϰ������̬��ʼ��");
		int[][] arr03 = {{1,2,3},{4,5},{6,7,8,9},{2,3,4}};
	}
	
	/*��ӡ�������
	1
	1	1
	1	2	1
	1	3	3	1
	1	4	6	4	1
	1	5	10	10	5	1
	1	6	15	20	15	6	1
	*/
	public static void trigonometry(){
		System.out.print("������������ǵ�������");
		Scanner input = new Scanner(System.in);
		int  floor = input.nextInt();
		//int[][] tr = new int[floor][];  //��˳�ʼ�����ڱ���ʱ����ͨ���������ڽ���ʱ����
		//int[] tr[] = new int[floor][];  //��˳�ʼ�����ڱ���ʱ����ͨ���������ڽ���ʱ����
		int[][] tr = new int[floor][floor];
		
		if (floor<=1){
			System.out.println("�������벻�ܹ�����������ǣ�лл��");
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