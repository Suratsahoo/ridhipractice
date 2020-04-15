package home.prac.test;

import java.util.Scanner;

import home.prac.coding.UseCopyConst;

public class CopyconstTest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int x,y;
		System.out.println("Enter Mark1-->");
		x=sc.nextInt();
		System.out.println("Enter Mark2-->");
		y=sc.nextInt();
		UseCopyConst ridhi=new UseCopyConst(x,y);
		UseCopyConst reeti=new UseCopyConst(ridhi);
		System.out.println("Ridhi Mark1="+ridhi.getMark1());
		System.out.println("Ridhi Mark2="+ridhi.getMark2());
		System.out.println("Reeti Mark1="+reeti.getMark1());
		System.out.println("Reeti Mark2="+reeti.getMark2());

	}

}
