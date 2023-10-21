
public class Salary {

	public static void main(String[] args) {
		String employee = "Peter Madison";
		int salary = 20000;
		double stateTax = salary * 0.284;
		double personalTax;
		double netSalary;
		
			if ((salary - stateTax - 7000) > 0)
				personalTax = (salary - stateTax - 7000)*0.1;
			else personalTax = 0;
		
				
		netSalary = salary - stateTax - personalTax;
		
		System.out.println("The employee " + employee + " with the gross salary of: " + salary + " MKD.");
		System.out.println("Will get NET salary: " + netSalary + " MKD.");
		System.out.println("State taxes are: " + stateTax + " MKD.");
		System.out.println("Personal tax is: " + personalTax + " MKD.");
	}

}
