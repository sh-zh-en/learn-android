/**
*	这是针对int类型的数组进行操作的工具。
*	@author  HaimingMao
*	@version v.01
*/


public class ArrayTool{
	/**
	*	这是私有构造
	*/
	private ArrayTool(){}
	
	/**
	*	Define the method whitch array traversal.	
	*	@para int[] arr 这是要被遍历的数组
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
	*	@param int[] arr 这是要获取最大值的数组
	*	@return int 返回数组中的最大值	
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
	*	@param int[] arr 这是要获取最小值的数组
	*	@return int 返回数组中的最小值
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
	*	@param int[] arr 这是要源数组
	*	@param int value 这是要查找的元素
	*	@return int 返回数组中的索引
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
