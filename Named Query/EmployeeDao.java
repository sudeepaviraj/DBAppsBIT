import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.*;

public class EmployeeDao {

    public static List<Employee> getAll(){

        List<Employee> employeeList = CommonDao.get("get_all");


        return employeeList;
    }

}

