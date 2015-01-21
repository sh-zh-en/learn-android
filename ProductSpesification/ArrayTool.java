/**
*	�������int���͵�������в����Ĺ��ߡ�
*	@author  HaimingMao
*	@version v.01
*/


public class ArrayTool{
	/**
	*	����˽�й���
	*/
	private ArrayTool(){}
	
	/**
	*	Define the method whitch array traversal.	
	*	@para int[] arr ����Ҫ������������
	*/
	public static void arrayTraversal(int[] arr){
		for(int i=0;i<arr.length;i++){
			if(i==arr.length-1){
				System.out.println(arr[i]);
			}
			else{
				System.out.println(arr[i] + ", ");
			}
		}
	}
	
	/**
	*	Define the method whitch get the maximum value in the array.
	*	@param int[] arr ����Ҫ��ȡ���ֵ������
	*	@return int ���������е����ֵ	
	*/
	public static int arrayMax(int[] arr){
		int max = arr[0];
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
				max = arr[i];
			}
		}
		return max;
	}
	
	/**
	*	Define the method whitch get the minimum value in the array.
	*	@param int[] arr ����Ҫ��ȡ��Сֵ������
	*	@return int ���������е���Сֵ
	*/
	public static int arrayMin(int[] arr){
		int max = arr[0];
		for(int i=1;i<arr.length;i++){
			if(max>arr[i]){
				max = arr[i];
			}
		}
		return max;
	}
	
	/**
	*	Define the method whitch will get the index of the assign value in the given array.
	*	@param int[] arr ����ҪԴ����
	*	@param int value ����Ҫ���ҵ�Ԫ��
	*	@return int ���������е�����
	*/
	public static int arrayIndex(int[] arr,int x){
		int index = -1;
		for(int i=0;i<arr.length;i++){
			if(arr[i] == x){
				index = i;
			}
		}
		return index;
	}
	
	//
	
	
}