import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.nikini.traning.config.ApplicationConfiguration;
import com.nikini.traning.model.Employee;
import com.nikini.traning.service.EmployeeService;

public class Application {
	public static void main(String[] args) {
		
		
		ApplicationContext ApplicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		EmployeeService employeeService = ApplicationContext.getBean("employeeService", EmployeeService.class);
		System.out.println(employeeService.toString());
		EmployeeService employeeService2 = ApplicationContext.getBean("employeeService", EmployeeService.class);
		System.out.println(employeeService2.toString());
		List<Employee> employees = employeeService.getAllEmployees();
		for (Employee employee : employees) {
			System.out.println(employee.getEmployeeName() + " at " + employee.getEmployeeLocation());
		}
	}
}

  