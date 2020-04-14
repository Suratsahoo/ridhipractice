import java.util.Scanner;

public class ExplainOverload {
	
	static String calculator(int a,int b,Scanner df) {
		int add,sub,mul,div;
		double value;
		add=a+b;
		sub=a-b;
		mul=a*b;
		div=a/b;
		System.out.println("Enter a double value-->");
		value=df.nextDouble();
	    calculator(value);
		return "Add:"+add+" "+"Subtraction:"+sub+" "+"multiplication:"+mul+" "+"Division:"+div;
		
		
	}
	
	static void calculator(double d)
	{
		System.out.println("Double Vlue-->"+d);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("enter two no.s-->");
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println(calculator(a,b,sc));
		
		
	}

}
