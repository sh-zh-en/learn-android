
import java.util.ArrayList;


class Test{
	public static void main(String[] args){
		
		String[] array;// Ҫ��ʼ��������
	
		ArrayList<Integer> fieldList = new ArrayList<Integer>();  //���ȴ���һ��ArrayList���͵Ķ���
		fieldList.add(23);      //����������Ԫ��field1
		//��ArrayList���͵Ķ���ת��ΪString���ͣ�����ʼ������array.
		array= (int[])fieldList.toArray(new int [fieldList.size()]);
	
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
	
}
