
public class UseConst {
	int a,b;

	public UseConst() {
		a=0;b=0;
		
	}
	public UseConst(int a,int b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		UseConst ob=new UseConst();
		UseConst ob1;
		ob1=new UseConst(20,30);
		
	}

}
