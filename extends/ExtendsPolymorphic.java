


class Father{
	public void show(){
		System.out.println("Father �ࡣ");
	}	
}
class Son extends Father{
	public void show(){
		System.out.println("Son �ࡣ");
	}
	public void show2(){
		System.out.println("Son ����");
	}
	public void show3(){
		super.show();
	}
}

class  ExtendsPolymorphic{
	public static void main(String[] args){
		Father f = new Father();
		f.show();
		System.out.println("-------------------------------");
		Son s = new Son();
		s.show();
		s.show2();
		s.show3();
		System.out.println("-------------------------------");
		Father test = new Son();
		test.show();
		//test.show2();	
	}
	
	
	
}