
import com.horstmann.corejava.*;
import static java.lang.System.*;

public class PackageTest {
	public static void main(String[] args){
		//becaues of the import statement, we dont have to use
		//com.horstmann.corejava.Employee here
		Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		
		harry.raiseSalary(5);
		
		//karena kita mengimport static statement, kita tidak dapat menggunakan System.out
		out.println("name=" + harry.getName() + ",salary=" + harry.getSalary());
	}
}
