class Demo0112{
	public static void main(String[] args){
		System.out.println("hello world");
		int a=10;
		int b=20;
		System.out.println("����ǰa="+a+",b="+b);
		int max1=a>b?a:b;
		System.out.println("The max = "+max1);
		//ʵ��a��bֵ�Ľ���
		/*
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("������a="+a+",b="+b);
		*/
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("������a="+a+",b="+b);
		int max;
		max=a>b?a:b;
		System.out.println("The max = "+max);


		}
	}
