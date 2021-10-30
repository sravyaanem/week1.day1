package week1.day1;

public class FibonocciSeries {
	int firstNum=0;
	int secNum=1;
	int thirdnum;
	public void fibMth() {
		// TODO Auto-generated method stub
		for(int nxtNum=2;nxtNum<=8;nxtNum++) {
					thirdnum=firstNum+secNum;
					if(thirdnum<15) {
			System.out.print(thirdnum+" ");
					}
			firstNum=secNum;
			secNum=thirdnum;
		}

	}
	public static void main(String[] args) {
		FibonocciSeries fibObj=new FibonocciSeries();
		System.out.print(fibObj.firstNum+" ");
		System.out.print(fibObj.secNum+" ");
		fibObj.fibMth();
	}

}
