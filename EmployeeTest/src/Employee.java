import java.util.Date;
import java.util.GregorianCalendar;


public class Employee {
	
	private String name;
	private double salary;
	private Date HireDate;

	public Employee(String n, double s, int year, int month, int day){
		
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
		HireDate = calendar.getTime();
					
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public Date getHireDate() {
		return HireDate;
	}
	
	public void raiseSalary(double byPercent){
		double raise = (salary*byPercent)/100;
		salary+=raise;
	}
	
}
