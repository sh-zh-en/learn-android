
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

