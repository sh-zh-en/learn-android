class Demo0112{
	public static void main(String[] args){
		System.out.println("hello world");
		int a=10;
		int b=20;
		System.out.println("交换前a="+a+",b="+b);
		int max1 = a>b?a:b;
		System.out.println("The max = "+max1);
		//实现a与b值的交换
		/*
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("交换后a="+a+",b="+b);
		*/
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("交换后a="+a+",b="+b);
		int max;
		max=a>b?a:b;
		System.out.println("The max = "+max);


		}
	}

