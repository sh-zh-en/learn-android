
/*
	��Ĺ��췽������˳��
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
		System.out.println("������޲ι��췽����");
	}
	public Father(String cha){
		System.out.println("������вι��췽����");
	}
}

class Son extends Father{
	public Son(){		
		System.out.println("������޲ι��췽����");		
	}
	public Son(String num){
		System.out.println("������вι��췽����");
	}
}
