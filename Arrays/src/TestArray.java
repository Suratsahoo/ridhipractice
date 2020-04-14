import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<5;i++)
		{
		System.out.println("Enter a value-->");
		a[i]=sc.nextInt();
		}
		System.out.printf("The values are-->"+a[0]);
		for(int i=0;i<5;i++)
			System.out.print(a[i]);
}
	
}
