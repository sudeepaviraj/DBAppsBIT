import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

    public static List<Employee> getAll(){

        List<Employee> employeeList = new ArrayList<Employee>();

        try

        { 
            ResultSet result = CommonDao.get("SELECT * FROM employee");

            while(result.next()){
                int id = result.getInt("id");
                String name = result.getString("name");
                String nic = result.getString("nic");
                int gender = result.getInt("gender");


                Gender genderinfo = GenderDao.getbyId(gender);

                Employee emp =  new Employee();
                emp.setname(name);
                emp.setGender(genderinfo);
                emp.setId(id);
                emp.setNic(nic);

                employeeList.add(emp);

            }
            return employeeList;

        }
        catch(SQLException expection)
        {
            System.out.println("Error"+expection.getMessage());
        }
        return employeeList;
    }

}

