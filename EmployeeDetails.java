package week1.day2.assignments;

public class EmployeeDetails {
	public void printEmployeeName(String empName, int empId) {
		empName="Chitra";
		empId=123;
		System.out.println(empName);
		System.out.println(empId);
	}
	private String getEmployeeAddress(String empAddress) {
		//empAddress="Chennai";
		System.out.println(empAddress);
		return empAddress;
	}
	double printEmployeeSalary(double empSalary) {
		empSalary=23424.234;
		System.out.println(empSalary);
		return empSalary;
	}
	void printEmployeeMobileNumber(long mobNum) {
	mobNum=192931929l;
	System.out.println(mobNum);
	}
	public static void main(String[] args) {
		EmployeeDetails emp = new EmployeeDetails();
		emp.printEmployeeName("Chitra", 14);
		emp.getEmployeeAddress("Chennai");
		emp.printEmployeeSalary(6767.777);
		emp.printEmployeeMobileNumber(999999999l);
		emp.getEmployeeAddress("Agra");
	}
}
