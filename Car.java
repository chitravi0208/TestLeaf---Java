package week1.day2.assignments;

public class Car {
	public void applyBreak() {
		System.out.println("Break Applied");
	}
	int applyGear() {
		int gear=1;
		return gear;
	}
	private boolean switchOnAC() {
		boolean acflag=true;
		return acflag;
	}
	public void applyAccelerator() {
		System.out.println("accelerate");
	}
public static void main(String[] args) {
	Car bal = new Car();
	bal.applyBreak();
	System.out.println(bal.applyGear());
	System.out.println(bal.switchOnAC());
	bal.applyAccelerator();
}
}
