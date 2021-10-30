package week1.day1;

public class PrimeNumber {
	int numberToBeGiven;
	
	public void checkPrimeMthd() {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=2;i<numberToBeGiven;i++) {
			if(numberToBeGiven%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("PRIME: "+numberToBeGiven);
		}
		else
			System.out.println("OH GOD NOT A PRIME");

	}
	public void primeSeries() {
		// TODO Auto-generated method stub
		for(int i=3;i<=9;i++) {
			int count1=0;
			for(int j=i;j>=1;j--) {
				if(i%j==0) {
					count1++;
				}
			}
			if(count1==2) {
				System.out.println(i);
				
			}
		}
	

	}
	public static void main(String[] args) {
		PrimeNumber primObj=new PrimeNumber();
		primObj.numberToBeGiven=9;
	primObj.checkPrimeMthd();
		primObj.primeSeries();
	}

}
