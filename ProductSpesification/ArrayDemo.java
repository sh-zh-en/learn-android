/*
	����һ��˵���飺
		A:дһ�������ࣻ
		B:�����������ĵ�ע��
			��ʽ��
			���ݣ������;�����ߡ��汾
				  ��������;������������ֵ˵��
		C���ù��߽����ĵ�ע�͡���javadoc����
		D:��ʽ
			$ javadoc -d Ŀ¼ -author -version ArrayTool.java

*/

class ArrayDemo{
	public static void main(String[] args){
		//Define Array.
		int[] arr = {23,45,25,64,21};
		
		//Traversal
		ArrayTool.arrayTraversal(arr);
		
		
		//Maximum
		int max = ArrayTool.arrayMax(arr);
		System.out.println("maximum = "+max);
		
		//Minimum
		int min = ArrayTool.arrayMin(arr);
		System.out.println("minimum = "+min);
		
		//Index
		int index = ArrayTool.arrayIndex(arr,25);
		if(index < 0){
			System.out.println("�����ݲ��������С�");
		}
		else{
			System.out.println("index = "+index);
		}
		
		
	}
	
}