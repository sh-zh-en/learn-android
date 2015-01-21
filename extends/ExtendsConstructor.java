
/*
	类的构造方法调用顺序
*/
class  ExtendsConstructor{
	public static void main(String[] args){
		Father f = new Father();
		System.out.println("----------------------------------");
		Son s=new Son();  
	}
}

class Father{
	public  Father(){
		System.out.println("父类的无参构造方法。");
	}
	public Father(String cha){
		System.out.println("父类的有参构造方法。");
	}
}

class Son extends Father{
	public Son(){		
		System.out.println("子类的无参构造方法。");		
	}
	public Son(String num){
		System.out.println("子类的有参构造方法。");
	}
}

