package week1.day1;

public class Factorial {
	int num;
	int fact=1;
	public void factNum() {
		// TODO Auto-generated method stub
		for(int i=1;i<=num;i++) {
     fact*=i;
     
		}
		System.out.println(fact);
		
	}
	public static void main(String[] args) {
		Factorial fac=new Factorial();
		fac.num=5;
         fac.factNum();
		
	}

}
