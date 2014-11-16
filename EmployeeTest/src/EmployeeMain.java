
public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("John", 335, 1990, 02, 21);
		staff[1] = new Employee("UJohn", 320, 1991, 02, 20);
		staff[2] = new Employee("Jjohn", 319, 1993, 03, 19);
	
	for(Employee e: staff)
		e.raiseSalary(5);
		
	for(Employee e:staff)
		System.out.println("Name " + e.getName() + "\n" 
                         + "Salary " + e.getSalary()+ "\n"
                         + "Hire Day " + e.getHireDate());	

}
}