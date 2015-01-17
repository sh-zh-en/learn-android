/*
	制作一个说明书：
		A:写一个工具类；
		B:对这个类加入文档注释
			格式：
			内容：类的用途、作者、版本
				  方法的用途、参数、返回值说明
		C：用工具解析文档注释——javadoc工具
		D:格式
			$ javadoc -d 目录 -author -version ArrayTool.java

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
			System.out.println("该数据不在数组中。");
		}
		else{
			System.out.println("index = "+index);
		}
		
		
	}
	
}