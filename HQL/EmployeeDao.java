import java.util.List;
import org.hibernate.*;


public class EmployeeDao {

    public static List<Employee> getAll(){

        List<Employee> empList = CommonDao.getall("SELECT e FROM Employee e");

        return empList;

    }

}

