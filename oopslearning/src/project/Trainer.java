package project;

public class Trainer {
	private int salary = 10000;
	String dept = "Java";
	String institute = "Payilagam";
public int getSalary() {
		return salary;
	}
	public Trainer(String string, String string2) {
		this.dept = string;
		this.institute = string2;
	}
public static void main(String[] args) {
		Trainer trainerkumar = new Trainer("CSE", "Payilagam");
		trainerkumar.training();
}
private void training() {
		System.out.println(dept);
		System.out.println(institute);
		System.out.println(salary);
}
}
