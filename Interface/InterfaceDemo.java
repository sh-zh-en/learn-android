


interface Inter{
	public int num = 10;
	public final int num2 = 20;
	public static final int num3 = 30;
	//�ӿ���û�й��췽����
	//public Inter(){}
	//Ĭ����public 
	abstract void show();
}
//class  InterImpl implements Inter{} Ĭ�ϼ̳� Object��
/*  
class  InterImpl implements Inter{
	public InterImpl(){
		super();
	}
}
*/

class  InterImpl extends Object implements Inter{
	public  int num = 100;
	public int num2 = 200;
	public int num3 = 300;
	public InterImpl(){
		super();
	}
	public void show(){
		int num = 1000;
		int num2 = 2000;
		int num3 = 3000;
		//���ﲻ����super����Ϊ��super�����ڵ�ȡ���෽�������졢������������ĸ�����Object������Inter
		//System.out.println(super.num3);
		System.out.println("�ӿ��еı����ֱ�Ϊ��"+this.num2+", "+num3);
	}
}


class InterfaceDemo{
	public static void main(String[] args){
		Inter i = new InterImpl();
		System.out.println(i.num);
		System.out.println(i.num2);
		i.show();
	}
}