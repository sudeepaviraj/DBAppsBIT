import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.*;


public class EmployeeDao {

    public static List<Employee> getAll(){

       List<Employee> empList = CommonDao.getall(Employee.class);
    
        return empList;

    }

}

