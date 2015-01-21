


interface Inter{
	public int num = 10;
	public final int num2 = 20;
	public static final int num3 = 30;
	//接口中没有构造方法。
	//public Inter(){}
	//默认有public 
	abstract void show();
}
//class  InterImpl implements Inter{} 默认继承 Object类
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
		//这里不能用super，因为，super适用于调取父类方法、构造、变量，而这里的父类是Object，而非Inter
		//System.out.println(super.num3);
		System.out.println("接口中的变量分别为："+this.num2+", "+num3);
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