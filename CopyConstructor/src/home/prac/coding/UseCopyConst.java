package home.prac.coding;

public class UseCopyConst {
	
	int m1,m2;

	public UseCopyConst(int mark1,int mark2) {
		
		this.m1=mark1;
		this.m2=mark2;
	}
	public UseCopyConst(UseCopyConst xyz) {
		m1=xyz.m1;
		m2=xyz.m2;
	}
	
	public int getMark1() {
		return m1;
	}
	public int getMark2() {
		return m2;
	}

}
