package week1.day2.assignments;

public class TwoWheeler {
	int noOfWheells=2;
	short noOfMirrors=2;
	long chassisNumber=1221323533L;
	boolean isPunctured=false;
	String bikeName="Access 125";
	double runningKM=3000.3222;
public static void main(String[] args) {
	TwoWheeler bike=new TwoWheeler();
	System.out.println(bike.noOfWheells);
	System.out.println(bike.noOfMirrors);
	System.out.println(bike.chassisNumber);
	System.out.println(bike.isPunctured);
	System.out.println(bike.bikeName);
	System.out.println(bike.runningKM);
}

}
