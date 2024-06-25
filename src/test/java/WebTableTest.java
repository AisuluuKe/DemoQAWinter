import com.demoqa.entities.Employee;
import org.testng.annotations.Test;

import java.util.List;

public class WebTableTest extends BaseTest{

    @Test(description = "Practice form test")
    public void test123(){
        driver.get("https://demoqa.com/webtables");
        Employee employee = randomUtils.createMockEmployee();
        demoQaPages.getWebTablePage().addNewEmployee(randomUtils.createMockEmployee());

        List<Employee> employees = demoQaPages.getWebTablePage().getEmployeesFromTable();

         for (Employee employee1: employees){
             System.out.println(employee);
         }
    }
}
