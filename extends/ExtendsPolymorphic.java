


class Father{
	public void show(){
		System.out.println("Father 类。");
	}	
}
class Son extends Father{
	public void show(){
		System.out.println("Son 类。");
	}
	public void show2(){
		System.out.println("Son 方法");
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